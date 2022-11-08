// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.hours;

import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.hours.BusinessHoursViewModel$intents$2$4", f = "BusinessHoursViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends xzr implements gub<rv2.b, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessHoursViewModel C0;
    
    public d(final BusinessHoursViewModel c0, final ap6<? super d> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new d(this.C0, (ap6<? super d>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final ov2 r0 = this.C0.R0;
        Objects.requireNonNull(r0);
        r0.a(ov2$a.a(ov2.Companion, (String)null, "discard_confirmation", "cancel", 1));
        return oyv.a;
    }
}
