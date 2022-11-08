// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.settings.overview;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.settings.overview.ProfessionalSettingsViewModel$intents$2$3", f = "ProfessionalSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends xzr implements gub<x4l$c, ap6<? super oyv>, Object>
{
    public final /* synthetic */ ProfessionalSettingsViewModel C0;
    
    public e(final ProfessionalSettingsViewModel c0, final ap6<? super e> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new e(this.C0, (ap6<? super e>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.O0.a(w4l.e);
        final ProfessionalSettingsViewModel c0 = this.C0;
        ((MviViewModel)c0).T((rtb)new e$a(c0));
        ((MviViewModel)this.C0).V((Object)v4l.d.a);
        return oyv.a;
    }
}
