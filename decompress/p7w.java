import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p7w extends mts
{
    public final gew s1;
    public final e6b t1;
    public final ulh u1;
    public boolean v1;
    
    public p7w(final ybv ybv, final aws aws, final qrs qrs, final zh7<vo6> zh7, final udf<nws> udf, final dsb dsb, final rpd rpd, final zoi<nws> zoi, final Context context, final uc uc, final exs exs, final g0t g0t, final x3e<nws> x3e, final pca<bo> pca, final adx adx, final jev jev, final lwa v0, final fxe<e6b> fxe, final gew s1) {
        super(ybv, aws, qrs, (zh7)zh7, (udf)udf, dsb, rpd, (zoi)zoi, uc, exs, g0t, (x3e)x3e, (pca)pca, adx, jev);
        this.v1 = true;
        this.s1 = s1;
        super.X0.V0 = (n0s$a)v0;
        e6b t1;
        if (dta.b().b("android_audio_avatar_ring_search_results_page_enabled", false)) {
            t1 = (e6b)fxe.get();
        }
        else {
            t1 = null;
        }
        this.t1 = t1;
        this.u1 = new ulh(kwe.b(), zca.a(this.h1(), this.i1()));
    }
    
    @Override
    public final void O0(final i4e<nws> i4e) {
        super.O0(i4e);
        if (amy.y() && dta.b().b("android_audio_avatar_ring_search_results_page_enabled", false)) {
            final e6b t1 = this.t1;
            if (t1 != null && i4e instanceof bld) {
                t1.a((bld)i4e, this.v1);
                this.v1 = false;
            }
        }
    }
    
    @Override
    public final void a() {
        this.d1(2);
        if (dta.b().b("android_audio_avatar_ring_search_results_page_enabled", false)) {
            this.v1 = true;
        }
    }
    
    @Override
    public final lcv$b m0(final lcv$b lcv$b) {
        lcv$b.a = "search_results";
        final w2a$a w2a$a = new w2a$a();
        final jx6 a = yds.a;
        w2a$a.a = (yds)new jjr(2131953931);
        w2a$a.b = (yds)new jjr(2131953915);
        w2a$a.c = (yds)new jjr(2131953917);
        w2a$a.e = 1;
        final y2a.e d = new y2a.e((w2a)((h4j)w2a$a).e());
        d.a = (y2a.c)new fcn((Object)this, 5);
        final y2a.d b = lcv$b.b;
        b.b();
        b.f = 2131166694;
        b.d = d;
        return lcv$b;
    }
    
    @Override
    public final void x1(final amh amh, int a) {
        final fr1 fr1 = (fr1)super.e1;
        final ulh u1 = this.u1;
        if (u1 != null) {
            final s5p s = fr1.s();
            Objects.requireNonNull(u1);
            if (amh.b != null && ((gzm)u1).i((Object)amh.c)) {
                final String b = ((tca)u1.E0).b();
                final String d = u1.E0.d();
                final qzo b2 = amh.b;
                final zf4 zf4 = new zf4(new String[] { b, d, b2.f, b2.g, "impression" });
                zf4.i((szo)vpv.a(amh.b));
                zf4.y = a;
                a = w4j.a;
                zf4.x = s;
                saw.b((okm)zf4);
            }
        }
    }
}
