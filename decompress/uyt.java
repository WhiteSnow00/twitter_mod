import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uyt extends AnimatorListenerAdapter
{
    public final /* synthetic */ at0 C0;
    public final /* synthetic */ xyt D0;
    
    public uyt(final xyt d0, final at0 c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        ((l7q)this.C0).remove((Object)animator);
        this.D0.U0.remove(animator);
    }
    
    public final void onAnimationStart(final Animator animator) {
        this.D0.U0.add(animator);
    }
}
