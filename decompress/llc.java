import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class llc implements ViewTreeObserver$OnPreDrawListener
{
    public final mlc D0;
    
    public llc(final mlc d0) {
        this.D0 = d0;
    }
    
    public final boolean onPreDraw() {
        final mlc d0 = this.D0;
        final View k0 = d0.b.K0;
        final boolean b = false;
        if ((k0 == null || k0.getVisibility() != 0) && !d0.i) {
            d0.a().f((taf)taf$w.a);
            d0.i = true;
        }
        if (!d0.h) {
            d0.h = true;
            d0.a().f((taf)new taf$u(d0.b.G1().f().getSize()));
            d0.e = hq1.b();
        }
        if (d0.j) {
            final View k2 = d0.b.K0;
            int n = b ? 1 : 0;
            if (k2 != null) {
                n = (b ? 1 : 0);
                if (k2.getVisibility() == 0) {
                    n = 1;
                }
            }
            if (n == 0) {
                d0.a().f((taf)taf$h.a);
                d0.e = hq1.b();
            }
            d0.c.j((ViewTreeObserver$OnPreDrawListener)d0.f);
        }
        return true;
    }
}
