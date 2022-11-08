// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.narrowcast.bottomsheet;

import com.twitter.model.narrowcast.NarrowcastError;
import com.twitter.narrowcast.feature.api.NarrowcastBottomSheetFragmentArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/narrowcast/bottomsheet/NarrowcastBottomSheetViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Le8i;", "Ld8i;", "Lo7i;", "feature.tfa.narrowcast.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NarrowcastBottomSheetViewModel extends MviViewModel<e8i, d8i, o7i>
{
    public static final /* synthetic */ soe<Object>[] Q0;
    public final zml<g9i> N0;
    public final NarrowcastBottomSheetFragmentArgs O0;
    public final gyh P0;
    
    static {
        Q0 = new soe[] { (soe)hi.m(NarrowcastBottomSheetViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public NarrowcastBottomSheetViewModel(final y8i y8i, final zml<g9i> n0, final NarrowcastBottomSheetFragmentArgs o0, final ibm ibm, final jh5 jh5) {
        zzd.f((Object)y8i, "repository");
        zzd.f((Object)n0, "narrowcastTypeObserver");
        zzd.f((Object)o0, "args");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)jh5, "communitiesUtils");
        super((fae)ibm, (oax)new e8i((ded<? extends x8i>)tdy.D0(), (x8i)new x8i$b(0, 1, (hg8)null), jh5.b(), o0.getNarrowcastError()));
        this.N0 = n0;
        this.O0 = o0;
        this.B(y8i.a(o0.getUserIdentifier()), (rtb)new NarrowcastBottomSheetViewModel$a(this));
        this.P0 = oyz.f0(this, (rtb)new NarrowcastBottomSheetViewModel$b(this));
    }
    
    public final void W(final g9i g9i) {
        zzd.f((Object)g9i, "narrowcastType");
        final NarrowcastError narrowcastError = this.O0.getNarrowcastError();
        if (narrowcastError != null && (g9i instanceof g9i.a && narrowcastError instanceof g8i)) {
            this.V((Object)new o7i$c(narrowcastError));
            return;
        }
        this.N0.onNext((Object)g9i);
        this.V((Object)o7i$a.a);
    }
    
    public final iyh<d8i> v() {
        return (iyh<d8i>)this.P0.a((soe)NarrowcastBottomSheetViewModel.Q0[0]);
    }
}
