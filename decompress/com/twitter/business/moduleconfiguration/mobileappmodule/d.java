// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.mobileappmodule;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.mobileappmodule.util.inputtext.MobileAppPlatformType;

@gb8(c = "com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel$intents$2$2", f = "MobileAppModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends xzr implements gub<fdh.h, ap6<? super oyv>, Object>
{
    public final /* synthetic */ MobileAppModuleConfigurationViewModel C0;
    
    public d(final MobileAppModuleConfigurationViewModel c0, final ap6<? super d> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new d(this.C0, (ap6<? super d>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final MobileAppModuleConfigurationViewModel c0 = this.C0;
        ((MviViewModel)c0).V((Object)new bdh$c(MobileAppPlatformType.GOOGLE, c0.V0.getGoogleStoreUrl()));
        return oyv.a;
    }
}
