// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@vb8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$intents$2$2", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends l1s implements hub<kro$c, mp6<? super vzv>, Object>
{
    public Object F0;
    public final SafetyModePreviewViewModel G0;
    public final nro H0;
    
    public h(final SafetyModePreviewViewModel g0, final nro h0, final mp6<? super h> mp6) {
        this.G0 = g0;
        this.H0 = h0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final h h = new h(this.G0, this.H0, (mp6<? super h>)mp6);
        h.F0 = f0;
        return (mp6<vzv>)h;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final kro$c kro$c = (kro$c)this.F0;
        final SafetyModePreviewViewModel g0 = this.G0;
        final h$a h$a = new h$a(kro$c, g0, this.H0);
        final ape<Object>[] s0 = SafetyModePreviewViewModel.S0;
        g0.T((stb)h$a);
        this.G0.Q((stb)new h$b(kro$c));
        return vzv.a;
    }
}
