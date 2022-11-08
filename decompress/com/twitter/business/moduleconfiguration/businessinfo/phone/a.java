// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.phone;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.phone.BusinessPhoneViewModel$intents$2$1", f = "BusinessPhoneViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends xzr implements gub<m23.h, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessPhoneViewModel C0;
    
    public a(final BusinessPhoneViewModel c0, final ap6<? super a> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new a(this.C0, (ap6<? super a>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (ap6<?>)o2);
        final oyv a2 = oyv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final BusinessPhoneViewModel c0 = this.C0;
        final a$a a$a = new a$a(c0);
        final soe[] u0 = BusinessPhoneViewModel.U0;
        ((MviViewModel)c0).T((rtb)a$a);
        return oyv.a;
    }
}
