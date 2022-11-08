import android.os.Bundle;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class p1v extends izw
{
    public void b(final Context context) {
        new k01((Object)this, (Object)context, 4).run();
    }
    
    public izw c() {
        final jev jev = new jev();
        ((vyo)jev).c("gallery");
        ((vyo)jev).d("");
        super.a = (eca)new qav(jev);
        final int a = w4j.a;
        return this;
    }
    
    public zm d() {
        final vo6 b = ajy.B(super.e);
        if (b != null) {
            final jev f = this.f();
            String d = null;
            if (f != null) {
                d = ((vyo)this.f()).d;
            }
            if (!wug.q(b)) {
                boolean y = false;
                if (!ckr.f1(d, "search", false)) {
                    y = dcs.y();
                }
                if (y) {
                    final int a = fbd.a;
                    Objects.requireNonNull(gbd.Companion);
                    ((gbd)afw.Companion.a().c((Class)gbd.class)).n3().a.set(b);
                    final jev f2 = this.f();
                    if (f2 != null) {
                        ((vyo)f2).b = String.valueOf(b.D());
                        final int a2 = w4j.a;
                    }
                    final zad$a zad$a = new zad$a();
                    zad$a.b = b.D();
                    zad$a.c = f2;
                    return (zm)((h4j)zad$a).e();
                }
            }
            dtg dtg;
            if (super.e instanceof etg && yos.n()) {
                dtg = ((etg)super.e).C0;
            }
            else {
                dtg = wug.e(b.f());
            }
            final yvb$a yvb$a = new yvb$a();
            yvb$a.v(b.D());
            yvb$a.s(this.f());
            yvb$a.w(1);
            yvb$a.q(dtg);
            final q0t x0 = b.X0;
            if (x0 != null) {
                yvj.c(((dj1.a)yvb$a).a, "extra_ad_preview_metadata_override", (Object)x0, (alp)q0t.c);
            }
            ((dj1.a)yvb$a).a.putExtra("extra_gallery_is_from_dock", super.c);
            yvb$a.u(b.S0);
            yvb$a.r(b.Z0);
            return (zm)((h4j)yvb$a).e();
        }
        final h3$a h3$a = new h3$a();
        h3$a.b = super.e;
        h3$a.c = this.f();
        h3$a.d = super.c;
        return (zm)((h4j)h3$a).e();
    }
    
    public Bundle e(final Context context) {
        return null;
    }
    
    public final jev f() {
        final eca a = super.a;
        if (a instanceof zec) {
            return ((zec)a).f();
        }
        return null;
    }
    
    public final p1v g(final vo6 vo6) {
        super.e = (i1)new cbu(vo6);
        final int a = w4j.a;
        return this;
    }
}
