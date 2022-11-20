// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$10", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements ftb<eef$g, go6<? super fzv>, Object>
{
    public final LinkModuleConfigurationViewModel D0;
    
    public a(final LinkModuleConfigurationViewModel d0, final go6<? super a> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new a(this.D0, (go6<? super a>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (go6<?>)o2);
        final fzv a2 = fzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final LinkModuleConfigurationViewModel d0 = this.D0;
        final cef$a cef$a = new cef$a(false, 3);
        final coe[] e1 = LinkModuleConfigurationViewModel.e1;
        ((MviViewModel)d0).V((Object)cef$a);
        return fzv.a;
    }
}
