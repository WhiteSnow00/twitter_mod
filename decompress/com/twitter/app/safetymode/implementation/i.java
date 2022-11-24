// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@vb8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$intents$2$3", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class i extends l1s implements hub<kro$f, mp6<? super vzv>, Object>
{
    public final SafetyModePreviewViewModel F0;
    
    public i(final SafetyModePreviewViewModel f0, final mp6<? super i> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new i(this.F0, (mp6<? super i>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i i = (i)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        i.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final SafetyModePreviewViewModel f0 = this.F0;
        final hro$c a = hro$c.a;
        final ape<Object>[] s0 = SafetyModePreviewViewModel.S0;
        f0.V((Object)a);
        return vzv.a;
    }
}
