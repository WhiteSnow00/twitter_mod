import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ip4 implements ValueAnimator$AnimatorUpdateListener
{
    public final CollapsingToolbarLayout D0;
    
    public ip4(final CollapsingToolbarLayout d0) {
        this.D0 = d0;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.D0.setScrimAlpha((int)valueAnimator.getAnimatedValue());
    }
}
