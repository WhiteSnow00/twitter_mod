import android.os.Bundle;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class k2v extends d0x
{
    public void b(final Context context) {
        new g01((Object)this, (Object)context, 4).run();
    }
    
    public d0x c() {
        final efv efv = new efv();
        ((lzo)efv).c("gallery");
        ((lzo)efv).d("");
        super.a = (mba)new lbv(efv);
        final int a = c5j.a;
        return this;
    }
    
    public ym d() {
        final bo6 t = max.t(super.e);
        if (t != null) {
            final efv f = this.f();
            String d = null;
            if (f != null) {
                d = ((lzo)this.f()).d;
            }
            if (!wug.q(t)) {
                boolean v = false;
                if (!vkr.T(d, "search", false)) {
                    v = sh4.v();
                }
                if (v) {
                    final int a = lad.a;
                    Objects.requireNonNull(mad.Companion);
                    ((mad)nfw.Companion.a().c((Class)mad.class)).n3().a.set(t);
                    final efv f2 = this.f();
                    if (f2 != null) {
                        ((lzo)f2).b = String.valueOf(t.D());
                        final int a2 = c5j.a;
                    }
                    final fad$a fad$a = new fad$a();
                    fad$a.b = t.D();
                    fad$a.c = f2;
                    return (ym)((n4j)fad$a).e();
                }
            }
            dtg dtg;
            if (super.e instanceof etg && rpb.I()) {
                dtg = ((etg)super.e).D0;
            }
            else {
                dtg = wug.e(t.f());
            }
            final avb$a avb$a = new avb$a();
            avb$a.v(t.D());
            avb$a.s(this.f());
            avb$a.w(1);
            avb$a.q(dtg);
            final g1t y0 = t.Y0;
            if (y0 != null) {
                dwj.c(((xi1.a)avb$a).a, "extra_ad_preview_metadata_override", (Object)y0, (rlp)g1t.c);
            }
            ((xi1.a)avb$a).a.putExtra("extra_gallery_is_from_dock", super.c);
            avb$a.u(t.T0);
            avb$a.r(t.a1);
            return (ym)((n4j)avb$a).e();
        }
        final k3$a k3$a = new k3$a();
        k3$a.b = super.e;
        k3$a.c = this.f();
        k3$a.d = super.c;
        return (ym)((n4j)k3$a).e();
    }
    
    public Bundle e(final Context context) {
        return null;
    }
    
    public final efv f() {
        final mba a = super.a;
        if (a instanceof zdc) {
            return ((zdc)a).f();
        }
        return null;
    }
    
    public final k2v g(final bo6 bo6) {
        super.e = (i1)new vbu(bo6);
        final int a = c5j.a;
        return this;
    }
}
