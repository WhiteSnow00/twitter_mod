// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$saveModule$2$1", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class n extends l1s implements hub<noj<uow>, mp6<? super vzv>, Object>
{
    public Object F0;
    public final LinkModuleConfigurationViewModel G0;
    public final boolean H0;
    public final boolean I0;
    
    public n(final LinkModuleConfigurationViewModel g0, final boolean h0, final boolean i0, final mp6<? super n> mp6) {
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final n n = new n(this.G0, this.H0, this.I0, (mp6<? super n>)mp6);
        n.F0 = f0;
        return (mp6<vzv>)n;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final n n = (n)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        n.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final noj noj = (noj)this.F0;
        this.G0.T0.c(this.H0);
        if (noj.f()) {
            ((MviViewModel)this.G0).Q((stb)n$a.F0);
            ((MviViewModel)this.G0).V((Object)new zef$h(((uow)noj.c()).b));
        }
        else {
            ((MviViewModel)this.G0).V((Object)new zef$a(this.I0));
        }
        return vzv.a;
    }
}
