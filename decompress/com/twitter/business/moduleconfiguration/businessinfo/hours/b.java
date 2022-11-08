// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.hours;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.hours.BusinessHoursViewModel$intents$2$2", f = "BusinessHoursViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends xzr implements gub<rv2.d, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessHoursViewModel C0;
    
    public b(final BusinessHoursViewModel c0, final ap6<? super b> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new b(this.C0, (ap6<? super b>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.R0.a(ov2.d);
        final BusinessHoursViewModel c0 = this.C0;
        ((MviViewModel)c0).V((Object)new nv2$b(c0.N0.a()));
        return oyv.a;
    }
}
