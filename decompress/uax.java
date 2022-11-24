import android.app.Activity;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uax extends xus
{
    public final qgd v1;
    
    public uax(final hdv hdv, final fxs fxs, final bts bts, final ii7<hp6> ii7, final def<vxs> def, final dsb dsb, final vpd vpd, final vpi<vxs> vpi, final Context context, final tc tc, final oys oys, final p1t p1t, final d4e<vxs> d4e, final fda<fo> fda, final mex mex, final sfv sfv, final xjh xjh) {
        super(hdv, fxs, bts, (ii7)ii7, (def)def, dsb, vpd, (vpi)vpi, tc, oys, p1t, (d4e)d4e, (fda)fda, mex, sfv);
        final AtomicReference atomicReference = new AtomicReference();
        final int a = hgd.a;
        this.v1 = new qgd(igd.Companion.a(), ehk.c());
        j39.g(atomicReference, ((t5j)xjh.K0).subscribe((rk6)new ppa(this, 10), (rk6)new vhd((Object)this, 14)));
    }
    
    public final void L0() {
        if (((Activity)((idv)this).F0).isFinishing()) {
            final bts h1 = super.h1;
            final int a = o5j.a;
            final tax tax = (tax)h1;
            final gvs gvs = new gvs(kbv.J2(((idv)this).I0));
            final fxs$a fxs$a = new fxs$a();
            fxs$a.c = ((idv)this).I0.getId();
            Objects.requireNonNull(tax);
            fxs$a.a = 35;
            fxs$a.b = ((bts)tax).c;
            xw0.c((sj)new psf(gvs, ((z4j)fxs$a).e(), 3));
        }
        super.L0();
    }
    
    public final udv$b l0(final udv$b udv$b) {
        udv$b.a = "moderated_tweets";
        return udv$b;
    }
}
