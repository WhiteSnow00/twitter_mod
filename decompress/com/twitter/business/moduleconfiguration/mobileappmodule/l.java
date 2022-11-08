// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.mobileappmodule;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel$saveAppModule$2$1", f = "MobileAppModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class l extends xzr implements gub<snj<knw>, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ MobileAppModuleConfigurationViewModel D0;
    public final /* synthetic */ boolean E0;
    public final /* synthetic */ boolean F0;
    
    public l(final MobileAppModuleConfigurationViewModel d0, final boolean e0, final boolean f0, final ap6<? super l> ap6) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final l l = new l(this.D0, this.E0, this.F0, (ap6<? super l>)ap6);
        l.C0 = c0;
        return (ap6<oyv>)l;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final l l = (l)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        l.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final snj snj = (snj)this.C0;
        this.D0.Q0.c(this.E0);
        if (snj.f()) {
            ((MviViewModel)this.D0).Q((rtb)l$a.C0);
            ((MviViewModel)this.D0).V((Object)new bdh$f(((knw)snj.c()).b));
        }
        else {
            ((MviViewModel)this.D0).V((Object)new bdh$a(this.F0));
        }
        return oyv.a;
    }
}
