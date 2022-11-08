// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.items;

import java.util.List;
import java.util.Locale;
import java.util.Objects;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/items/SpacesStationsTabCarouselItemViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lrtq;", "Lysq;", "Lxsq;", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SpacesStationsTabCarouselItemViewModel extends MviViewModel<rtq, ysq, xsq>
{
    public static final /* synthetic */ soe<Object>[] T0;
    public final wdr$a N0;
    public final rsq O0;
    public final dbr P0;
    public final grq Q0;
    public final Context R0;
    public final gyh S0;
    
    static {
        T0 = new soe[] { (soe)hi.m(SpacesStationsTabCarouselItemViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SpacesStationsTabCarouselItemViewModel(final wdr$a n0, final rsq o0, final dbr p6, final grq q0, final Context r0, final ibm ibm) {
        zzd.f((Object)n0, "item");
        zzd.f((Object)o0, "spacesStationUtils");
        zzd.f((Object)p6, "stationsPlaybackEventDispatcher");
        zzd.f((Object)q0, "spacesLauncher");
        zzd.f((Object)r0, "context");
        zzd.f((Object)ibm, "releaseCompletable");
        final y9r a = n0.a;
        final String d = a.d;
        final String b = a.b;
        final List c = a.c;
        final List f = a.f;
        final List e = a.e;
        final String i = a.i;
        final String g = a.g;
        final abr a2 = abr.Companion.a(g);
        final ajy a3 = ffa.a;
        final String h = n0.a.h;
        Objects.requireNonNull(a3);
        zzd.f((Object)h, "name");
        final int[] f2 = nb0.F(4);
        final int length = f2.length;
        final int n2 = 0;
        int n3 = 0;
        int n4;
        while (true) {
            n4 = n2;
            if (n3 >= length) {
                break;
            }
            n4 = f2[n3];
            final String p7 = ffa.p(n4);
            final Locale root = Locale.ROOT;
            final String upperCase = p7.toUpperCase(root);
            zzd.e((Object)upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            final String upperCase2 = h.toUpperCase(root);
            zzd.e((Object)upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (zzd.a((Object)upperCase, (Object)upperCase2)) {
                break;
            }
            ++n3;
        }
        if (n4 == 0) {
            n4 = 4;
        }
        final y9r a4 = n0.a;
        super((fae)ibm, (oax)new rtq(d, b, c, f, e, a2, n4, g, i, a4.j, a4.k, 512));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p6;
        this.Q0 = q0;
        this.R0 = r0;
        this.Q((rtb)new SpacesStationsTabCarouselItemViewModel$a(this));
        this.S0 = oyz.f0(this, (rtb)new SpacesStationsTabCarouselItemViewModel$b(this));
    }
    
    public final iyh<ysq> v() {
        return (iyh<ysq>)this.S0.a((soe)SpacesStationsTabCarouselItemViewModel.T0[0]);
    }
}
