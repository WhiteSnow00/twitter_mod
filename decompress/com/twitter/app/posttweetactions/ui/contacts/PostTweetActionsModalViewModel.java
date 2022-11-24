// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.posttweetactions.ui.contacts;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/posttweetactions/ui/contacts/PostTweetActionsModalViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ld4a;", "", "Lbtk;", "subsystem.tfa.post-tweet-actions.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostTweetActionsModalViewModel extends MviViewModel<d4a, Object, btk>
{
    public static final ape<Object>[] R0;
    public final yyh Q0;
    
    static {
        R0 = new ape[] { (ape)lb0.h(PostTweetActionsModalViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public PostTweetActionsModalViewModel(final kcm kcm) {
        e0e.f((Object)kcm, "releaseComplete");
        super((iae)kcm, (ccx)d4a.a);
        this.Q0 = hfe.v((MviViewModel)this, (stb)new PostTweetActionsModalViewModel$a(this));
    }
    
    public final azh<Object> v() {
        return (azh<Object>)this.Q0.a((ape)PostTweetActionsModalViewModel.R0[0]);
    }
}
