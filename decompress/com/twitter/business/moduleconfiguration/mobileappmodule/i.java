// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.mobileappmodule;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel$intents$2$7", f = "MobileAppModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class i extends xzr implements gub<fdh.d, ap6<? super oyv>, Object>
{
    public final /* synthetic */ MobileAppModuleConfigurationViewModel C0;
    
    public i(final MobileAppModuleConfigurationViewModel c0, final ap6<? super i> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new i(this.C0, (ap6<? super i>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i i = (i)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        i.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.P0.a(cdh.d);
        ((MviViewModel)this.C0).V((Object)new bdh$a(false, 3));
        return oyv.a;
    }
}
