// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.settings.overview;

import com.twitter.weaver.mvi.MviViewModel;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

@gb8(c = "com.twitter.business.settings.overview.ProfessionalSettingsViewModel$intents$2$1", f = "ProfessionalSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends xzr implements gub<x4l$e, ap6<? super oyv>, Object>
{
    public final /* synthetic */ ProfessionalSettingsViewModel C0;
    
    public c(final ProfessionalSettingsViewModel c0, final ap6<? super c> ap6) {
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
        final snj b = this.C0.P0.b;
        if (b.f()) {
            this.C0.O0.a(w4l.f);
            final ProfessionalSettingsViewModel c0 = this.C0;
            final fj.a companion = fj.Companion;
            final u6l a = ((v3l)b.c()).a;
            Objects.requireNonNull(companion);
            zzd.f((Object)a, "professionalType");
            final int ordinal = ((Enum)a).ordinal();
            if (ordinal == 0) {
                throw new IllegalArgumentException("unsupported account type");
            }
            fj fj;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fj = fj.D0;
            }
            else {
                fj = fj.C0;
            }
            ((MviViewModel)c0).V((Object)new v4l.f(fj));
        }
        return oyv.a;
    }
}
