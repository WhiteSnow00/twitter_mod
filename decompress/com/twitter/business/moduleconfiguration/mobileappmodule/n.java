// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.mobileappmodule;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.mobileappmodule.MobileAppModuleConfigurationViewModel$saveAppModule$2$3", f = "MobileAppModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class n extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public final /* synthetic */ MobileAppModuleConfigurationViewModel C0;
    public final /* synthetic */ boolean D0;
    
    public n(final MobileAppModuleConfigurationViewModel c0, final boolean d0, final ap6<? super n> ap6) {
        this.C0 = c0;
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new n(this.C0, this.D0, (ap6<? super n>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final n n = (n)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        n.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.Q0.a(this.D0);
        ((MviViewModel)this.C0).Q((rtb)n$a.C0);
        final MobileAppModuleConfigurationViewModel c0 = this.C0;
        Objects.requireNonNull(c0);
        ((MviViewModel)c0).V((Object)new bdh$e(2131952936));
        return oyv.a;
    }
}
