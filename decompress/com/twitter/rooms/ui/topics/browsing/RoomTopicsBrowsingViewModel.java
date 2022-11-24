// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.browsing;

import java.util.List;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/topics/browsing/RoomTopicsBrowsingViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ltho;", "Lmho;", "Llho;", "feature.tfa.rooms.ui.topics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomTopicsBrowsingViewModel extends MviViewModel<tho, mho, lho>
{
    public static final ape<Object>[] T0;
    public final ffo Q0;
    public final oko R0;
    public final yyh S0;
    
    static {
        T0 = new ape[] { (ape)lb0.h(RoomTopicsBrowsingViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomTopicsBrowsingViewModel(final kcm kcm, final z01 z01, final ygo ygo, final cgo cgo, final uho uho, final ffo q0, final oko r0, final b11 b11) {
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)z01, "browseTopicsDataSource");
        e0e.f((Object)ygo, "roomTopicItemClickDispatcher");
        e0e.f((Object)cgo, "roomTopicCategoryClickDispatcher");
        e0e.f((Object)uho, "roomTopicsBrowsingViewStateManager");
        e0e.f((Object)q0, "roomTaggedTopicsDispatcher");
        e0e.f((Object)r0, "roomsScribeReporter");
        e0e.f((Object)b11, "componentPrefixDispatcher");
        super((iae)kcm, (ccx)new tho((List)h3a.F0, true));
        this.Q0 = q0;
        oko.b0(this.R0 = r0, (String)null, "impression", (String)null, 27);
        MviViewModel.M((MviViewModel)this, (t5j)((lhm)uho).F0, (String)null, (asx)null, (hub)new RoomTopicsBrowsingViewModel$a(this, (mp6)null), 3, (Object)null);
        this.C((bbq)((tnm<String, Object, osc>)z01).S("INITIAL_QUERY"), (stb)new RoomTopicsBrowsingViewModel$b(this, uho));
        final znl a = ((zaa)ygo).a;
        e0e.e((Object)a, "observe()");
        MviViewModel.M((MviViewModel)this, (t5j)a, (String)null, (asx)null, (hub)new RoomTopicsBrowsingViewModel$c(uho, this, (mp6)null), 3, (Object)null);
        final znl a2 = cgo.a;
        e0e.e((Object)a2, "observe()");
        MviViewModel.M((MviViewModel)this, (t5j)a2, (String)null, (asx)null, (hub)new RoomTopicsBrowsingViewModel$d(uho, (mp6)null), 3, (Object)null);
        b11.a((Object)ica.Companion.b("audiospace", "topics_browse", "", ""));
        this.S0 = hfe.v((MviViewModel)this, (stb)new RoomTopicsBrowsingViewModel$e(this));
    }
    
    public final azh<mho> v() {
        return (azh<mho>)this.S0.a((ape)RoomTopicsBrowsingViewModel.T0[0]);
    }
}
