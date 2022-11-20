import android.view.View;
import com.twitter.common.ui.isTalkingView.IsTalkingView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l0o extends ste implements qsb<j1o, fzv>
{
    public final k0o D0;
    
    public l0o(final k0o d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final j1o j1o = (j1o)o;
        czd.f((Object)j1o, "$this$distinct");
        final IsTalkingView h0 = this.D0.H0;
        int visibility;
        if (j1o.r) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((View)h0).setVisibility(visibility);
        final boolean r = j1o.r;
        if (!r && j1o.e) {
            this.D0.H0.c();
        }
        else if (!r && !j1o.e) {
            this.D0.H0.a();
        }
        return fzv.a;
    }
}
