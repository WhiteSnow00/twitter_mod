import android.animation.AnimatorSet;
import java.util.Objects;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class znq extends AnimatorListenerAdapter
{
    public final xnq D0;
    
    public znq(final xnq d0) {
        this.D0 = d0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        czd.f((Object)animator, "animation");
        final xnq.a companion = xnq.Companion;
        final AnimatorSet e = this.D0.e;
        Objects.requireNonNull(companion);
        e.setStartDelay(200L);
        e.start();
    }
}
