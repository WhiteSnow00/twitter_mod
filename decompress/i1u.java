import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i1u implements Animation$AnimationListener
{
    public final /* synthetic */ k1u C0;
    
    public i1u(final k1u c0) {
        this.C0 = c0;
    }
    
    public final void onAnimationEnd(final Animation animation) {
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
        ((View)this.C0.D0).setVisibility(0);
    }
}
