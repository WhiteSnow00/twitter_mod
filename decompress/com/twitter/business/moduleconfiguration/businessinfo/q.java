// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$intents$2$7", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class q extends xzr implements gub<cx2$p, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ BusinessInfoViewModel D0;
    
    public q(final BusinessInfoViewModel d0, final ap6<? super q> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final q q = new q(this.D0, (ap6<? super q>)ap6);
        q.C0 = c0;
        return (ap6<oyv>)q;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final q q = (q)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        q.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final cx2$p cx2$p = (cx2$p)this.C0;
        this.D0.a1.setPhoneData(cx2$p.a);
        final BusinessInfoViewModel d0 = this.D0;
        ((MviViewModel)d0).Q((rtb)new q$a(d0, cx2$p));
        return oyv.a;
    }
}
