// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.search;

import java.util.concurrent.TimeUnit;
import java.util.List;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/settings/search/SettingsSearchResultsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lsqp;", "Liqp;", "Lhqp;", "feature.tfa.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SettingsSearchResultsViewModel extends MviViewModel<sqp, iqp, hqp>
{
    public static final ape<Object>[] R0;
    public final yyh Q0;
    
    static {
        R0 = new ape[] { (ape)lb0.h(SettingsSearchResultsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SettingsSearchResultsViewModel(final kcm kcm, final ypp ypp) {
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)ypp, "searchController");
        super((iae)kcm, (ccx)new sqp((String)null, (List)null, false, false, 15, (wg8)null));
        new znl();
        final t5j distinctUntilChanged = ypp.d.distinctUntilChanged();
        e0e.e((Object)distinctUntilChanged, "searchController.searchS\u2026te.distinctUntilChanged()");
        this.B(distinctUntilChanged, (stb)new SettingsSearchResultsViewModel$a(this));
        final t5j debounce = woo.a(this.R(), new dpe[] { (dpe)SettingsSearchResultsViewModel$b.F0, (dpe)SettingsSearchResultsViewModel$c.F0 }).debounce(500L, TimeUnit.MILLISECONDS);
        e0e.e((Object)debounce, "stateObservable()\n      \u20260, TimeUnit.MILLISECONDS)");
        this.B(debounce, (stb)new SettingsSearchResultsViewModel$d(this));
        this.Q0 = hfe.v((MviViewModel)this, (stb)new SettingsSearchResultsViewModel$e(this));
    }
    
    public final azh<iqp> v() {
        return (azh<iqp>)this.Q0.a((ape)SettingsSearchResultsViewModel.R0[0]);
    }
}
