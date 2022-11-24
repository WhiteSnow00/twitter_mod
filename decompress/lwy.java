import java.util.Objects;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;
import java.util.Enumeration;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwy extends InputStream
{
    public final Enumeration<File> F0;
    public FileInputStream G0;
    
    public lwy(final Enumeration<File> f0) throws IOException {
        this.F0 = f0;
        this.a();
    }
    
    public final void a() throws IOException {
        final FileInputStream g0 = this.G0;
        if (g0 != null) {
            g0.close();
        }
        FileInputStream g2;
        if (this.F0.hasMoreElements()) {
            g2 = new FileInputStream(this.F0.nextElement());
        }
        else {
            g2 = null;
        }
        this.G0 = g2;
    }
    
    @Override
    public final void close() throws IOException {
        super.close();
        final FileInputStream g0 = this.G0;
        if (g0 != null) {
            g0.close();
            this.G0 = null;
        }
    }
    
    @Override
    public final int read() throws IOException {
        while (true) {
            final FileInputStream g0 = this.G0;
            if (g0 == null) {
                return -1;
            }
            final int read = g0.read();
            if (read != -1) {
                return read;
            }
            this.a();
        }
    }
    
    @Override
    public final int read(final byte[] array, final int n, final int n2) throws IOException {
        if (this.G0 == null) {
            return -1;
        }
        Objects.requireNonNull(array);
        if (n < 0 || n2 < 0 || n2 > array.length - n) {
            throw new IndexOutOfBoundsException();
        }
        if (n2 != 0) {
            do {
                final int read = this.G0.read(array, n, n2);
                if (read > 0) {
                    return read;
                }
                this.a();
            } while (this.G0 != null);
            return -1;
        }
        return 0;
    }
}
