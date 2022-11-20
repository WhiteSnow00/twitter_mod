// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation;

@sa8(c = "com.twitter.app.safetymode.implementation.SafetyModePreviewViewModel$1$1", f = "SafetyModePreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements ftb<qqo, go6<? super fzv>, Object>
{
    public Object D0;
    public final SafetyModePreviewViewModel E0;
    
    public a(final SafetyModePreviewViewModel e0, final go6<? super a> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final a a = new a(this.E0, (go6<? super a>)go6);
        a.D0 = d0;
        return (go6<fzv>)a;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (go6<?>)o2);
        final fzv a2 = fzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final qqo qqo = (qqo)this.D0;
        final SafetyModePreviewViewModel e0 = this.E0;
        final a$a a$a = new a$a(qqo);
        final coe<Object>[] q0 = SafetyModePreviewViewModel.Q0;
        e0.Q((qsb)a$a);
        return fzv.a;
    }
}
