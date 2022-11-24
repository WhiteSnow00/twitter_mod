import java.io.IOException;
import java.io.EOFException;
import com.google.android.exoplayer2.n;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lm9 implements vwt
{
    public final byte[] a;
    
    public lm9() {
        this.a = new byte[4096];
    }
    
    public final void a(final gxj gxj, final int n) {
        gxj.E(n);
    }
    
    public final void b(final long n, final int n2, final int n3, final int n4, final vwt$a vwt$a) {
    }
    
    public final int c(final k88 k88, final int n, final boolean b) {
        return this.f(k88, n, b);
    }
    
    public final void d(final gxj gxj, final int n) {
        gxj.E(n);
    }
    
    public final void e(final n n) {
    }
    
    public final int f(final k88 k88, int n, final boolean b) throws IOException {
        n = Math.min(this.a.length, n);
        n = k88.b(this.a, 0, n);
        if (n != -1) {
            return n;
        }
        if (b) {
            return -1;
        }
        throw new EOFException();
    }
}
