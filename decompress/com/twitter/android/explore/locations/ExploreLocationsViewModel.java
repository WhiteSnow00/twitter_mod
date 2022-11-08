// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.locations;

import java.util.Locale;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/twitter/android/explore/locations/ExploreLocationsViewModel;", "Lg8x;", "feature.tfa.explore.explore-settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class ExploreLocationsViewModel implements g8x
{
    public final ila C0;
    public final jma D0;
    public final Locale E0;
    public final rv1<rla> F0;
    public final m29 G0;
    
    public ExploreLocationsViewModel(final ila c0, final jma d0, final Locale e0, final ibm ibm) {
        zzd.f((Object)c0, "locationsRepo");
        zzd.f((Object)d0, "settingsRepo");
        zzd.f((Object)e0, "locale");
        zzd.f((Object)ibm, "releaseCompletable");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = (rv1<rla>)new rv1();
        final m29 g0 = new m29();
        this.G0 = g0;
        ibm.i((rj)new ap0(g0, 0));
    }
}
