// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.request.inbox.actions;

import java.util.List;
import com.twitter.util.user.UserIdentifier;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/dm/request/inbox/actions/QuickActionViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lytl;", "Lftl;", "Letl;", "feature.tfa.dm.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class QuickActionViewModel extends MviViewModel<ytl, ftl, etl>
{
    public static final /* synthetic */ soe<Object>[] R0;
    public final itl N0;
    public final jp7 O0;
    public final UserIdentifier P0;
    public final gyh Q0;
    
    static {
        R0 = new soe[] { (soe)hi.m(QuickActionViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public QuickActionViewModel(final List<dtl> list, final itl n0, final jp7 o0, final UserIdentifier p5, final ibm ibm) {
        zzd.f((Object)list, "actions");
        zzd.f((Object)n0, "repository");
        zzd.f((Object)o0, "inboxItem");
        zzd.f((Object)p5, "owner");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new ytl(list));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p5;
        this.Q0 = oyz.f0(this, (rtb)new rtb<iyh<ftl>, oyv>() {
            public final /* synthetic */ QuickActionViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)ftl.a.class), (gub)new a(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)ftl$b$a.class), (gub)new b(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)ftl$b$c.class), (gub)new c(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)ftl$b$b.class), (gub)new d(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<ftl> v() {
        return (iyh<ftl>)this.Q0.a((soe)QuickActionViewModel.R0[0]);
    }
}
