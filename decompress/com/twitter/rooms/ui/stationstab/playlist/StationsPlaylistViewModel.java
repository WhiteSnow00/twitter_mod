// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.playlist;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.rooms.subsystem.api.models.StationTrack$Recorded;
import com.twitter.rooms.subsystem.api.models.StationTrack$Live;
import com.twitter.rooms.subsystem.api.models.StationTrack$Podcast;
import java.util.Objects;
import com.twitter.rooms.subsystem.api.models.StationTrack;
import java.util.ArrayList;
import com.twitter.rooms.subsystem.api.args.StationsPlaylistArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/playlist/StationsPlaylistViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lnbr;", "", "Lebr;", "Companion", "a", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class StationsPlaylistViewModel extends MviViewModel<nbr, Object, ebr>
{
    public static final StationsPlaylistViewModel.StationsPlaylistViewModel$a Companion;
    public static final /* synthetic */ soe<Object>[] Q0;
    public final xio N0;
    public final gjo O0;
    public final gyh P0;
    
    static {
        Q0 = new soe[] { (soe)hi.m(StationsPlaylistViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new StationsPlaylistViewModel.StationsPlaylistViewModel$a();
    }
    
    public StationsPlaylistViewModel(final StationsPlaylistArgs stationsPlaylistArgs, final xio n0, final gjo o0, final ibm ibm) {
        zzd.f((Object)stationsPlaylistArgs, "args");
        zzd.f((Object)n0, "roomUtilsFragmentViewEventDispatcher");
        zzd.f((Object)o0, "roomsScribeReporter");
        zzd.f((Object)ibm, "releaseCompletable");
        final String stationName = stationsPlaylistArgs.getStationName();
        final List<StationTrack> stationTracks = stationsPlaylistArgs.getStationTracks();
        final ArrayList list = new ArrayList<bar$a>(kr4.h1((Iterable)stationTracks, 10));
        final Iterator<Object> iterator = stationTracks.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final StationTrack next = iterator.next();
            if (n2 < 0) {
                tdy.V0();
                throw null;
            }
            final StationTrack stationTrack = next;
            final StationsPlaylistViewModel.StationsPlaylistViewModel$a companion = StationsPlaylistViewModel.Companion;
            final int size = stationsPlaylistArgs.getStationTracks().size();
            final Integer currentTrackIndex = stationsPlaylistArgs.getCurrentTrackIndex();
            Objects.requireNonNull(companion);
            zzd.f((Object)stationTrack, "<this>");
            bar$a bar$a;
            if (stationTrack instanceof StationTrack$Podcast) {
                final String trackArtUrl = stationTrack.getTrackArtUrl();
                final yvt c0 = yvt.C0;
                final StationTrack$Podcast stationTrack$Podcast = (StationTrack$Podcast)stationTrack;
                final String title = stationTrack$Podcast.getPodcast().getTitle();
                final String title2 = stationTrack$Podcast.getPodcast().getShow().getTitle();
                final long pubDateMs = stationTrack$Podcast.getPodcast().getPubDateMs();
                boolean b = false;
                Label_0218: {
                    if (currentTrackIndex != null) {
                        if (n2 == currentTrackIndex) {
                            b = true;
                            break Label_0218;
                        }
                    }
                    b = false;
                }
                bar$a = new bar$a(trackArtUrl, c0, title, title2, Long.valueOf(pubDateMs), b, n2, size, (Integer)null, stationTrack$Podcast.getSocialProof());
            }
            else if (stationTrack instanceof StationTrack$Live) {
                final String trackArtUrl2 = stationTrack.getTrackArtUrl();
                final yvt d0 = yvt.D0;
                final StationTrack$Live stationTrack$Live = (StationTrack$Live)stationTrack;
                final String title3 = stationTrack$Live.getTitle();
                final String hostDisplayName = stationTrack$Live.getHostDisplayName();
                boolean b2 = false;
                Label_0323: {
                    if (currentTrackIndex != null) {
                        if (n2 == currentTrackIndex) {
                            b2 = true;
                            break Label_0323;
                        }
                    }
                    b2 = false;
                }
                bar$a = new bar$a(trackArtUrl2, d0, title3, hostDisplayName, (Long)null, b2, n2, size, Integer.valueOf(stationTrack$Live.getTotalParticipating()), stationTrack$Live.getSocialProof());
            }
            else {
                if (!(stationTrack instanceof StationTrack$Recorded)) {
                    throw new NoWhenBranchMatchedException();
                }
                final String trackArtUrl3 = stationTrack.getTrackArtUrl();
                final yvt e0 = yvt.E0;
                final StationTrack$Recorded stationTrack$Recorded = (StationTrack$Recorded)stationTrack;
                final String title4 = stationTrack$Recorded.getTitle();
                final String hostDisplayName2 = stationTrack$Recorded.getHostDisplayName();
                final Long recordedTime = stationTrack$Recorded.getRecordedTime();
                boolean b3 = false;
                Label_0438: {
                    if (currentTrackIndex != null) {
                        if (n2 == currentTrackIndex) {
                            b3 = true;
                            break Label_0438;
                        }
                    }
                    b3 = false;
                }
                bar$a = new bar$a(trackArtUrl3, e0, title4, hostDisplayName2, recordedTime, b3, n2, size, (Integer)null, stationTrack$Recorded.getSocialProof());
            }
            list.add(bar$a);
            ++n2;
        }
        super((fae)ibm, (oax)new nbr(stationName, (List)list));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = oyz.f0(this, (rtb)new StationsPlaylistViewModel$b(this));
    }
    
    public final iyh<Object> v() {
        return (iyh<Object>)this.P0.a((soe)StationsPlaylistViewModel.Q0[0]);
    }
}
