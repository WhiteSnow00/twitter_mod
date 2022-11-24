// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.hero.slate;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.android.liveevent.landing.hero.slate.SlateHeroViewModel$intents$2$1", f = "SlateHeroViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends l1s implements hub<gfq.a, mp6<? super vzv>, Object>
{
    public final SlateHeroViewModel F0;
    
    public a(final SlateHeroViewModel f0, final mp6<? super a> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new a(this.F0, (mp6<? super a>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (mp6<?>)o2);
        final vzv a2 = vzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final SlateHeroViewModel f0 = this.F0;
        final stb<mfq, vzv> stb = (stb<mfq, vzv>)new stb<mfq, vzv>(f0) {
            public final SlateHeroViewModel F0;
            
            public final Object invoke(final Object o) {
                final mfq mfq = (mfq)o;
                e0e.f((Object)mfq, "state");
                if (mfq.b != null && SlateHeroViewModel.W(this.F0, mfq.a) != 0L) {
                    final SlateHeroViewModel f0 = this.F0;
                    ((MviViewModel)f0).V((Object)new dfq$a(mfq.b, SlateHeroViewModel.W(f0, mfq.a)));
                }
                return vzv.a;
            }
        };
        final ape[] s0 = SlateHeroViewModel.S0;
        ((MviViewModel)f0).T((stb)stb);
        return vzv.a;
    }
}
