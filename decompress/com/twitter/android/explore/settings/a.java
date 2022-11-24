// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.settings;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@vb8(c = "com.twitter.android.explore.settings.ExploreSettingsViewModel$1$1", f = "ExploreSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends l1s implements hub<dma, mp6<? super vzv>, Object>
{
    public Object F0;
    public final ExploreSettingsViewModel G0;
    
    public a(final ExploreSettingsViewModel g0, final mp6<? super a> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final a a = new a(this.G0, (mp6<? super a>)mp6);
        a.F0 = f0;
        return (mp6<vzv>)a;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (mp6<?>)o2);
        final vzv a2 = vzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final dma dma = (dma)this.F0;
        final ExploreSettingsViewModel g0 = this.G0;
        final stb<dna, dna> stb = (stb<dna, dna>)new stb<dna, dna>(g0, dma) {
            public final ExploreSettingsViewModel F0;
            public final dma G0;
            
            public final Object invoke(final Object o) {
                e0e.f((Object)o, "$this$setState");
                final ExploreSettingsViewModel f0 = this.F0;
                final dma g0 = this.G0;
                final ape[] s0 = ExploreSettingsViewModel.S0;
                Objects.requireNonNull(f0);
                return new dna(g0, false, false);
            }
        };
        final ape[] s0 = ExploreSettingsViewModel.S0;
        ((MviViewModel)g0).Q((stb)stb);
        return vzv.a;
    }
}
