// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.item;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/topics/item/RoomTopicViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Liho;", "Lugo;", "Ltgo;", "Companion", "a", "feature.tfa.rooms.ui.topics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomTopicViewModel extends MviViewModel<iho, ugo, tgo>
{
    public static final RoomTopicViewModel.RoomTopicViewModel$a Companion;
    public static final ape<Object>[] R0;
    public final yyh Q0;
    
    static {
        R0 = new ape[] { (ape)lb0.h(RoomTopicViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomTopicViewModel.RoomTopicViewModel$a();
    }
    
    public RoomTopicViewModel(final vgo vgo, final kcm kcm, final ygo ygo) {
        e0e.f((Object)vgo, "roomTopicItem");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)ygo, "roomTopicItemClickDispatcher");
        Objects.requireNonNull(RoomTopicViewModel.Companion);
        super((iae)kcm, (ccx)new iho(vgo.c, vgo.d, vgo.e, vgo.f));
        this.Q0 = hfe.v((MviViewModel)this, (stb)new RoomTopicViewModel$b(ygo, vgo));
    }
    
    public final azh<ugo> v() {
        return (azh<ugo>)this.Q0.a((ape)RoomTopicViewModel.R0[0]);
    }
}
