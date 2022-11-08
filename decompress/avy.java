import java.util.Objects;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;
import java.util.Enumeration;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avy extends InputStream
{
    public final Enumeration<File> C0;
    public FileInputStream D0;
    
    public avy(final Enumeration<File> c0) throws IOException {
        this.C0 = c0;
        this.a();
    }
    
    public final void a() throws IOException {
        final FileInputStream d0 = this.D0;
        if (d0 != null) {
            d0.close();
        }
        FileInputStream d2;
        if (this.C0.hasMoreElements()) {
            d2 = new FileInputStream(this.C0.nextElement());
        }
        else {
            d2 = null;
        }
        this.D0 = d2;
    }
    
    @Override
    public final void close() throws IOException {
        super.close();
        final FileInputStream d0 = this.D0;
        if (d0 != null) {
            d0.close();
            this.D0 = null;
        }
    }
    
    @Override
    public final int read() throws IOException {
        while (true) {
            final FileInputStream d0 = this.D0;
            if (d0 == null) {
                return -1;
            }
            final int read = d0.read();
            if (read != -1) {
                return read;
            }
            this.a();
        }
    }
    
    @Override
    public final int read(final byte[] array, final int n, final int n2) throws IOException {
        if (this.D0 == null) {
            return -1;
        }
        Objects.requireNonNull(array);
        if (n < 0 || n2 < 0 || n2 > array.length - n) {
            throw new IndexOutOfBoundsException();
        }
        if (n2 != 0) {
            do {
                final int read = this.D0.read(array, n, n2);
                if (read > 0) {
                    return read;
                }
                this.a();
            } while (this.D0 != null);
            return -1;
        }
        return 0;
    }
}
