import com.twitter.ui.components.button.compose.HorizonComposeButton;
import androidx.recyclerview.widget.RecyclerView$e;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pyk implements ilx<vyk, oyk, nyk>
{
    public final uyk D0;
    public final yv8 E0;
    public final h3e<g84> F0;
    public final wyk G0;
    public final rhh<vyk> H0;
    
    public pyk(View l0, final dej dej, final oej oej, final dtr dtr, final uyk d0, final yv8 e0, final h3e<g84> f0, final wyk g0) {
        czd.f((Object)l0, "rootView");
        czd.f((Object)dej, "ocfRichTextProcessorHelper");
        czd.f((Object)oej, "header");
        czd.f((Object)dtr, "properties");
        czd.f((Object)d0, "viewHolder");
        czd.f((Object)e0, "dialogNavDelegate");
        czd.f((Object)f0, "adapter");
        czd.f((Object)g0, "toggleHandler");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = (rhh<vyk>)q3j.g0((qsb)new qsb<rhh$a<vyk>, fzv>(this) {
            public final pyk D0;
            
            public final Object invoke(final Object o) {
                final rhh$a rhh$a = (rhh$a)o;
                czd.f((Object)rhh$a, "$this$watch");
                rhh$a.c(new foe[] { (foe)qyk.D0 }, (qsb)new ryk(this.D0));
                rhh$a.c(new foe[] { (foe)syk.D0 }, (qsb)new tyk(this.D0));
                return fzv.a;
            }
        });
        ((ViewGroup)l0).addView(((nk8)d0).D0);
        Objects.requireNonNull(d0);
        l0 = d0.L0;
        czd.e((Object)l0, "headerView");
        final kdj kdj = new kdj(l0);
        kdj.B((cym)dej, oej.a);
        kdj.q((cym)dej, oej.b);
        Objects.requireNonNull(d0);
        d0.K0.z((RecyclerView$e)f0);
        final ssv a = dtr.a;
        czd.c((Object)a);
        final String c = a.c;
        czd.c((Object)c);
        Objects.requireNonNull(d0);
        d0.M0.setText((CharSequence)c);
    }
    
    public final void T(final jbx jbx) {
        final vyk vyk = (vyk)jbx;
        czd.f((Object)vyk, "state");
        this.H0.b((Object)vyk);
    }
    
    public final void q(final Object o) {
        final nyk nyk = (nyk)o;
        czd.f((Object)nyk, "effect");
        if (nyk instanceof nyk$a) {
            this.E0.T(((nyk$a)nyk).a);
        }
        else if (nyk instanceof nyk$b) {
            ((RecyclerView$e)this.F0).f();
        }
    }
    
    public final h5j<oyk> w() {
        final HorizonComposeButton m0 = this.D0.M0;
        czd.e((Object)m0, "ctaButton");
        final h5j merge = h5j.merge((taj)aoo.f((View)m0).map((psb)new ui4((qsb)pyk$b.D0, 5)), (taj)((h5j)this.G0.b).map((psb)new x9v((qsb)pyk$c.D0, 2)));
        czd.e((Object)merge, "merge(\n        viewHolde\u2026.ItemSelected(it) }\n    )");
        return (h5j<oyk>)merge;
    }
    
    public interface a
    {
        pyk a(final View p0);
    }
}
