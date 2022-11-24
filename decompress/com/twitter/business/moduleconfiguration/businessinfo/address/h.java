// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.address;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Iterator;
import java.util.List;
import com.twitter.business.model.listselection.BusinessListSelectionData$Country;
import java.util.Comparator;
import com.twitter.business.model.address.BusinessAddressCountry;
import com.twitter.profilemodules.model.business.CountryIso;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

@vb8(c = "com.twitter.business.moduleconfiguration.businessinfo.address.BusinessAddressViewModel$intents$2$6", f = "BusinessAddressViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends l1s implements hub<cu2$e, mp6<? super vzv>, Object>
{
    public final BusinessAddressViewModel F0;
    public final iwl G0;
    public final au2 H0;
    
    public h(final BusinessAddressViewModel f0, final iwl g0, final au2 h0, final mp6<? super h> mp6) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new h(this.F0, this.G0, this.H0, (mp6<? super h>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final BusinessAddressViewModel f0 = this.F0;
        Objects.requireNonNull(this.G0);
        final String[] isoCountries = Locale.getISOCountries();
        e0e.e((Object)isoCountries, "getISOCountries()");
        final ArrayList list = new ArrayList();
        for (int length = isoCountries.length, i = 0; i < length; ++i) {
            final CountryIso a = CountryIso.Companion.a(isoCountries[i]);
            if (a != null) {
                list.add(a);
            }
        }
        final ArrayList list2 = new ArrayList<BusinessAddressCountry>(nr4.d1((Iterable)list, 10));
        for (final CountryIso countryIso : list) {
            final String displayCountry = new Locale("", countryIso.getIsoString()).getDisplayCountry(g6s.c());
            e0e.e((Object)displayCountry, "Locale(\"\", it.isoString)\u2026Config.getDeviceLocale())");
            list2.add(new BusinessAddressCountry(displayCountry, countryIso));
        }
        final ArrayList<BusinessAddressCountry> list3 = new ArrayList<BusinessAddressCountry>();
        for (final BusinessAddressCountry next : list2) {
            if (next.getCountryName().length() > 0) {
                list3.add(next);
            }
        }
        final List b2 = rr4.b2((Iterable)list3, (Comparator)new qq4());
        final ArrayList list4 = new ArrayList<BusinessListSelectionData$Country>(nr4.d1((Iterable)b2, 10));
        for (final BusinessAddressCountry businessAddressCountry : b2) {
            list4.add(new BusinessListSelectionData$Country(businessAddressCountry.getCountryName(), businessAddressCountry));
        }
        final zt2$c zt2$c = new zt2$c((List)list4);
        final ape[] u0 = BusinessAddressViewModel.U0;
        ((MviViewModel)f0).V((Object)zt2$c);
        this.H0.a(au2.h);
        return vzv.a;
    }
}
