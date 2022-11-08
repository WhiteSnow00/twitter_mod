// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.address;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.address.BusinessAddressViewModel$intents$2$9", f = "BusinessAddressViewModel.kt", l = {}, m = "invokeSuspend")
public final class k extends xzr implements gub<st2$c, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessAddressViewModel C0;
    
    public k(final BusinessAddressViewModel c0, final ap6<? super k> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new k(this.C0, (ap6<? super k>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final k k = (k)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        k.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final BusinessAddressViewModel c0 = this.C0;
        final k$a k$a = new k$a(c0);
        final soe[] r0 = BusinessAddressViewModel.R0;
        ((MviViewModel)c0).T((rtb)k$a);
        return oyv.a;
    }
}
