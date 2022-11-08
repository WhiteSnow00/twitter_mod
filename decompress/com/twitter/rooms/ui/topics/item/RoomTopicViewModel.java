// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.item;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/topics/item/RoomTopicViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lbgo;", "Lnfo;", "Lmfo;", "Companion", "a", "feature.tfa.rooms.ui.topics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomTopicViewModel extends MviViewModel<bgo, nfo, mfo>
{
    public static final RoomTopicViewModel.RoomTopicViewModel$a Companion;
    public static final /* synthetic */ soe<Object>[] O0;
    public final gyh N0;
    
    static {
        O0 = new soe[] { (soe)hi.m(RoomTopicViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomTopicViewModel.RoomTopicViewModel$a();
    }
    
    public RoomTopicViewModel(final ofo ofo, final ibm ibm, final rfo rfo) {
        zzd.f((Object)ofo, "roomTopicItem");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)rfo, "roomTopicItemClickDispatcher");
        Objects.requireNonNull(RoomTopicViewModel.Companion);
        super((fae)ibm, (oax)new bgo(ofo.c, ofo.d, ofo.e, ofo.f));
        this.N0 = oyz.f0(this, (rtb)new RoomTopicViewModel$b(rfo, ofo));
    }
    
    public final iyh<nfo> v() {
        return (iyh<nfo>)this.N0.a((soe)RoomTopicViewModel.O0[0]);
    }
}
