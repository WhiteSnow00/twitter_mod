// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit;

@sa8(c = "com.twitter.app.profiles.edit.EditPronounsViewModel$intents$2$1$1$1", f = "EditPronounsViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<tmi, go6<? super fzv>, Object>
{
    public final EditPronounsViewModel D0;
    public final bt9 E0;
    
    public b(final EditPronounsViewModel d0, final bt9 e0, final go6<? super b> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new b(this.D0, this.E0, (go6<? super b>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final EditPronounsViewModel d0 = this.D0;
        final rs9.a a = new rs9.a(this.E0.a);
        final coe<Object>[] p = EditPronounsViewModel.P0;
        d0.V((Object)a);
        return fzv.a;
    }
}
