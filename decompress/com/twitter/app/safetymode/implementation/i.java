// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@sa8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$intents$2$3", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class i extends p0s implements ftb<rqo.f, go6<? super fzv>, Object>
{
    public final SafetyModePreviewViewModel D0;
    
    public i(final SafetyModePreviewViewModel d0, final go6<? super i> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new i(this.D0, (go6<? super i>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i i = (i)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        i.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final SafetyModePreviewViewModel d0 = this.D0;
        final oqo$c a = oqo$c.a;
        final coe<Object>[] q0 = SafetyModePreviewViewModel.Q0;
        d0.V((Object)a);
        return fzv.a;
    }
}
