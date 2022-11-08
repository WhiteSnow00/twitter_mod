import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aja extends a1c
{
    public final s0k t1;
    public final via u1;
    public final String v1;
    public int w1;
    
    public aja(final ybv ybv, final fxe<e1c> fxe, final aws aws, final qrs qrs, final zh7<vo6> zh7, final udf<nws> udf, final dsb dsb, final rpd rpd, final zoi<nws> zoi, final Context context, final uc uc, final exs exs, final g0t g0t, final x3e<nws> x3e, final pca<bo> pca, final adx adx, final alj alj, final jev jev, final s0k t1, final via u1) {
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
        zzd.f((Object)t1, "pctTimelineTracker");
        zzd.f((Object)u1, "exploreDynamicChromePctNotifier");
        super(ybv, fxe, aws, qrs, zh7, udf, dsb, rpd, zoi, context, uc, exs, g0t, x3e, pca, adx, alj, jev);
        this.t1 = t1;
        this.u1 = u1;
        this.v1 = ((zl1)qrs).g("key_page_title");
        this.w1 = 2;
    }
    
    @Override
    public final void O0(final i4e<nws> i4e) {
        zzd.f((Object)i4e, "items");
        final int d = nb0.D(this.w1);
        if (d != 0) {
            if (d == 1) {
                super.O0(i4e);
            }
        }
        else {
            this.t1.b((r0k)new r0k$a(this.v1));
            this.t1.b((r0k)new r0k$h(this.v1));
            super.O0(i4e);
            this.t1.b((r0k)new r0k$g(this.v1));
            this.t1.b((r0k)new r0k$i(this.v1));
            this.w1 = 2;
        }
        final via u1 = this.u1;
        if (u1.b == 1) {
            u1.a.b((r0k)new r0k$i("explore-tapped"));
            u1.b = 2;
        }
    }
    
    @Override
    public final void T0() {
        final s0k t1 = this.t1;
        final String v1 = this.v1;
        final StringBuilder sb = new StringBuilder();
        sb.append("explore-pull-to-refresh-");
        sb.append(v1);
        t1.c(sb.toString());
        this.d1(2);
    }
    
    @Override
    public final void o1() {
        super.G0.V((rtb)new rtb<gkf$c, oyv>() {
            public final /* synthetic */ aja C0;
            
            public final Object invoke(final Object o) {
                zzd.f((Object)o, "it");
                final aja c0 = this.C0;
                c0.t1.b((r0k)new r0k$f(c0.v1));
                return oyv.a;
            }
        });
        super.G0.F0((rtb)new aja$b(this));
        super.G0.f1((rtb)new aja$c(this));
    }
}
