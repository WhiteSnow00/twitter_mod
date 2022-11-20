import android.app.Activity;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bax extends eus
{
    public final qfd t1;
    
    public bax(final tcv tcv, final mws mws, final hss hss, final gh7<bo6> gh7, final gdf<cxs> gdf, final brb brb, final tod tod, final epi<cxs> epi, final Context context, final sc sc, final vxs vxs, final w0t w0t, final c3e<cxs> c3e, final xba<bo> xba, final udx udx, final efv efv, final jjh jjh) {
        super(tcv, mws, hss, (gh7)gh7, (gdf)gdf, brb, tod, (epi)epi, sc, vxs, w0t, (c3e)c3e, (xba)xba, udx, efv);
        final AtomicReference atomicReference = new AtomicReference();
        final int a = hfd.a;
        this.t1 = new qfd(ifd.Companion.a(), m1f.e());
        b29.g(atomicReference, ((h5j)jjh.I0).subscribe((lj6)new iag(this, 15), (lj6)new a1p((Object)this, 16)));
    }
    
    public final void L0() {
        if (((Activity)((ucv)this).D0).isFinishing()) {
            final hss f1 = super.f1;
            final int a = c5j.a;
            final aax aax = (aax)f1;
            final nus nus = new nus(vav.I2(((ucv)this).G0));
            final mws$a mws$a = new mws$a();
            mws$a.c = ((ucv)this).G0.getId();
            Objects.requireNonNull(aax);
            mws$a.a = 35;
            mws$a.b = ((hss)aax).c;
            rw0.c((oj)new fz7((Object)nus, (Object)((n4j)mws$a).e(), 2));
        }
        super.L0();
    }
    
    public final gdv$b l0(final gdv$b gdv$b) {
        gdv$b.a = "moderated_tweets";
        return gdv$b;
    }
}
