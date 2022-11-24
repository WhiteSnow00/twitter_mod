// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$5", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class i extends l1s implements hub<bff$e, mp6<? super vzv>, Object>
{
    public final LinkModuleConfigurationViewModel F0;
    
    public i(final LinkModuleConfigurationViewModel f0, final mp6<? super i> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new i(this.F0, (mp6<? super i>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i i = (i)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        i.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final kd4 u0 = this.F0.U0;
        u0.a(shw.R(u0.b, (String)null, "clear_data", 10));
        final kd4 u2 = this.F0.U0;
        u2.a(shw.L(u2.b, (String)null, "clear_data", 10));
        ((MviViewModel)this.F0).V((Object)zef$e.a);
        return vzv.a;
    }
}
