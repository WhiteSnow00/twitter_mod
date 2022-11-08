import java.util.Iterator;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j1p<OBJECT, ERROR> extends rmm<OBJECT, ERROR>
{
    public final vom<OBJECT, ERROR> D0;
    public kmm<OBJECT, ERROR> E0;
    public tg4 F0;
    public Map<String, String> G0;
    public boolean H0;
    public boolean I0;
    public sba J0;
    public otk<tsc<OBJECT, ERROR>> K0;
    
    public j1p(final qmm<OBJECT, ERROR> qmm) {
        super((qmm)qmm);
        this.D0 = new j1p.j1p$a(this);
        this.I0 = true;
        this.K0 = (otk<tsc<OBJECT, ERROR>>)vpd.f;
    }
    
    public final void e(final ism<tsc<OBJECT, ERROR>> ism) {
        if (this.I0) {
            this.r(ism);
        }
        super.e((ism)ism);
    }
    
    public final void j(final ism<tsc<OBJECT, ERROR>> ism) {
        super.j((ism)ism);
        final tg4 f0 = this.F0;
        if (f0 != null) {
            ++f0.f;
            final tg4 i = f0.i;
            if (i != null) {
                i.p();
            }
        }
        this.x(ism, true);
    }
    
    public final void r(final ism<tsc<OBJECT, ERROR>> ism) {
        if (this.F0 != null) {
            final ijf$a ijf$a = new ijf$a(ism.c());
            final Iterator iterator = ism.b().iterator();
            while (iterator.hasNext()) {
                ((ijf)ijf$a).p((Object)((tsc)iterator.next()).f);
            }
            final tg4 f0 = this.F0;
            final List list = (List)((h4j)ijf$a).e();
            final kmm<OBJECT, ERROR> e0 = this.E0;
            pf8.r(e0);
            vg4 vg4;
            if (((cw0)e0).N()) {
                vg4 = vg4.G0;
            }
            else {
                final tsc tsc = (tsc)ism.d();
                if (tsc.b) {
                    vg4 = vg4.D0;
                }
                else if (this.K0.apply((Object)tsc)) {
                    vg4 = vg4.F0;
                }
                else {
                    vg4 = vg4.E0;
                }
            }
            final kmm<OBJECT, ERROR> e2 = this.E0;
            pf8.r(e2);
            f0.o(list, vg4, ((cw0)e2).I0.b(), asc.a());
            if (this.H0) {
                xca.a().b(((gw0)this).q(), (okm)new sg4((ug4)((h4j)this.F0).e()));
            }
        }
        final kmm<OBJECT, ERROR> e3 = this.E0;
        pf8.r(e3);
        if (!((cw0)e3).N()) {
            this.x(ism, false);
        }
    }
    
    public final void t(final ism<tsc<OBJECT, ERROR>> ism, final sba sba, final String s) {
        final tsc tsc = (tsc)ism.d();
        final zf4 zf4 = new zf4(((gw0)this).q());
        zf4.T = nca.Companion.c(sba, s).toString();
        final int a = w4j.a;
        final xsc d = tsc.d();
        if (tsc.f != null && d != null) {
            ici.b(zf4, d);
            ici.d((d0p)zf4, tsc.f.c.toString(), d);
        }
        zf4.s((long)(ism.b().size() - 1));
        if (!hr4.u((Map)this.G0)) {
            zf4.B = pjr.t((Map)this.G0);
        }
        saw.b((okm)zf4);
    }
    
    public final void x(final ism<tsc<OBJECT, ERROR>> ism, final boolean b) {
        final sba j0 = this.J0;
        if (j0 != null) {
            final tsc tsc = (tsc)ism.d();
            String s;
            if (this.K0.apply((Object)tsc)) {
                s = "success";
            }
            else if (b) {
                s = "retry";
            }
            else {
                if (tsc.c == 429) {
                    this.t(ism, j0, "rate_limit");
                }
                s = "failure";
            }
            this.t(ism, j0, s);
        }
    }
}
