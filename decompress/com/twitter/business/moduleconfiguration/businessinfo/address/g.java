// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.address;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.businessinfo.util.inputtext.BusinessInputTextType;

@vb8(c = "com.twitter.business.moduleconfiguration.businessinfo.address.BusinessAddressViewModel$intents$2$5", f = "BusinessAddressViewModel.kt", l = {}, m = "invokeSuspend")
public final class g extends l1s implements hub<cu2$k, mp6<? super vzv>, Object>
{
    public final BusinessAddressViewModel F0;
    public final au2 G0;
    
    public g(final BusinessAddressViewModel f0, final au2 g0, final mp6<? super g> mp6) {
        this.F0 = f0;
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new g(this.F0, this.G0, (mp6<? super g>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final g g = (g)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        g.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final BusinessAddressViewModel f0 = this.F0;
        ((MviViewModel)f0).V((Object)new zt2$b(BusinessInputTextType.POSTAL_CODE, f0.S0.getZipCode()));
        this.G0.a(au2.e);
        return vzv.a;
    }
}
