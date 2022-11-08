import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.animation.ValueAnimator$AnimatorUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f92 implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ BottomSheetBehavior C0;
    
    public f92(final BottomSheetBehavior c0) {
        this.C0 = c0;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final float floatValue = (float)valueAnimator.getAnimatedValue();
        final qng h = this.C0.h;
        if (h != null) {
            h.r(floatValue);
        }
    }
}
