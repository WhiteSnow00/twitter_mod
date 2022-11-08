import java.util.Objects;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fhf implements okx<thf, Object, ogf>, ay9<ogf>
{
    public final /* synthetic */ pgf C0;
    public final View D0;
    public final TextView E0;
    public final TextView F0;
    public final View G0;
    public final ImageView H0;
    public final mhh<thf> I0;
    
    public fhf(final View view, final pgf c0) {
        zzd.f((Object)view, "rootView");
        zzd.f((Object)c0, "effectHandler");
        this.C0 = c0;
        this.D0 = view.findViewById(2131429763);
        this.E0 = (TextView)view.findViewById(2131429759);
        this.F0 = (TextView)view.findViewById(2131429760);
        this.G0 = view.findViewById(2131429623);
        this.H0 = (ImageView)view.findViewById(2131429761);
        this.I0 = (mhh<thf>)ajy.a0((rtb)new fhf$b(this));
    }
    
    public final void T(final oax oax) {
        final thf thf = (thf)oax;
        zzd.f((Object)thf, "state");
        this.I0.b((Object)thf);
    }
    
    public final void s(final Object o) {
        final ogf ogf = (ogf)o;
        zzd.f((Object)ogf, "effect");
        final pgf c0 = this.C0;
        Objects.requireNonNull(c0);
        if (ogf instanceof ogf.a) {
            c0.C0.c(((ogf.a)ogf).a);
        }
    }
    
    public final b5j<Object> x() {
        final View d0 = this.D0;
        zzd.e((Object)d0, "moduleView");
        final b5j mergeArray = b5j.mergeArray(new naj[] { (naj)asy.q(d0).map((qtb)new c9v((rtb)fhf$a.C0, 16)) });
        zzd.e((Object)mergeArray, "mergeArray(\n        modu\u2026leClicked\n        }\n    )");
        return (b5j<Object>)mergeArray;
    }
}
