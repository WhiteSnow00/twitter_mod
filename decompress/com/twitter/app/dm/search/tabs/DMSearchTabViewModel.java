// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.search.tabs;

import java.util.List;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/dm/search/tabs/DMSearchTabViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lu18;", "Lj18;", "Li18;", "feature.tfa.dm.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class DMSearchTabViewModel extends MviViewModel<u18, j18, i18>
{
    public static final /* synthetic */ soe<Object>[] P0;
    public final ww7<ls7, xr7, fs7> N0;
    public final gyh O0;
    
    static {
        P0 = new soe[] { (soe)hi.m(DMSearchTabViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public DMSearchTabViewModel(final ibm ibm, final ww7<ls7, xr7, fs7> n0) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)n0, "searchController");
        super((fae)ibm, (oax)new u18(jt0.V0((Object[])h28.values()), h28.C0, false, (List)v2a.C0));
        this.N0 = n0;
        final b5j ofType = n0.c().ofType((Class)fs7.a.class);
        zzd.e((Object)ofType, "searchController.searchE\u2026.ofType(Tabs::class.java)");
        MviViewModel.M((MviViewModel)this, ofType, (String)null, (qqx)null, (gub)new DMSearchTabViewModel$a(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, n0.b(), (String)null, (qqx)null, (gub)new DMSearchTabViewModel$b(this, (ap6)null), 3, (Object)null);
        this.O0 = oyz.f0(this, (rtb)new DMSearchTabViewModel$c(this));
    }
    
    public final iyh<j18> v() {
        return (iyh<j18>)this.O0.a((soe)DMSearchTabViewModel.P0[0]);
    }
}
