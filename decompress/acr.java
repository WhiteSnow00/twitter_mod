import android.view.View;
import com.twitter.common.ui.isTalkingView.IsTalkingView;
import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acr extends pue implements stb<mcr, vzv>
{
    public final ybr F0;
    
    public acr(final ybr f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final mcr mcr = (mcr)o;
        e0e.f((Object)mcr, "$this$distinct");
        final IsTalkingView j0 = this.F0.J0;
        int visibility;
        if (mcr.f) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)j0).setVisibility(visibility);
        if (mcr.f) {
            this.F0.J0.c();
        }
        else {
            this.F0.J0.e();
        }
        final int ordinal = ((Enum)mcr.b).ordinal();
        int n = 0;
        Label_0121: {
            if (ordinal != 0) {
                if (ordinal == 1) {
                    n = this.F0.P0;
                    break Label_0121;
                }
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            n = this.F0.Q0;
        }
        this.F0.J0.f(n);
        return vzv.a;
    }
}
