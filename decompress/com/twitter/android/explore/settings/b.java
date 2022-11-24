// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.settings;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.android.explore.settings.ExploreSettingsViewModel$1$2", f = "ExploreSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends l1s implements stb<mp6<? super vzv>, Object>
{
    public final ExploreSettingsViewModel F0;
    
    public b(final ExploreSettingsViewModel f0, final mp6<? super b> mp6) {
        this.F0 = f0;
        super(1, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final mp6<?> mp6) {
        return (mp6<vzv>)new b(this.F0, (mp6<? super b>)mp6);
    }
    
    public final Object invoke(final Object o) {
        final b b = (b)this.create((mp6<?>)o);
        final vzv a = vzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final ExploreSettingsViewModel f0 = this.F0;
        final stb<dna, dna> f2 = (stb<dna, dna>)b$a.F0;
        final ape[] s0 = ExploreSettingsViewModel.S0;
        ((MviViewModel)f0).Q((stb)f2);
        return vzv.a;
    }
}
