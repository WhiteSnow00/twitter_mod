import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rmo implements ViewTreeObserver$OnPreDrawListener
{
    public final smo D0;
    
    public rmo(final smo d0) {
        this.D0 = d0;
    }
    
    public final boolean onPreDraw() {
        this.D0.v1.a(sti.c.F0);
        ((ucv)this.D0).Y0.I0.j((ViewTreeObserver$OnPreDrawListener)this);
        return true;
    }
}
