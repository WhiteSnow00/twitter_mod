// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.mobileappmodule.url;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.mobileappmodule.url.MobileAppUrlInputViewModel$intents$2$3", f = "MobileAppUrlInputViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends xzr implements gub<pfh$c, ap6<? super oyv>, Object>
{
    public final /* synthetic */ MobileAppUrlInputViewModel C0;
    
    public c(final MobileAppUrlInputViewModel c0, final ap6<? super c> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new c(this.C0, (ap6<? super c>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c c = (c)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final MobileAppUrlInputViewModel c0 = this.C0;
        ((MviViewModel)c0).V((Object)new ofh.b(c0.N0.getTag()));
        return oyv.a;
    }
}
