// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$13", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends l1s implements hub<bff$j, mp6<? super vzv>, Object>
{
    public final LinkModuleConfigurationViewModel F0;
    
    public d(final LinkModuleConfigurationViewModel f0, final mp6<? super d> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new d(this.F0, (mp6<? super d>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        this.F0.d1.c();
        return vzv.a;
    }
}
