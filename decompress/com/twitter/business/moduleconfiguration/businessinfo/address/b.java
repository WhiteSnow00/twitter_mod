// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.address;

@vb8(c = "com.twitter.business.moduleconfiguration.businessinfo.address.BusinessAddressViewModel$intents$2$11", f = "BusinessAddressViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends l1s implements hub<cu2$f, mp6<? super vzv>, Object>
{
    public final au2 F0;
    
    public b(final au2 f0, final mp6<? super b> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new b(this.F0, (mp6<? super b>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        this.F0.a(au2.j);
        return vzv.a;
    }
}
