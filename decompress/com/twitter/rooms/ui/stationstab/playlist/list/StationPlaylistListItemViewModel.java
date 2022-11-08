// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.playlist.list;

import android.content.res.Resources;
import com.twitter.rooms.model.Image;
import com.twitter.rooms.model.StationsSocialProof;
import java.util.List;
import java.util.Objects;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/playlist/list/StationPlaylistListItemViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ltar;", "", "Ldar;", "Companion", "a", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class StationPlaylistListItemViewModel extends MviViewModel<tar, Object, dar>
{
    public static final StationPlaylistListItemViewModel.StationPlaylistListItemViewModel$a Companion;
    public static final /* synthetic */ soe<Object>[] Q0;
    public final aar N0;
    public final gjo O0;
    public final gyh P0;
    
    static {
        Q0 = new soe[] { (soe)hi.m(StationPlaylistListItemViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new StationPlaylistListItemViewModel.StationPlaylistListItemViewModel$a();
    }
    
    public StationPlaylistListItemViewModel(final Context context, final bar$a bar$a, final aar n0, final gjo o0, final qnq qnq, final ibm ibm) {
        zzd.f((Object)context, "context");
        zzd.f((Object)bar$a, "item");
        zzd.f((Object)n0, "stationPlaylistItemDispatcher");
        zzd.f((Object)o0, "roomsScribeReporter");
        zzd.f((Object)qnq, "spacesCardUtils");
        zzd.f((Object)ibm, "releaseCompletable");
        Objects.requireNonNull(StationPlaylistListItemViewModel.Companion);
        final String a = bar$a.a;
        final yvt b = bar$a.b;
        final String c = bar$a.c;
        final String d = bar$a.d;
        final Long e = bar$a.e;
        String s;
        if (e != null) {
            final long longValue = e.longValue();
            final Resources resources = context.getResources();
            zzd.e((Object)resources, "context.resources");
            if (mq1.g(longValue, 0)) {
                s = resources.getString(2131955783);
                zzd.e((Object)s, "resources.getString(stri\u2026.podcast_published_today)");
            }
            else if (mq1.g(longValue, -1)) {
                s = resources.getString(2131955784);
                zzd.e((Object)s, "resources.getString(stri\u2026cast_published_yesterday)");
            }
            else {
                s = hqs.p(resources, longValue);
                zzd.e((Object)s, "getDateString(resources, timestampMs)");
            }
        }
        else {
            s = "";
        }
        final boolean f = bar$a.f;
        final int g = bar$a.g;
        final yvt b2 = bar$a.b;
        final yvt d2 = yvt.D0;
        List list = null;
        Label_0277: {
            if (b2 == d2) {
                final Integer i = bar$a.i;
                if (i != null) {
                    list = tdy.u0((Object)new StationsSocialProof(qnq.a((List)v2a.C0, (int)i, 2131958230), null, null));
                    break Label_0277;
                }
            }
            final List j = bar$a.j;
            if (j != null) {
                list = or4.E1((Iterable)j);
            }
            else {
                list = null;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(context.getString(2131958504, new Object[] { bar$a.g + 1, bar$a.h }));
        ri4.X((Object)sb, bar$a.f, (rtb)new a(context));
        akr.X0(sb, new String[] { ", ", bar$a.c });
        ri4.X((Object)sb, bar$a.f, (rtb)new b(context, bar$a));
        if (bar$a.b == d2) {
            akr.X0(sb, new String[] { ", ", context.getString(2131958481) });
        }
        else {
            final Long e2 = bar$a.e;
            if (e2 != null) {
                final long longValue2 = e2;
                final Resources resources2 = context.getResources();
                zzd.e((Object)resources2, "context.resources");
                String s2;
                if (mq1.g(longValue2, 0)) {
                    s2 = resources2.getString(2131955783);
                    zzd.e((Object)s2, "resources.getString(stri\u2026.podcast_published_today)");
                }
                else if (mq1.g(longValue2, -1)) {
                    s2 = resources2.getString(2131955784);
                    zzd.e((Object)s2, "resources.getString(stri\u2026cast_published_yesterday)");
                }
                else {
                    s2 = hqs.p(resources2, longValue2);
                    zzd.e((Object)s2, "getDateString(resources, timestampMs)");
                }
                akr.X0(sb, new String[] { ", ", s2 });
            }
        }
        final List k = bar$a.j;
        if (k != null) {
            final StationsSocialProof stationsSocialProof = (StationsSocialProof)or4.I1(k);
            if (stationsSocialProof != null) {
                akr.X0(sb, new String[] { ", ", stationsSocialProof.getText() });
            }
        }
        final String string = sb.toString();
        zzd.e((Object)string, "StringBuilder().apply {\n\u2026\n            }.toString()");
        super((fae)ibm, (oax)new tar(a, b, c, d, s, f, g, list, string));
        this.N0 = n0;
        gjo.H(this.O0 = o0, "stations", "playlist", "track", "cell", "impression", null, null, null, null, null, bar$a.g, null, false, null, null, null, null, null, null, 523232);
        this.P0 = oyz.f0(this, (rtb)new StationPlaylistListItemViewModel$b(this));
    }
    
    public final iyh<Object> v() {
        return (iyh<Object>)this.P0.a((soe)StationPlaylistListItemViewModel.Q0[0]);
    }
}
