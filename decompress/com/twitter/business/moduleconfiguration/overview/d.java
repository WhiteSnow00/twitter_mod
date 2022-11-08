// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.overview;

import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel$intents$2$1", f = "ModuleOverviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends xzr implements gub<fmh.b, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ModuleOverviewViewModel D0;
    
    public d(final ModuleOverviewViewModel d0, final ap6<? super d> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final d d = new d(this.D0, (ap6<? super d>)ap6);
        d.C0 = c0;
        return (ap6<oyv>)d;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final fmh.b b = (fmh.b)this.C0;
        final ModuleOverviewViewModel d0 = this.D0;
        final soe[] y0 = ModuleOverviewViewModel.Y0;
        Objects.requireNonNull(d0);
        d0.Z(b.a);
        d0.Y(b.a, b.b, b.c);
        return oyv.a;
    }
}
