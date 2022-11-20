// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.subscription;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/newsletters/subscription/NewsletterSubscribeSheetViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lnji;", "Lwii;", "Ltii;", "subsystem.tfa.newsletters.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class NewsletterSubscribeSheetViewModel extends MviViewModel<nji, wii, tii>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)NewsletterSubscribeSheetViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NewsletterSubscribeSheetViewModel(final sii sii, final nmr nmr, final xbm xbm) {
        czd.f((Object)sii, "args");
        czd.f((Object)nmr, "repository");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new nji(false, sii.c, sii.f, sii.d, sii.e, sii.g, (aor)aor$a.a, false, sii.h, sii.i, false, sii.j, sii.k, sii.l));
        this.T((qsb)new NewsletterSubscribeSheetViewModel$a(this));
        this.O0 = ewj.n(this, (qsb)new NewsletterSubscribeSheetViewModel$b(this, nmr));
    }
    
    public final jyh<wii> v() {
        return (jyh<wii>)this.O0.a((coe)NewsletterSubscribeSheetViewModel.P0[0]);
    }
}
