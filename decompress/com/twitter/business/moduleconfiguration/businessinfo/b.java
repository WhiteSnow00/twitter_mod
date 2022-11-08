// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@gb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$intents$2$11", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends xzr implements gub<cx2$f, ap6<? super oyv>, Object>
{
    public final /* synthetic */ BusinessInfoViewModel C0;
    
    public b(final BusinessInfoViewModel c0, final ap6<? super b> ap6) {
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
        final fd4 s0 = this.C0.S0;
        s0.a(m0n.Z(s0.b, "clear_data", "confirm", 8));
        final BusinessInfoViewModel c0 = this.C0;
        final String currentModuleId = c0.a1.getCurrentModuleId();
        oyv a;
        if (currentModuleId != null) {
            final iz5 f = c0.O0.f(currentModuleId);
            final kt1 kt1 = new kt1((rtb)new cz2(c0), 9);
            Objects.requireNonNull(f);
            ((MviViewModel)c0).x((iz5)new g06((h06)f, (fk6)kt1, (fk6)jvb.d, (rj)jvb.c), (rtb)new gz2(c0));
            a = oyv.a;
        }
        else {
            a = null;
        }
        if (a == null) {
            c0.a1.clearAllData();
            ((MviViewModel)c0).Q((rtb)lz2.C0);
            ((MviViewModel)c0).V((Object)new ax2$a(false, 3));
        }
        return oyv.a;
    }
}
