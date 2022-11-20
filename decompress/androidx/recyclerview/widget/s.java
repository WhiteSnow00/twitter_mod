// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class s implements ValueAnimator$AnimatorUpdateListener
{
    public final q.f D0;
    
    public s(final q.f d0) {
        this.D0 = d0;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.D0.P0 = valueAnimator.getAnimatedFraction();
    }
}
