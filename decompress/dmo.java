import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmo implements ViewTreeObserver$OnPreDrawListener
{
    public final /* synthetic */ emo C0;
    
    public dmo(final emo c0) {
        this.C0 = c0;
    }
    
    public final boolean onPreDraw() {
        this.C0.u1.a(qti.c.E0);
        this.C0.X0.H0.j((ViewTreeObserver$OnPreDrawListener)this);
        return true;
    }
}
