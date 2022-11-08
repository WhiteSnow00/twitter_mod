// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$saveModuleContent$2$2", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class u extends xzr implements rtb<ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessInfoViewModel C0;
    
    public u(final BusinessInfoViewModel c0, final ap6<? super u> ap6) {
        this.C0 = c0;
        super(1, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final ap6<?> ap6) {
        return (ap6<oyv>)new u(this.C0, (ap6<? super u>)ap6);
    }
    
    public final Object invoke(final Object o) {
        final u u = (u)this.create((ap6<?>)o);
        final oyv a = oyv.a;
        u.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final BusinessInfoViewModel c0 = this.C0;
        final u$a c2 = u$a.C0;
        final soe[] c3 = BusinessInfoViewModel.c1;
        ((MviViewModel)c0).Q((rtb)c2);
        return oyv.a;
    }
}
