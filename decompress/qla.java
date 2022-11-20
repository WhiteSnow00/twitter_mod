import androidx.preference.Preference$e;
import androidx.preference.Preference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qla implements ilx<wla, mla, rla>
{
    public final obi<?> D0;
    public final qft E0;
    public final mia F0;
    public final qla.qla$a G0;
    
    public qla(final bnd bnd, final obi<?> d0, final qft e0, final mia f0) {
        czd.f((Object)d0, "navigator");
        czd.f((Object)e0, "toaster");
        czd.f((Object)f0, "exploreImmersiveFeatures");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        final qla.qla$a g0 = new qla.qla$a(bnd);
        this.G0 = g0;
        ((Preference)g0.c).U(f0.isEnabled() || !s9c.d());
        g0.a.U(false);
        g0.a.I0 = (Preference$e)new pla(this, (ym)new yja());
    }
    
    public final void T(final jbx jbx) {
        final wla wla = (wla)jbx;
        czd.f((Object)wla, "state");
        if (wla.b) {
            this.G0.a.M(false);
            ((Preference)this.G0.b).M(false);
            ((Preference)this.G0.d).M(false);
        }
        else if (wla.c) {
            this.G0.a.M(false);
            ((Preference)this.G0.b).M(false);
            ((Preference)this.G0.d).M(false);
        }
        else {
            this.G0.a.R((CharSequence)wla.a.c);
            this.G0.a.M(wla.a.a ^ true);
            this.G0.a.U(wla.a.a ^ true);
            this.G0.b.Y(wla.a.a);
            ((Preference)this.G0.b).M(true);
            this.G0.d.Y(wla.a.d);
            ((Preference)this.G0.d).M(true);
        }
    }
    
    public final void q(final Object o) {
        final rla rla = (rla)o;
        czd.f((Object)rla, "effect");
        if (rla instanceof m4q) {
            this.E0.c(2131954014, 0);
        }
    }
    
    public final h5j<mla> w() {
        final h5j merge = h5j.merge((taj)aoo.a(this.G0.b).map((psb)new nla((qsb)qla$b.D0, 0)), (taj)aoo.a(this.G0.d).map((psb)new ola((qsb)qla$c.D0, 0)));
        czd.e((Object)merge, "merge(\n            vh.my\u2026alizePref(it) }\n        )");
        return (h5j<mla>)merge;
    }
}
