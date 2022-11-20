import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzt extends AnimatorListenerAdapter
{
    public final ts0 D0;
    public final nzt E0;
    
    public kzt(final nzt e0, final ts0 d0) {
        this.E0 = e0;
        this.D0 = d0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        ((d8q<Object, Object>)this.D0).remove(animator);
        this.E0.V0.remove(animator);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.E0.V0.add(animator);
    }
}
