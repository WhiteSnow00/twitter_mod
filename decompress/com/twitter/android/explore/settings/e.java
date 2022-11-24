// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.settings;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.android.explore.settings.ExploreSettingsViewModel$intents$2$2", f = "ExploreSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends l1s implements hub<z3w, mp6<? super vzv>, Object>
{
    public Object F0;
    public final ExploreSettingsViewModel G0;
    
    public e(final ExploreSettingsViewModel g0, final mp6<? super e> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final e e = new e(this.G0, (mp6<? super e>)mp6);
        e.F0 = f0;
        return (mp6<vzv>)e;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final z3w z3w = (z3w)this.F0;
        final ExploreSettingsViewModel g0 = this.G0;
        final stb<dna, vzv> stb = (stb<dna, vzv>)new stb<dna, vzv>(g0, z3w) {
            public final ExploreSettingsViewModel F0;
            public final z3w G0;
            
            public final Object invoke(final Object o) {
                final dna dna = (dna)o;
                e0e.f((Object)dna, "currentState");
                final ExploreSettingsViewModel f0 = this.F0;
                final dma$a a = dna.a.a();
                a.a = this.G0.a;
                ((MviViewModel)f0).x(f0.Q0.b((dma)((z4j)a).e()), (stb)new cna(f0));
                return vzv.a;
            }
        };
        final ape[] s0 = ExploreSettingsViewModel.S0;
        ((MviViewModel)g0).T((stb)stb);
        return vzv.a;
    }
}
