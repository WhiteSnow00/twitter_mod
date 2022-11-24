import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.n;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbw
{
    public final List<n> a;
    public final vwt[] b;
    
    public cbw(final List<n> a) {
        this.a = a;
        this.b = new vwt[a.size()];
    }
    
    public final void a(final long n, final gxj gxj) {
        if (gxj.c - gxj.b < 9) {
            return;
        }
        final int e = gxj.e();
        final int e2 = gxj.e();
        final int t = gxj.t();
        if (e == 434 && e2 == 1195456820 && t == 3) {
            co3.b(n, gxj, this.b);
        }
    }
    
    public final void b(final voa voa, final kbu$d kbu$d) {
        for (int i = 0; i < this.b.length; ++i) {
            kbu$d.a();
            final vwt r = voa.r(kbu$d.c(), 3);
            final n n = this.a.get(i);
            final String q0 = n.Q0;
            final boolean b = "application/cea-608".equals(q0) || "application/cea-708".equals(q0);
            final String value = String.valueOf(q0);
            String concat;
            if (value.length() != 0) {
                concat = "Invalid closed caption mime type provided: ".concat(value);
            }
            else {
                concat = new String("Invalid closed caption mime type provided: ");
            }
            omi.n(b, (Object)concat);
            final n$a n$a = new n$a();
            n$a.a = kbu$d.b();
            n$a.k = q0;
            n$a.d = n.I0;
            n$a.c = n.H0;
            n$a.C = n.i1;
            n$a.m = n.S0;
            r.e(new n(n$a));
            this.b[i] = r;
        }
    }
}
