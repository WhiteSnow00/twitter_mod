// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$intents$2$8", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class r extends xzr implements gub<cx2$b, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ BusinessInfoViewModel D0;
    
    public r(final BusinessInfoViewModel d0, final ap6<? super r> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final r r = new r(this.D0, (ap6<? super r>)ap6);
        r.C0 = c0;
        return (ap6<oyv>)r;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final r r = (r)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        r.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final cx2$b cx2$b = (cx2$b)this.C0;
        this.D0.a1.setAddressData(cx2$b.a);
        final BusinessInfoViewModel d0 = this.D0;
        ((MviViewModel)d0).Q((rtb)new r$a(d0, cx2$b));
        final BusinessInfoViewModel d2 = this.D0;
        ((MviViewModel)d2).T((rtb)new r$b(d2));
        return oyv.a;
    }
}
