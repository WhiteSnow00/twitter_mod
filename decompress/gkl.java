import android.widget.Button;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkl implements xlx<hkl, fkl, ekl>
{
    public final View F0;
    public final ex8 G0;
    public final Button H0;
    
    public gkl(View viewById, final ex8 g0) {
        e0e.f((Object)viewById, "rootView");
        e0e.f((Object)g0, "dialogNavigationDelegate");
        this.F0 = viewById;
        this.G0 = g0;
        viewById = viewById.findViewById(2131429351);
        e0e.e((Object)viewById, "rootView.findViewById(R.id.got_it_button)");
        this.H0 = (Button)viewById;
    }
    
    public final void T(final ccx ccx) {
        e0e.f((Object)ccx, "state");
        this.F0.setVisibility(0);
    }
    
    public final void r(final Object o) {
        final ekl ekl = (ekl)o;
        e0e.f((Object)ekl, "effect");
        if (ekl instanceof ekl$a) {
            this.G0.E0();
        }
    }
    
    public final t5j<fkl> w() {
        final t5j merge = t5j.merge((Iterable)shw.x0((Object)vq9.a((View)this.H0).map((rtb)new cu1((stb)gkl$b.F0, 10))));
        e0e.e((Object)merge, "merge(\n        listOf(\n \u2026Clicked }\n        )\n    )");
        return (t5j<fkl>)merge;
    }
}
