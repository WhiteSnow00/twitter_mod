// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@sa8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$2$1", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<wqo, go6<? super fzv>, Object>
{
    public Object D0;
    public final SafetyModePreviewViewModel E0;
    
    public b(final SafetyModePreviewViewModel e0, final go6<? super b> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final b b = new b(this.E0, (go6<? super b>)go6);
        b.D0 = d0;
        return (go6<fzv>)b;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final wqo wqo = (wqo)this.D0;
        final SafetyModePreviewViewModel e0 = this.E0;
        final b$a b$a = new b$a(wqo);
        final coe<Object>[] q0 = SafetyModePreviewViewModel.Q0;
        e0.Q((qsb)b$a);
        return fzv.a;
    }
}
