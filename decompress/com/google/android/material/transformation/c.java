// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class c extends AnimatorListenerAdapter
{
    public final /* synthetic */ gb4 C0;
    
    public c(final gb4 c0) {
        this.C0 = c0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        final gb4$d revealInfo = this.C0.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        this.C0.setRevealInfo(revealInfo);
    }
}
