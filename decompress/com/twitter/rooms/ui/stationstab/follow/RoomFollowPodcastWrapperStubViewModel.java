// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.follow;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/follow/RoomFollowPodcastWrapperStubViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lujn;", "", "Lldn;", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomFollowPodcastWrapperStubViewModel extends MviViewModel<ujn, Object, ldn>
{
    public RoomFollowPodcastWrapperStubViewModel(final ibm ibm) {
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new ujn(false, 1, null));
        final oio a = oio.a;
        if (dta.b().b("voice_rooms_podcast_following_enabled", false)) {
            this.Q((rtb)RoomFollowPodcastWrapperStubViewModel$a.C0);
        }
    }
}
