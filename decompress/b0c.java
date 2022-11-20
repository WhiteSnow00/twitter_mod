import com.twitter.timeline.newtweetsbanner.BaseNewTweetsBannerPresenter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class b0c extends eus
{
    public final pwe<g0c> t1;
    
    public b0c(final tcv tcv, final pwe<g0c> t1, final mws mws, final hss hss, final gh7<bo6> gh7, final gdf<cxs> gdf, final brb brb, final tod tod, final epi<cxs> epi, final Context context, final sc sc, final vxs vxs, final w0t w0t, final c3e<cxs> c3e, final xba<bo> xba, final udx udx, final flj flj, final efv efv) {
        czd.f((Object)tcv, "dependencies");
        czd.f((Object)t1, "genericTimelinePresenter");
        czd.f((Object)mws, "timelineIdentifier");
        czd.f((Object)hss, "args");
        czd.f((Object)gh7, "dmComposeHandler");
        czd.f((Object)gdf, "lingerImpressionHelper");
        czd.f((Object)brb, "friendshipCache");
        czd.f((Object)tod, "inlineDismissController");
        czd.f((Object)epi, "itemCollectionProvider");
        czd.f((Object)context, "applicationContext");
        czd.f((Object)sc, "mediaPrefetcher");
        czd.f((Object)vxs, "timelineItemScribeReporter");
        czd.f((Object)w0t, "timelinePinnedHeaderAdapter");
        czd.f((Object)c3e, "itemBinderDirectory");
        czd.f((Object)xba, "results");
        czd.f((Object)udx, "viewportController");
        czd.f((Object)flj, "oneOffTimelineCleanUpJob");
        czd.f((Object)efv, "scribeAssociation");
        super(tcv, mws, hss, (gh7)gh7, (gdf)gdf, brb, tod, (epi)epi, sc, vxs, w0t, (c3e)c3e, (xba)xba, udx, efv);
        this.t1 = t1;
        flj.a(super.c1);
    }
    
    public final void j0() {
        super.j0();
        ((BaseNewTweetsBannerPresenter)((g0c)this.t1.get()).E0).F0 = false;
    }
    
    public gdv$b l0(final gdv$b gdv$b) {
        gdv$b.a = "generic";
        final i2a$d b = gdv$b.b;
        b.b();
        final g2a$a g2a$a = new g2a$a();
        final nw6 a = tes.a;
        g2a$a.a = (tes)new dkr(2131953931);
        g2a$a.b = (tes)new dkr(2131953915);
        g2a$a.c = (tes)new dkr(2131953917);
        g2a$a.e = 1;
        final i2a$e d = new i2a$e((g2a)((n4j)g2a$a).e());
        d.a = (i2a$c)new e71((Object)this, 20);
        b.d = d;
        b.c = new i2a$e(((ucv)this).N0.a);
        return gdv$b;
    }
}
