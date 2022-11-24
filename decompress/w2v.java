import android.os.Bundle;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class w2v extends u0x
{
    public void b(final Context context) {
        new m01((Object)this, (Object)context, 4).run();
    }
    
    public u0x c() {
        final sfv sfv = new sfv();
        ((f0p)sfv).c("gallery");
        ((f0p)sfv).d("");
        super.a = (uca)new acv(sfv);
        final int a = o5j.a;
        return this;
    }
    
    public cn d() {
        final hp6 u0 = xd.u0(super.e);
        if (u0 != null) {
            final sfv f = this.f();
            String d = null;
            if (f != null) {
                d = ((f0p)this.f()).d;
            }
            if (!qvg.q(u0)) {
                boolean t0 = false;
                if (!slr.i1(d, "search", false)) {
                    t0 = iuk.t0();
                }
                if (t0) {
                    final int a = lbd.a;
                    Objects.requireNonNull(mbd.Companion);
                    ((mbd)dgw.Companion.a().c((Class)mbd.class)).n3().a.set(u0);
                    final sfv f2 = this.f();
                    if (f2 != null) {
                        ((f0p)f2).b = String.valueOf(u0.D());
                        final int a2 = o5j.a;
                    }
                    final fbd$a fbd$a = new fbd$a();
                    fbd$a.b = u0.D();
                    fbd$a.c = f2;
                    return (cn)((z4j)fbd$a).e();
                }
            }
            wtg wtg;
            if (super.e instanceof xtg && fr0.J()) {
                wtg = ((xtg)super.e).F0;
            }
            else {
                wtg = qvg.e(u0.f());
            }
            final cwb$a cwb$a = new cwb$a();
            cwb$a.v(u0.D());
            cwb$a.s(this.f());
            cwb$a.w(1);
            cwb$a.q(wtg);
            final z1t a3 = u0.a1;
            if (a3 != null) {
                swj.c(((aj1.a)cwb$a).a, "extra_ad_preview_metadata_override", (Object)a3, (nmp)z1t.c);
            }
            ((aj1.a)cwb$a).a.putExtra("extra_gallery_is_from_dock", super.c);
            cwb$a.u(u0.V0);
            cwb$a.r(u0.c1);
            return (cn)((z4j)cwb$a).e();
        }
        final e3$a e3$a = new e3$a();
        e3$a.b = super.e;
        e3$a.c = this.f();
        e3$a.d = super.c;
        return (cn)((z4j)e3$a).e();
    }
    
    public Bundle e(final Context context) {
        return null;
    }
    
    public final sfv f() {
        final uca a = super.a;
        if (a instanceof bfc) {
            return ((bfc)a).f();
        }
        return null;
    }
    
    public final w2v g(final hp6 hp6) {
        super.e = (h1)new lcu(hp6);
        final int a = o5j.a;
        return this;
    }
}
