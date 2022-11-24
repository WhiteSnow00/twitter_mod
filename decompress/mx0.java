import java.io.FileOutputStream;
import java.io.IOException;
import android.util.Log;
import java.io.OutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mx0
{
    public final File a;
    public final File b;
    
    public mx0(final File a) {
        this.a = a;
        this.b = new File(String.valueOf(a.getPath()).concat(".bak"));
    }
    
    public final boolean a() {
        return this.a.exists() || this.b.exists();
    }
    
    public final InputStream b() throws FileNotFoundException {
        if (this.b.exists()) {
            this.a.delete();
            this.b.renameTo(this.a);
        }
        return new FileInputStream(this.a);
    }
    
    public final OutputStream c() throws IOException {
        if (this.a.exists()) {
            if (!this.b.exists()) {
                if (!this.a.renameTo(this.b)) {
                    final String value = String.valueOf(this.a);
                    final String value2 = String.valueOf(this.b);
                    final StringBuilder sb = new StringBuilder(value2.length() + (value.length() + 37));
                    sb.append("Couldn't rename file ");
                    sb.append(value);
                    sb.append(" to backup file ");
                    sb.append(value2);
                    Log.w("AtomicFile", sb.toString());
                }
            }
            else {
                this.a.delete();
            }
        }
        try {
            return new a(this.a);
        }
        catch (final FileNotFoundException ex) {
            final File parentFile = this.a.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    return new a(this.a);
                }
                catch (final FileNotFoundException ex2) {
                    final String value3 = String.valueOf(this.a);
                    final StringBuilder sb2 = new StringBuilder(value3.length() + 16);
                    sb2.append("Couldn't create ");
                    sb2.append(value3);
                    throw new IOException(sb2.toString(), ex2);
                }
            }
            final String value4 = String.valueOf(this.a);
            final StringBuilder sb3 = new StringBuilder(value4.length() + 16);
            sb3.append("Couldn't create ");
            sb3.append(value4);
            throw new IOException(sb3.toString(), ex);
        }
    }
    
    public static final class a extends OutputStream
    {
        public final FileOutputStream F0;
        public boolean G0;
        
        public a(final File file) throws FileNotFoundException {
            this.G0 = false;
            this.F0 = new FileOutputStream(file);
        }
        
        @Override
        public final void close() throws IOException {
            if (this.G0) {
                return;
            }
            this.G0 = true;
            this.flush();
            try {
                this.F0.getFD().sync();
            }
            catch (final IOException ex) {
                tqb.b0("AtomicFile", "Failed to sync file descriptor:", ex);
            }
            this.F0.close();
        }
        
        @Override
        public final void flush() throws IOException {
            this.F0.flush();
        }
        
        @Override
        public final void write(final int n) throws IOException {
            this.F0.write(n);
        }
        
        @Override
        public final void write(final byte[] array) throws IOException {
            this.F0.write(array);
        }
        
        @Override
        public final void write(final byte[] array, final int n, final int n2) throws IOException {
            this.F0.write(array, n, n2);
        }
    }
}
