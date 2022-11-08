// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.overview;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel$intents$2$6", f = "ModuleOverviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class i extends xzr implements gub<fmh.c, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ModuleOverviewViewModel D0;
    
    public i(final ModuleOverviewViewModel d0, final ap6<? super i> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final i i = new i(this.D0, (ap6<? super i>)ap6);
        i.C0 = c0;
        return (ap6<oyv>)i;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i i = (i)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        i.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final fmh.c c = (fmh.c)this.C0;
        final ModuleOverviewViewModel d0 = this.D0;
        final soe[] y0 = ModuleOverviewViewModel.Y0;
        Objects.requireNonNull(d0);
        if (c.b.length() == 0) {
            ((MviViewModel)d0).Q((rtb)qnh.C0);
            d0.a0(2131953936);
        }
        else {
            final emh n0 = d0.N0;
            final koh a = c.a;
            Objects.requireNonNull(n0);
            zzd.f((Object)a, "moduleType");
            n0.b(m0n.K("module_overview", n0.a(a), "add", 2));
            d0.b0(c.b, true, (otb)new knh(d0));
        }
        return oyv.a;
    }
}
