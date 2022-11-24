// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore.settings;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.android.explore.settings.ExploreSettingsViewModel$1$3", f = "ExploreSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends l1s implements hub<Throwable, mp6<? super vzv>, Object>
{
    public final ExploreSettingsViewModel F0;
    
    public c(final ExploreSettingsViewModel f0, final mp6<? super c> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new c(this.F0, (mp6<? super c>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c c = (c)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final ExploreSettingsViewModel f0 = this.F0;
        final stb<dna, dna> f2 = (stb<dna, dna>)c$a.F0;
        final ape[] s0 = ExploreSettingsViewModel.S0;
        ((MviViewModel)f0).Q((stb)f2);
        ((MviViewModel)this.F0).V((Object)j5q.a);
        return vzv.a;
    }
}
