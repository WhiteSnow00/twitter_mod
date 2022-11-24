// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.address;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.model.listselection.BusinessListSelectionData;
import java.util.Objects;
import com.twitter.business.model.address.BusinessAddressInfoData;
import com.twitter.business.model.listselection.BusinessListSelectionData$Country;

@vb8(c = "com.twitter.business.moduleconfiguration.businessinfo.address.BusinessAddressViewModel$intents$2$2", f = "BusinessAddressViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends l1s implements hub<cu2$i, mp6<? super vzv>, Object>
{
    public Object F0;
    public final BusinessAddressViewModel G0;
    
    public d(final BusinessAddressViewModel g0, final mp6<? super d> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final d d = new d(this.G0, (mp6<? super d>)mp6);
        d.F0 = f0;
        return (mp6<vzv>)d;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final cu2$i cu2$i = (cu2$i)this.F0;
        final BusinessAddressViewModel g0 = this.G0;
        final BusinessListSelectionData a = cu2$i.a;
        if (a instanceof BusinessListSelectionData$Country) {
            g0.S0 = BusinessAddressInfoData.copy$default(g0.S0, (String)null, (String)null, (String)null, (String)null, ((BusinessListSelectionData$Country)a).getCountry().getCountryISO(), 15, (Object)null);
            final BusinessAddressViewModel g2 = this.G0;
            Objects.requireNonNull(g2);
            ((MviViewModel)g2).Q((stb)new av2(g2));
            return vzv.a;
        }
        final BusinessListSelectionData a2 = cu2$i.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("Argument of type ");
        sb.append(a2);
        sb.append(" cannot be handled.");
        throw new IllegalArgumentException(sb.toString());
    }
}
