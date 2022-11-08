// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.settings.overview;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.settings.overview.ProfessionalSettingsViewModel$intents$2$4$1$3", f = "ProfessionalSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public final /* synthetic */ ProfessionalSettingsViewModel C0;
    public final /* synthetic */ x4l$b D0;
    
    public h(final ProfessionalSettingsViewModel c0, final x4l$b d0, final ap6<? super h> ap6) {
        this.C0 = c0;
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new h(this.C0, this.D0, (ap6<? super h>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final ProfessionalSettingsViewModel c0 = this.C0;
        final h$a h$a = new h$a(this.D0);
        final ProfessionalSettingsViewModel$a companion = ProfessionalSettingsViewModel.Companion;
        ((MviViewModel)c0).Q((rtb)h$a);
        ProfessionalSettingsViewModel.X(this.C0, 2131952399);
        return oyv.a;
    }
}
