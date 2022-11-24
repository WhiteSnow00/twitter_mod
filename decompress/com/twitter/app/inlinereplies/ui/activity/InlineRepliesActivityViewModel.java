// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.inlinereplies.ui.activity;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004" }, d2 = { "Lcom/twitter/app/inlinereplies/ui/activity/InlineRepliesActivityViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Llqd;", "", "feature.tfa.inline-replies.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class InlineRepliesActivityViewModel extends MviViewModel<lqd, Object, Object>
{
    public static final ape<Object>[] R0;
    public final yyh Q0;
    
    static {
        R0 = new ape[] { (ape)lb0.h(InlineRepliesActivityViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public InlineRepliesActivityViewModel(final kcm kcm) {
        e0e.f((Object)kcm, "releaseCompletable");
        super((iae)kcm, (ccx)lqd.a);
        this.Q0 = hfe.v((MviViewModel)this, (stb)new InlineRepliesActivityViewModel$a(this));
    }
    
    public final azh<Object> v() {
        return (azh<Object>)this.Q0.a((ape)InlineRepliesActivityViewModel.R0[0]);
    }
}
