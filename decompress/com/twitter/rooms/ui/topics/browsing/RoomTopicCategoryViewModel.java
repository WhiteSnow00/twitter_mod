// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.browsing;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/topics/browsing/RoomTopicCategoryViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lqgo;", "Lfgo;", "Lego;", "Companion", "b", "feature.tfa.rooms.ui.topics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomTopicCategoryViewModel extends MviViewModel<qgo, fgo, ego>
{
    public static final RoomTopicCategoryViewModel.RoomTopicCategoryViewModel$b Companion;
    public static final ape<Object>[] V0;
    public final ggo Q0;
    public final cgo R0;
    public final oko S0;
    public final AtomicBoolean T0;
    public final yyh U0;
    
    static {
        V0 = new ape[] { (ape)lb0.h(RoomTopicCategoryViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomTopicCategoryViewModel.RoomTopicCategoryViewModel$b();
    }
    
    public RoomTopicCategoryViewModel(final ggo q0, final cgo r0, final uho uho, final oko s0, final kcm kcm) {
        e0e.f((Object)q0, "item");
        e0e.f((Object)r0, "roomTopicCategoryClickDispatcher");
        e0e.f((Object)uho, "roomTopicsBrowsingViewStateManager");
        e0e.f((Object)s0, "roomsScribeReporter");
        e0e.f((Object)kcm, "releaseCompletable");
        Objects.requireNonNull(RoomTopicCategoryViewModel.Companion);
        super((iae)kcm, (ccx)new qgo(q0.b, q0.c, q0.e, q0.a));
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = new AtomicBoolean(false);
        MviViewModel.M((MviViewModel)this, (t5j)((lhm)uho).F0, (String)null, (asx)null, (hub)new RoomTopicCategoryViewModel$a(this, (mp6)null), 3, (Object)null);
        this.U0 = hfe.v((MviViewModel)this, (stb)new RoomTopicCategoryViewModel$c(this));
    }
    
    public final azh<fgo> v() {
        return (azh<fgo>)this.U0.a((ape)RoomTopicCategoryViewModel.V0[0]);
    }
}
