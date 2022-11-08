// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.overview;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel$intents$2$4", f = "ModuleOverviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class g extends xzr implements gub<fmh.a, ap6<? super oyv>, Object>
{
    public final /* synthetic */ ModuleOverviewViewModel C0;
    
    public g(final ModuleOverviewViewModel c0, final ap6<? super g> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new g(this.C0, (ap6<? super g>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final g g = (g)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        g.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final ModuleOverviewViewModel c0 = this.C0;
        final soe[] y0 = ModuleOverviewViewModel.Y0;
        Objects.requireNonNull(c0);
        ((MviViewModel)c0).T((rtb)new inh(c0));
        return oyv.a;
    }
}
