// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.overview;

@gb8(c = "com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel$fetchEditableProfileModules$2$3", f = "ModuleOverviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public final /* synthetic */ ModuleOverviewViewModel C0;
    
    public c(final ModuleOverviewViewModel c0, final ap6<? super c> ap6) {
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
        ModuleOverviewViewModel.W(this.C0);
        return oyv.a;
    }
}
