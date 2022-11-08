import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmu implements ViewTreeObserver$OnPreDrawListener
{
    public final /* synthetic */ ViewTreeObserver C0;
    public final /* synthetic */ lev D0;
    public final /* synthetic */ View E0;
    public final /* synthetic */ emu F0;
    
    public fmu(final emu f0, final ViewTreeObserver c0, final lev d0, final View e0) {
        this.F0 = f0;
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final boolean onPreDraw() {
        if (this.C0.isAlive()) {
            this.C0.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        }
        this.D0.Z0 = this.E0.getHeight() * 100000 / this.F0.H0;
        return true;
    }
}
