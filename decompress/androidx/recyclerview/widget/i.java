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

public final class i extends AnimatorListenerAdapter
{
    public final RecyclerView$c0 D0;
    public final View E0;
    public final ViewPropertyAnimator F0;
    public final g G0;
    
    public i(final g g0, final RecyclerView$c0 d0, final View e0, final ViewPropertyAnimator f0) {
        this.G0 = g0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.E0.setAlpha(1.0f);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.F0.setListener((Animator$AnimatorListener)null);
        ((RecyclerView$j)this.G0).h(this.D0);
        this.G0.o.remove(this.D0);
        this.G0.s();
    }
    
    public final void onAnimationStart(final Animator animator) {
        Objects.requireNonNull(this.G0);
    }
}
