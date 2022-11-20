import android.view.ViewGroup;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.view.animation.Animation$AnimationListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbb implements Animation$AnimationListener
{
    public final ImageView D0;
    public final ibb E0;
    
    public fbb(final ibb e0, final ImageView d0) {
        this.E0 = e0;
        this.D0 = d0;
    }
    
    public final void onAnimationEnd(final Animation animation) {
        ((ViewGroup)this.E0).removeView((View)this.D0);
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
    }
}
