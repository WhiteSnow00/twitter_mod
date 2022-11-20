// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.posttweetactions.ui.contacts;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/posttweetactions/ui/contacts/PostTweetActionsModalViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lb3a;", "", "Losk;", "subsystem.tfa.post-tweet-actions.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostTweetActionsModalViewModel extends MviViewModel<b3a, Object, osk>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)PostTweetActionsModalViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public PostTweetActionsModalViewModel(final xbm xbm) {
        czd.f((Object)xbm, "releaseComplete");
        super((k9e)xbm, (jbx)b3a.a);
        this.O0 = ewj.n(this, (qsb)new PostTweetActionsModalViewModel$a(this));
    }
    
    public final jyh<Object> v() {
        return (jyh<Object>)this.O0.a((coe)PostTweetActionsModalViewModel.P0[0]);
    }
}
