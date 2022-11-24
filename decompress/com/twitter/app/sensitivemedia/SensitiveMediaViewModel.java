// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.sensitivemedia;

import java.util.Set;
import com.twitter.sensitivemedia.SensitiveMediaActivityContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/sensitivemedia/SensitiveMediaViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lwjp;", "Ldjp;", "Lcjp;", "feature.tfa.sensitivemedia.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SensitiveMediaViewModel extends MviViewModel<wjp, djp, cjp>
{
    public static final ape<Object>[] R0;
    public final yyh Q0;
    
    static {
        R0 = new ape[] { (ape)lb0.h(SensitiveMediaViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SensitiveMediaViewModel(final SensitiveMediaActivityContentViewArgs sensitiveMediaActivityContentViewArgs, final kcm kcm) {
        e0e.f((Object)sensitiveMediaActivityContentViewArgs, "args");
        e0e.f((Object)kcm, "releaseCompletable");
        super((iae)kcm, (ccx)new wjp(sensitiveMediaActivityContentViewArgs.getEditableMedia(), sensitiveMediaActivityContentViewArgs.getSensitiveMediaCategories(), true));
        final fg4 fg4 = new fg4();
        ((o1p)fg4).T = new dda("tabbed_media", "sensitive_media", "", "sensitive_media_tab", "show").toString();
        final int a = o5j.a;
        this.V((Object)new cjp$c((tlm)fg4));
        this.Q0 = hfe.v((MviViewModel)this, (stb)new SensitiveMediaViewModel$a(this));
    }
    
    public final azh<djp> v() {
        return (azh<djp>)this.Q0.a((ape)SensitiveMediaViewModel.R0[0]);
    }
}
