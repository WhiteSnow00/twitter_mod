import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ta4 extends AnimatorListenerAdapter
{
    public final /* synthetic */ va4 C0;
    
    public ta4(final va4 c0) {
        this.C0 = c0;
    }
    
    public final void onAnimationRepeat(final Animator animator) {
        super.onAnimationRepeat(animator);
        final va4 c0 = this.C0;
        c0.h = (c0.h + 4) % c0.g.c.length;
    }
}
