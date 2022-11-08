// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.locations;

import java.util.concurrent.TimeUnit;
import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004" }, d2 = { "Lcom/twitter/android/explore/locations/ExploreLocationsBinder;", "Lg6x;", "Lmla;", "Lcom/twitter/android/explore/locations/ExploreLocationsViewModel;", "feature.tfa.explore.explore-settings.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class ExploreLocationsBinder implements g6x<mla, ExploreLocationsViewModel>
{
    public final qvo a;
    
    public ExploreLocationsBinder(final qvo a) {
        zzd.f((Object)a, "mainScheduler");
        this.a = a;
    }
    
    public final j29 a(final f6x f6x, final g8x g8x) {
        final mla mla = (mla)f6x;
        final ExploreLocationsViewModel exploreLocationsViewModel = (ExploreLocationsViewModel)g8x;
        zzd.f((Object)mla, "viewDelegate");
        zzd.f((Object)exploreLocationsViewModel, "viewModel");
        final rd6 rd6 = new rd6();
        final b5j startWith = ((b5j)exploreLocationsViewModel.F0).startWith((Object)new rla((String)null, (List)null, true, false, false, 27));
        zzd.e((Object)startWith, "stateEmitter.startWith(E\u2026iewState(loading = true))");
        rd6.a(startWith.observeOn(this.a).subscribe((fk6)new tna((rtb)new bla(mla), 2), (fk6)new sna((rtb)cla.C0, 3)));
        final b5j debounce = r9x.b((TextView)mla.I0).map((qtb)new kla((rtb)lla.C0, 0)).distinctUntilChanged().debounce(200L, TimeUnit.MILLISECONDS);
        zzd.e((Object)debounce, "editText.afterTextChange\u20260, TimeUnit.MILLISECONDS)");
        rd6.a(debounce.subscribe((fk6)new ug((rtb)new dla(exploreLocationsViewModel), 3)));
        rd6.a(((b5j)mla.G0).subscribe((fk6)new rj4((rtb)new ela(exploreLocationsViewModel), 2)));
        return (j29)rd6;
    }
}
