import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.widget.ProgressBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvq extends ste implements qsb<vvq, fzv>
{
    public final xuq D0;
    
    public fvq(final xuq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vvq vvq = (vvq)o;
        czd.f((Object)vvq, "$this$distinct");
        final ProgressBar q0 = this.D0.Q0;
        final boolean a = vvq.a;
        final int n = 8;
        int visibility;
        if (a) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)q0).setVisibility(visibility);
        final xuq d0 = this.D0;
        final boolean c = vvq.c;
        final boolean a2 = vvq.a;
        final boolean b = c && !a2;
        final SwipeRefreshLayout r0 = d0.R0;
        int visibility2;
        if (b ^ true) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        ((View)r0).setVisibility(visibility2);
        final Group t0 = d0.T0;
        int visibility3 = n;
        if (b) {
            visibility3 = 0;
        }
        t0.setVisibility(visibility3);
        return fzv.a;
    }
}
