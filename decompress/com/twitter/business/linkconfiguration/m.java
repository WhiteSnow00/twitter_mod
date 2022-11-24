// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$9", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class m extends l1s implements hub<bff$a, mp6<? super vzv>, Object>
{
    public final LinkModuleConfigurationViewModel F0;
    
    public m(final LinkModuleConfigurationViewModel f0, final mp6<? super m> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new m(this.F0, (mp6<? super m>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final m m = (m)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        m.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final LinkModuleConfigurationViewModel f0 = this.F0;
        final ape[] g1 = LinkModuleConfigurationViewModel.g1;
        Object a;
        if (!f0.W()) {
            a = new zef$a(false, 3);
        }
        else {
            a = zef$f.a;
        }
        ((MviViewModel)f0).V(a);
        return vzv.a;
    }
}
