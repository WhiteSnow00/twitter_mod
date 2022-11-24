import com.twitter.app.profiles.edit.bottomsheets.PronounsSpeedBumpBottomSheetFragmentArgs;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zt9 implements xlx<cu9, Object, st9>, ny9<st9>
{
    public final gx8 F0;
    public final t5j<Object> G0;
    public final tt9 H0;
    public final View I0;
    public final ynl<vzv> J0;
    
    public zt9(final duo duo, final View view, final tt9 h0, final gx8 f0, final t5j<Object> g0) {
        e0e.f((Object)duo, "savedStateHandler");
        e0e.f((Object)view, "rootView");
        e0e.f((Object)h0, "effectHandler");
        e0e.f((Object)f0, "dialogOpener");
        e0e.f((Object)g0, "toolbarIntentObservable");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final View viewById = view.findViewById(2131431307);
        e0e.e((Object)viewById, "rootView.findViewById(R.id.see_examples_text)");
        this.I0 = viewById;
        this.J0 = (ynl<vzv>)new ynl();
    }
    
    public final void T(final ccx ccx) {
        final cu9 cu9 = (cu9)ccx;
        e0e.f((Object)cu9, "state");
        if (cu9.b) {
            this.F0.d((lw8)new PronounsSpeedBumpBottomSheetFragmentArgs(), (px8)px8$a.F0).w((rtb)new mav((stb)au9.F0, 7)).F((rk6)this.J0);
        }
    }
    
    public final void r(final Object o) {
        final st9 st9 = (st9)o;
        e0e.f((Object)st9, "effect");
        this.H0.a(st9);
    }
    
    public final t5j<Object> w() {
        final t5j merge = t5j.merge((Iterable)shw.y0((Object[])new t5j[] { vq9.a(this.I0).map((rtb)new yj4((stb)zt9$b.F0, 12)), ((t5j)this.J0).map((rtb)new nav((stb)zt9$c.F0, 12)), this.G0 }));
        e0e.e((Object)merge, "merge(\n        listOf(\n \u2026bservable\n        )\n    )");
        return (t5j<Object>)merge;
    }
}
