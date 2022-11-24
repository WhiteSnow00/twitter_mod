import android.view.View;
import android.animation.ValueAnimator;
import com.google.android.material.textfield.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pd4 implements ValueAnimator$AnimatorUpdateListener
{
    public final a F0;
    
    public pd4(final a f0) {
        this.F0 = f0;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final float floatValue = (float)valueAnimator.getAnimatedValue();
        ((View)((b5a)this.F0).c).setScaleX(floatValue);
        ((View)((b5a)this.F0).c).setScaleY(floatValue);
    }
}
