// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.database.collection.error;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/database/collection/error/ErrorTimelineItemViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lcaa;", "Lbaa;", "Laaa;", "subsystem.tfa.database.collection.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class ErrorTimelineItemViewModel extends MviViewModel<caa, baa, aaa>
{
    public static final /* synthetic */ soe<Object>[] P0;
    public final xau N0;
    public final gyh O0;
    
    static {
        P0 = new soe[] { (soe)hi.m(ErrorTimelineItemViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public ErrorTimelineItemViewModel(final m9a m9a, final cl0 cl0, final xau n0, final ibm ibm) {
        zzd.f((Object)m9a, "timelineItem");
        zzd.f((Object)cl0, "appConfig");
        zzd.f((Object)n0, "appPreferences");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new caa(m9a));
        this.N0 = n0;
        cl0.t();
        this.Q((rtb)new rtb<caa, caa>() {
            public final Object invoke(final Object o) {
                final caa caa = (caa)o;
                zzd.f((Object)caa, "$this$setState");
                final boolean c0 = false;
                final m9a a = caa.a;
                zzd.f((Object)a, "timelineItem");
                return new caa(a, c0);
            }
        });
        this.O0 = oyz.f0(this, (rtb)new rtb<iyh<baa>, oyv>() {
            public final /* synthetic */ ErrorTimelineItemViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)baa.a.class), (gub)new a(this.C0, m9a, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<baa> v() {
        return (iyh<baa>)this.O0.a((soe)ErrorTimelineItemViewModel.P0[0]);
    }
}
