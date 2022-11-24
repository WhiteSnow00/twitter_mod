import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lnu implements ViewTreeObserver$OnPreDrawListener
{
    public final ViewTreeObserver F0;
    public final ufv G0;
    public final View H0;
    public final knu I0;
    
    public lnu(final knu i0, final ViewTreeObserver f0, final ufv g0, final View h0) {
        this.I0 = i0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final boolean onPreDraw() {
        if (this.F0.isAlive()) {
            this.F0.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        }
        this.G0.Z0 = this.H0.getHeight() * 100000 / this.I0.K0;
        return true;
    }
}
