import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ha4 extends AnimatorListenerAdapter
{
    public final ka4 D0;
    
    public ha4(final ka4 d0) {
        this.D0 = d0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.D0.b();
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.D0.a();
    }
}
