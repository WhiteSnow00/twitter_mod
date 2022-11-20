// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/newsletters/NewsletterProfileModuleViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Luhi;", "Lohi;", "Lnhi;", "subsystem.tfa.newsletters.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class NewsletterProfileModuleViewModel extends MviViewModel<uhi, ohi, nhi>
{
    public static final coe<Object>[] Q0;
    public final mgw O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)NewsletterProfileModuleViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NewsletterProfileModuleViewModel(final xbm xbm, final n87 n87, final fwm fwm, final mnl<cgv> mnl, final mgw o0) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)n87, "currentProfileUserReplayDispatcher");
        czd.f((Object)fwm, "revueModuleRepository");
        czd.f((Object)mnl, "refreshRelay");
        czd.f((Object)o0, "dataSource");
        Objects.requireNonNull(uhi.Companion);
        super((k9e)xbm, (jbx)uhi.q);
        this.O0 = o0;
        if (asa.b().b("android_newsletter_profile_module_enabled", false)) {
            final h5j combineLatest = h5j.combineLatest((taj)((wgm)n87).D0, (taj)((wgm)fwm).D0, (zv1)new r18((Object)NewsletterProfileModuleViewModel$a.D0, 6));
            czd.e((Object)combineLatest, "combineLatest(\n         \u2026revueModule\n            }");
            MviViewModel.M((MviViewModel)this, combineLatest, (String)null, (jrx)null, (ftb)new NewsletterProfileModuleViewModel$b(this, (go6)null), 3, (Object)null);
            final h5j flatMapSingle = ((h5j)mnl).flatMapSingle((psb)new tl4((qsb)new NewsletterProfileModuleViewModel$c(this), 25));
            czd.e((Object)flatMapSingle, "refreshRelay.flatMapSing\u2026r.stringId)\n            }");
            MviViewModel.M((MviViewModel)this, flatMapSingle, (String)null, (jrx)null, (ftb)new NewsletterProfileModuleViewModel$d(this, (go6)null), 3, (Object)null);
        }
        this.P0 = ewj.n(this, (qsb)new NewsletterProfileModuleViewModel$e(this));
    }
    
    public final jyh<ohi> v() {
        return (jyh<ohi>)this.P0.a((coe)NewsletterProfileModuleViewModel.Q0[0]);
    }
}
