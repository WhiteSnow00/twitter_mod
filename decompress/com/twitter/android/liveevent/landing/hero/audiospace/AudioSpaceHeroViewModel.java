// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.hero.audiospace;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006" }, d2 = { "Lcom/twitter/android/liveevent/landing/hero/audiospace/AudioSpaceHeroViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lr21;", "Lf21;", "Ld21;", "Lbkc;", "feature.tfa.liveevent.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class AudioSpaceHeroViewModel extends MviViewModel<r21, f21, d21> implements bkc
{
    public static final /* synthetic */ soe<Object>[] V0;
    public final p1o N0;
    public final n3e O0;
    public final nm P0;
    public final g6n Q0;
    public final kvo R0;
    public final gpf S0;
    public final sco T0;
    public final gyh U0;
    
    static {
        V0 = new soe[] { (soe)hi.m(AudioSpaceHeroViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public AudioSpaceHeroViewModel(final ibm ibm, final p1o n0, final n3e o0, final nm p8, final g6n q0, final kvo r0, final gpf s0, final sco t0) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)n0, "rsvpDispatcher");
        zzd.f((Object)o0, "isSubscribedRepository");
        zzd.f((Object)p8, "activeAudioSpaceDataDispatcher");
        zzd.f((Object)q0, "audioSpacesRepository");
        zzd.f((Object)r0, "scheduledSpaceSubscriptionRepository");
        zzd.f((Object)s0, "liveEventScribeReporter");
        zzd.f((Object)t0, "roomStatusProvider");
        super((fae)ibm, (oax)new r21((fpf)null, false, (mdq)null, false, false, 31, (hg8)null));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p8;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = oyz.f0(this, (rtb)new AudioSpaceHeroViewModel$a(this));
    }
    
    public final void a() {
        this.Q((rtb)AudioSpaceHeroViewModel$c.C0);
    }
    
    public final void c() {
        this.Q((rtb)AudioSpaceHeroViewModel$b.C0);
    }
    
    public final boolean g(final int n) {
        return n == 5;
    }
    
    public final void o(final boolean b) {
        this.Q((rtb)new h21(b));
    }
    
    public final void p(final dm3 dm3) {
        zzd.f((Object)dm3, "item");
        if (dm3.j == 5) {
            final fpf c = dm3.c;
            if (c != null) {
                final nm p = this.P0;
                Objects.requireNonNull(p);
                ((ggm)p).a((Object)snj.b((Object)c));
                this.Q((rtb)new l21(c));
                MviViewModel.M((MviViewModel)this, this.T0.a(), (String)null, (qqx)null, (gub)new i21(this, c, null), 3, (Object)null);
                final fpf c2 = dm3.c;
                zzd.c((Object)c2);
                final n3e o0 = this.O0;
                String b;
                if ((b = c2.b) == null) {
                    b = "";
                }
                MviViewModel.N((MviViewModel)this, (n9q)o0.a(b), (String)null, (qqx)null, (gub)new o21(this, null), 3, (Object)null);
                MviViewModel.M((MviViewModel)this, this.N0.a(), (String)null, (qqx)null, (gub)new p21(c2, this, null), 3, (Object)null);
                return;
            }
        }
        final mdq d = dm3.d;
        if (d != null) {
            this.Q((rtb)new m21(d));
        }
    }
    
    public final iyh<f21> v() {
        return (iyh<f21>)this.U0.a((soe)AudioSpaceHeroViewModel.V0[0]);
    }
}
