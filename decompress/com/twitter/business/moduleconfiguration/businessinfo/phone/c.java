// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.phone;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Iterator;
import java.util.List;
import com.twitter.business.model.listselection.BusinessListSelectionData$PhoneCountryCode;
import java.util.Comparator;
import java.util.Locale;
import com.twitter.business.model.phone.BusinessPhoneCountryCodeData;
import com.twitter.profilemodules.model.business.CountryIso;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collections;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.phone.BusinessPhoneViewModel$intents$2$3", f = "BusinessPhoneViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends xzr implements gub<m23.c, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessPhoneViewModel C0;
    
    public c(final BusinessPhoneViewModel c0, final ap6<? super c> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new c(this.C0, (ap6<? super c>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c c = (c)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final BusinessPhoneViewModel c0 = this.C0;
        Objects.requireNonNull(c0.Q0);
        final wbk i = wbk.i();
        zzd.e((Object)i, "PhoneNumberUtilProvider().get()");
        final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)i.f);
        zzd.e((Object)unmodifiableSet, "util.supportedRegions");
        final ArrayList list = new ArrayList();
        final Iterator<String> iterator = unmodifiableSet.iterator();
        while (iterator.hasNext()) {
            final CountryIso a = CountryIso.Companion.a((String)iterator.next());
            if (a != null) {
                list.add(a);
            }
        }
        final ArrayList list2 = new ArrayList<BusinessPhoneCountryCodeData>(kr4.h1((Iterable)list, 10));
        for (final CountryIso countryIso : list) {
            final Locale locale = new Locale("", countryIso.getIsoString());
            final int g = i.g(countryIso.getIsoString());
            final String displayCountry = locale.getDisplayCountry(t4s.c());
            zzd.e((Object)displayCountry, "locale.getDisplayCountry\u2026Config.getDeviceLocale())");
            list2.add(new BusinessPhoneCountryCodeData(g, displayCountry, countryIso));
        }
        final List f2 = or4.f2((Iterable)list2, (Comparator)new p4l());
        final BusinessPhoneViewModel c2 = this.C0;
        final ArrayList list3 = new ArrayList<BusinessListSelectionData$PhoneCountryCode>(kr4.h1((Iterable)f2, 10));
        for (final BusinessPhoneCountryCodeData businessPhoneCountryCodeData : f2) {
            Objects.requireNonNull(c2);
            final String countryName = businessPhoneCountryCodeData.getCountryName();
            final int code = businessPhoneCountryCodeData.getCode();
            final StringBuilder sb = new StringBuilder();
            sb.append(countryName);
            sb.append(" (+");
            sb.append(code);
            sb.append(")");
            list3.add(new BusinessListSelectionData$PhoneCountryCode(sb.toString(), businessPhoneCountryCodeData));
        }
        ((MviViewModel)c0).V((Object)new k23$e((List)list3));
        return oyv.a;
    }
}
