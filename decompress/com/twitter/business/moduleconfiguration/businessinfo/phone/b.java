// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.phone;

import com.twitter.profilemodules.model.business.CountryIso;
import com.twitter.business.model.phone.BusinessPhoneInfoData;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.phone.BusinessPhoneViewModel$intents$2$2", f = "BusinessPhoneViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends xzr implements gub<m23.b, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ BusinessPhoneViewModel D0;
    
    public b(final BusinessPhoneViewModel d0, final ap6<? super b> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final b b = new b(this.D0, (ap6<? super b>)ap6);
        b.C0 = c0;
        return (ap6<oyv>)b;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final m23.b b = (m23.b)this.C0;
        final l23 o2 = this.D0.O0;
        final ok6 a = b.a;
        Objects.requireNonNull(o2);
        zzd.f((Object)a, "contactMethod");
        final l23$a companion = l23.Companion;
        final int ordinal = ((Enum)a).ordinal();
        String s;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new IllegalStateException("unsupported contact method selection");
                }
                s = "call_and_text";
            }
            else {
                s = "text";
            }
        }
        else {
            s = "call";
        }
        o2.a(l23$a.a(companion, s, "radio_button"));
        final BusinessPhoneViewModel d0 = this.D0;
        d0.S0 = BusinessPhoneInfoData.copy$default(d0.S0, 0, (String)null, b.a, (CountryIso)null, 11, (Object)null);
        BusinessPhoneViewModel.W(this.D0);
        return oyv.a;
    }
}
