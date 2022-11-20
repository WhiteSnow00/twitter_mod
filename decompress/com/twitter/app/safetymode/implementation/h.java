// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@sa8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$intents$2$2", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends p0s implements ftb<rqo.c, go6<? super fzv>, Object>
{
    public Object D0;
    public final SafetyModePreviewViewModel E0;
    public final uqo F0;
    
    public h(final SafetyModePreviewViewModel e0, final uqo f0, final go6<? super h> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final h h = new h(this.E0, this.F0, (go6<? super h>)go6);
        h.D0 = d0;
        return (go6<fzv>)h;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final rqo.c c = (rqo.c)this.D0;
        final SafetyModePreviewViewModel e0 = this.E0;
        final h$a h$a = new h$a(c, e0, this.F0);
        final coe<Object>[] q0 = SafetyModePreviewViewModel.Q0;
        e0.T((qsb)h$a);
        this.E0.Q((qsb)new h$b(c));
        return fzv.a;
    }
}
