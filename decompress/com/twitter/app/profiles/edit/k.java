// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit;

@sa8(c = "com.twitter.app.profiles.edit.EditVerifiedPhoneStatusViewModel$intents$2$3", f = "EditVerifiedPhoneStatusViewModel.kt", l = {}, m = "invokeSuspend")
public final class k extends p0s implements ftb<ov9, go6<? super fzv>, Object>
{
    public final EditVerifiedPhoneStatusViewModel D0;
    public final lv9 E0;
    
    public k(final EditVerifiedPhoneStatusViewModel d0, final lv9 e0, final go6<? super k> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new k(this.D0, this.E0, (go6<? super k>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final k k = (k)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        k.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final EditVerifiedPhoneStatusViewModel d0 = this.D0;
        final k$a k$a = new k$a(d0, this.E0);
        final coe<Object>[] p = EditVerifiedPhoneStatusViewModel.P0;
        d0.T((qsb)k$a);
        return fzv.a;
    }
}
