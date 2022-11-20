// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.playlist;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.rooms.subsystem.api.models.StationTrack$Recorded;
import java.util.List;
import com.twitter.rooms.subsystem.api.models.StationTrack$Podcast;
import java.util.Objects;
import com.twitter.rooms.subsystem.api.models.StationTrack;
import java.util.ArrayList;
import com.twitter.rooms.subsystem.api.args.StationsPlaylistArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/playlist/StationsPlaylistViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ljcr;", "", "Lacr;", "Companion", "a", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class StationsPlaylistViewModel extends MviViewModel<jcr, Object, acr>
{
    public static final a Companion;
    public static final coe<Object>[] R0;
    public final mjo O0;
    public final vjo P0;
    public final hyh Q0;
    
    static {
        R0 = new coe[] { (coe)w9.f((Class)StationsPlaylistViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new a();
    }
    
    public StationsPlaylistViewModel(final StationsPlaylistArgs stationsPlaylistArgs, final mjo o0, final vjo p4, final xbm xbm) {
        czd.f((Object)stationsPlaylistArgs, "args");
        czd.f((Object)o0, "roomUtilsFragmentViewEventDispatcher");
        czd.f((Object)p4, "roomsScribeReporter");
        czd.f((Object)xbm, "releaseCompletable");
        final String stationName = stationsPlaylistArgs.getStationName();
        final List stationTracks = stationsPlaylistArgs.getStationTracks();
        final ArrayList list = new ArrayList<war$a>(iq4.H((Iterable)stationTracks, 10));
        final Iterator iterator = stationTracks.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n < 0) {
                s9i.E();
                throw null;
            }
            final StationTrack stationTrack = (StationTrack)next;
            final a companion = StationsPlaylistViewModel.Companion;
            final int size = stationsPlaylistArgs.getStationTracks().size();
            final Integer currentTrackIndex = stationsPlaylistArgs.getCurrentTrackIndex();
            Objects.requireNonNull(companion);
            czd.f((Object)stationTrack, "<this>");
            war$a war$a;
            if (stationTrack instanceof StationTrack$Podcast) {
                final String trackArtUrl = stationTrack.getTrackArtUrl();
                final owt d0 = owt.D0;
                final StationTrack$Podcast stationTrack$Podcast = (StationTrack$Podcast)stationTrack;
                final String title = stationTrack$Podcast.getPodcast().getTitle();
                final String title2 = stationTrack$Podcast.getPodcast().getShow().getTitle();
                final long pubDateMs = stationTrack$Podcast.getPodcast().getPubDateMs();
                boolean b = false;
                Label_0218: {
                    if (currentTrackIndex != null) {
                        if (n == currentTrackIndex) {
                            b = true;
                            break Label_0218;
                        }
                    }
                    b = false;
                }
                war$a = new war$a(trackArtUrl, d0, title, title2, Long.valueOf(pubDateMs), b, n, size, (Integer)null, stationTrack$Podcast.getSocialProof());
            }
            else if (stationTrack instanceof StationTrack.Live) {
                final String trackArtUrl2 = stationTrack.getTrackArtUrl();
                final owt e0 = owt.E0;
                final StationTrack.Live live = (StationTrack.Live)stationTrack;
                final String title3 = live.getTitle();
                final String hostDisplayName = live.getHostDisplayName();
                boolean b2 = false;
                Label_0323: {
                    if (currentTrackIndex != null) {
                        if (n == currentTrackIndex) {
                            b2 = true;
                            break Label_0323;
                        }
                    }
                    b2 = false;
                }
                war$a = new war$a(trackArtUrl2, e0, title3, hostDisplayName, (Long)null, b2, n, size, Integer.valueOf(live.getTotalParticipating()), (List)live.getSocialProof());
            }
            else {
                if (!(stationTrack instanceof StationTrack$Recorded)) {
                    throw new NoWhenBranchMatchedException();
                }
                final String trackArtUrl3 = stationTrack.getTrackArtUrl();
                final owt f0 = owt.F0;
                final StationTrack$Recorded stationTrack$Recorded = (StationTrack$Recorded)stationTrack;
                final String title4 = stationTrack$Recorded.getTitle();
                final String hostDisplayName2 = stationTrack$Recorded.getHostDisplayName();
                final Long recordedTime = stationTrack$Recorded.getRecordedTime();
                boolean b3 = false;
                Label_0438: {
                    if (currentTrackIndex != null) {
                        if (n == currentTrackIndex) {
                            b3 = true;
                            break Label_0438;
                        }
                    }
                    b3 = false;
                }
                war$a = new war$a(trackArtUrl3, f0, title4, hostDisplayName2, recordedTime, b3, n, size, (Integer)null, stationTrack$Recorded.getSocialProof());
            }
            list.add(war$a);
            ++n;
        }
        super((k9e)xbm, (jbx)new jcr(stationName, (List)list));
        this.O0 = o0;
        this.P0 = p4;
        this.Q0 = ewj.n(this, (qsb)new StationsPlaylistViewModel$b(this));
    }
    
    public final jyh<Object> v() {
        return (jyh<Object>)this.Q0.a((coe)StationsPlaylistViewModel.R0[0]);
    }
    
    public static final class a
    {
    }
}
