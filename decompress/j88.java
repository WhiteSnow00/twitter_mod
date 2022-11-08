import java.io.IOException;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.a;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j88 extends InputStream
{
    public final a C0;
    public final b D0;
    public final byte[] E0;
    public boolean F0;
    public boolean G0;
    
    public j88(final a c0, final b d0) {
        this.F0 = false;
        this.G0 = false;
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = new byte[1];
    }
    
    @Override
    public final void close() throws IOException {
        if (!this.G0) {
            this.C0.close();
            this.G0 = true;
        }
    }
    
    @Override
    public final int read() throws IOException {
        final int read = this.read(this.E0);
        int n = -1;
        if (read != -1) {
            n = (this.E0[0] & 0xFF);
        }
        return n;
    }
    
    @Override
    public final int read(final byte[] array) throws IOException {
        return this.read(array, 0, array.length);
    }
    
    @Override
    public final int read(final byte[] array, int b, final int n) throws IOException {
        ri4.t(this.G0 ^ true);
        if (!this.F0) {
            this.C0.a(this.D0);
            this.F0 = true;
        }
        b = ((v78)this.C0).b(array, b, n);
        if (b == -1) {
            return -1;
        }
        return b;
    }
}
