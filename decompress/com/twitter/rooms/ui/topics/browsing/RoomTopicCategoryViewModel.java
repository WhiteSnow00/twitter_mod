// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.browsing;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/topics/browsing/RoomTopicCategoryViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ljfo;", "Lyeo;", "Lxeo;", "Companion", "b", "feature.tfa.rooms.ui.topics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomTopicCategoryViewModel extends MviViewModel<jfo, yeo, xeo>
{
    public static final RoomTopicCategoryViewModel.RoomTopicCategoryViewModel$b Companion;
    public static final /* synthetic */ soe<Object>[] S0;
    public final zeo N0;
    public final veo O0;
    public final gjo P0;
    public final AtomicBoolean Q0;
    public final gyh R0;
    
    static {
        S0 = new soe[] { (soe)hi.m(RoomTopicCategoryViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new RoomTopicCategoryViewModel.RoomTopicCategoryViewModel$b();
    }
    
    public RoomTopicCategoryViewModel(final zeo n0, final veo o0, final ngo ngo, final gjo p5, final ibm ibm) {
        zzd.f((Object)n0, "item");
        zzd.f((Object)o0, "roomTopicCategoryClickDispatcher");
        zzd.f((Object)ngo, "roomTopicsBrowsingViewStateManager");
        zzd.f((Object)p5, "roomsScribeReporter");
        zzd.f((Object)ibm, "releaseCompletable");
        Objects.requireNonNull(RoomTopicCategoryViewModel.Companion);
        super((fae)ibm, (oax)new jfo(n0.b, n0.c, n0.e, n0.a));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p5;
        this.Q0 = new AtomicBoolean(false);
        MviViewModel.M((MviViewModel)this, (b5j)((ggm)ngo).C0, (String)null, (qqx)null, (gub)new RoomTopicCategoryViewModel$a(this, (ap6)null), 3, (Object)null);
        this.R0 = oyz.f0(this, (rtb)new RoomTopicCategoryViewModel$c(this));
    }
    
    public final iyh<yeo> v() {
        return (iyh<yeo>)this.R0.a((soe)RoomTopicCategoryViewModel.S0[0]);
    }
}
