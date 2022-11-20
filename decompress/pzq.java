import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ProgressBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pzq extends ste implements qsb<xzq, fzv>
{
    public final jzq D0;
    
    public pzq(final jzq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final xzq xzq = (xzq)o;
        czd.f((Object)xzq, "$this$distinct");
        final ProgressBar j0 = this.D0.J0;
        final boolean a = xzq.a;
        int visibility = 8;
        int visibility2;
        if (a) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        ((View)j0).setVisibility(visibility2);
        this.D0.K0.setRefreshing(xzq.b);
        final HorizontalScrollView l0 = this.D0.L0;
        if (!xzq.a && !xzq.c) {
            visibility = 0;
        }
        ((View)l0).setVisibility(visibility);
        jzq.a(this.D0, xzq.c, xzq.a);
        return fzv.a;
    }
}
