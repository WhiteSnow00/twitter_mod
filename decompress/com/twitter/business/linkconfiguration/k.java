// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$7", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class k extends l1s implements hub<bff$d, mp6<? super vzv>, Object>
{
    public final LinkModuleConfigurationViewModel F0;
    
    public k(final LinkModuleConfigurationViewModel f0, final mp6<? super k> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new k(this.F0, (mp6<? super k>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final k k = (k)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        k.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final kd4 u0 = this.F0.U0;
        u0.a(shw.R(u0.b, "clear_data", "cancel", 8));
        return vzv.a;
    }
}
