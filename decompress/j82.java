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

public final class j82 extends AnimatorListenerAdapter
{
    public boolean C0;
    public final /* synthetic */ ActionMenuView D0;
    public final /* synthetic */ int E0;
    public final /* synthetic */ boolean F0;
    public final /* synthetic */ BottomAppBar G0;
    
    public j82(final BottomAppBar g0, final ActionMenuView d0, final int e0, final boolean f0) {
        this.G0 = g0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.C0 = true;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        if (!this.C0) {
            final BottomAppBar g0 = this.G0;
            final int z1 = g0.z1;
            final boolean b = z1 != 0;
            if (z1 != 0) {
                g0.z1 = 0;
                ((Toolbar)g0).getMenu().clear();
                ((Toolbar)g0).p(z1);
            }
            final BottomAppBar g2 = this.G0;
            final ActionMenuView d0 = this.D0;
            final int e0 = this.E0;
            final boolean f0 = this.F0;
            Objects.requireNonNull(g2);
            final k82 k82 = new k82(g2, d0, e0, f0);
            if (b) {
                ((View)d0).post((Runnable)k82);
            }
            else {
                k82.run();
            }
        }
    }
}
