import android.animation.Animator;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cha extends AnimatorListenerAdapter
{
    public final ExpandableTransformationBehavior D0;
    
    public cha(final ExpandableTransformationBehavior d0) {
        this.D0 = d0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        this.D0.b = null;
    }
}
