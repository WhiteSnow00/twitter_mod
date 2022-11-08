import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ktt extends a1c
{
    public final gst t1;
    public final String u1;
    
    public ktt(final ybv ybv, final fxe<e1c> fxe, final aws aws, final qrs qrs, final zh7<vo6> zh7, final udf<nws> udf, final dsb dsb, final rpd rpd, final zoi<nws> zoi, final Context context, final uc uc, final exs exs, final g0t g0t, final x3e<nws> x3e, final pca<bo> pca, final adx adx, final alj alj, final jev jev, final gst t1) {
        zzd.f((Object)ybv, "dependencies");
        zzd.f((Object)fxe, "genericTimelinePresenter");
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
        zzd.f((Object)t1, "topicsPctTracker");
        super(ybv, fxe, aws, qrs, zh7, udf, dsb, rpd, zoi, context, uc, exs, g0t, x3e, pca, adx, alj, jev);
        this.t1 = t1;
        this.u1 = ((zl1)qrs).g("page_title");
    }
    
    @Override
    public final void M0() {
        if (this.F0()) {
            final gst t1 = this.t1;
            final String u1 = this.u1;
            final StringBuilder sb = new StringBuilder();
            sb.append("topic-management-page-tab-load-");
            sb.append(u1);
            t1.b(sb.toString());
        }
        super.M0();
    }
    
    @Override
    public final void O0(final i4e<nws> i4e) {
        zzd.f((Object)i4e, "items");
        super.O0(i4e);
        final gst t1 = this.t1;
        final String u1 = this.u1;
        final StringBuilder sb = new StringBuilder();
        sb.append("topic-management-page-tab-load-");
        sb.append(u1);
        t1.b(sb.toString());
    }
    
    @Override
    public final void S0() {
        final gst t1 = this.t1;
        final String u1 = this.u1;
        final StringBuilder sb = new StringBuilder();
        sb.append("topic-management-page-tab-load-");
        sb.append(u1);
        t1.a(sb.toString());
        super.S0();
    }
}
