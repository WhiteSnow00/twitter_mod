// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$saveModule$2$2", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class o extends l1s implements stb<mp6<? super vzv>, Object>
{
    public final LinkModuleConfigurationViewModel F0;
    
    public o(final LinkModuleConfigurationViewModel f0, final mp6<? super o> mp6) {
        this.F0 = f0;
        super(1, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final mp6<?> mp6) {
        return (mp6<vzv>)new o(this.F0, (mp6<? super o>)mp6);
    }
    
    public final Object invoke(final Object o) {
        final o o2 = (o)this.create((mp6<?>)o);
        final vzv a = vzv.a;
        o2.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final LinkModuleConfigurationViewModel f0 = this.F0;
        final stb<LinkModuleConfigurationViewModel$b, LinkModuleConfigurationViewModel$b> f2 = (stb<LinkModuleConfigurationViewModel$b, LinkModuleConfigurationViewModel$b>)o$a.F0;
        final ape[] g1 = LinkModuleConfigurationViewModel.g1;
        ((MviViewModel)f0).Q((stb)f2);
        return vzv.a;
    }
}
