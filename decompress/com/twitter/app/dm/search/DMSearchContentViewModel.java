// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.search;

import com.twitter.util.user.UserIdentifier;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/dm/search/DMSearchContentViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lvw7;", "Ldw7;", "Lcw7;", "feature.tfa.dm.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class DMSearchContentViewModel extends MviViewModel<vw7, dw7, cw7>
{
    public static final /* synthetic */ soe<Object>[] R0;
    public final UserIdentifier N0;
    public final ww7<e18, wv7, ox7> O0;
    public boolean P0;
    public final gyh Q0;
    
    static {
        R0 = new soe[] { (soe)hi.m(DMSearchContentViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public DMSearchContentViewModel(final ibm ibm, final UserIdentifier n0, final ww7<e18, wv7, ox7> o0) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)n0, "owner");
        zzd.f((Object)o0, "searchController");
        super((fae)ibm, (oax)new vw7$b(false));
        this.N0 = n0;
        this.O0 = o0;
        final b5j distinctUntilChanged = o0.b().distinctUntilChanged();
        zzd.e((Object)distinctUntilChanged, "searchController.searchS\u2026te.distinctUntilChanged()");
        this.B(distinctUntilChanged, (rtb)new rtb<oyh<vw7, e18>, oyv>() {
            public final /* synthetic */ DMSearchContentViewModel C0;
            
            public final Object invoke(final Object o) {
                final oyh oyh = (oyh)o;
                zzd.f((Object)oyh, "$this$intoWeaver");
                oyh.e((gub)new a(this.C0, (ap6)null));
                return oyv.a;
            }
        });
        MviViewModel.M((MviViewModel)this, o0.c(), (String)null, (qqx)null, (gub)new DMSearchContentViewModel$b(this, (ap6)null), 3, (Object)null);
        this.Q0 = oyz.f0(this, (rtb)new rtb<iyh<dw7>, oyv>() {
            public final /* synthetic */ DMSearchContentViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)dw7.f.class), (gub)new b(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dw7.g.class), (gub)new e(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dw7.h.class), (gub)new f(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dw7.i.class), (gub)new g(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dw7.j.class), (gub)new h(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dw7.e.class), (gub)new i(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dw7.c.class), (gub)new j(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dw7.k.class), (gub)new k(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dw7.d.class), (gub)new l(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dw7.b.class), (gub)new c(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)dw7.a.class), (gub)new d(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<dw7> v() {
        return (iyh<dw7>)this.Q0.a((soe)DMSearchContentViewModel.R0[0]);
    }
}
