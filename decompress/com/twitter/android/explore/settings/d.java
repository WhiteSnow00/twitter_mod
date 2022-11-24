// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.settings;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.android.explore.settings.ExploreSettingsViewModel$intents$2$1", f = "ExploreSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends l1s implements hub<g4w, mp6<? super vzv>, Object>
{
    public Object F0;
    public final ExploreSettingsViewModel G0;
    
    public d(final ExploreSettingsViewModel g0, final mp6<? super d> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final d d = new d(this.G0, (mp6<? super d>)mp6);
        d.F0 = f0;
        return (mp6<vzv>)d;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final g4w g4w = (g4w)this.F0;
        final ExploreSettingsViewModel g0 = this.G0;
        final stb<dna, vzv> stb = (stb<dna, vzv>)new stb<dna, vzv>(g0, g4w) {
            public final ExploreSettingsViewModel F0;
            public final g4w G0;
            
            public final Object invoke(final Object o) {
                final dna dna = (dna)o;
                e0e.f((Object)dna, "currentState");
                final ExploreSettingsViewModel f0 = this.F0;
                final dma$a a = dna.a.a();
                a.d = this.G0.a;
                ((MviViewModel)f0).x(f0.Q0.b((dma)((z4j)a).e()), (stb)new cna(f0));
                return vzv.a;
            }
        };
        final ape[] s0 = ExploreSettingsViewModel.S0;
        ((MviViewModel)g0).T((stb)stb);
        return vzv.a;
    }
}
