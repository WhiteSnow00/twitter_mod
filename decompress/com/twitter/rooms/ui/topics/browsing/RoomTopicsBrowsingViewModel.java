// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.browsing;

import java.util.List;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/topics/browsing/RoomTopicsBrowsingViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lmgo;", "Lfgo;", "Lego;", "feature.tfa.rooms.ui.topics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomTopicsBrowsingViewModel extends MviViewModel<mgo, fgo, ego>
{
    public static final /* synthetic */ soe<Object>[] Q0;
    public final wdo N0;
    public final gjo O0;
    public final gyh P0;
    
    static {
        Q0 = new soe[] { (soe)hi.m(RoomTopicsBrowsingViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomTopicsBrowsingViewModel(final ibm ibm, final x01 x01, final rfo rfo, final veo veo, final ngo ngo, final wdo n0, final gjo o0, final z01 z01) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)x01, "browseTopicsDataSource");
        zzd.f((Object)rfo, "roomTopicItemClickDispatcher");
        zzd.f((Object)veo, "roomTopicCategoryClickDispatcher");
        zzd.f((Object)ngo, "roomTopicsBrowsingViewStateManager");
        zzd.f((Object)n0, "roomTaggedTopicsDispatcher");
        zzd.f((Object)o0, "roomsScribeReporter");
        zzd.f((Object)z01, "componentPrefixDispatcher");
        super((fae)ibm, (oax)new mgo((List)v2a.C0, true));
        this.N0 = n0;
        gjo.b0(this.O0 = o0, null, "impression", null, 27);
        MviViewModel.M((MviViewModel)this, (b5j)((ggm)ngo).C0, (String)null, (qqx)null, (gub)new RoomTopicsBrowsingViewModel$a(this, (ap6)null), 3, (Object)null);
        this.C(((omm)x01).S((Object)"INITIAL_QUERY"), (rtb)new RoomTopicsBrowsingViewModel$b(this, ngo));
        final zml a = ((laa)rfo).a;
        zzd.e((Object)a, "observe()");
        MviViewModel.M((MviViewModel)this, (b5j)a, (String)null, (qqx)null, (gub)new RoomTopicsBrowsingViewModel$c(ngo, this, (ap6)null), 3, (Object)null);
        final zml a2 = ((laa)veo).a;
        zzd.e((Object)a2, "observe()");
        MviViewModel.M((MviViewModel)this, (b5j)a2, (String)null, (qqx)null, (gub)new RoomTopicsBrowsingViewModel$d(ngo, (ap6)null), 3, (Object)null);
        z01.a((Object)sba.Companion.b("audiospace", "topics_browse", "", ""));
        this.P0 = oyz.f0(this, (rtb)new RoomTopicsBrowsingViewModel$e(this));
    }
    
    public final iyh<fgo> v() {
        return (iyh<fgo>)this.P0.a((soe)RoomTopicsBrowsingViewModel.Q0[0]);
    }
}
