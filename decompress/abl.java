import com.twitter.app.profiles.di.retained.BaseProfileTimelineRetainedGraph;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abl extends ap1
{
    public abl(final tcv tcv, final mws mws, final hss hss, final gh7<bo6> gh7, final gdf<cxs> gdf, final brb brb, final tod tod, final epi<cxs> epi, final Context context, final sc sc, final vxs vxs, final w0t w0t, final c3e<cxs> c3e, final xba<bo> xba, final udx udx, final efv efv, final mel mel, final flj flj) {
        super(tcv, mws, hss, (gh7)gh7, (gdf)gdf, brb, tod, (epi)epi, context, sc, vxs, w0t, (c3e)c3e, (xba)xba, udx, efv, mel, flj);
    }
    
    public final gdv$b l0(final gdv$b gdv$b) {
        super.l0(gdv$b);
        gdv$b.a = "profile_media";
        if (this.B1()) {
            final g2a$a g2a$a = new g2a$a();
            final nw6 a = tes.a;
            g2a$a.a = (tes)new dkr(2131953835);
            g2a$a.b = (tes)new dkr(2131953834);
            g2a$a.h = r2a.Q0;
            final g2a g2a = (g2a)((n4j)g2a$a).e();
            gdv$b.g = 2131624572;
            final i2a$d b = gdv$b.b;
            b.a = 2131625221;
            b.b = 0;
            b.c = new i2a$e(g2a);
        }
        else if (d4j.f()) {
            Object k0 = null;
            final cgv d = ((BaseProfileTimelineRetainedGraph)((ucv)this).E0.o()).d().d;
            if (d != null) {
                k0 = d.K0;
            }
            if (k0 != null) {
                final g2a$a g2a$a2 = new g2a$a();
                g2a$a2.a = tes.a(((ucv)this).z0().getString(2131953833, new Object[] { k0 }));
                g2a$a2.b = (tes)new dkr(2131953832);
                g2a$a2.h = r2a.Q0;
                final g2a g2a2 = (g2a)((n4j)g2a$a2).e();
                gdv$b.g = 2131624572;
                final i2a$d b2 = gdv$b.b;
                b2.a = 2131625221;
                b2.b = 0;
                b2.c = new i2a$e(g2a2);
            }
        }
        return gdv$b;
    }
}
