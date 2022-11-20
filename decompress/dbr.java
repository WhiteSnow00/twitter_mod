import android.view.View;
import com.twitter.common.ui.isTalkingView.IsTalkingView;
import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbr extends ste implements qsb<pbr, fzv>
{
    public final bbr D0;
    
    public dbr(final bbr d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pbr pbr = (pbr)o;
        czd.f((Object)pbr, "$this$distinct");
        final IsTalkingView h0 = this.D0.H0;
        int visibility;
        if (pbr.f) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)h0).setVisibility(visibility);
        if (pbr.f) {
            this.D0.H0.c();
        }
        else {
            this.D0.H0.e();
        }
        final int ordinal = ((Enum)pbr.b).ordinal();
        int n = 0;
        Label_0121: {
            if (ordinal != 0) {
                if (ordinal == 1) {
                    n = this.D0.N0;
                    break Label_0121;
                }
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            n = this.D0.O0;
        }
        this.D0.H0.f(n);
        return fzv.a;
    }
}
