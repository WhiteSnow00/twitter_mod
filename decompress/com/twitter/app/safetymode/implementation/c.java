// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@vb8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$intents$2$1$1$1$1", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends l1s implements hub<Throwable, mp6<? super vzv>, Object>
{
    public final SafetyModePreviewViewModel F0;
    
    public c(final SafetyModePreviewViewModel f0, final mp6<? super c> mp6) {
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
        final SafetyModePreviewViewModel f0 = this.F0;
        final hro$a a = hro$a.a;
        final ape<Object>[] s0 = SafetyModePreviewViewModel.S0;
        f0.V((Object)a);
        return vzv.a;
    }
}
