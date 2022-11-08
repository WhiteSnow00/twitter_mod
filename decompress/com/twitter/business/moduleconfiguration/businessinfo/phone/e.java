// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.phone;

import com.twitter.business.moduleconfiguration.businessinfo.util.inputtext.BusinessInputTextType;
import com.twitter.profilemodules.model.business.CountryIso;
import com.twitter.business.model.phone.BusinessPhoneInfoData;
import com.google.i18n.phonenumbers.NumberParseException;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.phone.BusinessPhoneViewModel$intents$2$5", f = "BusinessPhoneViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends xzr implements gub<m23.i, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ BusinessPhoneViewModel D0;
    public final /* synthetic */ iyh<m23> E0;
    
    public e(final BusinessPhoneViewModel d0, final iyh<m23> e0, final ap6<? super e> ap6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final e e = new e(this.D0, this.E0, (ap6<? super e>)ap6);
        e.C0 = c0;
        return (ap6<oyv>)e;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(Object o) {
        kq9.b1(o);
        final m23.i i = (m23.i)this.C0;
        if (e.e$a.a[((Enum)i.a).ordinal()] == 1) {
            final BusinessPhoneViewModel d0 = this.D0;
            final String b = i.b;
            final t23 r0 = d0.R0;
            final String isoString = d0.S0.getCountryIso().getIsoString();
            Objects.requireNonNull(r0);
            zzd.f((Object)b, "phone");
            zzd.f((Object)isoString, "countryIso");
            String s2;
            try {
                Objects.requireNonNull(r0.a);
                final wbk j = wbk.i();
                final jck y = j.y((CharSequence)b, isoString);
                final String s = s2 = j.m(y);
                if (y.F0) {
                    final String g0 = y.G0;
                    o = new StringBuilder();
                    ((StringBuilder)o).append(s);
                    ((StringBuilder)o).append(";");
                    ((StringBuilder)o).append(g0);
                    s2 = ((StringBuilder)o).toString();
                }
                zzd.e((Object)s2, "{\n        with(phoneNumb\u2026        }\n        }\n    }");
            }
            catch (final NumberParseException ex) {
                s2 = b;
            }
            final BusinessPhoneViewModel d2 = this.D0;
            final boolean a = d2.R0.a(s2, d2.S0.getCountryIso().getIsoString());
            final BusinessPhoneViewModel d3 = this.D0;
            final BusinessPhoneInfoData s3 = d3.S0;
            ok6 ok6;
            if (a) {
                ok6 = ok6.C0;
            }
            else {
                ok6 = s3.getContactMethod();
            }
            d3.S0 = BusinessPhoneInfoData.copy$default(s3, 0, s2, ok6, (CountryIso)null, 9, (Object)null);
            BusinessPhoneViewModel.W(this.D0);
            return oyv.a;
        }
        final BusinessInputTextType a2 = i.a;
        final iyh<m23> e0 = this.E0;
        final StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append(" not supported in ");
        sb.append(e0);
        throw new UnsupportedOperationException(sb.toString());
    }
}
