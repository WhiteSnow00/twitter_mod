// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$intents$2$9", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class s extends xzr implements gub<cx2$n, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ BusinessInfoViewModel D0;
    
    public s(final BusinessInfoViewModel d0, final ap6<? super s> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final s s = new s(this.D0, (ap6<? super s>)ap6);
        s.C0 = c0;
        return (ap6<oyv>)s;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final s s = (s)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        s.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final cx2$n cx2$n = (cx2$n)this.C0;
        this.D0.a1.setHoursData(cx2$n.a);
        final BusinessInfoViewModel d0 = this.D0;
        ((MviViewModel)d0).Q((rtb)new s$a(d0, cx2$n));
        return oyv.a;
    }
}
