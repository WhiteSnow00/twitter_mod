// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.address;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.businessinfo.util.inputtext.BusinessInputTextType;
import com.twitter.profilemodules.model.business.CountryIso;
import com.twitter.business.model.address.BusinessAddressInfoData;

@vb8(c = "com.twitter.business.moduleconfiguration.businessinfo.address.BusinessAddressViewModel$intents$2$7", f = "BusinessAddressViewModel.kt", l = {}, m = "invokeSuspend")
public final class i extends l1s implements hub<cu2$j, mp6<? super vzv>, Object>
{
    public Object F0;
    public final BusinessAddressViewModel G0;
    
    public i(final BusinessAddressViewModel g0, final mp6<? super i> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final i i = new i(this.G0, (mp6<? super i>)mp6);
        i.F0 = f0;
        return (mp6<vzv>)i;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i i = (i)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        i.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final cu2$j cu2$j = (cu2$j)this.F0;
        final BusinessAddressViewModel g0 = this.G0;
        final int n = i.i$a.a[((Enum)cu2$j.a).ordinal()];
        BusinessAddressInfoData s0;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        final BusinessInputTextType a = cu2$j.a;
                        final StringBuilder sb = new StringBuilder();
                        sb.append(a);
                        sb.append(" not supported in ");
                        sb.append(cu2$j);
                        throw new UnsupportedOperationException(sb.toString());
                    }
                    s0 = BusinessAddressInfoData.copy$default(g0.S0, (String)null, (String)null, (String)null, cu2$j.b, (CountryIso)null, 23, (Object)null);
                }
                else {
                    s0 = BusinessAddressInfoData.copy$default(g0.S0, (String)null, (String)null, cu2$j.b, (String)null, (CountryIso)null, 27, (Object)null);
                }
            }
            else {
                s0 = BusinessAddressInfoData.copy$default(g0.S0, (String)null, cu2$j.b, (String)null, (String)null, (CountryIso)null, 29, (Object)null);
            }
        }
        else {
            s0 = BusinessAddressInfoData.copy$default(g0.S0, cu2$j.b, (String)null, (String)null, (String)null, (CountryIso)null, 30, (Object)null);
        }
        g0.S0 = s0;
        ((MviViewModel)g0).Q((stb)new av2(g0));
        return vzv.a;
    }
}
