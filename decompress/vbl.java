import android.view.ViewStub;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vbl implements xlx
{
    public final View F0;
    public final k9x G0;
    public final View H0;
    public final ViewStub I0;
    public final View J0;
    public final ViewStub K0;
    public final View L0;
    public final View M0;
    public final View N0;
    public final View O0;
    public final View P0;
    
    public vbl(final View f0, final k9x g0) {
        e0e.f((Object)f0, "rootView");
        e0e.f((Object)g0, "viewLifecycle");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = f0.findViewById(2131427375);
        this.I0 = (ViewStub)f0.findViewById(2131427378);
        this.J0 = f0.findViewById(2131427376);
        this.K0 = (ViewStub)f0.findViewById(2131427377);
        this.L0 = f0.findViewById(2131430241);
        this.M0 = f0.findViewById(2131431442);
        this.N0 = f0.findViewById(2131429763);
        this.O0 = f0.findViewById(2131430075);
        this.P0 = f0.findViewById(2131430358);
    }
    
    public final void T(final ccx ccx) {
        final ncl ncl = (ncl)ccx;
        e0e.f((Object)ncl, "state");
        final int a = ncl.a;
        final int n = 1;
        if (a == 1) {
            final boolean b = c5l.Companion.b();
            if (b && ((View)this.K0).getParent() != null) {
                this.K0.inflate();
            }
            else if (!b && ((View)this.I0).getParent() != null) {
                this.I0.inflate();
            }
        }
        final View h0 = this.H0;
        e0e.e((Object)h0, "aboutViewContainer");
        final int n2 = 0;
        int visibility;
        if (a == 1 && !c5l.Companion.b()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        h0.setVisibility(visibility);
        final View j0 = this.J0;
        e0e.e((Object)j0, "aboutViewControllerV1");
        int visibility2;
        if (a == 1 && c5l.Companion.b()) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        j0.setVisibility(visibility2);
        final View l0 = this.L0;
        e0e.e((Object)l0, "newsletterContainer");
        int visibility3;
        if (a == 2) {
            visibility3 = 0;
        }
        else {
            visibility3 = 8;
        }
        l0.setVisibility(visibility3);
        final View m0 = this.M0;
        e0e.e((Object)m0, "shopModuleContainer");
        int visibility4;
        if (a == 3) {
            visibility4 = 0;
        }
        else {
            visibility4 = 8;
        }
        m0.setVisibility(visibility4);
        final View n3 = this.N0;
        e0e.e((Object)n3, "linkModuleContainer");
        int visibility5;
        if (a == 4) {
            visibility5 = 0;
        }
        else {
            visibility5 = 8;
        }
        n3.setVisibility(visibility5);
        final View o0 = this.O0;
        e0e.e((Object)o0, "mobileAppModuleContainer");
        int visibility6;
        if (a == 5) {
            visibility6 = 0;
        }
        else {
            visibility6 = 8;
        }
        o0.setVisibility(visibility6);
        final View p = this.P0;
        e0e.e((Object)p, "noModuleContainer");
        int visibility7;
        if (a == 6) {
            visibility7 = 0;
        }
        else {
            visibility7 = 8;
        }
        p.setVisibility(visibility7);
        final View f0 = this.F0;
        int n4;
        if (a != 7) {
            n4 = n;
        }
        else {
            n4 = 0;
        }
        int visibility8;
        if (n4 != 0) {
            visibility8 = n2;
        }
        else {
            visibility8 = 8;
        }
        f0.setVisibility(visibility8);
    }
    
    public final void r(final Object o) {
    }
    
    public final t5j<wbl> w() {
        final t5j map = this.G0.l().map((rtb)new zj4((stb)vbl$a.F0, 22));
        e0e.e((Object)map, "viewLifecycle.observeSho\u2026ent.OnViewShown\n        }");
        return (t5j<wbl>)map;
    }
}
