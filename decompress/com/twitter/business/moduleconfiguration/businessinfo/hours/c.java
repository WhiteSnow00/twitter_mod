// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo.hours;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.hours.BusinessHoursViewModel$intents$2$3", f = "BusinessHoursViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends xzr implements gub<rv2.c, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessHoursViewModel C0;
    
    public c(final BusinessHoursViewModel c0, final ap6<? super c> ap6) {
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
        final ov2 r0 = this.C0.R0;
        Objects.requireNonNull(r0);
        r0.a(ov2$a.a(ov2.Companion, (String)null, "discard_confirmation", "confirm", 1));
        ((MviViewModel)this.C0).V((Object)nv2$a.a);
        return oyv.a;
    }
}
