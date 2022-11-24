// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@vb8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$intents$2$1", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends l1s implements hub<kro$d, mp6<? super vzv>, Object>
{
    public Object F0;
    public final SafetyModePreviewViewModel G0;
    public final nro H0;
    
    public e(final SafetyModePreviewViewModel g0, final nro h0, final mp6<? super e> mp6) {
        this.G0 = g0;
        this.H0 = h0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final e e = new e(this.G0, this.H0, (mp6<? super e>)mp6);
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
        final kro$d kro$d = (kro$d)this.F0;
        final SafetyModePreviewViewModel g0 = this.G0;
        final e$a e$a = new e$a(kro$d, g0, this.H0);
        final ape<Object>[] s0 = SafetyModePreviewViewModel.S0;
        g0.T((stb)e$a);
        this.G0.Q((stb)new e$b(kro$d));
        return vzv.a;
    }
}
