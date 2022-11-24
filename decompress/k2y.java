import android.util.Log;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k2y extends z2y
{
    public final o2y b;
    public final n5y c;
    
    public k2y(final y2y y2y, final o2y b, final n5y c) {
        this.b = b;
        this.c = c;
        super(y2y);
    }
    
    public final void a() {
        final o2y b = this.b;
        final n5y c = this.c;
        final boolean b2 = false;
        if (b.o(0)) {
            final bi6 g0 = c.G0;
            if (g0.s()) {
                final l6y h0 = c.H0;
                Objects.requireNonNull(h0, "null reference");
                final bi6 h2 = h0.H0;
                if (!h2.s()) {
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(h2)), (Throwable)new Exception());
                    b.l(h2);
                }
                else {
                    b.n = true;
                    final q2d p = h0.p();
                    Objects.requireNonNull(p, "null reference");
                    b.o = p;
                    b.p = h0.I0;
                    b.q = h0.J0;
                    b.n();
                }
            }
            else {
                int n = b2 ? 1 : 0;
                if (b.l) {
                    n = (b2 ? 1 : 0);
                    if (!g0.p()) {
                        n = 1;
                    }
                }
                if (n != 0) {
                    b.i();
                    b.n();
                }
                else {
                    b.l(g0);
                }
            }
        }
    }
}
