// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit;

@sa8(c = "com.twitter.app.profiles.edit.EditVerifiedPhoneStatusViewModel$intents$2$3$1$1", f = "EditVerifiedPhoneStatusViewModel.kt", l = {}, m = "invokeSuspend")
public final class j extends p0s implements ftb<tmi, go6<? super fzv>, Object>
{
    public final EditVerifiedPhoneStatusViewModel D0;
    public final vv9 E0;
    
    public j(final EditVerifiedPhoneStatusViewModel d0, final vv9 e0, final go6<? super j> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new j(this.D0, this.E0, (go6<? super j>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final j j = (j)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        j.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final EditVerifiedPhoneStatusViewModel d0 = this.D0;
        final mv9.a a = new mv9.a(this.E0.a);
        final coe<Object>[] p = EditVerifiedPhoneStatusViewModel.P0;
        d0.V((Object)a);
        return fzv.a;
    }
}
