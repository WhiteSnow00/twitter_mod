// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$5", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class i extends p0s implements ftb<eef$e, go6<? super fzv>, Object>
{
    public final LinkModuleConfigurationViewModel D0;
    
    public i(final LinkModuleConfigurationViewModel d0, final go6<? super i> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new i(this.D0, (go6<? super i>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i i = (i)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        i.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final hc4 s0 = this.D0.S0;
        s0.a(nza.j1(s0.b, (String)null, "clear_data", 10));
        final hc4 s2 = this.D0.S0;
        s2.a(nza.f1(s2.b, (String)null, "clear_data", 10));
        ((MviViewModel)this.D0).V((Object)cef$e.a);
        return fzv.a;
    }
}
