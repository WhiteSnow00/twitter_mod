import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.n;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ryj implements zap
{
    public n a;
    public x9t b;
    public ewt c;
    
    public ryj(final String k) {
        final n$a n$a = new n$a();
        n$a.k = k;
        this.a = new n(n$a);
    }
    
    public final void a(final rwj rwj) {
        omy.m((Object)this.b);
        final int a = cnw.a;
        Object a2 = this.b;
        synchronized (a2) {
            final long c = ((x9t)a2).c;
            long c2;
            if (c != -9223372036854775807L) {
                c2 = c + ((x9t)a2).b;
            }
            else {
                c2 = ((x9t)a2).c();
            }
            monitorexit(a2);
            final long d = this.b.d();
            if (c2 != -9223372036854775807L) {
                if (d != -9223372036854775807L) {
                    a2 = this.a;
                    if (d != ((n)a2).S0) {
                        a2 = new n$a((n)a2);
                        ((n$a)a2).o = d;
                        a2 = new n((n$a)a2);
                        this.a = (n)a2;
                        this.c.e((n)a2);
                    }
                    final int n = rwj.c - rwj.b;
                    this.c.d(rwj, n);
                    this.c.b(c2, 1, n, 0, null);
                }
            }
        }
    }
    
    public final void b(final x9t b, final nna nna, final uau.d d) {
        this.b = b;
        d.a();
        (this.c = nna.n(d.c(), 5)).e(this.a);
    }
}
