// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.transformation;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.animation.AnimatorListenerAdapter;

public final class b extends AnimatorListenerAdapter
{
    public final /* synthetic */ gb4 C0;
    public final /* synthetic */ Drawable D0;
    
    public b(final gb4 c0, final Drawable d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.C0.setCircularRevealOverlayDrawable((Drawable)null);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.C0.setCircularRevealOverlayDrawable(this.D0);
    }
}
