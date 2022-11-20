// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit;

@sa8(c = "com.twitter.app.profiles.edit.EditPronounsViewModel$intents$2$1", f = "EditPronounsViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends p0s implements ftb<us9, go6<? super fzv>, Object>
{
    public final EditPronounsViewModel D0;
    public final qs9 E0;
    
    public c(final EditPronounsViewModel d0, final qs9 e0, final go6<? super c> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new c(this.D0, this.E0, (go6<? super c>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c c = (c)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final EditPronounsViewModel d0 = this.D0;
        final c$a c$a = new c$a(d0, this.E0);
        final coe<Object>[] p = EditPronounsViewModel.P0;
        d0.T((qsb)c$a);
        return fzv.a;
    }
}
