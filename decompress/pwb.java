import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pwb implements ViewTreeObserver$OnGlobalLayoutListener
{
    public final ViewTreeObserver D0;
    public final String E0;
    public final String F0;
    public final String G0;
    public final owb H0;
    
    public pwb(final owb h0, final ViewTreeObserver d0, final String e0, final String f0, final String g0) {
        this.H0 = h0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onGlobalLayout() {
        this.D0.removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        if (this.H0.b.getLineCount() > 2) {
            this.H0.a(this.E0, this.F0, this.G0, 0);
        }
    }
}
