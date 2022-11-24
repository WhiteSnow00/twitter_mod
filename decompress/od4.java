import android.animation.Animator;
import com.google.android.material.textfield.a;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class od4 extends AnimatorListenerAdapter
{
    public final a F0;
    
    public od4(final a f0) {
        this.F0 = f0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        ((b5a)this.F0).a.setEndIconVisible(false);
    }
}
