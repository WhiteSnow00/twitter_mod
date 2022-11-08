// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.overview;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel$updateModuleVisibility$3$2", f = "ModuleOverviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class m extends xzr implements rtb<ap6<? super oyv>, Object>
{
    public final /* synthetic */ ModuleOverviewViewModel C0;
    
    public m(final ModuleOverviewViewModel c0, final ap6<? super m> ap6) {
        this.C0 = c0;
        super(1, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final ap6<?> ap6) {
        return (ap6<oyv>)new m(this.C0, (ap6<? super m>)ap6);
    }
    
    public final Object invoke(final Object o) {
        final m m = (m)this.create((ap6<?>)o);
        final oyv a = oyv.a;
        m.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final ModuleOverviewViewModel c0 = this.C0;
        final m$a c2 = m$a.C0;
        final soe[] y0 = ModuleOverviewViewModel.Y0;
        ((MviViewModel)c0).Q((rtb)c2);
        return oyv.a;
    }
}
