import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x1u implements Animation$AnimationListener
{
    public final z1u D0;
    
    public x1u(final z1u d0) {
        this.D0 = d0;
    }
    
    public final void onAnimationEnd(final Animation animation) {
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
        ((View)this.D0.E0).setVisibility(0);
    }
}
