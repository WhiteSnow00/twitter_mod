import java.nio.channels.Channel;
import android.util.Log;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.nio.channels.ReadableByteChannel;
import android.os.Build$VERSION;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.nio.channels.Channels;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yoo implements i0s, mn8
{
    public final Context F0;
    public final String G0;
    public final File H0;
    public final Callable<InputStream> I0;
    public final int J0;
    public final i0s K0;
    public z98 L0;
    public boolean M0;
    
    public yoo(final Context f0, final String g0, final File h0, final Callable<InputStream> i0, final int j0, final i0s k0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
    }
    
    public final h0s H2() {
        synchronized (this) {
            if (!this.M0) {
                this.c(true);
                this.M0 = true;
            }
            return this.K0.H2();
        }
    }
    
    public final i0s a() {
        return this.K0;
    }
    
    public final void b(final File file) throws IOException {
        Label_0077: {
            if (this.G0 != null) {
                final Object o = Channels.newChannel(this.F0.getAssets().open(this.G0));
                break Label_0077;
            }
            if (this.H0 != null) {
                final Object o = new FileInputStream(this.H0).getChannel();
                break Label_0077;
            }
            final Callable<InputStream> i0 = this.I0;
            if (i0 == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                Object o = Channels.newChannel(i0.call());
                final File tempFile = File.createTempFile("room-copy-helper", ".tmp", this.F0.getCacheDir());
                tempFile.deleteOnExit();
                final FileChannel channel = new FileOutputStream(tempFile).getChannel();
                try {
                    if (Build$VERSION.SDK_INT > 23) {
                        channel.transferFrom((ReadableByteChannel)o, 0L, Long.MAX_VALUE);
                    }
                    else {
                        final InputStream inputStream = Channels.newInputStream((ReadableByteChannel)o);
                        final OutputStream outputStream = Channels.newOutputStream(channel);
                        final byte[] array = new byte[4096];
                        while (true) {
                            final int read = inputStream.read(array);
                            if (read <= 0) {
                                break;
                            }
                            outputStream.write(array, 0, read);
                        }
                    }
                    channel.force(false);
                    ((Channel)o).close();
                    channel.close();
                    o = file.getParentFile();
                    if (o != null && !((File)o).exists() && !((File)o).mkdirs()) {
                        o = ehk.f("Failed to create directories for ");
                        ((StringBuilder)o).append(file.getAbsolutePath());
                        throw new IOException(((StringBuilder)o).toString());
                    }
                    if (tempFile.renameTo(file)) {
                        return;
                    }
                    o = ehk.f("Failed to move intermediate file (");
                    ((StringBuilder)o).append(tempFile.getAbsolutePath());
                    ((StringBuilder)o).append(") to destination (");
                    ((StringBuilder)o).append(file.getAbsolutePath());
                    ((StringBuilder)o).append(").");
                    throw new IOException(((StringBuilder)o).toString());
                }
                finally {
                    ((Channel)o).close();
                    channel.close();
                }
            }
            catch (final Exception ex) {
                throw new IOException("inputStreamCallable exception on call", ex);
            }
        }
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }
    
    public final void c(final boolean b) {
        final String databaseName = this.getDatabaseName();
        final File databasePath = this.F0.getDatabasePath(databaseName);
        final z98 l0 = this.L0;
        final lw6 lw6 = new lw6(databaseName, this.F0.getFilesDir(), l0 == null || l0.l);
        try {
            lw6.b.lock();
            if (lw6.c) {
                try {
                    (lw6.d = new FileOutputStream(lw6.a).getChannel()).lock();
                }
                catch (final IOException ex) {
                    throw new IllegalStateException("Unable to grab copy lock.", ex);
                }
            }
            if (!databasePath.exists()) {
                try {
                    this.b(databasePath);
                    return;
                }
                catch (final IOException ex2) {
                    throw new RuntimeException("Unable to copy database file.", ex2);
                }
            }
            if (this.L0 == null) {
                return;
            }
            try {
                final int c = re7.c(databasePath);
                final int j0 = this.J0;
                if (c == j0) {
                    return;
                }
                if (this.L0.a(c, j0)) {
                    return;
                }
                if (this.F0.deleteDatabase(databaseName)) {
                    try {
                        this.b(databasePath);
                    }
                    catch (final IOException ex3) {
                        Log.w("ROOM", "Unable to copy database file.", (Throwable)ex3);
                    }
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to delete database file (");
                    sb.append(databaseName);
                    sb.append(") for a copy destructive migration.");
                    Log.w("ROOM", sb.toString());
                }
            }
            catch (final IOException ex4) {
                Log.w("ROOM", "Unable to read database version.", (Throwable)ex4);
            }
        }
        finally {
            lw6.a();
        }
    }
    
    public final void close() {
        synchronized (this) {
            this.K0.close();
            this.M0 = false;
        }
    }
    
    public final String getDatabaseName() {
        return this.K0.getDatabaseName();
    }
    
    public final void setWriteAheadLoggingEnabled(final boolean writeAheadLoggingEnabled) {
        this.K0.setWriteAheadLoggingEnabled(writeAheadLoggingEnabled);
    }
}
