import java.io.IOException;
import java.io.File;
import java.nio.channels.FileLock;
import java.io.FileOutputStream;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hya implements Closeable
{
    public FileOutputStream C0;
    public FileLock D0;
    
    public hya(final File file, final boolean b) throws IOException {
        final FileOutputStream c0 = new FileOutputStream(file);
        this.C0 = c0;
        Label_0039: {
            if (!b) {
                break Label_0039;
            }
            try {
                FileLock d0 = null;
                Label_0047: {
                    try {
                        d0 = c0.getChannel().tryLock();
                        break Label_0047;
                    }
                    catch (final IOException ex) {
                        d0 = null;
                        break Label_0047;
                    }
                    d0 = c0.getChannel().lock();
                }
                if (d0 == null) {
                    this.C0.close();
                }
                this.D0 = d0;
            }
            finally {
                this.C0.close();
            }
        }
    }
    
    @Override
    public final void close() throws IOException {
        try {
            final FileLock d0 = this.D0;
            if (d0 != null) {
                d0.release();
            }
        }
        finally {
            this.C0.close();
        }
    }
}
