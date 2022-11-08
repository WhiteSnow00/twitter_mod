// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$intents$2$12", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends xzr implements gub<cx2$d, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessInfoViewModel C0;
    
    public c(final BusinessInfoViewModel c0, final ap6<? super c> ap6) {
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
        final fd4 s0 = this.C0.S0;
        s0.a(m0n.Z(s0.b, "clear_data", "cancel", 8));
        return oyv.a;
    }
}
