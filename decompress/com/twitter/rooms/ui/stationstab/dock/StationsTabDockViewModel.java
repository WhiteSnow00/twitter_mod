// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.dock;

import java.util.List;
import com.twitter.rooms.subsystem.api.args.StationsTabControllerContentViewArgs;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/dock/StationsTabDockViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ltdr;", "", "Lwcr;", "Companion", "h", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class StationsTabDockViewModel extends MviViewModel<tdr, Object, wcr>
{
    public static final StationsTabDockViewModel.StationsTabDockViewModel$h Companion;
    public static final /* synthetic */ soe<Object>[] Q0;
    public final Context N0;
    public final isq O0;
    public final gyh P0;
    
    static {
        Q0 = new soe[] { (soe)hi.m(StationsTabDockViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new StationsTabDockViewModel.StationsTabDockViewModel$h();
    }
    
    public StationsTabDockViewModel(final Context n0, final StationsTabControllerContentViewArgs stationsTabControllerContentViewArgs, final ydr ydr, final dbr dbr, final isq o0, final gjo gjo, final aar aar, final ulq ulq, final ibm ibm) {
        zzd.f((Object)n0, "context");
        zzd.f((Object)stationsTabControllerContentViewArgs, "args");
        zzd.f((Object)ydr, "stationsTrackEventDispatcher");
        zzd.f((Object)dbr, "playbackEventDispatcher");
        zzd.f((Object)o0, "stationPlaybackManager");
        zzd.f((Object)gjo, "roomsScribeReporter");
        zzd.f((Object)aar, "stationPlaylistItemDispatcher");
        zzd.f((Object)ulq, "spaceViewDispatcher");
        zzd.f((Object)ibm, "releaseCompletable");
        final String title = stationsTabControllerContentViewArgs.getStationFeed().getTitle();
        final String trackArtUrl = stationsTabControllerContentViewArgs.getCurrentTrack().getTrackArtUrl();
        final StationsTabDockViewModel.StationsTabDockViewModel$h companion = StationsTabDockViewModel.Companion;
        super((fae)ibm, (oax)new tdr(title, trackArtUrl, stationsTabControllerContentViewArgs.getCurrentTrack().getNextTrackData(), stationsTabControllerContentViewArgs.getCurrentTrack().getNextTrackData() != null, stationsTabControllerContentViewArgs.getCurrentTrack().getTrackMetadata(), stationsTabControllerContentViewArgs.getStationFeed().getStationMetadata(), stationsTabControllerContentViewArgs.getStationFeed().getBackgroundGradient(), companion.c(stationsTabControllerContentViewArgs.getCurrentTrack()), stationsTabControllerContentViewArgs.getCurrentTrack().getTrackUuid(), (List)stationsTabControllerContentViewArgs.getStationFeed().getStationTracks(), companion.a(n0, stationsTabControllerContentViewArgs.getCurrentTrack().getNextTrackData(), o0.k.size()), companion.b(stationsTabControllerContentViewArgs.getCurrentTrack())));
        this.N0 = n0;
        this.O0 = o0;
        gjo.R(companion.c(stationsTabControllerContentViewArgs.getCurrentTrack()));
        final b5j map = ((b5j)ydr.a).filter((ptk)new zt1((rtb)StationsTabDockViewModel$a.C0, 21)).map((qtb)new sbn((rtb)StationsTabDockViewModel$b.C0, 10));
        zzd.e((Object)map, "stationsTrackEventDispat\u2026        .map { it.get() }");
        MviViewModel.M((MviViewModel)this, map, (String)null, (qqx)null, (gub)new StationsTabDockViewModel$c(this, gjo, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)aar.a, (String)null, (qqx)null, (gub)new StationsTabDockViewModel$d(this, dbr, (ap6)null), 3, (Object)null);
        final b5j filter = ((b5j)dbr.a).filter((ptk)new di((rtb)StationsTabDockViewModel$e.C0, 16));
        zzd.e((Object)filter, "playbackEventDispatcher.\u2026.TurnOffSkipTrackButton }");
        MviViewModel.M((MviViewModel)this, filter, (String)null, (qqx)null, (gub)new StationsTabDockViewModel$f(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)ulq.a, (String)null, (qqx)null, (gub)new StationsTabDockViewModel$g(this, (ap6)null), 3, (Object)null);
        ulq.b.onNext((Object)Boolean.TRUE);
        this.P0 = oyz.f0(this, (rtb)new StationsTabDockViewModel$i(this, gjo, dbr, ulq));
    }
    
    public final iyh<Object> v() {
        return (iyh<Object>)this.P0.a((soe)StationsTabDockViewModel.Q0[0]);
    }
}
