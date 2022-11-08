import com.twitter.app.profiles.di.retained.BaseProfileTimelineRetainedGraph;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oal extends ep1
{
    public oal(final ybv ybv, final aws aws, final qrs qrs, final zh7<vo6> zh7, final udf<nws> udf, final dsb dsb, final rpd rpd, final zoi<nws> zoi, final Context context, final uc uc, final exs exs, final g0t g0t, final x3e<nws> x3e, final pca<bo> pca, final adx adx, final jev jev, final ael ael, final alj alj) {
        super(ybv, aws, qrs, zh7, udf, dsb, rpd, zoi, context, uc, exs, g0t, x3e, pca, adx, jev, ael, alj);
    }
    
    public final lcv$b m0(final lcv$b lcv$b) {
        super.m0(lcv$b);
        lcv$b.a = "profile_media";
        if (this.B1()) {
            final w2a$a w2a$a = new w2a$a();
            final jx6 a = yds.a;
            w2a$a.a = (yds)new jjr(2131953835);
            w2a$a.b = (yds)new jjr(2131953834);
            w2a$a.h = h3a.P0;
            final w2a w2a = (w2a)((h4j)w2a$a).e();
            lcv$b.g = 2131624572;
            final y2a.d b = lcv$b.b;
            b.a = 2131625219;
            b.b = 0;
            b.c = new y2a.e(w2a);
        }
        else if (ck1.n()) {
            Object j0 = null;
            final hfv d = ((BaseProfileTimelineRetainedGraph)((acv)this).D0.o()).d().d;
            if (d != null) {
                j0 = d.J0;
            }
            if (j0 != null) {
                final w2a$a w2a$a2 = new w2a$a();
                w2a$a2.a = yds.a(((acv)this).z0().getString(2131953833, new Object[] { j0 }));
                w2a$a2.b = (yds)new jjr(2131953832);
                w2a$a2.h = h3a.P0;
                final w2a w2a2 = (w2a)((h4j)w2a$a2).e();
                lcv$b.g = 2131624572;
                final y2a.d b2 = lcv$b.b;
                b2.a = 2131625219;
                b2.b = 0;
                b2.c = new y2a.e(w2a2);
            }
        }
        return lcv$b;
    }
}
