// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.search;

import java.util.concurrent.TimeUnit;
import java.util.List;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/settings/search/SettingsSearchResultsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lxpp;", "Lnpp;", "Lmpp;", "feature.tfa.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SettingsSearchResultsViewModel extends MviViewModel<xpp, npp, mpp>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)SettingsSearchResultsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SettingsSearchResultsViewModel(final xbm xbm, final dpp dpp) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)dpp, "searchController");
        super((k9e)xbm, (jbx)new xpp((String)null, (List)null, false, false, 15, (rf8)null));
        new nnl();
        final h5j distinctUntilChanged = dpp.d.distinctUntilChanged();
        czd.e((Object)distinctUntilChanged, "searchController.searchS\u2026te.distinctUntilChanged()");
        this.B(distinctUntilChanged, (qsb)new SettingsSearchResultsViewModel$a(this));
        final h5j debounce = doo.a(this.R(), new foe[] { (foe)SettingsSearchResultsViewModel$b.D0, (foe)SettingsSearchResultsViewModel$c.D0 }).debounce(500L, TimeUnit.MILLISECONDS);
        czd.e((Object)debounce, "stateObservable()\n      \u20260, TimeUnit.MILLISECONDS)");
        this.B(debounce, (qsb)new SettingsSearchResultsViewModel$d(this));
        this.O0 = ewj.n(this, (qsb)new SettingsSearchResultsViewModel$e(this));
    }
    
    public final jyh<npp> v() {
        return (jyh<npp>)this.O0.a((coe)SettingsSearchResultsViewModel.P0[0]);
    }
}
