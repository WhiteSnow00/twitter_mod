// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@vb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$intents$2$11", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends l1s implements hub<nx2$f, mp6<? super vzv>, Object>
{
    public final BusinessInfoViewModel F0;
    
    public b(final BusinessInfoViewModel f0, final mp6<? super b> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new b(this.F0, (mp6<? super b>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final kd4 v0 = this.F0.V0;
        v0.a(shw.R(v0.b, "clear_data", "confirm", 8));
        final BusinessInfoViewModel f0 = this.F0;
        final String currentModuleId = f0.d1.getCurrentModuleId();
        vzv a;
        if (currentModuleId != null) {
            final yz5 f2 = f0.R0.f(currentModuleId);
            final bu1 bu1 = new bu1((stb)new nz2(f0), 7);
            Objects.requireNonNull(f2);
            ((MviViewModel)f0).x((yz5)new w06((x06)f2, (rk6)bu1, (rk6)lvb.d, (sj)lvb.c), (stb)new rz2(f0));
            a = vzv.a;
        }
        else {
            a = null;
        }
        if (a == null) {
            f0.d1.clearAllData();
            ((MviViewModel)f0).Q((stb)wz2.F0);
            ((MviViewModel)f0).V((Object)new lx2$a(false, 3));
        }
        return vzv.a;
    }
}
