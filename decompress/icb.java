import android.view.ViewGroup;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.view.animation.Animation$AnimationListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class icb implements Animation$AnimationListener
{
    public final /* synthetic */ ImageView C0;
    public final /* synthetic */ lcb D0;
    
    public icb(final lcb d0, final ImageView c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    public final void onAnimationEnd(final Animation animation) {
        ((ViewGroup)this.D0).removeView((View)this.C0);
    }
    
    public final void onAnimationRepeat(final Animation animation) {
    }
    
    public final void onAnimationStart(final Animation animation) {
    }
}
