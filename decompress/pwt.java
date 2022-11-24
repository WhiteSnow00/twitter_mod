import com.google.android.exoplayer2.n;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pwt
{
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final n f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    public final qwt[] k;
    
    public pwt(final int a, final int b, final long c, final long d, final long e, final n f, final int g, final qwt[] k, final int j, final long[] h, final long[] i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.k = k;
        this.j = j;
        this.h = h;
        this.i = i;
    }
    
    public final qwt a(final int n) {
        final qwt[] k = this.k;
        qwt qwt;
        if (k == null) {
            qwt = null;
        }
        else {
            qwt = k[n];
        }
        return qwt;
    }
}
