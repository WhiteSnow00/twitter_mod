// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.hero.slate;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006" }, d2 = { "Lcom/twitter/android/liveevent/landing/hero/slate/SlateHeroViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lydq;", "Lsdq;", "Lpdq;", "Lbkc;", "feature.tfa.liveevent.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class SlateHeroViewModel extends MviViewModel<ydq, sdq, pdq> implements bkc
{
    public static final /* synthetic */ soe<Object>[] P0;
    public final xou N0;
    public final gyh O0;
    
    static {
        P0 = new soe[] { (soe)hi.m(SlateHeroViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public SlateHeroViewModel(final xou n0, final ibm ibm) {
        zzd.f((Object)n0, "tweetRepository");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new ydq(null, null, false, null, false, 31, null));
        this.N0 = n0;
        this.O0 = oyz.f0(this, (rtb)new SlateHeroViewModel$a(this));
    }
    
    public static final long W(final SlateHeroViewModel slateHeroViewModel, final mdq mdq) {
        Objects.requireNonNull(slateHeroViewModel);
        long o = 0L;
        if (mdq != null) {
            o = pjr.o(mdq.f, 0L);
        }
        return o;
    }
    
    public final void X(final mdq mdq) {
        this.Q((rtb)new SlateHeroViewModel$b(mdq));
        final long o = pjr.o(mdq.f, 0L);
        if (o != 0L) {
            this.T((rtb)new SlateHeroViewModel$c(this, o, mdq));
        }
    }
    
    public final void a() {
        this.Q((rtb)SlateHeroViewModel$e.C0);
    }
    
    public final void c() {
        this.Q((rtb)SlateHeroViewModel$d.C0);
    }
    
    public final boolean g(final int n) {
        return n == 2 || n == 0;
    }
    
    public final void o(final boolean b) {
        this.Q((rtb)new tdq(b));
    }
    
    public final void p(final dm3 dm3) {
        zzd.f((Object)dm3, "item");
        final int j = dm3.j;
        if (j == 2) {
            final mdq e = dm3.e;
            if (e != null) {
                this.X(e);
                return;
            }
        }
        if (j == 0) {
            final mdq d = dm3.d;
            if (d != null) {
                this.X(d);
            }
        }
    }
    
    public final iyh<sdq> v() {
        return (iyh<sdq>)this.O0.a((soe)SlateHeroViewModel.P0[0]);
    }
}
