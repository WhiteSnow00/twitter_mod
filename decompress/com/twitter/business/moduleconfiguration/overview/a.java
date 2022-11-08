// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.overview;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel$fetchEditableProfileModules$2$1", f = "ModuleOverviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends xzr implements gub<snj<z8w>, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ModuleOverviewViewModel D0;
    
    public a(final ModuleOverviewViewModel d0, final ap6<? super a> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final a a = new a(this.D0, (ap6<? super a>)ap6);
        a.C0 = c0;
        return (ap6<oyv>)a;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (ap6<?>)o2);
        final oyv a2 = oyv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final snj snj = (snj)this.C0;
        this.D0.N0.b(emh.e);
        if (snj.f()) {
            final ModuleOverviewViewModel d0 = this.D0;
            final Object c = snj.c();
            zzd.e(c, "modules.get()");
            final z8w a = (z8w)c;
            ((MviViewModel)d0).Q((rtb)snh.C0);
            d0.S0.a = a;
            ((MviViewModel)d0).Q((rtb)new tnh(d0, a));
        }
        else {
            ModuleOverviewViewModel.W(this.D0);
        }
        return oyv.a;
    }
}
