import java.util.Objects;
import android.animation.Animator;
import com.google.android.material.bottomappbar.BottomAppBar;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n82 extends AnimatorListenerAdapter
{
    public final BottomAppBar F0;
    
    public n82(final BottomAppBar f0) {
        this.F0 = f0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        Objects.requireNonNull(this.F0);
        Objects.requireNonNull(this.F0);
        this.F0.y1 = null;
    }
    
    public final void onAnimationStart(final Animator animator) {
        Objects.requireNonNull(this.F0);
    }
}
