import android.content.Context;
import com.twitter.ui.widget.TintableImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yer extends ste implements qsb<b2o, fzv>
{
    public final xbr$b D0;
    public final ver E0;
    public final afr F0;
    
    public yer(final xbr$b d0, final ver e0, final afr f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final b2o b2o = (b2o)o;
        if (czd.a((Object)b2o.a, (Object)this.D0.a.h)) {
            final ver e0 = this.E0;
            final afr f0 = this.F0;
            final TintableImageView d1 = f0.d1;
            final Context context = f0.getHeldView().getContext();
            czd.e((Object)context, "heldView.context");
            final r21 a = this.D0.a;
            if (b2o.b) {
                e0.o(d1, context);
                e0.n(d1, context, a);
            }
            else {
                e0.q(d1, context);
                e0.p(d1, context, a);
            }
        }
        return fzv.a;
    }
}
