// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.dock;

import com.twitter.rooms.subsystem.api.args.RoomReplayFragmentContentViewArgs;
import com.twitter.rooms.subsystem.api.args.DisplayMode;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.rooms.subsystem.api.models.StationTrack$Recorded;
import com.twitter.rooms.subsystem.api.args.RoomAudioSpaceFragmentContentViewArgs;
import com.twitter.rooms.subsystem.api.args.StationFragmentContentViewArgs;
import com.twitter.rooms.subsystem.api.models.StationTrack$Podcast;
import com.twitter.rooms.subsystem.api.models.StationTrack$TrackData;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.rooms.subsystem.api.models.StationTrack;
import com.twitter.rooms.subsystem.api.args.StationsTabControllerContentViewArgs;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/dock/StationsTabDockViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lper;", "", "Ltdr;", "Companion", "h", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class StationsTabDockViewModel extends MviViewModel<per, Object, tdr>
{
    public static final h Companion;
    public static final coe<Object>[] R0;
    public final Context O0;
    public final dtq P0;
    public final hyh Q0;
    
    static {
        R0 = new coe[] { (coe)w9.f((Class)StationsTabDockViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new h();
    }
    
    public StationsTabDockViewModel(final Context o0, final StationsTabControllerContentViewArgs stationsTabControllerContentViewArgs, final uer uer, final zbr zbr, final dtq p9, final vjo vjo, final var var, final omq omq, final xbm xbm) {
        czd.f((Object)o0, "context");
        czd.f((Object)stationsTabControllerContentViewArgs, "args");
        czd.f((Object)uer, "stationsTrackEventDispatcher");
        czd.f((Object)zbr, "playbackEventDispatcher");
        czd.f((Object)p9, "stationPlaybackManager");
        czd.f((Object)vjo, "roomsScribeReporter");
        czd.f((Object)var, "stationPlaylistItemDispatcher");
        czd.f((Object)omq, "spaceViewDispatcher");
        czd.f((Object)xbm, "releaseCompletable");
        final String title = stationsTabControllerContentViewArgs.getStationFeed().getTitle();
        final String trackArtUrl = stationsTabControllerContentViewArgs.getCurrentTrack().getTrackArtUrl();
        final h companion = StationsTabDockViewModel.Companion;
        super((k9e)xbm, (jbx)new per(title, trackArtUrl, stationsTabControllerContentViewArgs.getCurrentTrack().getNextTrackData(), stationsTabControllerContentViewArgs.getCurrentTrack().getNextTrackData() != null, stationsTabControllerContentViewArgs.getCurrentTrack().getTrackMetadata(), stationsTabControllerContentViewArgs.getStationFeed().getStationMetadata(), stationsTabControllerContentViewArgs.getStationFeed().getBackgroundGradient(), companion.c(stationsTabControllerContentViewArgs.getCurrentTrack()), stationsTabControllerContentViewArgs.getCurrentTrack().getTrackUuid(), stationsTabControllerContentViewArgs.getStationFeed().getStationTracks(), companion.a(o0, stationsTabControllerContentViewArgs.getCurrentTrack().getNextTrackData(), p9.k.size()), companion.b(stationsTabControllerContentViewArgs.getCurrentTrack())));
        this.O0 = o0;
        this.P0 = p9;
        vjo.R(companion.c(stationsTabControllerContentViewArgs.getCurrentTrack()));
        final h5j map = ((h5j)uer.a).filter((ytk)new wtn((qsb)StationsTabDockViewModel$a.D0, 19)).map((psb)new wtn((qsb)StationsTabDockViewModel$b.D0, 14));
        czd.e((Object)map, "stationsTrackEventDispat\u2026        .map { it.get() }");
        MviViewModel.M((MviViewModel)this, map, (String)null, (jrx)null, (ftb)new ftb<StationTrack, go6<? super fzv>, Object>(this, vjo, null) {
            public Object D0;
            public final StationsTabDockViewModel E0;
            public final vjo F0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<StationTrack, go6<? super fzv>, Object> ftb = (ftb<StationTrack, go6<? super fzv>, Object>)new ftb<StationTrack, go6<? super fzv>, Object>(this.E0, this.F0, go6) {
                    public Object D0;
                    public final StationsTabDockViewModel E0;
                    public final vjo F0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<StationTrack, go6<? super fzv>, Object> ftb = (ftb<StationTrack, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final StationTrack stationTrack = (StationTrack)this.D0;
                final StationsTabDockViewModel e0 = this.E0;
                final StationsTabDockViewModel$c$a stationsTabDockViewModel$c$a = new StationsTabDockViewModel$c$a(stationTrack, this.F0, e0);
                final h companion = StationsTabDockViewModel.Companion;
                e0.T((qsb)stationsTabDockViewModel$c$a);
                return fzv.a;
            }
        }, 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (h5j)var.a, (String)null, (jrx)null, (ftb)new ftb<Integer, go6<? super fzv>, Object>(this, zbr, null) {
            public int D0;
            public final StationsTabDockViewModel E0;
            public final zbr F0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                final ftb<Integer, go6<? super fzv>, Object> ftb = (ftb<Integer, go6<? super fzv>, Object>)new ftb<Integer, go6<? super fzv>, Object>(this.E0, this.F0, go6) {
                    public int D0;
                    public final StationsTabDockViewModel E0;
                    public final zbr F0;
                };
                ftb.D0 = ((Number)o).intValue();
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<Integer, go6<? super fzv>, Object> ftb = (ftb<Integer, go6<? super fzv>, Object>)this.create(((Number)o).intValue(), (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final int d0 = this.D0;
                final StationsTabDockViewModel e0 = this.E0;
                final StationsTabDockViewModel$d$a stationsTabDockViewModel$d$a = new StationsTabDockViewModel$d$a(this.F0, d0, e0);
                final h companion = StationsTabDockViewModel.Companion;
                e0.T((qsb)stationsTabDockViewModel$d$a);
                return fzv.a;
            }
        }, 3, (Object)null);
        final h5j filter = ((h5j)zbr.a).filter((ytk)new vi4((qsb)StationsTabDockViewModel$e.D0, 14));
        czd.e((Object)filter, "playbackEventDispatcher.\u2026.TurnOffSkipTrackButton }");
        MviViewModel.M((MviViewModel)this, filter, (String)null, (jrx)null, (ftb)new ftb<zbr.a, go6<? super fzv>, Object>(this, null) {
            public final StationsTabDockViewModel D0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                return (go6<fzv>)new ftb<zbr.a, go6<? super fzv>, Object>(this.D0, go6) {
                    public final StationsTabDockViewModel D0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<zbr.a, go6<? super fzv>, Object> ftb = (ftb<zbr.a, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final StationsTabDockViewModel d0 = this.D0;
                final StationsTabDockViewModel$f$a d2 = StationsTabDockViewModel$f$a.D0;
                final h companion = StationsTabDockViewModel.Companion;
                d0.Q((qsb)d2);
                return fzv.a;
            }
        }, 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (h5j)omq.a, (String)null, (jrx)null, (ftb)new ftb<ContentViewArgs, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final StationsTabDockViewModel E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<ContentViewArgs, go6<? super fzv>, Object> ftb = (ftb<ContentViewArgs, go6<? super fzv>, Object>)new ftb<ContentViewArgs, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final StationsTabDockViewModel E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<ContentViewArgs, go6<? super fzv>, Object> ftb = (ftb<ContentViewArgs, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final ContentViewArgs contentViewArgs = (ContentViewArgs)this.D0;
                final StationsTabDockViewModel e0 = this.E0;
                final StationsTabDockViewModel$g$a stationsTabDockViewModel$g$a = new StationsTabDockViewModel$g$a(contentViewArgs);
                final h companion = StationsTabDockViewModel.Companion;
                e0.Q((qsb)stationsTabDockViewModel$g$a);
                return fzv.a;
            }
        }, 3, (Object)null);
        omq.b.onNext((Object)Boolean.TRUE);
        this.Q0 = ewj.n(this, (qsb)new StationsTabDockViewModel$i(this, vjo, zbr, omq));
    }
    
    public final jyh<Object> v() {
        return (jyh<Object>)this.Q0.a((coe)StationsTabDockViewModel.R0[0]);
    }
    
    public static final class h
    {
        public final String a(final Context context, final StationTrack$TrackData stationTrack$TrackData, final int n) {
            czd.f((Object)context, "context");
            String string = null;
            Integer value;
            if (stationTrack$TrackData != null) {
                value = stationTrack$TrackData.getTrackNumber();
            }
            else {
                value = null;
            }
            if (value != null) {
                string = context.getString(2131958508, new Object[] { stationTrack$TrackData.getTrackNumber(), n });
            }
            return string;
        }
        
        public final ContentViewArgs b(final StationTrack stationTrack) {
            czd.f((Object)stationTrack, "stationTrack");
            Object o;
            if (stationTrack instanceof StationTrack$Podcast) {
                o = new StationFragmentContentViewArgs(((StationTrack$Podcast)stationTrack).getPodcast());
            }
            else if (stationTrack instanceof StationTrack.Live) {
                o = new RoomAudioSpaceFragmentContentViewArgs(true);
            }
            else {
                if (!(stationTrack instanceof StationTrack$Recorded)) {
                    throw new NoWhenBranchMatchedException();
                }
                final StationTrack$Recorded stationTrack$Recorded = (StationTrack$Recorded)stationTrack;
                o = new RoomReplayFragmentContentViewArgs(stationTrack$Recorded.getHostTwitterId(), stationTrack$Recorded.getHostAvatarUrl(), stationTrack$Recorded.getHostDisplayName(), stationTrack$Recorded.getRoomId(), stationTrack$Recorded.getTitle(), stationTrack$Recorded.getRecordedTime(), stationTrack$Recorded.isSpaceAvailableForClipping(), stationTrack$Recorded.getTotalNumParticipants(), (DisplayMode)DisplayMode.StationsTab.INSTANCE);
            }
            return (ContentViewArgs)o;
        }
        
        public final owt c(final StationTrack stationTrack) {
            czd.f((Object)stationTrack, "<this>");
            owt owt;
            if (stationTrack instanceof StationTrack$Podcast) {
                owt = owt.D0;
            }
            else if (stationTrack instanceof StationTrack.Live) {
                owt = owt.E0;
            }
            else {
                owt = owt.F0;
            }
            return owt;
        }
    }
}
