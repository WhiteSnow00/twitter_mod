// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.topics.peek;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/android/topics/peek/TopicPeekViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lwus;", "Lcdw;", "Lppt;", "Companion", "a", "feature.tfa.topics.landing.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class TopicPeekViewModel extends MviViewModel<wus, cdw, ppt>
{
    public static final a Companion;
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)TopicPeekViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new a();
    }
    
    public TopicPeekViewModel(final ort ort, final xbm xbm) {
        czd.f((Object)ort, "timelineFragmentArgs");
        czd.f((Object)xbm, "releaseCompletable");
        Objects.requireNonNull(TopicPeekViewModel.Companion);
        super((k9e)xbm, (jbx)new wus((hss)ort));
        this.O0 = ewj.n(this, (qsb)new TopicPeekViewModel$b(this));
    }
    
    public final jyh<cdw> v() {
        return (jyh<cdw>)this.O0.a((coe)TopicPeekViewModel.P0[0]);
    }
    
    public static final class a
    {
    }
}
