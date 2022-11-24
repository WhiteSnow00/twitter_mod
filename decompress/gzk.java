import com.twitter.ui.components.button.compose.HorizonComposeButton;
import androidx.recyclerview.widget.RecyclerView$e;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzk implements xlx<mzk, fzk, ezk>
{
    public final lzk F0;
    public final ex8 G0;
    public final j4e<l94> H0;
    public final nzk I0;
    public final fih<mzk> J0;
    
    public gzk(View n0, final qej qej, final afj afj, final bur bur, final lzk f0, final ex8 g0, final j4e<l94> h0, final nzk i0) {
        e0e.f((Object)n0, "rootView");
        e0e.f((Object)qej, "ocfRichTextProcessorHelper");
        e0e.f((Object)afj, "header");
        e0e.f((Object)bur, "properties");
        e0e.f((Object)f0, "viewHolder");
        e0e.f((Object)g0, "dialogNavDelegate");
        e0e.f((Object)h0, "adapter");
        e0e.f((Object)i0, "toggleHandler");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = (fih<mzk>)ma7.S((stb)new stb<fih$a<mzk>, vzv>(this) {
            public final gzk F0;
            
            public final Object invoke(final Object o) {
                final fih$a fih$a = (fih$a)o;
                e0e.f((Object)fih$a, "$this$watch");
                fih$a.c(new dpe[] { (dpe)hzk.F0 }, (stb)new izk(this.F0));
                fih$a.c(new dpe[] { (dpe)jzk.F0 }, (stb)new kzk(this.F0));
                return vzv.a;
            }
        });
        ((ViewGroup)n0).addView(((sl8)f0).F0);
        Objects.requireNonNull(f0);
        n0 = f0.N0;
        e0e.e((Object)n0, "headerView");
        final xdj xdj = new xdj(n0);
        xdj.B((tym)qej, afj.a);
        xdj.q((tym)qej, afj.b);
        Objects.requireNonNull(f0);
        f0.M0.z((RecyclerView$e)h0);
        final dtv a = bur.a;
        e0e.c((Object)a);
        final String c = a.c;
        e0e.c((Object)c);
        Objects.requireNonNull(f0);
        f0.O0.setText((CharSequence)c);
    }
    
    public final void T(final ccx ccx) {
        final mzk mzk = (mzk)ccx;
        e0e.f((Object)mzk, "state");
        this.J0.b((Object)mzk);
    }
    
    public final void r(final Object o) {
        final ezk ezk = (ezk)o;
        e0e.f((Object)ezk, "effect");
        if (ezk instanceof ezk$a) {
            this.G0.T(((ezk$a)ezk).a);
        }
        else if (ezk instanceof ezk$b) {
            ((RecyclerView$e)this.H0).f();
        }
    }
    
    public final t5j<fzk> w() {
        final HorizonComposeButton o0 = this.F0.O0;
        e0e.e((Object)o0, "ctaButton");
        final t5j merge = t5j.merge((fbj)too.f((View)o0).map((rtb)new yj4((stb)gzk$b.F0, 5)), (fbj)((t5j)this.I0.b).map((rtb)new nav((stb)gzk$c.F0, 2)));
        e0e.e((Object)merge, "merge(\n        viewHolde\u2026.ItemSelected(it) }\n    )");
        return (t5j<fzk>)merge;
    }
}
