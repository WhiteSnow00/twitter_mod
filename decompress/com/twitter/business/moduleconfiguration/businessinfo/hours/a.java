// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.hours;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.hours.BusinessHoursViewModel$intents$2$1", f = "BusinessHoursViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends xzr implements gub<rv2.a, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessHoursViewModel C0;
    
    public a(final BusinessHoursViewModel c0, final ap6<? super a> ap6) {
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
        if (zzd.a((Object)this.C0.O0.getBusinessHoursData(), (Object)this.C0.N0.a())) {
            ((MviViewModel)this.C0).V((Object)nv2$a.a);
        }
        else {
            ((MviViewModel)this.C0).V((Object)nv2$e.a);
        }
        return oyv.a;
    }
}
