// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.settings;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/android/explore/settings/ExploreSettingsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lwla;", "Lmla;", "Lrla;", "feature.tfa.explore.explore-settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class ExploreSettingsViewModel extends MviViewModel<wla, mla, rla>
{
    public static final coe<Object>[] Q0;
    public final kla O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)ExploreSettingsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public ExploreSettingsViewModel(final xbm xbm, final kla o0) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)o0, "repository");
        Objects.requireNonNull(wla.Companion);
        super((k9e)xbm, (jbx)wla.d);
        this.O0 = o0;
        this.B(o0.a(), (qsb)new ExploreSettingsViewModel$a(this));
        this.P0 = ewj.n(this, (qsb)new ExploreSettingsViewModel$b(this));
    }
    
    public final jyh<mla> v() {
        return (jyh<mla>)this.P0.a((coe)ExploreSettingsViewModel.Q0[0]);
    }
}
