// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.address;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.model.address.BusinessAddressInfoData;

@vb8(c = "com.twitter.business.moduleconfiguration.businessinfo.address.BusinessAddressViewModel$intents$2$9", f = "BusinessAddressViewModel.kt", l = {}, m = "invokeSuspend")
public final class k extends l1s implements hub<cu2$c, mp6<? super vzv>, Object>
{
    public final BusinessAddressViewModel F0;
    
    public k(final BusinessAddressViewModel f0, final mp6<? super k> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new k(this.F0, (mp6<? super k>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final k k = (k)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        k.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final BusinessAddressViewModel f0 = this.F0;
        final stb<cv2, vzv> stb = (stb<cv2, vzv>)new stb<cv2, vzv>(f0) {
            public final BusinessAddressViewModel F0;
            
            public final Object invoke(final Object o) {
                e0e.f((Object)o, "it");
                final BusinessAddressViewModel f0 = this.F0;
                Object a;
                if (e0e.a((Object)f0.Q0.getAddressData(), (Object)this.F0.S0)) {
                    a = new zt2$a((BusinessAddressInfoData)null, 1, (wg8)null);
                }
                else {
                    a = zt2$d.a;
                }
                ((MviViewModel)f0).V(a);
                return vzv.a;
            }
        };
        final ape[] u0 = BusinessAddressViewModel.U0;
        ((MviViewModel)f0).T((stb)stb);
        return vzv.a;
    }
}
