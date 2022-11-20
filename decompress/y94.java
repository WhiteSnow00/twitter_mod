import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y94 extends AnimatorListenerAdapter
{
    public final z94 D0;
    
    public y94(final z94 d0) {
        this.D0 = d0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        this.D0.c();
        final d80 k = this.D0.k;
        if (k != null) {
            k.a();
        }
    }
}
