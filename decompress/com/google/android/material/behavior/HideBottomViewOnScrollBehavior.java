// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.behavior;

import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;

public class HideBottomViewOnScrollBehavior<V extends View> extends c<V>
{
    public int a;
    public int b;
    public int c;
    public ViewPropertyAnimator d;
    
    public HideBottomViewOnScrollBehavior() {
        this.a = 0;
        this.b = 2;
        this.c = 0;
    }
    
    public HideBottomViewOnScrollBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
        this.b = 2;
        this.c = 0;
    }
    
    @Override
    public boolean i(final CoordinatorLayout coordinatorLayout, final V v, final int n) {
        this.a = v.getMeasuredHeight() + ((ViewGroup$MarginLayoutParams)v.getLayoutParams()).bottomMargin;
        return false;
    }
    
    @Override
    public final void m(final CoordinatorLayout coordinatorLayout, final V v, final View view, int n, final int n2, int n3, final int n4, final int n5, final int[] array) {
        n = 1;
        n3 = 0;
        if (n2 > 0) {
            n = n3;
            if (this.b == 1) {
                n = 1;
            }
            if (n == 0) {
                final ViewPropertyAnimator d = this.d;
                if (d != null) {
                    d.cancel();
                    v.clearAnimation();
                }
                this.b = 1;
                this.t(v, this.a + this.c, 175L, (TimeInterpolator)kc0.c);
            }
        }
        else if (n2 < 0) {
            if (this.b != 2) {
                n = 0;
            }
            if (n == 0) {
                final ViewPropertyAnimator d2 = this.d;
                if (d2 != null) {
                    d2.cancel();
                    v.clearAnimation();
                }
                this.b = 2;
                this.t(v, 0, 225L, (TimeInterpolator)kc0.d);
            }
        }
    }
    
    @Override
    public boolean q(final CoordinatorLayout coordinatorLayout, final V v, final View view, final View view2, final int n, int n2) {
        if (view2 == 2) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        return n2 != 0;
    }
    
    public final void t(final V v, final int n, final long duration, final TimeInterpolator interpolator) {
        this.d = v.animate().translationY((float)n).setInterpolator(interpolator).setDuration(duration).setListener((Animator$AnimatorListener)new HideBottomViewOnScrollBehavior$a(this));
    }
}
