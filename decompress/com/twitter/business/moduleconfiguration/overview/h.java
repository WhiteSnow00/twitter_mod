// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.overview;

import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel$intents$2$5", f = "ModuleOverviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends xzr implements gub<fmh.g, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ModuleOverviewViewModel D0;
    
    public h(final ModuleOverviewViewModel d0, final ap6<? super h> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final h h = new h(this.D0, (ap6<? super h>)ap6);
        h.C0 = c0;
        return (ap6<oyv>)h;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final fmh.g g = (fmh.g)this.C0;
        final ModuleOverviewViewModel d0 = this.D0;
        final emh n0 = d0.N0;
        final koh a = g.a;
        Objects.requireNonNull(n0);
        zzd.f((Object)a, "moduleType");
        n0.b(m0n.K("module_overview", n0.a(a), "remove", 2));
        d0.b0(g.b, false, (otb)new nnh(d0));
        return oyv.a;
    }
}
