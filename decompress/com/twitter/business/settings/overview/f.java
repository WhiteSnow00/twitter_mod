// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.settings.overview;

import com.twitter.weaver.mvi.MviViewModel;

@gb8(c = "com.twitter.business.settings.overview.ProfessionalSettingsViewModel$intents$2$4$1$1", f = "ProfessionalSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends xzr implements rtb<ap6<? super oyv>, Object>
{
    public final /* synthetic */ ProfessionalSettingsViewModel C0;
    public final /* synthetic */ x4l$b D0;
    
    public f(final ProfessionalSettingsViewModel c0, final x4l$b d0, final ap6<? super f> ap6) {
        this.C0 = c0;
        this.D0 = d0;
        super(1, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final ap6<?> ap6) {
        return (ap6<oyv>)new f(this.C0, this.D0, (ap6<? super f>)ap6);
    }
    
    public final Object invoke(final Object o) {
        final f f = (f)this.create((ap6<?>)o);
        final oyv a = oyv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final ProfessionalSettingsViewModel c0 = this.C0;
        final f$a f$a = new f$a(this.D0);
        final ProfessionalSettingsViewModel$a companion = ProfessionalSettingsViewModel.Companion;
        ((MviViewModel)c0).Q((rtb)f$a);
        return oyv.a;
    }
}
