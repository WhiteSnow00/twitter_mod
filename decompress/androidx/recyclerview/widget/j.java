// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import java.util.Objects;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

public final class j extends AnimatorListenerAdapter
{
    public final RecyclerView$c0 D0;
    public final int E0;
    public final View F0;
    public final int G0;
    public final ViewPropertyAnimator H0;
    public final g I0;
    
    public j(final g i0, final RecyclerView$c0 d0, final int e0, final View f0, final int g0, final ViewPropertyAnimator h0) {
        this.I0 = i0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        if (this.E0 != 0) {
            this.F0.setTranslationX(0.0f);
        }
        if (this.G0 != 0) {
            this.F0.setTranslationY(0.0f);
        }
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.H0.setListener((Animator$AnimatorListener)null);
        ((RecyclerView$j)this.I0).h(this.D0);
        this.I0.p.remove(this.D0);
        this.I0.s();
    }
    
    public final void onAnimationStart(final Animator animator) {
        Objects.requireNonNull(this.I0);
    }
}
