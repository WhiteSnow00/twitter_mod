// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.overview;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel$updateModuleVisibility$3$3", f = "ModuleOverviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class n extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public final /* synthetic */ ModuleOverviewViewModel C0;
    
    public n(final ModuleOverviewViewModel c0, final ap6<? super n> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new n(this.C0, (ap6<? super n>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final n n = (n)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        n.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final emh n0 = this.C0.N0;
        Objects.requireNonNull(n0);
        n0.b(m0n.u0("module_overview", "module_visibility_update"));
        final ModuleOverviewViewModel c0 = this.C0;
        ((MviViewModel)c0).Q((rtb)qnh.C0);
        c0.a0(2131953936);
        return oyv.a;
    }
}
