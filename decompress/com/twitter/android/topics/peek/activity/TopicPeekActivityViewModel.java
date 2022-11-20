// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.topics.peek.activity;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/android/topics/peek/activity/TopicPeekActivityViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lmpt;", "Ljpt;", "Lipt;", "feature.tfa.topics.landing.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class TopicPeekActivityViewModel extends MviViewModel<mpt, jpt, ipt>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)TopicPeekActivityViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public TopicPeekActivityViewModel(final hpt hpt, final xbm xbm) {
        czd.f((Object)hpt, "activityArgs");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)mpt.a);
        final String stringExtra = hpt.mIntent.getStringExtra("args_topic_id");
        final vba vba = (vba)klp.a(hpt.mIntent.getByteArrayExtra("arg_referring_event_namespace"), (rlp)vba$b.b);
        final boolean b = true;
        if (stringExtra != null && stringExtra.length() != 0 && vba != null) {
            this.V((Object)new ipt$b(stringExtra, vba));
        }
        else {
            int n = b ? 1 : 0;
            if (stringExtra != null) {
                if (stringExtra.length() == 0) {
                    n = (b ? 1 : 0);
                }
                else {
                    n = 0;
                }
            }
            String s;
            if (n != 0) {
                s = "Topic Id is null or empty.";
            }
            else {
                s = "ReferringEventNamespace is null.";
            }
            s9g.c("TopicPeekActivityViewModel", s);
            this.V((Object)ipt$a.a);
        }
        this.O0 = ewj.n(this, (qsb)new TopicPeekActivityViewModel$a(this));
    }
    
    public final jyh<jpt> v() {
        return (jyh<jpt>)this.O0.a((coe)TopicPeekActivityViewModel.P0[0]);
    }
}
