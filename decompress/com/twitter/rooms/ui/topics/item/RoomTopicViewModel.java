// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.item;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/topics/item/RoomTopicViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lpgo;", "Lbgo;", "Lago;", "Companion", "a", "feature.tfa.rooms.ui.topics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomTopicViewModel extends MviViewModel<pgo, bgo, ago>
{
    public static final a Companion;
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)RoomTopicViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new a();
    }
    
    public RoomTopicViewModel(final cgo cgo, final xbm xbm, final fgo fgo) {
        czd.f((Object)cgo, "roomTopicItem");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)fgo, "roomTopicItemClickDispatcher");
        Objects.requireNonNull(RoomTopicViewModel.Companion);
        super((k9e)xbm, (jbx)new pgo(cgo.c, cgo.d, cgo.e, cgo.f));
        this.O0 = ewj.n(this, (qsb)new RoomTopicViewModel$b(fgo, cgo));
    }
    
    public final jyh<bgo> v() {
        return (jyh<bgo>)this.O0.a((coe)RoomTopicViewModel.P0[0]);
    }
    
    public static final class a
    {
    }
}
