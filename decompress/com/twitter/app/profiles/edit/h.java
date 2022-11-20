// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit;

@sa8(c = "com.twitter.app.profiles.edit.EditVerifiedPhoneStatusViewModel$intents$2$1", f = "EditVerifiedPhoneStatusViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends p0s implements ftb<qv9, go6<? super fzv>, Object>
{
    public final EditVerifiedPhoneStatusViewModel D0;
    
    public h(final EditVerifiedPhoneStatusViewModel d0, final go6<? super h> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new h(this.D0, (go6<? super h>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final EditVerifiedPhoneStatusViewModel d0 = this.D0;
        final h$a d2 = h$a.D0;
        final coe<Object>[] p = EditVerifiedPhoneStatusViewModel.P0;
        d0.Q((qsb)d2);
        return fzv.a;
    }
}
