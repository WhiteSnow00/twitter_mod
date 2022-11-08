// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.phone;

import com.twitter.profilemodules.model.business.CountryIso;
import com.twitter.business.model.phone.BusinessPhoneCountryCodeData;
import com.twitter.business.model.listselection.BusinessListSelectionData;
import com.twitter.business.model.phone.BusinessPhoneInfoData;
import com.twitter.business.model.listselection.BusinessListSelectionData$PhoneCountryCode;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.phone.BusinessPhoneViewModel$intents$2$9", f = "BusinessPhoneViewModel.kt", l = {}, m = "invokeSuspend")
public final class i extends xzr implements gub<m23.g, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ BusinessPhoneViewModel D0;
    
    public i(final BusinessPhoneViewModel d0, final ap6<? super i> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final i i = new i(this.D0, (ap6<? super i>)ap6);
        i.C0 = c0;
        return (ap6<oyv>)i;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i i = (i)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        i.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final m23.g g = (m23.g)this.C0;
        final BusinessPhoneViewModel d0 = this.D0;
        final BusinessListSelectionData a = g.a;
        if (a instanceof BusinessListSelectionData$PhoneCountryCode) {
            final BusinessPhoneCountryCodeData countryCodeData = ((BusinessListSelectionData$PhoneCountryCode)a).getCountryCodeData();
            final int component1 = countryCodeData.component1();
            final CountryIso component2 = countryCodeData.component3();
            final BusinessPhoneInfoData s0 = this.D0.S0;
            String rawPhoneNumber;
            if (s0.getCountryCode() != component1) {
                rawPhoneNumber = "";
            }
            else {
                rawPhoneNumber = this.D0.S0.getRawPhoneNumber();
            }
            d0.S0 = BusinessPhoneInfoData.copy$default(s0, component1, rawPhoneNumber, (ok6)null, component2, 4, (Object)null);
            BusinessPhoneViewModel.W(this.D0);
            return oyv.a;
        }
        final BusinessListSelectionData a2 = g.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("Argument of type ");
        sb.append(a2);
        sb.append(" cannot be handled.");
        throw new IllegalArgumentException(sb.toString());
    }
}
