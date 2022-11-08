// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.podcast;

import android.content.res.Resources;
import android.content.Context;
import com.twitter.rooms.subsystem.api.args.StationFragmentContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/podcast/StationsPodcastViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Locr;", "Lpbr;", "Lobr;", "Companion", "c", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class StationsPodcastViewModel extends MviViewModel<ocr, pbr, obr>
{
    public static final StationsPodcastViewModel.StationsPodcastViewModel$c Companion;
    public static final /* synthetic */ soe<Object>[] P0;
    public final b1o N0;
    public final gyh O0;
    
    static {
        P0 = new soe[] { (soe)hi.m(StationsPodcastViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new StationsPodcastViewModel.StationsPodcastViewModel$c();
    }
    
    public StationsPodcastViewModel(final StationFragmentContentViewArgs stationFragmentContentViewArgs, final Context context, final dbr dbr, final gjo gjo, final b1o n0, final zml<x1> zml, final ibm ibm) {
        zzd.f((Object)stationFragmentContentViewArgs, "args");
        zzd.f((Object)context, "context");
        zzd.f((Object)dbr, "stationsPlaybackEventDispatcher");
        zzd.f((Object)gjo, "scribeReporter");
        zzd.f((Object)n0, "replayPlaybackEventDispatcher");
        zzd.f((Object)zml, "avEventSubject");
        zzd.f((Object)ibm, "releaseCompletable");
        final String title = stationFragmentContentViewArgs.getPodcastEpisode().getShow().getTitle();
        final String description = stationFragmentContentViewArgs.getPodcastEpisode().getDescription();
        final String title2 = stationFragmentContentViewArgs.getPodcastEpisode().getTitle();
        final String artUrl = stationFragmentContentViewArgs.getPodcastEpisode().getShow().getArtUrl();
        final String id = stationFragmentContentViewArgs.getPodcastEpisode().getShow().getId();
        final String id2 = stationFragmentContentViewArgs.getPodcastEpisode().getId();
        final long pubDateMs = stationFragmentContentViewArgs.getPodcastEpisode().getPubDateMs();
        final Resources resources = context.getResources();
        zzd.e((Object)resources, "context.resources");
        String s;
        if (mq1.g(pubDateMs, 0)) {
            s = resources.getString(2131955783);
            zzd.e((Object)s, "resources.getString(stri\u2026.podcast_published_today)");
        }
        else if (mq1.g(pubDateMs, -1)) {
            s = resources.getString(2131955784);
            zzd.e((Object)s, "resources.getString(stri\u2026cast_published_yesterday)");
        }
        else {
            s = hqs.p(resources, pubDateMs);
            zzd.e((Object)s, "getDateString(resources, timestampMs)");
        }
        super((fae)ibm, (oax)new ocr(title, description, title2, artUrl, id, id2, 0L, 0L, 0L, false, s, true, false, true, 2131232302, 2131955649));
        this.N0 = n0;
        final dbr.b b = (dbr.b)dbr.b.b();
        if (b != null && zzd.a((Object)b.a, (Object)stationFragmentContentViewArgs.getPodcastEpisode().getId())) {
            this.Q((rtb)new StationsPodcastViewModel$a(b));
        }
        MviViewModel.M((MviViewModel)this, (b5j)zml, (String)null, (qqx)null, (gub)new StationsPodcastViewModel$b(this, (ap6)null), 3, (Object)null);
        this.O0 = oyz.f0(this, (rtb)new StationsPodcastViewModel$d(this, gjo, dbr));
    }
    
    public final iyh<pbr> v() {
        return (iyh<pbr>)this.O0.a((soe)StationsPodcastViewModel.P0[0]);
    }
}
