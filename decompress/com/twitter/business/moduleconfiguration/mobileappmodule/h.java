// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.mobileappmodule;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel$intents$2$6", f = "MobileAppModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends xzr implements gub<fdh.i, ap6<? super oyv>, Object>
{
    public final /* synthetic */ MobileAppModuleConfigurationViewModel C0;
    
    public h(final MobileAppModuleConfigurationViewModel c0, final ap6<? super h> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new h(this.C0, (ap6<? super h>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final MobileAppModuleConfigurationViewModel c0 = this.C0;
        final bdh$e bdh$e = new bdh$e(2131955098);
        final soe[] x0 = MobileAppModuleConfigurationViewModel.X0;
        ((MviViewModel)c0).V((Object)bdh$e);
        return oyv.a;
    }
}
