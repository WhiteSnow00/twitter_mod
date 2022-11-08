// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.overview;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel$updateModuleVisibility$3$1", f = "ModuleOverviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class l extends xzr implements gub<snj<z8w>, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ModuleOverviewViewModel D0;
    public final /* synthetic */ otb<oyv> E0;
    
    public l(final ModuleOverviewViewModel d0, final otb<oyv> e0, final ap6<? super l> ap6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final l l = new l(this.D0, this.E0, (ap6<? super l>)ap6);
        l.C0 = c0;
        return (ap6<oyv>)l;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final l l = (l)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        l.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final snj snj = (snj)this.C0;
        final emh n0 = this.D0.N0;
        Objects.requireNonNull(n0);
        n0.b(m0n.w0("module_overview", "module_visibility_update"));
        if (snj.f()) {
            final ModuleOverviewViewModel d0 = this.D0;
            final Object c = snj.c();
            zzd.e(c, "modules.get()");
            final z8w a = (z8w)c;
            ((MviViewModel)d0).Q((rtb)snh.C0);
            d0.S0.a = a;
            ((MviViewModel)d0).Q((rtb)new tnh(d0, a));
            this.E0.invoke();
        }
        else {
            final ModuleOverviewViewModel d2 = this.D0;
            ((MviViewModel)d2).Q((rtb)qnh.C0);
            d2.a0(2131953936);
        }
        return oyv.a;
    }
}
