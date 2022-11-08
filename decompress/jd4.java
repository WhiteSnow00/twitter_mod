import android.animation.Animator;
import com.google.android.material.textfield.a;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jd4 extends AnimatorListenerAdapter
{
    public final /* synthetic */ a C0;
    
    public jd4(final a c0) {
        this.C0 = c0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        ((p4a)this.C0).a.setEndIconVisible(false);
    }
}
