// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.mobileappmodule;

@gb8(c = "com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel$intents$2$9", f = "MobileAppModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class k extends xzr implements gub<fdh.f, ap6<? super oyv>, Object>
{
    public final /* synthetic */ MobileAppModuleConfigurationViewModel C0;
    
    public k(final MobileAppModuleConfigurationViewModel c0, final ap6<? super k> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new k(this.C0, (ap6<? super k>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final k k = (k)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        k.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.U0.b();
        this.C0.Z(true);
        return oyv.a;
    }
}
