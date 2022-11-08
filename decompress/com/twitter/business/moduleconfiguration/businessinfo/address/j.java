// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.address;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.address.BusinessAddressViewModel$intents$2$8", f = "BusinessAddressViewModel.kt", l = {}, m = "invokeSuspend")
public final class j extends xzr implements gub<st2$h, ap6<? super oyv>, Object>
{
    public final /* synthetic */ qt2 C0;
    public final /* synthetic */ BusinessAddressViewModel D0;
    
    public j(final qt2 c0, final BusinessAddressViewModel d0, final ap6<? super j> ap6) {
        this.C0 = c0;
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new j(this.C0, this.D0, (ap6<? super j>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final j j = (j)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        j.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.a(qt2.c);
        final BusinessAddressViewModel d0 = this.D0;
        ((MviViewModel)d0).V((Object)new pt2$a(d0.P0));
        return oyv.a;
    }
}
