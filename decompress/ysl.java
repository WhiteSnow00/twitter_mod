import java.io.IOException;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ysl implements c
{
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ int[] b;
    
    public ysl(final byte[] a, final int[] b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final InputStream inputStream, final int n) throws IOException {
        try {
            inputStream.read(this.a, this.b[0], n);
            final int[] b = this.b;
            b[0] += n;
        }
        finally {
            inputStream.close();
        }
    }
}
