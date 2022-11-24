import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.n;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzj implements ubp
{
    public n a;
    public tat b;
    public vwt c;
    
    public gzj(final String k) {
        final n$a n$a = new n$a();
        n$a.k = k;
        this.a = new n(n$a);
    }
    
    public final void a(final gxj gxj) {
        omi.r((Object)this.b);
        final int a = rnw.a;
        Object a2 = this.b;
        synchronized (a2) {
            final long c = ((tat)a2).c;
            long c2;
            if (c != -9223372036854775807L) {
                c2 = c + ((tat)a2).b;
            }
            else {
                c2 = ((tat)a2).c();
            }
            monitorexit(a2);
            final long d = this.b.d();
            if (c2 != -9223372036854775807L) {
                if (d != -9223372036854775807L) {
                    a2 = this.a;
                    if (d != ((n)a2).U0) {
                        a2 = new n$a((n)a2);
                        ((n$a)a2).o = d;
                        a2 = new n((n$a)a2);
                        this.a = (n)a2;
                        this.c.e((n)a2);
                    }
                    final int n = gxj.c - gxj.b;
                    this.c.d(gxj, n);
                    this.c.b(c2, 1, n, 0, (vwt$a)null);
                }
            }
        }
    }
    
    public final void b(final tat b, final voa voa, final kbu$d kbu$d) {
        this.b = b;
        kbu$d.a();
        (this.c = voa.r(kbu$d.c(), 5)).e(this.a);
    }
}
