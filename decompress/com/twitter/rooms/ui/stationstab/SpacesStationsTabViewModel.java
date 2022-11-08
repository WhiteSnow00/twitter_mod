// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab;

import java.util.List;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00062\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001\u0007¨\u0006\b" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/SpacesStationsTabViewModel;", "Ldvq;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lcvq;", "Lwtq;", "Lutq;", "Companion", "e", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SpacesStationsTabViewModel extends MviViewModel<cvq, wtq, utq> implements dvq
{
    public static final SpacesStationsTabViewModel.SpacesStationsTabViewModel$e Companion;
    public static final /* synthetic */ soe<Object>[] T0;
    public final h0n N0;
    public final gjo O0;
    public final p1o P0;
    public final kvo Q0;
    public final g6n R0;
    public final gyh S0;
    
    static {
        T0 = new soe[] { (soe)hi.m(SpacesStationsTabViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new SpacesStationsTabViewModel.SpacesStationsTabViewModel$e();
    }
    
    public SpacesStationsTabViewModel(final h0n n0, final gjo o0, final p1o p8, final dbr dbr, final kvo q0, final g6n r0, final z7x z7x, final ibm ibm) {
        zzd.f((Object)n0, "roomFeedRepository");
        zzd.f((Object)o0, "roomsScribeReporter");
        zzd.f((Object)p8, "rsvpDispatcher");
        zzd.f((Object)dbr, "stationsPlaybackEventDispatcher");
        zzd.f((Object)q0, "scheduledSpaceSubscriptionRepository");
        zzd.f((Object)r0, "audioSpacesRepository");
        zzd.f((Object)z7x, "viewLifecycle");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new cvq(false, false, false, null, null, false, 63, null));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p8;
        this.Q0 = q0;
        this.R0 = r0;
        final b5j take = z7x.d().take(1L);
        zzd.e((Object)take, "viewLifecycle.observeFocus().take(1)");
        MviViewModel.M((MviViewModel)this, take, (String)null, (qqx)null, (gub)new SpacesStationsTabViewModel$a(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)z7x.d(), (String)null, (qqx)null, (gub)new SpacesStationsTabViewModel$b(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)z7x.g(), (String)null, (qqx)null, (gub)new SpacesStationsTabViewModel$c(this, (ap6)null), 3, (Object)null);
        MviViewModel.M((MviViewModel)this, (b5j)dbr.a, (String)null, (qqx)null, (gub)new SpacesStationsTabViewModel$d(this, (ap6)null), 3, (Object)null);
        this.S0 = oyz.f0(this, (rtb)new SpacesStationsTabViewModel$f(this));
    }
    
    public final void q(final v21 v21, final rtb<? super Boolean, oyv> rtb) {
        this.x(this.Q0.b(v21.h), (rtb)new SpacesStationsTabViewModel$g((rtb)rtb, this, v21));
    }
    
    public final void r(final v21 v21, final rtb<? super Boolean, oyv> rtb) {
        this.x(this.Q0.a(v21.h), (rtb)new SpacesStationsTabViewModel$h((rtb)rtb, this, v21));
    }
    
    public final iyh<wtq> v() {
        return (iyh<wtq>)this.S0.a((soe)SpacesStationsTabViewModel.T0[0]);
    }
}
