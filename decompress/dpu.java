import android.view.View;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpu implements View$OnAttachStateChangeListener
{
    public final View D0;
    public final cpu E0;
    public final int F0;
    
    public dpu(final View d0, final cpu e0, final int f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        czd.f((Object)view, "view");
        this.D0.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.E0.I0.setCurrentItem(this.F0);
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        czd.f((Object)view, "view");
    }
}
