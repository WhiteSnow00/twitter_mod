import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n8w extends xus
{
    public final kfw v1;
    public final d6b w1;
    public final omh x1;
    public boolean y1;
    
    public n8w(final hdv hdv, final fxs fxs, final bts bts, final ii7<hp6> ii7, final def<vxs> def, final dsb dsb, final vpd vpd, final vpi<vxs> vpi, final Context context, final tc tc, final oys oys, final p1t p1t, final d4e<vxs> d4e, final fda<fo> fda, final mex mex, final sfv sfv, final lwa y0, final mxe<d6b> mxe, final kfw v1) {
        super(hdv, fxs, bts, (ii7)ii7, (def)def, dsb, vpd, (vpi)vpi, tc, oys, p1t, (d4e)d4e, (fda)fda, mex, sfv);
        this.y1 = true;
        this.v1 = v1;
        ((idv)this).a1.Y0 = (b2s$a)y0;
        d6b w1;
        if (ita.b().b("android_audio_avatar_ring_search_results_page_enabled", false)) {
            w1 = (d6b)mxe.get();
        }
        else {
            w1 = null;
        }
        this.w1 = w1;
        this.x1 = new omh(z9a.j(), pda.a(this.h1(), this.i1()));
    }
    
    public final void O0(final p4e<vxs> p4e) {
        super.O0((p4e)p4e);
        if (qjy.u() && ita.b().b("android_audio_avatar_ring_search_results_page_enabled", false)) {
            final d6b w1 = this.w1;
            if (w1 != null && p4e instanceof fld) {
                w1.a((fld)p4e, this.y1);
                this.y1 = false;
            }
        }
    }
    
    public final void a() {
        this.d1(2);
        if (ita.b().b("android_audio_avatar_ring_search_results_page_enabled", false)) {
            this.y1 = true;
        }
    }
    
    public final udv$b l0(final udv$b udv$b) {
        udv$b.a = "search_results";
        final i3a$a i3a$a = new i3a$a();
        final tx6 a = lfs.a;
        i3a$a.a = (lfs)new zkr(2131953931);
        i3a$a.b = (lfs)new zkr(2131953915);
        i3a$a.c = (lfs)new zkr(2131953917);
        i3a$a.e = 1;
        final k3a$e d = new k3a$e((i3a)((z4j)i3a$a).e());
        d.a = (k3a$c)new pn1((Object)this, 14);
        final k3a$d b = udv$b.b;
        b.b();
        b.f = 2131166694;
        b.d = d;
        return udv$b;
    }
    
    public final void x1(final umh umh, int a) {
        final ir1 ir1 = (ir1)super.h1;
        final omh x1 = this.x1;
        if (x1 != null) {
            final f7p s = ir1.s();
            Objects.requireNonNull(x1);
            if (umh.b != null && ((a8d)x1).g((Object)umh.c)) {
                final String b = ((jda)x1.H0).b();
                final String d = x1.H0.d();
                final b1p b2 = umh.b;
                final fg4 fg4 = new fg4(new String[] { b, d, b2.f, b2.g, "impression" });
                ((o1p)fg4).i((d1p)crv.a(umh.b));
                ((o1p)fg4).y = a;
                a = o5j.a;
                ((o1p)fg4).x = s;
                sbw.b((tlm)fg4);
            }
        }
    }
}
