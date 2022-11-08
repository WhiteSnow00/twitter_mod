// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.settings.overview;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@gb8(c = "com.twitter.business.settings.overview.ProfessionalSettingsViewModel$fetchEditableProfileModules$1$2", f = "ProfessionalSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends xzr implements gub<Throwable, ap6<? super oyv>, Object>
{
    public final /* synthetic */ ProfessionalSettingsViewModel C0;
    
    public b(final ProfessionalSettingsViewModel c0, final ap6<? super b> ap6) {
        this.C0 = c0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object o, final ap6<?> ap6) {
        return (ap6<oyv>)new b(this.C0, (ap6<? super b>)ap6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        this.C0.O0.a(w4l.o);
        final ProfessionalSettingsViewModel c0 = this.C0;
        Objects.requireNonNull(c0);
        ((MviViewModel)c0).V((Object)new v4l.g(2131953913));
        return oyv.a;
    }
}
