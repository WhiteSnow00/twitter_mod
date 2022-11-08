// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.follow;

import com.twitter.rooms.model.Show;
import java.util.List;
import java.util.Objects;
import com.twitter.rooms.subsystem.api.args.StationFragmentContentViewArgs;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/follow/RoomFollowPodcastWrapperViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lkkn;", "", "Lsjn;", "Companion", "b", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomFollowPodcastWrapperViewModel extends MviViewModel<kkn, Object, sjn>
{
    public static final RoomFollowPodcastWrapperViewModel.RoomFollowPodcastWrapperViewModel$b Companion;
    public final Context N0;
    public final xin O0;
    public final ztn P0;
    public final fln Q0;
    
    static {
        Companion = new RoomFollowPodcastWrapperViewModel.RoomFollowPodcastWrapperViewModel$b();
    }
    
    public RoomFollowPodcastWrapperViewModel(final Context n0, final StationFragmentContentViewArgs stationFragmentContentViewArgs, final win win, final xin o0, final ztn p7, final fln q0, final ibm ibm) {
        zzd.f((Object)n0, "context");
        zzd.f((Object)stationFragmentContentViewArgs, "viewArgs");
        zzd.f((Object)win, "roomFollowPodcastItemDispatcher");
        zzd.f((Object)o0, "roomFollowPodcastRepository");
        zzd.f((Object)p7, "podcastFollowingStateMap");
        zzd.f((Object)q0, "friendshipRepository");
        zzd.f((Object)ibm, "releaseCompletable");
        final RoomFollowPodcastWrapperViewModel.RoomFollowPodcastWrapperViewModel$b companion = RoomFollowPodcastWrapperViewModel.Companion;
        final Show show = stationFragmentContentViewArgs.getPodcastEpisode().getShow();
        Objects.requireNonNull(companion);
        final aun c0 = aun.C0;
        final String title = show.getTitle();
        String s;
        if (ckr.h1((CharSequence)show.getTwitterHandle())) {
            s = n0.getString(2131958482);
        }
        else {
            s = zi.y(n0.getString(2131958482), " · ", show.getTwitterHandle());
        }
        zzd.e((Object)s, "if (show.twitterHandle.i\u2026andle}\"\n                }");
        final String value = String.valueOf(r60.a(show.getDescription()));
        final String artUrl = show.getArtUrl();
        final String id = show.getId();
        zzd.f((Object)id, "podcastId");
        fkb fkb;
        if ((fkb = p7.a.get(id)) == null) {
            if (show.getFollowing()) {
                fkb = fkb.E0;
            }
            else {
                fkb = fkb.C0;
            }
        }
        super((fae)ibm, (oax)new kkn(tdy.u0((Object)new min(c0, title, s, value, artUrl, fkb, false, false, show.getId()))));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p7;
        this.Q0 = q0;
        String twitterHandle = stationFragmentContentViewArgs.getPodcastEpisode().getShow().getTwitterHandle();
        if (!(ckr.h1((CharSequence)twitterHandle) ^ true)) {
            twitterHandle = null;
        }
        if (twitterHandle != null) {
            final n9q b = o0.b(twitterHandle);
            final wj4 wj4 = new wj4((rtb)gkn.C0, 13);
            Objects.requireNonNull(b);
            MviViewModel.L((MviViewModel)this, (log)new ipg((qpg)new zog((ubq)b, (ptk)wj4), (qtb)new adr((rtb)hkn.C0, 1)), (qqx)null, (String)null, (gub)new ikn(this, (ap6)null), 3, (Object)null);
        }
        final zml a = ((laa)win).a;
        zzd.e((Object)a, "observe()");
        MviViewModel.M((MviViewModel)this, (b5j)a, (String)null, (qqx)null, (gub)new RoomFollowPodcastWrapperViewModel$a(this, (ap6)null), 3, (Object)null);
    }
    
    public static final void W(final RoomFollowPodcastWrapperViewModel roomFollowPodcastWrapperViewModel, final fkb fkb) {
        Objects.requireNonNull(roomFollowPodcastWrapperViewModel);
        roomFollowPodcastWrapperViewModel.Q((rtb)new jkn(aun.C0, fkb));
    }
    
    public static final void X(final RoomFollowPodcastWrapperViewModel roomFollowPodcastWrapperViewModel, final fkb fkb) {
        Objects.requireNonNull(roomFollowPodcastWrapperViewModel);
        roomFollowPodcastWrapperViewModel.Q((rtb)new jkn(aun.D0, fkb));
    }
}
