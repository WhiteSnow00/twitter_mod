import android.view.View;
import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wpp extends ste implements qsb<xpp, fzv>
{
    public final opp D0;
    
    public wpp(final opp d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final xpp xpp = (xpp)o;
        czd.f((Object)xpp, "$this$distinct");
        final opp d0 = this.D0;
        final List b = xpp.b;
        Objects.requireNonNull(d0);
        if (b.isEmpty()) {
            ((View)d0.H0).setVisibility(8);
        }
        else {
            ((View)d0.H0).setVisibility(0);
            d0.D0.g(b);
        }
        return fzv.a;
    }
}
