// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@sa8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$intents$2$5", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class k extends p0s implements ftb<rqo.b, go6<? super fzv>, Object>
{
    public final SafetyModePreviewViewModel D0;
    public final uqo E0;
    
    public k(final SafetyModePreviewViewModel d0, final uqo e0, final go6<? super k> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new k(this.D0, this.E0, (go6<? super k>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final k k = (k)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        k.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final SafetyModePreviewViewModel d0 = this.D0;
        final k$a k$a = new k$a(d0, this.E0);
        final coe<Object>[] q0 = SafetyModePreviewViewModel.Q0;
        d0.T((qsb)k$a);
        this.D0.V((Object)oqo$b.a);
        return fzv.a;
    }
}
