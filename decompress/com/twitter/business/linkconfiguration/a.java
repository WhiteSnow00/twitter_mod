// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$10", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends l1s implements hub<bff$g, mp6<? super vzv>, Object>
{
    public final LinkModuleConfigurationViewModel F0;
    
    public a(final LinkModuleConfigurationViewModel f0, final mp6<? super a> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new a(this.F0, (mp6<? super a>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (mp6<?>)o2);
        final vzv a2 = vzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final LinkModuleConfigurationViewModel f0 = this.F0;
        final zef$a zef$a = new zef$a(false, 3);
        final ape[] g1 = LinkModuleConfigurationViewModel.g1;
        ((MviViewModel)f0).V((Object)zef$a);
        return vzv.a;
    }
}
