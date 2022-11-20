import android.view.View;
import androidx.appcompat.widget.Toolbar;
import java.util.Objects;
import android.animation.Animator;
import com.google.android.material.bottomappbar.BottomAppBar;
import androidx.appcompat.widget.ActionMenuView;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c82 extends AnimatorListenerAdapter
{
    public boolean D0;
    public final ActionMenuView E0;
    public final int F0;
    public final boolean G0;
    public final BottomAppBar H0;
    
    public c82(final BottomAppBar h0, final ActionMenuView e0, final int f0, final boolean g0) {
        this.H0 = h0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.D0 = true;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        if (!this.D0) {
            final BottomAppBar h0 = this.H0;
            final int a1 = h0.A1;
            final boolean b = a1 != 0;
            if (a1 != 0) {
                h0.A1 = 0;
                ((Toolbar)h0).getMenu().clear();
                ((Toolbar)h0).p(a1);
            }
            final BottomAppBar h2 = this.H0;
            final ActionMenuView e0 = this.E0;
            final int f0 = this.F0;
            final boolean g0 = this.G0;
            Objects.requireNonNull(h2);
            final d82 d82 = new d82(h2, e0, f0, g0);
            if (b) {
                ((View)e0).post((Runnable)d82);
            }
            else {
                d82.run();
            }
        }
    }
}
