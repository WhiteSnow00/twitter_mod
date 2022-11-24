// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit;

@vb8(c = "com.twitter.app.profiles.edit.EditVerifiedPhoneStatusViewModel$intents$2$3", f = "EditVerifiedPhoneStatusViewModel.kt", l = {}, m = "invokeSuspend")
public final class k extends l1s implements hub<ow9, mp6<? super vzv>, Object>
{
    public final EditVerifiedPhoneStatusViewModel F0;
    public final lw9 G0;
    
    public k(final EditVerifiedPhoneStatusViewModel f0, final lw9 g0, final mp6<? super k> mp6) {
        this.F0 = f0;
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new k(this.F0, this.G0, (mp6<? super k>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final k k = (k)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        k.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final EditVerifiedPhoneStatusViewModel f0 = this.F0;
        final k$a k$a = new k$a(f0, this.G0);
        final ape<Object>[] r0 = EditVerifiedPhoneStatusViewModel.R0;
        f0.T((stb)k$a);
        return vzv.a;
    }
}
