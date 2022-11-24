import android.view.View;
import com.twitter.common.ui.isTalkingView.IsTalkingView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e1o extends pue implements stb<c2o, vzv>
{
    public final d1o F0;
    
    public e1o(final d1o f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final c2o c2o = (c2o)o;
        e0e.f((Object)c2o, "$this$distinct");
        final IsTalkingView j0 = this.F0.J0;
        int visibility;
        if (c2o.r) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((View)j0).setVisibility(visibility);
        final boolean r = c2o.r;
        if (!r && c2o.e) {
            this.F0.J0.c();
        }
        else if (!r && !c2o.e) {
            this.F0.J0.a();
        }
        return vzv.a;
    }
}
