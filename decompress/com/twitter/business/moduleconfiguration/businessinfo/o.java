// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.businessinfo.util.inputtext.BusinessInputTextType;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$intents$2$5", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class o extends xzr implements gub<cx2$s, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessInfoViewModel C0;
    
    public o(final BusinessInfoViewModel c0, final ap6<? super o> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new o(this.C0, (ap6<? super o>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final o o3 = (o)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        o3.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.Q0.a(bx2.b);
        final BusinessInfoViewModel c0 = this.C0;
        ((MviViewModel)c0).V((Object)new ax2$c(BusinessInputTextType.WEBSITE, c0.a1.getCurrentWebsite()));
        return oyv.a;
    }
}
