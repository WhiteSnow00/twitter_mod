// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@vb8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$intents$2$6", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class l extends l1s implements hub<kro$a, mp6<? super vzv>, Object>
{
    public final SafetyModePreviewViewModel F0;
    public final nro G0;
    
    public l(final SafetyModePreviewViewModel f0, final nro g0, final mp6<? super l> mp6) {
        this.F0 = f0;
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new l(this.F0, this.G0, (mp6<? super l>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final l l = (l)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        l.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final SafetyModePreviewViewModel f0 = this.F0;
        final l$a l$a = new l$a(f0, this.G0);
        final ape<Object>[] s0 = SafetyModePreviewViewModel.S0;
        f0.T((stb)l$a);
        this.F0.V((Object)hro$b.a);
        return vzv.a;
    }
}
