// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.phone;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.model.phone.BusinessPhoneInfoData;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.phone.BusinessPhoneViewModel$intents$2$4", f = "BusinessPhoneViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends xzr implements gub<m23.f, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessPhoneViewModel C0;
    
    public d(final BusinessPhoneViewModel c0, final ap6<? super d> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new d(this.C0, (ap6<? super d>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(Object o) {
        kq9.b1(o);
        this.C0.O0.a(l23.c);
        final BusinessPhoneViewModel c0 = this.C0;
        if (c0.X()) {
            o = new k23$b(this.C0.S0);
        }
        else if (this.C0.S0.getRawPhoneNumber().length() == 0) {
            o = new k23$b((BusinessPhoneInfoData)null, 1, (hg8)null);
        }
        else {
            o = new k23$c();
        }
        ((MviViewModel)c0).V(o);
        return oyv.a;
    }
}
