// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.overview;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.model.phone.PreviewOpenTimesData;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.overview.ModuleOverviewViewModel$intents$2$2", f = "ModuleOverviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends xzr implements gub<fmh.e, ap6<? super oyv>, Object>
{
    public /* synthetic */ Object C0;
    public final /* synthetic */ ModuleOverviewViewModel D0;
    
    public e(final ModuleOverviewViewModel d0, final ap6<? super e> ap6) {
        this.D0 = d0;
        super(2, (ap6)ap6);
    }
    
    public final ap6<oyv> create(final Object c0, final ap6<?> ap6) {
        final e e = new e(this.D0, (ap6<? super e>)ap6);
        e.C0 = c0;
        return (ap6<oyv>)e;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (ap6<?>)o2);
        final oyv a = oyv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        kq9.b1(o);
        final fmh.e e = (fmh.e)this.C0;
        final ModuleOverviewViewModel d0 = this.D0;
        final emh n0 = d0.N0;
        final koh a = e.a;
        final boolean b = e.b;
        Objects.requireNonNull(n0);
        zzd.f((Object)a, "moduleType");
        final emh$a companion = emh.Companion;
        final String a2 = n0.a(a);
        final boolean b2 = true;
        String s;
        if (b) {
            s = "enabled";
        }
        else {
            if (b) {
                throw new NoWhenBranchMatchedException();
            }
            s = "disabled";
        }
        Objects.requireNonNull(companion);
        n0.b(nca.Companion.e("module_overview", "", a2, "switch", s));
        final String c = e.c;
        if (c != null && c.length() != 0) {
            d0.b0(e.c, e.b, (otb)rnh.C0);
        }
        else {
            final koh a3 = e.a;
            int n2 = b2 ? 1 : 0;
            if (!zzd.a((Object)a3, (Object)koh.a.a)) {
                n2 = (b2 ? 1 : 0);
                if (!zzd.a((Object)a3, (Object)koh.d.a)) {
                    if (zzd.a((Object)a3, (Object)koh.c.a)) {
                        n2 = (b2 ? 1 : 0);
                    }
                    else {
                        n2 = 0;
                    }
                }
            }
            if (n2 != 0) {
                ((MviViewModel)d0).V((Object)new dmh.c(e.a, null, null, true, null, false, 54));
            }
            else {
                d0.a0(2131953936);
            }
        }
        return oyv.a;
    }
}
