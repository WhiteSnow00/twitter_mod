// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.sensitivemedia;

@vb8(c = "com.twitter.app.sensitivemedia.SensitiveMediaViewModel$intents$2$3", f = "SensitiveMediaViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends l1s implements hub<djp$d, mp6<? super vzv>, Object>
{
    public final SensitiveMediaViewModel F0;
    
    public d(final SensitiveMediaViewModel f0, final mp6<? super d> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new d(this.F0, (mp6<? super d>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final SensitiveMediaViewModel f0 = this.F0;
        final d$a f2 = d$a.F0;
        final ape<Object>[] r0 = SensitiveMediaViewModel.R0;
        f0.Q((stb)f2);
        return vzv.a;
    }
}
