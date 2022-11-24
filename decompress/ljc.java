import android.view.ViewGroup;
import android.view.View;
import tv.periscope.android.ui.love.HeartView$a;
import android.graphics.drawable.AnimationDrawable;
import tv.periscope.android.ui.love.HeartContainerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ljc implements rk6
{
    public final HeartContainerView F0;
    public final boolean G0;
    public final AnimationDrawable H0;
    public final long I0;
    public final long J0;
    
    public ljc(final HeartContainerView f0, final boolean g0, final AnimationDrawable h0, final long i0, final long j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final void accept(final Object o) {
        final HeartContainerView f0 = this.F0;
        final boolean g0 = this.G0;
        final AnimationDrawable h0 = this.H0;
        final long i0 = this.I0;
        final long j0 = this.J0;
        final ozr ozr = (ozr)o;
        int i2;
        int n;
        if (g0) {
            i2 = f0.I0 + f0.J0;
            n = f0.K0;
        }
        else {
            i2 = f0.I0;
            n = f0.J0;
        }
        f0.F0.b((View)ozr, (ViewGroup)f0, i2 + n, g0, HeartView$a.J0);
        if (g0) {
            ++f0.K0;
        }
        else {
            ++f0.J0;
        }
        if (h0 != null) {
            ozr.e(i0 / j0, j0);
        }
    }
}
