// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$6", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class j extends l1s implements hub<bff$f, mp6<? super vzv>, Object>
{
    public final LinkModuleConfigurationViewModel F0;
    
    public j(final LinkModuleConfigurationViewModel f0, final mp6<? super j> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new j(this.F0, (mp6<? super j>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final j j = (j)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        j.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final kd4 u0 = this.F0.U0;
        u0.a(shw.R(u0.b, "clear_data", "confirm", 8));
        final LinkModuleConfigurationViewModel f0 = this.F0;
        final String currentModuleId = f0.e1.getCurrentModuleId();
        vzv a;
        if (currentModuleId != null) {
            final yz5 j = f0.c1.j(currentModuleId);
            final zna zna = new zna((stb)new ggf(f0), 16);
            Objects.requireNonNull(j);
            ((MviViewModel)f0).x((yz5)new w06((x06)j, (rk6)zna, (rk6)lvb.d, (sj)lvb.c), (stb)new kgf(f0));
            a = vzv.a;
        }
        else {
            a = null;
        }
        if (a == null) {
            f0.e1.clearAllData();
            ((MviViewModel)f0).Q((stb)lgf.F0);
            ((MviViewModel)f0).V((Object)new zef$a(false, 3));
        }
        return vzv.a;
    }
}
