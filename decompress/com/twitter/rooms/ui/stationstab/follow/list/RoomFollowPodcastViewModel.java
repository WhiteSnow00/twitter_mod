// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.follow.list;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/follow/list/RoomFollowPodcastViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lpjn;", "", "Loin;", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomFollowPodcastViewModel extends MviViewModel<pjn, Object, oin>
{
    public static final /* synthetic */ soe<Object>[] Q0;
    public final min N0;
    public final win O0;
    public final gyh P0;
    
    static {
        Q0 = new soe[] { (soe)hi.m(RoomFollowPodcastViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomFollowPodcastViewModel(final min n0, final win o0, final ibm ibm) {
        zzd.f((Object)n0, "roomFollowPodcast");
        zzd.f((Object)o0, "roomFollowPodcastItemDispatcher");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new pjn(n0.b, n0.c, n0.d, n0.e, n0.a, n0.f, n0.g));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = oyz.f0(this, (rtb)new RoomFollowPodcastViewModel$a(this));
    }
    
    public final void W(final fkb fkb) {
        final win o0 = this.O0;
        final min n0 = this.N0;
        final win.a a = new win.a(n0.a, n0.i, n0.h, fkb);
        Objects.requireNonNull(o0);
        ((laa)o0).a.onNext((Object)a);
    }
    
    public final iyh<Object> v() {
        return (iyh<Object>)this.P0.a((soe)RoomFollowPodcastViewModel.Q0[0]);
    }
}
