// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.address;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.business.moduleconfiguration.businessinfo.address.BusinessAddressViewModel$intents$2$8", f = "BusinessAddressViewModel.kt", l = {}, m = "invokeSuspend")
public final class j extends l1s implements hub<cu2$h, mp6<? super vzv>, Object>
{
    public final au2 F0;
    public final BusinessAddressViewModel G0;
    
    public j(final au2 f0, final BusinessAddressViewModel g0, final mp6<? super j> mp6) {
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
        this.F0.a(au2.c);
        final BusinessAddressViewModel g0 = this.G0;
        ((MviViewModel)g0).V((Object)new zt2$a(g0.S0));
        return vzv.a;
    }
}
