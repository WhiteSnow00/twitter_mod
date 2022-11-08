// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Objects;

public final class f implements Runnable
{
    public final /* synthetic */ BaseTransientBottomBar C0;
    
    public f(final BaseTransientBottomBar c0) {
        this.C0 = c0;
    }
    
    @Override
    public final void run() {
        final BaseTransientBottomBar$g c = this.C0.c;
        if (c == null) {
            return;
        }
        if (((View)c).getParent() != null) {
            ((View)this.C0.c).setVisibility(0);
        }
        if (this.C0.c.getAnimationMode() == 1) {
            final BaseTransientBottomBar c2 = this.C0;
            Objects.requireNonNull(c2);
            final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
            ofFloat.setInterpolator((TimeInterpolator)kc0.a);
            ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new a(c2));
            final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[] { 0.8f, 1.0f });
            ofFloat2.setInterpolator((TimeInterpolator)kc0.d);
            ofFloat2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new b(c2));
            final AnimatorSet set = new AnimatorSet();
            set.playTogether(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2 });
            set.setDuration(150L);
            ((Animator)set).addListener((Animator$AnimatorListener)new zq1(c2));
            set.start();
        }
        else {
            final BaseTransientBottomBar c3 = this.C0;
            final int c4 = c3.c();
            ((View)c3.c).setTranslationY((float)c4);
            final ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[] { c4, 0 });
            valueAnimator.setInterpolator((TimeInterpolator)kc0.b);
            valueAnimator.setDuration(250L);
            ((Animator)valueAnimator).addListener((Animator$AnimatorListener)new wq1(c3));
            valueAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new c(c3, c4));
            valueAnimator.start();
        }
    }
}
