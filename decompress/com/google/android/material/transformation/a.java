// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class a implements ValueAnimator$AnimatorUpdateListener
{
    public final /* synthetic */ View C0;
    
    public a(final View c0) {
        this.C0 = c0;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.C0.invalidate();
    }
}
