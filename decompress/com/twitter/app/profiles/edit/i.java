// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit;

@sa8(c = "com.twitter.app.profiles.edit.EditVerifiedPhoneStatusViewModel$intents$2$2", f = "EditVerifiedPhoneStatusViewModel.kt", l = {}, m = "invokeSuspend")
public final class i extends p0s implements ftb<pv9, go6<? super fzv>, Object>
{
    public final EditVerifiedPhoneStatusViewModel D0;
    
    public i(final EditVerifiedPhoneStatusViewModel d0, final go6<? super i> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new i(this.D0, (go6<? super i>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i i = (i)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        i.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final EditVerifiedPhoneStatusViewModel d0 = this.D0;
        final mv9.b a = mv9.b.a;
        final coe<Object>[] p = EditVerifiedPhoneStatusViewModel.P0;
        d0.V((Object)a);
        return fzv.a;
    }
}
