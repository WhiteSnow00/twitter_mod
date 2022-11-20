import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.n;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qcp
{
    public final List<n> a;
    public final ewt[] b;
    
    public qcp(final List<n> a) {
        this.a = a;
        this.b = new ewt[a.size()];
    }
    
    public final void a(final long n, final rwj rwj) {
        dn3.a(n, rwj, this.b);
    }
    
    public final void b(final nna nna, final uau.d d) {
        for (int i = 0; i < this.b.length; ++i) {
            d.a();
            final ewt n = nna.n(d.c(), 3);
            final n n2 = this.a.get(i);
            final String o0 = n2.O0;
            final boolean b = "application/cea-608".equals(o0) || "application/cea-708".equals(o0);
            final String value = String.valueOf(o0);
            String concat;
            if (value.length() != 0) {
                concat = "Invalid closed caption mime type provided: ".concat(value);
            }
            else {
                concat = new String("Invalid closed caption mime type provided: ");
            }
            omy.h(b, (Object)concat);
            String a = n2.D0;
            if (a == null) {
                a = d.b();
            }
            final n$a n$a = new n$a();
            n$a.a = a;
            n$a.k = o0;
            n$a.d = n2.G0;
            n$a.c = n2.F0;
            n$a.C = n2.g1;
            n$a.m = n2.Q0;
            n.e(new n(n$a));
            this.b[i] = n;
        }
    }
}
