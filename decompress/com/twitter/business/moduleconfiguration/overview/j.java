// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.overview;

import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel$intents$2$7", f = "ModuleOverviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class j extends xzr implements gub<fmh.d, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ModuleOverviewViewModel D0;
    
    public j(final ModuleOverviewViewModel d0, final ap6<? super j> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final j j = new j(this.D0, (ap6<? super j>)ap6);
        j.C0 = c0;
        return (ap6<oyv>)j;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final j j = (j)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        j.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final fmh.d d = (fmh.d)this.C0;
        final ModuleOverviewViewModel d2 = this.D0;
        final soe[] y0 = ModuleOverviewViewModel.Y0;
        Objects.requireNonNull(d2);
        d2.Z(d.a);
        d2.Y(d.a, d.c, d.b);
        return oyv.a;
    }
}
