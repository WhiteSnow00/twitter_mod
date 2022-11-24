import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrk
{
    public final int a;
    public final k63 b;
    
    public jrk(final k63 b) {
        xd.D(true);
        this.a = 16384;
        this.b = b;
    }
    
    public final long a(final InputStream inputStream, final OutputStream outputStream) throws IOException {
        final byte[] array = (byte[])((ark)this.b).get(this.a);
        long n = 0L;
        try {
            while (true) {
                final int read = inputStream.read(array, 0, this.a);
                if (read == -1) {
                    break;
                }
                outputStream.write(array, 0, read);
                n += read;
            }
            return n;
        }
        finally {
            ((ark)this.b).b((Object)array);
        }
    }
}
