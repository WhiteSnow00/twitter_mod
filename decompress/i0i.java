import android.content.Context;
import android.view.View;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i0i implements ilx<k0i, f0i, e0i>, mx9<e0i>
{
    public final n0i D0;
    public final TextView E0;
    public final HorizonComposeButton F0;
    public final TextView G0;
    
    public i0i(final View view, final n0i d0) {
        czd.f((Object)view, "rootView");
        czd.f((Object)d0, "effectHandler");
        this.D0 = d0;
        this.E0 = (TextView)view.findViewById(2131430253);
        this.F0 = (HorizonComposeButton)view.findViewById(2131430252);
        this.G0 = (TextView)view.findViewById(2131430312);
    }
    
    public final void T(final jbx jbx) {
        czd.f((Object)jbx, "state");
    }
    
    public final Context a() {
        return ((View)this.E0).getContext();
    }
    
    public final void q(final Object o) {
        final e0i e0i = (e0i)o;
        czd.f((Object)e0i, "effect");
        this.D0.a(e0i);
    }
    
    public final h5j<f0i> w() {
        final HorizonComposeButton f0 = this.F0;
        czd.e((Object)f0, "connectWallet");
        final h5j map = aoo.f((View)f0).map((psb)new hdm((qsb)i0i$b.D0, 3));
        final TextView g0 = this.G0;
        czd.e((Object)g0, "cancel");
        final h5j map2 = aoo.f((View)g0).map((psb)new tl4((qsb)i0i$c.D0, 26));
        final h5j create = h5j.create((h9j)new h0i(this));
        czd.e((Object)create, "create { emitter ->\n    \u2026S\n            )\n        }");
        final h5j merge = h5j.merge((taj)map, (taj)map2, (taj)create.map((psb)new g0i((qsb)i0i$d.D0, 0)));
        czd.e((Object)merge, "merge(\n        connectWa\u2026LearnMoreClicked },\n    )");
        return (h5j<f0i>)merge;
    }
    
    public interface a
    {
        i0i a(final View p0);
    }
}
