import com.twitter.timeline.newtweetsbanner.BaseNewTweetsBannerPresenter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class a1c extends mts
{
    public final fxe<e1c> s1;
    
    public a1c(final ybv ybv, final fxe<e1c> s1, final aws aws, final qrs qrs, final zh7<vo6> zh7, final udf<nws> udf, final dsb dsb, final rpd rpd, final zoi<nws> zoi, final Context context, final uc uc, final exs exs, final g0t g0t, final x3e<nws> x3e, final pca<bo> pca, final adx adx, final alj alj, final jev jev) {
        zzd.f((Object)ybv, "dependencies");
        zzd.f((Object)s1, "genericTimelinePresenter");
        zzd.f((Object)aws, "timelineIdentifier");
        zzd.f((Object)qrs, "args");
        zzd.f((Object)zh7, "dmComposeHandler");
        zzd.f((Object)udf, "lingerImpressionHelper");
        zzd.f((Object)dsb, "friendshipCache");
        zzd.f((Object)rpd, "inlineDismissController");
        zzd.f((Object)zoi, "itemCollectionProvider");
        zzd.f((Object)context, "applicationContext");
        zzd.f((Object)uc, "mediaPrefetcher");
        zzd.f((Object)exs, "timelineItemScribeReporter");
        zzd.f((Object)g0t, "timelinePinnedHeaderAdapter");
        zzd.f((Object)x3e, "itemBinderDirectory");
        zzd.f((Object)pca, "results");
        zzd.f((Object)adx, "viewportController");
        zzd.f((Object)alj, "oneOffTimelineCleanUpJob");
        zzd.f((Object)jev, "scribeAssociation");
        super(ybv, aws, qrs, (zh7)zh7, (udf)udf, dsb, rpd, (zoi)zoi, uc, exs, g0t, (x3e)x3e, (pca)pca, adx, jev);
        this.s1 = s1;
        alj.a(super.b1);
    }
    
    @Override
    public final void k0() {
        super.k0();
        ((BaseNewTweetsBannerPresenter)((e1c)this.s1.get()).D0).E0 = false;
    }
    
    @Override
    public lcv$b m0(final lcv$b lcv$b) {
        lcv$b.a = "generic";
        final y2a.d b = lcv$b.b;
        b.b();
        final w2a$a w2a$a = new w2a$a();
        final jx6 a = yds.a;
        w2a$a.a = (yds)new jjr(2131953931);
        w2a$a.b = (yds)new jjr(2131953915);
        w2a$a.c = (yds)new jjr(2131953917);
        w2a$a.e = 1;
        final y2a.e d = new y2a.e((w2a)((h4j)w2a$a).e());
        d.a = (y2a.c)new on3((Object)this, 15);
        b.d = d;
        b.c = new y2a.e(super.M0.a);
        return lcv$b;
    }
}
