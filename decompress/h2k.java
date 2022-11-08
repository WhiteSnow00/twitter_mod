import java.util.concurrent.TimeUnit;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h2k extends mts
{
    public h2k(final ybv ybv, final aws aws, final qrs qrs, final zh7<vo6> zh7, final udf<nws> udf, final dsb dsb, final rpd rpd, final zoi<nws> zoi, final Context context, final uc uc, final exs exs, final g0t g0t, final x3e<nws> x3e, final pca<bo> pca, final adx adx, final jev jev) {
        super(ybv, aws, qrs, (zh7)zh7, (udf)udf, dsb, rpd, (zoi)zoi, uc, exs, g0t, (x3e)x3e, (pca)pca, adx, jev);
    }
    
    @Override
    public final long e1() {
        return TimeUnit.MINUTES.toMillis(5L);
    }
    
    @Override
    public final lcv$b m0(final lcv$b lcv$b) {
        lcv$b.a = "people_discovery";
        final w2a$a w2a$a = new w2a$a();
        final jx6 a = yds.a;
        w2a$a.a = (yds)new jjr(2131955662);
        w2a$a.b = (yds)new jjr(2131955663);
        w2a$a.c = (yds)new jjr(2131955665);
        w2a$a.e = 1;
        final y2a.e c = new y2a.e((w2a)((h4j)w2a$a).e());
        c.a = (y2a.c)new grx((Object)this, 7);
        lcv$b.b.c = c;
        return lcv$b;
    }
}
