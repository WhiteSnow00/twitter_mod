// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.hero.audiospace;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@vb8(c = "com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel$intents$2$1", f = "AudioSpaceHeroViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends l1s implements hub<h21.b, mp6<? super vzv>, Object>
{
    public final AudioSpaceHeroViewModel F0;
    
    public a(final AudioSpaceHeroViewModel f0, final mp6<? super a> mp6) {
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
        final AudioSpaceHeroViewModel f0 = this.F0;
        final ape[] y0 = AudioSpaceHeroViewModel.Y0;
        Objects.requireNonNull(f0);
        ((MviViewModel)f0).T((stb)new m21(f0));
        return vzv.a;
    }
}
