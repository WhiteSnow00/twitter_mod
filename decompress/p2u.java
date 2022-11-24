import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p2u implements Animation$AnimationListener
{
    public final r2u F0;
    
    public p2u(final r2u f0) {
        this.F0 = f0;
    }
    
    public final void onAnimationEnd(final Animation animation) {
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
        ((View)this.F0.G0).setVisibility(0);
    }
}
