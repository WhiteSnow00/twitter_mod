// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.podcast;

import android.content.res.Resources;
import android.content.Context;
import com.twitter.rooms.subsystem.api.args.StationFragmentContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/podcast/StationsPodcastViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lldr;", "Llcr;", "Lkcr;", "Companion", "c", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class StationsPodcastViewModel extends MviViewModel<ldr, lcr, kcr>
{
    public static final c Companion;
    public static final coe<Object>[] Q0;
    public final o1o O0;
    public final hyh P0;
    
    static {
        Q0 = new coe[] { (coe)w9.f((Class)StationsPodcastViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new c();
    }
    
    public StationsPodcastViewModel(final StationFragmentContentViewArgs stationFragmentContentViewArgs, final Context context, final zbr zbr, final vjo vjo, final o1o o0, final nnl<x1> nnl, final xbm xbm) {
        czd.f((Object)stationFragmentContentViewArgs, "args");
        czd.f((Object)context, "context");
        czd.f((Object)zbr, "stationsPlaybackEventDispatcher");
        czd.f((Object)vjo, "scribeReporter");
        czd.f((Object)o0, "replayPlaybackEventDispatcher");
        czd.f((Object)nnl, "avEventSubject");
        czd.f((Object)xbm, "releaseCompletable");
        final String title = stationFragmentContentViewArgs.getPodcastEpisode().getShow().getTitle();
        final String description = stationFragmentContentViewArgs.getPodcastEpisode().getDescription();
        final String title2 = stationFragmentContentViewArgs.getPodcastEpisode().getTitle();
        final String artUrl = stationFragmentContentViewArgs.getPodcastEpisode().getShow().getArtUrl();
        final String id = stationFragmentContentViewArgs.getPodcastEpisode().getShow().getId();
        final String id2 = stationFragmentContentViewArgs.getPodcastEpisode().getId();
        final long pubDateMs = stationFragmentContentViewArgs.getPodcastEpisode().getPubDateMs();
        final Resources resources = context.getResources();
        czd.e((Object)resources, "context.resources");
        String s;
        if (hq1.g(pubDateMs, 0)) {
            s = resources.getString(2131955783);
            czd.e((Object)s, "resources.getString(stri\u2026.podcast_published_today)");
        }
        else if (hq1.g(pubDateMs, -1)) {
            s = resources.getString(2131955784);
            czd.e((Object)s, "resources.getString(stri\u2026cast_published_yesterday)");
        }
        else {
            s = yqs.p(resources, pubDateMs);
            czd.e((Object)s, "getDateString(resources, timestampMs)");
        }
        super((k9e)xbm, (jbx)new ldr(title, description, title2, artUrl, id, id2, 0L, 0L, 0L, false, s, true, false, true, 2131232302, 2131955649));
        this.O0 = o0;
        final zbr.b b = (zbr.b)zbr.b.b();
        if (b != null && czd.a((Object)b.a, (Object)stationFragmentContentViewArgs.getPodcastEpisode().getId())) {
            this.Q((qsb)new StationsPodcastViewModel$a(b));
        }
        MviViewModel.M((MviViewModel)this, (h5j)nnl, (String)null, (jrx)null, (ftb)new ftb<x1, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final StationsPodcastViewModel E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<x1, go6<? super fzv>, Object> ftb = (ftb<x1, go6<? super fzv>, Object>)new ftb<x1, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final StationsPodcastViewModel E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<x1, go6<? super fzv>, Object> ftb = (ftb<x1, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final x1 x1 = (x1)this.D0;
                final boolean b = x1 instanceof tsv;
                final int n = 1;
                if (b || x1 instanceof ink) {
                    final StationsPodcastViewModel e0 = this.E0;
                    final StationsPodcastViewModel$b$a d0 = StationsPodcastViewModel$b$a.D0;
                    final c companion = StationsPodcastViewModel.Companion;
                    e0.Q((qsb)d0);
                }
                else {
                    int n2;
                    if (x1 instanceof mmk) {
                        n2 = n;
                    }
                    else {
                        n2 = ((x1 instanceof vsv) ? 1 : 0);
                    }
                    if (n2 != 0) {
                        final StationsPodcastViewModel e2 = this.E0;
                        final StationsPodcastViewModel$b$b d2 = StationsPodcastViewModel$b$b.D0;
                        final c companion2 = StationsPodcastViewModel.Companion;
                        e2.Q((qsb)d2);
                    }
                    else if (x1 instanceof dnk) {
                        final StationsPodcastViewModel e3 = this.E0;
                        final StationsPodcastViewModel$b$c d3 = StationsPodcastViewModel$b$c.D0;
                        final c companion3 = StationsPodcastViewModel.Companion;
                        e3.Q((qsb)d3);
                    }
                    else if (x1 instanceof lhl) {
                        final StationsPodcastViewModel e4 = this.E0;
                        final StationsPodcastViewModel$b$d stationsPodcastViewModel$b$d = new StationsPodcastViewModel$b$d(x1, e4);
                        final c companion4 = StationsPodcastViewModel.Companion;
                        e4.T((qsb)stationsPodcastViewModel$b$d);
                    }
                }
                return fzv.a;
            }
        }, 3, (Object)null);
        this.P0 = ewj.n(this, (qsb)new StationsPodcastViewModel$d(this, vjo, zbr));
    }
    
    public final jyh<lcr> v() {
        return (jyh<lcr>)this.P0.a((coe)StationsPodcastViewModel.Q0[0]);
    }
    
    public static final class c
    {
    }
}
