// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.alttext;

@sa8(c = "com.twitter.app.alttext.AltTextActivityViewModel$intents$2$1", f = "AltTextActivityViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements ftb<ay, go6<? super fzv>, Object>
{
    public final AltTextActivityViewModel D0;
    
    public a(final AltTextActivityViewModel d0, final go6<? super a> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new a(this.D0, (go6<? super a>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (go6<?>)o2);
        final fzv a2 = fzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final AltTextActivityViewModel d0 = this.D0;
        final a$a a$a = new a$a(d0);
        final coe<Object>[] p = AltTextActivityViewModel.P0;
        d0.T((qsb)a$a);
        return fzv.a;
    }
}
