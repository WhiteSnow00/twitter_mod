import java.util.Objects;
import android.animation.Animator;
import com.google.android.material.bottomappbar.BottomAppBar;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i82 extends AnimatorListenerAdapter
{
    public final /* synthetic */ BottomAppBar C0;
    
    public i82(final BottomAppBar c0) {
        this.C0 = c0;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        Objects.requireNonNull(this.C0);
        Objects.requireNonNull(this.C0);
        this.C0.v1 = null;
    }
    
    public final void onAnimationStart(final Animator animator) {
        Objects.requireNonNull(this.C0);
    }
}
