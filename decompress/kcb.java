import android.view.ViewGroup;
import android.animation.Animator;
import android.view.View;
import android.animation.Animator$AnimatorListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcb implements Animator$AnimatorListener
{
    public final /* synthetic */ View C0;
    public final /* synthetic */ lcb D0;
    
    public kcb(final lcb d0, final View c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        ((ViewGroup)this.D0).removeView(this.C0);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        ((ViewGroup)this.D0).removeView(this.C0);
    }
    
    public final void onAnimationRepeat(final Animator animator) {
    }
    
    public final void onAnimationStart(final Animator animator) {
    }
}
