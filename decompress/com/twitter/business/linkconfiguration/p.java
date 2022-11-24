// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$saveModule$2$3", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class p extends l1s implements hub<Throwable, mp6<? super vzv>, Object>
{
    public final LinkModuleConfigurationViewModel F0;
    public final boolean G0;
    
    public p(final LinkModuleConfigurationViewModel f0, final boolean g0, final mp6<? super p> mp6) {
        this.F0 = f0;
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new p(this.F0, this.G0, (mp6<? super p>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final p p2 = (p)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        p2.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        this.F0.T0.a(this.G0);
        ((MviViewModel)this.F0).Q((stb)p$a.F0);
        final LinkModuleConfigurationViewModel f0 = this.F0;
        Objects.requireNonNull(f0);
        ((MviViewModel)f0).V((Object)new zef$g(2131952936));
        return vzv.a;
    }
}
