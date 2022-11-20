import android.content.Context;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdj extends b0c
{
    public final LayoutInflater u1;
    public boolean v1;
    
    public hdj(final LayoutInflater u1, final tcv tcv, final pwe<g0c> pwe, final mws mws, final hss hss, final gh7<bo6> gh7, final gdf<cxs> gdf, final brb brb, final tod tod, final epi<cxs> epi, final Context context, final sc sc, final vxs vxs, final c3e<cxs> c3e, final xba<bo> xba, final udx udx, final flj flj, final efv efv, final w0t w0t) {
        czd.f((Object)u1, "layoutInflater");
        czd.f((Object)tcv, "dependencies");
        czd.f((Object)pwe, "genericTimelinePresenter");
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
        czd.f((Object)c3e, "itemBinderDirectory");
        czd.f((Object)xba, "results");
        czd.f((Object)udx, "viewportController");
        czd.f((Object)flj, "oneOffTimelineCleanUpJob");
        czd.f((Object)efv, "scribeAssociation");
        czd.f((Object)w0t, "timelinePinnedHeaderAdapter");
        super(tcv, pwe, mws, hss, gh7, gdf, brb, tod, epi, context, sc, vxs, w0t, c3e, xba, udx, flj, efv);
        this.u1 = u1;
    }
    
    @Override
    public final gdv$b l0(final gdv$b gdv$b) {
        super.l0(gdv$b);
        gdv$b.a = "generic_urt";
        gdv$b.g = 0;
        final i2a$d b = gdv$b.b;
        b.c = b.d;
        return gdv$b;
    }
}
