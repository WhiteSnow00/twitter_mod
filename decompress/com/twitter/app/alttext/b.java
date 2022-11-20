// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.alttext;

@sa8(c = "com.twitter.app.alttext.AltTextActivityViewModel$intents$2$2", f = "AltTextActivityViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<cy, go6<? super fzv>, Object>
{
    public final AltTextActivityViewModel D0;
    
    public b(final AltTextActivityViewModel d0, final go6<? super b> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new b(this.D0, (go6<? super b>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final AltTextActivityViewModel d0 = this.D0;
        final b$a b$a = new b$a(d0);
        final coe<Object>[] p = AltTextActivityViewModel.P0;
        d0.T((qsb)b$a);
        return fzv.a;
    }
}
