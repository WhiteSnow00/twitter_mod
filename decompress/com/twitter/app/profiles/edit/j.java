// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit;

@vb8(c = "com.twitter.app.profiles.edit.EditVerifiedPhoneStatusViewModel$intents$2$3$1$1", f = "EditVerifiedPhoneStatusViewModel.kt", l = {}, m = "invokeSuspend")
public final class j extends l1s implements hub<kni, mp6<? super vzv>, Object>
{
    public final EditVerifiedPhoneStatusViewModel F0;
    public final vw9 G0;
    
    public j(final EditVerifiedPhoneStatusViewModel f0, final vw9 g0, final mp6<? super j> mp6) {
        this.F0 = f0;
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new j(this.F0, this.G0, (mp6<? super j>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final j j = (j)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        j.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final EditVerifiedPhoneStatusViewModel f0 = this.F0;
        final mw9$a mw9$a = new mw9$a(this.G0.a);
        final ape<Object>[] r0 = EditVerifiedPhoneStatusViewModel.R0;
        f0.V((Object)mw9$a);
        return vzv.a;
    }
}
