// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.playlist.list;

import android.content.res.Resources;
import com.twitter.rooms.model.StationsSocialProof;
import java.util.List;
import java.util.Objects;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/playlist/list/StationPlaylistListItemViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lpbr;", "", "Lyar;", "Companion", "a", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class StationPlaylistListItemViewModel extends MviViewModel<pbr, Object, yar>
{
    public static final a Companion;
    public static final coe<Object>[] R0;
    public final var O0;
    public final vjo P0;
    public final hyh Q0;
    
    static {
        R0 = new coe[] { (coe)w9.f((Class)StationPlaylistListItemViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new a();
    }
    
    public StationPlaylistListItemViewModel(final Context context, final war$a war$a, final var o0, final vjo p6, final koq koq, final xbm xbm) {
        czd.f((Object)context, "context");
        czd.f((Object)war$a, "item");
        czd.f((Object)o0, "stationPlaylistItemDispatcher");
        czd.f((Object)p6, "roomsScribeReporter");
        czd.f((Object)koq, "spacesCardUtils");
        czd.f((Object)xbm, "releaseCompletable");
        Objects.requireNonNull(StationPlaylistListItemViewModel.Companion);
        final String a = war$a.a;
        final owt b = war$a.b;
        final String c = war$a.c;
        final String d = war$a.d;
        final Long e = war$a.e;
        String s;
        if (e != null) {
            final long longValue = e.longValue();
            final Resources resources = context.getResources();
            czd.e((Object)resources, "context.resources");
            if (hq1.g(longValue, 0)) {
                s = resources.getString(2131955783);
                czd.e((Object)s, "resources.getString(stri\u2026.podcast_published_today)");
            }
            else if (hq1.g(longValue, -1)) {
                s = resources.getString(2131955784);
                czd.e((Object)s, "resources.getString(stri\u2026cast_published_yesterday)");
            }
            else {
                s = yqs.p(resources, longValue);
                czd.e((Object)s, "getDateString(resources, timestampMs)");
            }
        }
        else {
            s = "";
        }
        final boolean f = war$a.f;
        final int g = war$a.g;
        final owt b2 = war$a.b;
        final owt e2 = owt.E0;
        List list = null;
        Label_0277: {
            if (b2 == e2) {
                final Integer i = war$a.i;
                if (i != null) {
                    list = s9i.r(new StationsSocialProof(koq.a((List)f2a.D0, (int)i, 2131958230), (List)null, (String)null));
                    break Label_0277;
                }
            }
            final List j = war$a.j;
            if (j != null) {
                list = mq4.e0((Iterable)j);
            }
            else {
                list = null;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(context.getString(2131958504, new Object[] { war$a.g + 1, war$a.h }));
        ffz.t0(sb, war$a.f, (qsb)new com.twitter.rooms.ui.stationstab.playlist.list.a(context));
        tkr.L(sb, new String[] { ", ", war$a.c });
        ffz.t0(sb, war$a.f, (qsb)new b(context, war$a));
        if (war$a.b == e2) {
            tkr.L(sb, new String[] { ", ", context.getString(2131958481) });
        }
        else {
            final Long e3 = war$a.e;
            if (e3 != null) {
                final long longValue2 = e3;
                final Resources resources2 = context.getResources();
                czd.e((Object)resources2, "context.resources");
                String s2;
                if (hq1.g(longValue2, 0)) {
                    s2 = resources2.getString(2131955783);
                    czd.e((Object)s2, "resources.getString(stri\u2026.podcast_published_today)");
                }
                else if (hq1.g(longValue2, -1)) {
                    s2 = resources2.getString(2131955784);
                    czd.e((Object)s2, "resources.getString(stri\u2026cast_published_yesterday)");
                }
                else {
                    s2 = yqs.p(resources2, longValue2);
                    czd.e((Object)s2, "getDateString(resources, timestampMs)");
                }
                tkr.L(sb, new String[] { ", ", s2 });
            }
        }
        final List k = war$a.j;
        if (k != null) {
            final StationsSocialProof stationsSocialProof = (StationsSocialProof)mq4.i0(k);
            if (stationsSocialProof != null) {
                tkr.L(sb, new String[] { ", ", stationsSocialProof.getText() });
            }
        }
        final String string = sb.toString();
        czd.e((Object)string, "StringBuilder().apply {\n\u2026\n            }.toString()");
        super((k9e)xbm, (jbx)new pbr(a, b, c, d, s, f, g, list, string));
        this.O0 = o0;
        vjo.H(this.P0 = p6, "stations", "playlist", "track", "cell", "impression", null, null, null, null, null, war$a.g, null, false, null, null, null, null, null, null, 523232);
        this.Q0 = ewj.n(this, (qsb)new StationPlaylistListItemViewModel$b(this));
    }
    
    public final jyh<Object> v() {
        return (jyh<Object>)this.Q0.a((coe)StationPlaylistListItemViewModel.R0[0]);
    }
    
    public static final class a
    {
    }
}
