// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$intents$2$17", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends xzr implements gub<cx2$k, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessInfoViewModel C0;
    
    public h(final BusinessInfoViewModel c0, final ap6<? super h> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new h(this.C0, (ap6<? super h>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.Z0.b();
        this.C0.b0(true);
        return oyv.a;
    }
}
