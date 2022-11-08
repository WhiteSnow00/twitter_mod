// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.View;
import android.os.Handler;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class d implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ BaseTransientBottomBar C0;
    
    public d(final BaseTransientBottomBar c0) {
        this.C0 = c0;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final int intValue = (int)valueAnimator.getAnimatedValue();
        final Handler n = BaseTransientBottomBar.n;
        ((View)this.C0.c).setTranslationY((float)intValue);
    }
}
