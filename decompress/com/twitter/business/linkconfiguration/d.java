// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

@sa8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$13", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends p0s implements ftb<eef$j, go6<? super fzv>, Object>
{
    public final LinkModuleConfigurationViewModel D0;
    
    public d(final LinkModuleConfigurationViewModel d0, final go6<? super d> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new d(this.D0, (go6<? super d>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        this.D0.b1.c();
        return fzv.a;
    }
}
