// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.items;

import com.twitter.rooms.model.StationsSocialProof;
import com.twitter.rooms.model.Image;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/items/SpacesStationsTabCarouselItemViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lluq;", "Lttq;", "Lstq;", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SpacesStationsTabCarouselItemViewModel extends MviViewModel<luq, ttq, stq>
{
    public static final coe<Object>[] U0;
    public final ser$a O0;
    public final mtq P0;
    public final zbr Q0;
    public final asq R0;
    public final Context S0;
    public final hyh T0;
    
    static {
        U0 = new coe[] { (coe)w9.f((Class)SpacesStationsTabCarouselItemViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SpacesStationsTabCarouselItemViewModel(final ser$a o0, final mtq p6, final zbr q0, final asq r0, final Context s0, final xbm xbm) {
        czd.f((Object)o0, "item");
        czd.f((Object)p6, "spacesStationUtils");
        czd.f((Object)q0, "stationsPlaybackEventDispatcher");
        czd.f((Object)r0, "spacesLauncher");
        czd.f((Object)s0, "context");
        czd.f((Object)xbm, "releaseCompletable");
        final tar a = o0.a;
        final String d = a.d;
        final String b = a.b;
        final List<Image> c = a.c;
        final List<StationsSocialProof> f = a.f;
        final List<xvt> e = a.e;
        final String i = a.i;
        final String g = a.g;
        final wbr a2 = wbr.Companion.a(g);
        final ii8 a3 = p0f.a;
        final String h = o0.a.h;
        Objects.requireNonNull(a3);
        czd.f((Object)h, "name");
        final int[] j = ib0.I(4);
        final int length = j.length;
        final int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= length) {
                break;
            }
            n3 = j[n2];
            final String n4 = p0f.n(n3);
            final Locale root = Locale.ROOT;
            final String upperCase = n4.toUpperCase(root);
            czd.e((Object)upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            final String upperCase2 = h.toUpperCase(root);
            czd.e((Object)upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (czd.a((Object)upperCase, (Object)upperCase2)) {
                break;
            }
            ++n2;
        }
        if (n3 == 0) {
            n3 = 4;
        }
        final tar a4 = o0.a;
        super((k9e)xbm, (jbx)new luq(d, b, (List)c, (List)f, (List)e, a2, n3, g, i, a4.j, a4.k, 512));
        this.O0 = o0;
        this.P0 = p6;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.Q((qsb)new SpacesStationsTabCarouselItemViewModel$a(this));
        this.T0 = ewj.n(this, (qsb)new SpacesStationsTabCarouselItemViewModel$b(this));
    }
    
    public final jyh<ttq> v() {
        return (jyh<ttq>)this.T0.a((coe)SpacesStationsTabCarouselItemViewModel.U0[0]);
    }
}
