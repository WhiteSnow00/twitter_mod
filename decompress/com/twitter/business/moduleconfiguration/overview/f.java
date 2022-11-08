// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.overview;

@gb8(c = "com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel$intents$2$3", f = "ModuleOverviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends xzr implements gub<fmh.f, ap6<? super oyv>, Object>
{
    public final /* synthetic */ ModuleOverviewViewModel C0;
    
    public f(final ModuleOverviewViewModel c0, final ap6<? super f> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new f(this.C0, (ap6<? super f>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f f = (f)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final ModuleOverviewViewModel c0 = this.C0;
        final soe[] y0 = ModuleOverviewViewModel.Y0;
        c0.X();
        return oyv.a;
    }
}
