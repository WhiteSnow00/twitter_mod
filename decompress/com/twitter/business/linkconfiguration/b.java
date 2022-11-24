// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$11", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends l1s implements hub<bff$i, mp6<? super vzv>, Object>
{
    public final LinkModuleConfigurationViewModel F0;
    
    public b(final LinkModuleConfigurationViewModel f0, final mp6<? super b> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new b(this.F0, (mp6<? super b>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        this.F0.d1.b();
        this.F0.X(true);
        return vzv.a;
    }
}
