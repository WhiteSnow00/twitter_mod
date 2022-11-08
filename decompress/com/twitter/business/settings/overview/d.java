// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.settings.overview;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.settings.overview.ProfessionalSettingsViewModel$intents$2$2", f = "ProfessionalSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends xzr implements gub<x4l$a, ap6<? super oyv>, Object>
{
    public final /* synthetic */ ProfessionalSettingsViewModel C0;
    
    public d(final ProfessionalSettingsViewModel c0, final ap6<? super d> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new d(this.C0, (ap6<? super d>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.O0.a(w4l.d);
        ((MviViewModel)this.C0).V((Object)v4l.c.a);
        return oyv.a;
    }
}
