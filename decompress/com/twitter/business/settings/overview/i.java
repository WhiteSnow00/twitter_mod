// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.settings.overview;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@gb8(c = "com.twitter.business.settings.overview.ProfessionalSettingsViewModel$intents$2$4", f = "ProfessionalSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class i extends xzr implements gub<x4l$b, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ProfessionalSettingsViewModel D0;
    
    public i(final ProfessionalSettingsViewModel d0, final ap6<? super i> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final i i = new i(this.D0, (ap6<? super i>)ap6);
        i.C0 = c0;
        return (ap6<oyv>)i;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i i = (i)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        i.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final x4l$b x4l$b = (x4l$b)this.C0;
        final w4l o2 = this.D0.O0;
        final boolean a = x4l$b.a;
        Objects.requireNonNull(o2);
        final w4l.a companion = w4l.Companion;
        String s;
        if (a) {
            s = "enabled";
        }
        else {
            s = "disabled";
        }
        Objects.requireNonNull(companion);
        o2.a(nca.Companion.e("professional_settings", "category_label_switch", "", "", s));
        final ProfessionalSettingsViewModel d0 = this.D0;
        ((MviViewModel)d0).x(d0.N0.d(x4l$b.a), (rtb)new i$a(this.D0, x4l$b));
        return oyv.a;
    }
}
