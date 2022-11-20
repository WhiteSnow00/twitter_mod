import java.util.Objects;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rgf implements ilx<ehf, Object, agf>, mx9<agf>
{
    public final bgf D0;
    public final View E0;
    public final TextView F0;
    public final TextView G0;
    public final View H0;
    public final ImageView I0;
    public final rhh<ehf> J0;
    
    public rgf(final View view, final bgf d0) {
        czd.f((Object)view, "rootView");
        czd.f((Object)d0, "effectHandler");
        this.D0 = d0;
        this.E0 = view.findViewById(2131429763);
        this.F0 = (TextView)view.findViewById(2131429759);
        this.G0 = (TextView)view.findViewById(2131429760);
        this.H0 = view.findViewById(2131429623);
        this.I0 = (ImageView)view.findViewById(2131429761);
        this.J0 = (rhh<ehf>)q3j.g0((qsb)new rgf$b(this));
    }
    
    public final void T(final jbx jbx) {
        final ehf ehf = (ehf)jbx;
        czd.f((Object)ehf, "state");
        this.J0.b((Object)ehf);
    }
    
    public final void q(final Object o) {
        final agf agf = (agf)o;
        czd.f((Object)agf, "effect");
        final bgf d0 = this.D0;
        Objects.requireNonNull(d0);
        if (agf instanceof agf$a) {
            d0.D0.c(((agf$a)agf).a);
        }
    }
    
    public final h5j<Object> w() {
        final View e0 = this.E0;
        czd.e((Object)e0, "moduleView");
        final h5j mergeArray = h5j.mergeArray(new taj[] { (taj)max.h(e0).map((psb)new ui4((qsb)rgf$a.D0, 17)) });
        czd.e((Object)mergeArray, "mergeArray(\n        modu\u2026leClicked\n        }\n    )");
        return (h5j<Object>)mergeArray;
    }
}
