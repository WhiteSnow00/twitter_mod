// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.follow.list;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/follow/list/RoomFollowPodcastViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lckn;", "", "Lcjn;", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomFollowPodcastViewModel extends MviViewModel<ckn, Object, cjn>
{
    public static final coe<Object>[] R0;
    public final ajn O0;
    public final kjn P0;
    public final hyh Q0;
    
    static {
        R0 = new coe[] { (coe)w9.f((Class)RoomFollowPodcastViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public RoomFollowPodcastViewModel(final ajn o0, final kjn p3, final xbm xbm) {
        czd.f((Object)o0, "roomFollowPodcast");
        czd.f((Object)p3, "roomFollowPodcastItemDispatcher");
        czd.f((Object)xbm, "releaseCompletable");
        super((k9e)xbm, (jbx)new ckn(o0.b, o0.c, o0.d, o0.e, o0.a, o0.f, o0.g));
        this.O0 = o0;
        this.P0 = p3;
        this.Q0 = ewj.n(this, (qsb)new RoomFollowPodcastViewModel$a(this));
    }
    
    public final void W(final djb djb) {
        final kjn p = this.P0;
        final ajn o0 = this.O0;
        final kjn.a a = new kjn.a(o0.a, o0.i, o0.h, djb);
        Objects.requireNonNull(p);
        ((t9a)p).a.onNext((Object)a);
    }
    
    public final jyh<Object> v() {
        return (jyh<Object>)this.Q0.a((coe)RoomFollowPodcastViewModel.R0[0]);
    }
}
