// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.moduleconfiguration.businessinfo.util.inputtext.BusinessInputTextType;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$intents$2$3", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class m extends xzr implements gub<cx2$i, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessInfoViewModel C0;
    
    public m(final BusinessInfoViewModel c0, final ap6<? super m> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new m(this.C0, (ap6<? super m>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final m m = (m)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        m.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.Q0.a(bx2.e);
        final BusinessInfoViewModel c0 = this.C0;
        ((MviViewModel)c0).V((Object)new ax2$c(BusinessInputTextType.EMAIL, c0.a1.getCurrentEmail()));
        return oyv.a;
    }
}
