import com.twitter.app.profiles.di.retained.BaseProfileTimelineRetainedGraph;
import android.content.Context;
import com.twitter.profiles.scrollingheader.e;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ep1 extends e
{
    public hfv t1;
    
    public ep1(final ybv ybv, final aws aws, final qrs qrs, final zh7<vo6> zh7, final udf<nws> udf, final dsb dsb, final rpd rpd, final zoi<nws> zoi, final Context context, final uc uc, final exs exs, final g0t g0t, final x3e<nws> x3e, final pca<bo> pca, final adx adx, final jev jev, final ael ael, final alj alj) {
        super(ybv, aws, qrs, (zh7)zh7, (udf)udf, dsb, rpd, (zoi)zoi, context, uc, exs, g0t, (x3e)x3e, (pca)pca, adx, jev);
        this.t1 = ael.d;
        if (this.B1() && dta.b().b("consideration_lonely_birds_good_impression_android_enabled", false)) {
            alj.a(((mts)this).b1);
        }
    }
    
    public final boolean B1() {
        return ((BaseProfileTimelineRetainedGraph)((acv)this).D0.o()).d().r();
    }
}
