// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.inlinereplies.ui.activity;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001�\u0006\u0004" }, d2 = { "Lcom/twitter/app/inlinereplies/ui/activity/InlineRepliesActivityViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lgqd;", "", "feature.tfa.inline-replies.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class InlineRepliesActivityViewModel extends MviViewModel<gqd, Object, Object>
{
    public static final /* synthetic */ soe<Object>[] O0;
    public final gyh N0;
    
    static {
        O0 = new soe[] { (soe)hi.m(InlineRepliesActivityViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public InlineRepliesActivityViewModel(final ibm ibm) {
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)gqd.a);
        this.N0 = oyz.f0(this, (rtb)new InlineRepliesActivityViewModel$a(this));
    }
    
    public final iyh<Object> v() {
        return (iyh<Object>)this.N0.a((soe)InlineRepliesActivityViewModel.O0[0]);
    }
}
