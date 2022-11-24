import android.view.ViewGroup;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h5p implements onf$b
{
    public final udv F0;
    public final g5p G0;
    
    public h5p(final g5p g0, final udv f0) {
        this.G0 = g0;
        this.F0 = f0;
    }
    
    public final void M(final int n) {
    }
    
    public final void V(final onf onf) {
    }
    
    public final void a0(final onf onf) {
    }
    
    public final void f(final onf onf) {
    }
    
    public final void l(final onf onf) {
    }
    
    public final void p(final onf onf) {
    }
    
    public final void s(final onf onf, int g, int d, int n, final boolean b) {
        if (g > 1) {
            return;
        }
        if (d > 0) {
            d = this.G0.d;
            if (d > 0) {
                if (g == 0) {
                    final RecyclerView b2 = ((n7m)onf).b;
                    d = 0;
                    g = 0;
                    final View child = ((ViewGroup)b2).getChildAt(0);
                    if (child != null) {
                        n = child.getTop();
                        d = -n;
                        if (n != 0) {
                            g = this.G0.f;
                        }
                        d -= g;
                    }
                }
                final g5p g2 = this.G0;
                g = g2.d;
                n = g2.c;
                g = Math.max(-d, -(g - n));
                final g5p g3 = this.G0;
                final f5p a = g3.a;
                if (a != null) {
                    if (g3.h) {
                        a.e0(g3.g = g, g3.e);
                    }
                    else {
                        ((View)((n7m)onf).b).post((Runnable)new oit((Object)this, 14));
                    }
                }
            }
        }
    }
    
    public final void u(final onf onf, int n) {
        if (this.G0.q != -1 && n == 0) {
            if (((n7m)onf).v().a > 1) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                this.F0.V1(1, this.G0.q, false);
            }
            this.G0.q = -1;
        }
    }
}
