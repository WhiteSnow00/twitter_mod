// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.tab;

import java.util.Objects;
import java.util.List;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/ui/tab/SpacesTabViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lezq;", "Lpyq;", "Lsvq;", "feature.tfa.rooms.ui.tab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SpacesTabViewModel extends MviViewModel<ezq, pyq, svq>
{
    public static final /* synthetic */ soe<Object>[] U0;
    public final h0n N0;
    public final vdo O0;
    public final peo P0;
    public final Context Q0;
    public final gjo R0;
    public final boolean S0;
    public final gyh T0;
    
    static {
        U0 = new soe[] { (soe)hi.m(SpacesTabViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SpacesTabViewModel(final h0n n0, final vdo o0, final peo p7, final Context q0, final gjo r0, final z7x z7x, final ibm ibm) {
        zzd.f((Object)n0, "roomAudioSpaceFeedRepository");
        zzd.f((Object)o0, "roomTabUuidDispatcher");
        zzd.f((Object)p7, "roomTimestampRepository");
        zzd.f((Object)q0, "context");
        zzd.f((Object)r0, "roomsScribeReporter");
        zzd.f((Object)z7x, "viewLifecycle");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new ezq(false, false, false, (List)null, (List)null, (String)null, 63, (hg8)null));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p7;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = oio.a.F();
        final b5j take = z7x.d().take(1L);
        zzd.e((Object)take, "viewLifecycle.observeFocus().take(1)");
        MviViewModel.M((MviViewModel)this, take, (String)null, (qqx)null, (gub)new SpacesTabViewModel$a(this, (ap6)null), 3, (Object)null);
        this.T0 = oyz.f0(this, (rtb)new SpacesTabViewModel$b(this));
    }
    
    public final void W(final String s, final boolean b, final boolean b2) {
        final n9q c = this.N0.c(s);
        final ypn ypn = new ypn((rtb)new SpacesTabViewModel$c(this, s), 5);
        Objects.requireNonNull(c);
        this.C((n9q)new taq((ubq)c, (qtb)ypn), (rtb)new SpacesTabViewModel$d(this, b2, b, s));
    }
    
    public final iyh<pyq> v() {
        return (iyh<pyq>)this.T0.a((soe)SpacesTabViewModel.U0[0]);
    }
}
