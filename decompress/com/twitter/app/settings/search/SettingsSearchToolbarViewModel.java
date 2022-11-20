// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.search;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/settings/search/SettingsSearchToolbarViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lmqp;", "Lhqp;", "Lcqp;", "feature.tfa.settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SettingsSearchToolbarViewModel extends MviViewModel<mqp, hqp, cqp>
{
    public static final coe<Object>[] Q0;
    public final dpp O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)SettingsSearchToolbarViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SettingsSearchToolbarViewModel(final xbm xbm, final r8x r8x, final dpp o0) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)r8x, "viewLifecycle");
        czd.f((Object)o0, "searchController");
        super((k9e)xbm, (jbx)new mqp(null, false, 3, null));
        this.O0 = o0;
        final h5j doOnSubscribe = o0.d.distinctUntilChanged().doOnSubscribe((lj6)new ft1((qsb)new SettingsSearchToolbarViewModel$a(this), 15));
        czd.e((Object)doOnSubscribe, "searchController.searchS\u2026enKeyboard)\n            }");
        this.B(doOnSubscribe, (qsb)new SettingsSearchToolbarViewModel$b(this));
        MviViewModel.M((MviViewModel)this, r8x.d(), (String)null, (jrx)null, (ftb)new ftb<tmi, go6<? super fzv>, Object>(this, null) {
            public final SettingsSearchToolbarViewModel D0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                return (go6<fzv>)new ftb<tmi, go6<? super fzv>, Object>(this.D0, go6) {
                    public final SettingsSearchToolbarViewModel D0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<tmi, go6<? super fzv>, Object> ftb = (ftb<tmi, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final SettingsSearchToolbarViewModel d0 = this.D0;
                final cqp.a a = cqp.a.a;
                final coe<Object>[] q0 = SettingsSearchToolbarViewModel.Q0;
                d0.V((Object)a);
                this.D0.Q((qsb)SettingsSearchToolbarViewModel$c$a.D0);
                return fzv.a;
            }
        }, 3, (Object)null);
        this.P0 = ewj.n(this, (qsb)new SettingsSearchToolbarViewModel$d(this));
    }
    
    public final jyh<hqp> v() {
        return (jyh<hqp>)this.P0.a((coe)SettingsSearchToolbarViewModel.Q0[0]);
    }
}
