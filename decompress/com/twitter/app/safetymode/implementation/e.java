// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@sa8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$intents$2$1", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends p0s implements ftb<rqo.d, go6<? super fzv>, Object>
{
    public Object D0;
    public final SafetyModePreviewViewModel E0;
    public final uqo F0;
    
    public e(final SafetyModePreviewViewModel e0, final uqo f0, final go6<? super e> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final e e = new e(this.E0, this.F0, (go6<? super e>)go6);
        e.D0 = d0;
        return (go6<fzv>)e;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final rqo.d d = (rqo.d)this.D0;
        final SafetyModePreviewViewModel e0 = this.E0;
        final e$a e$a = new e$a(d, e0, this.F0);
        final coe<Object>[] q0 = SafetyModePreviewViewModel.Q0;
        e0.T((qsb)e$a);
        this.E0.Q((qsb)new e$b(d));
        return fzv.a;
    }
}
