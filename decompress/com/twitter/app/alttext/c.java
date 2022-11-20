// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.alttext;

@sa8(c = "com.twitter.app.alttext.AltTextActivityViewModel$intents$2$3", f = "AltTextActivityViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends p0s implements ftb<dy, go6<? super fzv>, Object>
{
    public Object D0;
    public final AltTextActivityViewModel E0;
    
    public c(final AltTextActivityViewModel e0, final go6<? super c> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final c c = new c(this.E0, (go6<? super c>)go6);
        c.D0 = d0;
        return (go6<fzv>)c;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c c = (c)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final dy dy = (dy)this.D0;
        final AltTextActivityViewModel e0 = this.E0;
        final c$a c$a = new c$a(dy);
        final coe<Object>[] p = AltTextActivityViewModel.P0;
        e0.Q((qsb)c$a);
        return fzv.a;
    }
}
