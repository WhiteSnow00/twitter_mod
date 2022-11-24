// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.address;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.model.address.BusinessAddressInfoData;

@vb8(c = "com.twitter.business.moduleconfiguration.businessinfo.address.BusinessAddressViewModel$intents$2$10", f = "BusinessAddressViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends l1s implements hub<cu2$g, mp6<? super vzv>, Object>
{
    public final au2 F0;
    public final BusinessAddressViewModel G0;
    
    public a(final au2 f0, final BusinessAddressViewModel g0, final mp6<? super a> mp6) {
        this.F0 = f0;
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new a(this.F0, this.G0, (mp6<? super a>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (mp6<?>)o2);
        final vzv a2 = vzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        this.F0.a(au2.i);
        final BusinessAddressViewModel g0 = this.G0;
        final zt2$a zt2$a = new zt2$a((BusinessAddressInfoData)null, 1, (wg8)null);
        final ape[] u0 = BusinessAddressViewModel.U0;
        ((MviViewModel)g0).V((Object)zt2$a);
        return vzv.a;
    }
}
