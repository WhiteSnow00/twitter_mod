// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.mobileappmodule;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel$intents$2$5", f = "MobileAppModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class g extends xzr implements gub<fdh.b, ap6<? super oyv>, Object>
{
    public final /* synthetic */ MobileAppModuleConfigurationViewModel C0;
    
    public g(final MobileAppModuleConfigurationViewModel c0, final ap6<? super g> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new g(this.C0, (ap6<? super g>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final g g = (g)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        g.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final MobileAppModuleConfigurationViewModel c0 = this.C0;
        final soe[] x0 = MobileAppModuleConfigurationViewModel.X0;
        Object a;
        if (c0.Y()) {
            a = bdh$d.a;
        }
        else {
            a = new bdh$a(false, 3);
        }
        ((MviViewModel)c0).V(a);
        return oyv.a;
    }
}
