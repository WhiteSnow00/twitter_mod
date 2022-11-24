import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lno implements ViewTreeObserver$OnPreDrawListener
{
    public final mno F0;
    
    public lno(final mno f0) {
        this.F0 = f0;
    }
    
    public final boolean onPreDraw() {
        this.F0.x1.a(jui$c.H0);
        ((idv)this.F0).a1.K0.j((ViewTreeObserver$OnPreDrawListener)this);
        return true;
    }
}
