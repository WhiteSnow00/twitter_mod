// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@vb8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$intents$2$5", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class k extends l1s implements hub<kro$b, mp6<? super vzv>, Object>
{
    public final SafetyModePreviewViewModel F0;
    public final nro G0;
    
    public k(final SafetyModePreviewViewModel f0, final nro g0, final mp6<? super k> mp6) {
        this.F0 = f0;
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new k(this.F0, this.G0, (mp6<? super k>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final k k = (k)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        k.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final SafetyModePreviewViewModel f0 = this.F0;
        final k$a k$a = new k$a(f0, this.G0);
        final ape<Object>[] s0 = SafetyModePreviewViewModel.S0;
        f0.T((stb)k$a);
        this.F0.V((Object)hro$b.a);
        return vzv.a;
    }
}
