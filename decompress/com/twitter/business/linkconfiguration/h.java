// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.features.linkmodule.model.LinkModuleDomainConfig;

@sa8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$4", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends p0s implements ftb<eef$l, go6<? super fzv>, Object>
{
    public Object D0;
    public final LinkModuleConfigurationViewModel E0;
    
    public h(final LinkModuleConfigurationViewModel e0, final go6<? super h> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final h h = new h(this.E0, (go6<? super h>)go6);
        h.D0 = d0;
        return (go6<fzv>)h;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final eef$l eef$l = (eef$l)this.D0;
        final LinkModuleConfigurationViewModel e0 = this.E0;
        e0.c1 = LinkModuleDomainConfig.copy$default(e0.c1, null, null, eef$l.a.b, 3, null);
        final LinkModuleConfigurationViewModel e2 = this.E0;
        ((MviViewModel)e2).Q((qsb)new h$a(e2));
        return fzv.a;
    }
}
