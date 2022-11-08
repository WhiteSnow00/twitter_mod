// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.search;

import java.util.concurrent.TimeUnit;
import com.twitter.util.user.UserIdentifier;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/dm/search/DMSearchToolbarViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lf28;", "Lb28;", "Lw18;", "feature.tfa.dm.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class DMSearchToolbarViewModel extends MviViewModel<f28, b28, w18>
{
    public static final /* synthetic */ soe<Object>[] R0;
    public final ww7<e18, wv7, ox7> N0;
    public final UserIdentifier O0;
    public final zml<wv7$g> P0;
    public final gyh Q0;
    
    static {
        R0 = new soe[] { (soe)hi.m(DMSearchToolbarViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public DMSearchToolbarViewModel(final ibm ibm, final ww7<e18, wv7, ox7> n0, final UserIdentifier o0, final z7x z7x) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)n0, "searchController");
        zzd.f((Object)o0, "owner");
        zzd.f((Object)z7x, "viewLifecycle");
        super((fae)ibm, (oax)new f28(""));
        this.N0 = n0;
        this.O0 = o0;
        final long s = poa.S();
        final zml p4 = new zml();
        this.P0 = (zml<wv7$g>)p4;
        final b5j distinctUntilChanged = n0.b().distinctUntilChanged();
        zzd.e((Object)distinctUntilChanged, "searchController.searchS\u2026te.distinctUntilChanged()");
        this.B(distinctUntilChanged, (rtb)new rtb<oyh<f28, e18>, oyv>() {
            public final /* synthetic */ DMSearchToolbarViewModel C0;
            
            public final Object invoke(final Object o) {
                final oyh oyh = (oyh)o;
                zzd.f((Object)oyh, "$this$intoWeaver");
                oyh.e((gub)new m(this.C0, (ap6)null));
                return oyv.a;
            }
        });
        MviViewModel.M((MviViewModel)this, n0.c(), (String)null, (qqx)null, (gub)new DMSearchToolbarViewModel$b(this, (ap6)null), 3, (Object)null);
        final b5j debounce = ((b5j)p4).withLatestFrom((naj)n0.b().distinctUntilChanged(), (ew1)new cg8((Object)DMSearchToolbarViewModel$c.C0, 1)).debounce(s, TimeUnit.MILLISECONDS);
        zzd.e((Object)debounce, "debouncedQueryActionSubj\u2026e, TimeUnit.MILLISECONDS)");
        MviViewModel.M((MviViewModel)this, debounce, (String)null, (qqx)null, (gub)new DMSearchToolbarViewModel$d(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)z7x.d(), (String)null, (qqx)null, (gub)new DMSearchToolbarViewModel$e(this, (ap6)null), 3, (Object)null);
        this.Q0 = oyz.f0(this, (rtb)new rtb<iyh<b28>, oyv>() {
            public final /* synthetic */ DMSearchToolbarViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)b28.a.class), (gub)new n(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)b28.b.class), (gub)new o(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<b28> v() {
        return (iyh<b28>)this.Q0.a((soe)DMSearchToolbarViewModel.R0[0]);
    }
}
