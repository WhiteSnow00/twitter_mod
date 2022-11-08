// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.View;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class a implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ BaseTransientBottomBar C0;
    
    public a(final BaseTransientBottomBar c0) {
        this.C0 = c0;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        ((View)this.C0.c).setAlpha((float)valueAnimator.getAnimatedValue());
    }
}
