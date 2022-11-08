// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.collabs.search;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/collabs/search/CollaboratorsSearchViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lzp4;", "", "Llp4;", "feature.tfa.collabs.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class CollaboratorsSearchViewModel extends MviViewModel<zp4, Object, lp4>
{
    public static final /* synthetic */ soe<Object>[] Q0;
    public final lo4 N0;
    public final u76 O0;
    public final gyh P0;
    
    static {
        Q0 = new soe[] { (soe)hi.m(CollaboratorsSearchViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public CollaboratorsSearchViewModel(final ibm ibm, final lo4 n0, final u76 o0) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)n0, "collaborationSearchRepository");
        zzd.f((Object)o0, "composerCollabDispatcher");
        super((fae)ibm, (oax)new zp4("", (u6p)u6p$a.a));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = oyz.f0(this, (rtb)new rtb<iyh<Object>, oyv>() {
            public final /* synthetic */ CollaboratorsSearchViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)qp4.class), (gub)new a(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)op4.class), (gub)new b(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)pp4.class), (gub)new c(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)np4.class), (gub)new d(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)rp4.class), (gub)new e(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<Object> v() {
        return (iyh<Object>)this.P0.a((soe)CollaboratorsSearchViewModel.Q0[0]);
    }
}
