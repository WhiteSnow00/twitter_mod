// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.hero.audiospace;

import java.util.Objects;

@gb8(c = "com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel$intents$2$2", f = "AudioSpaceHeroViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends xzr implements gub<f21.a, ap6<? super oyv>, Object>
{
    public final /* synthetic */ AudioSpaceHeroViewModel C0;
    
    public b(final AudioSpaceHeroViewModel c0, final ap6<? super b> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new b(this.C0, (ap6<? super b>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final AudioSpaceHeroViewModel c0 = this.C0;
        final soe<Object>[] v0 = AudioSpaceHeroViewModel.V0;
        Objects.requireNonNull(c0);
        c0.T((rtb)new j21(c0));
        return oyv.a;
    }
}