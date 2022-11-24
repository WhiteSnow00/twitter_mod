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

public final class o82 extends AnimatorListenerAdapter
{
    public boolean F0;
    public final ActionMenuView G0;
    public final int H0;
    public final boolean I0;
    public final BottomAppBar J0;
    
    public o82(final BottomAppBar j0, final ActionMenuView g0, final int h0, final boolean i0) {
        this.J0 = j0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.F0 = true;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        if (!this.F0) {
            final BottomAppBar j0 = this.J0;
            final int c1 = j0.C1;
            final boolean b = c1 != 0;
            if (c1 != 0) {
                j0.C1 = 0;
                ((Toolbar)j0).getMenu().clear();
                ((Toolbar)j0).p(c1);
            }
            final BottomAppBar j2 = this.J0;
            final ActionMenuView g0 = this.G0;
            final int h0 = this.H0;
            final boolean i0 = this.I0;
            Objects.requireNonNull(j2);
            final p82 p = new p82(j2, g0, h0, i0);
            if (b) {
                ((View)g0).post((Runnable)p);
            }
            else {
                p.run();
            }
        }
    }
}
