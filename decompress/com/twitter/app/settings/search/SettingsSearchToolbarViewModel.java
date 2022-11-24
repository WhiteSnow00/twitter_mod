// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.search;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/settings/search/SettingsSearchToolbarViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lhrp;", "Lcrp;", "Lxqp;", "feature.tfa.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SettingsSearchToolbarViewModel extends MviViewModel<hrp, crp, xqp>
{
    public static final ape<Object>[] S0;
    public final ypp Q0;
    public final yyh R0;
    
    static {
        S0 = new ape[] { (ape)lb0.h(SettingsSearchToolbarViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SettingsSearchToolbarViewModel(final kcm kcm, final k9x k9x, final ypp q0) {
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)k9x, "viewLifecycle");
        e0e.f((Object)q0, "searchController");
        super((iae)kcm, (ccx)new hrp((String)null, false, 3, (wg8)null));
        this.Q0 = q0;
        final t5j doOnSubscribe = q0.d.distinctUntilChanged().doOnSubscribe((rk6)new aoa((stb)new SettingsSearchToolbarViewModel$a(this), 13));
        e0e.e((Object)doOnSubscribe, "searchController.searchS\u2026enKeyboard)\n            }");
        this.B(doOnSubscribe, (stb)new SettingsSearchToolbarViewModel$b(this));
        MviViewModel.M((MviViewModel)this, k9x.d(), (String)null, (asx)null, (hub)new hub<kni, mp6<? super vzv>, Object>(this, null) {
            public final SettingsSearchToolbarViewModel F0;
            
            public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
                return (mp6<vzv>)new hub<kni, mp6<? super vzv>, Object>(this.F0, mp6) {
                    public final SettingsSearchToolbarViewModel F0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final hub<kni, mp6<? super vzv>, Object> hub = (hub<kni, mp6<? super vzv>, Object>)this.create(o, (mp6<?>)o2);
                final vzv a = vzv.a;
                hub.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                jb2.M0(o);
                final SettingsSearchToolbarViewModel f0 = this.F0;
                final xqp$a a = xqp$a.a;
                final ape<Object>[] s0 = SettingsSearchToolbarViewModel.S0;
                f0.V((Object)a);
                this.F0.Q((stb)SettingsSearchToolbarViewModel$c$a.F0);
                return vzv.a;
            }
        }, 3, (Object)null);
        this.R0 = hfe.v((MviViewModel)this, (stb)new SettingsSearchToolbarViewModel$d(this));
    }
    
    public final azh<crp> v() {
        return (azh<crp>)this.R0.a((ape)SettingsSearchToolbarViewModel.S0[0]);
    }
}
