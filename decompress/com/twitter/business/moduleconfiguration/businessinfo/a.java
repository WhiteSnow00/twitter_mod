// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.moduleconfiguration.businessinfo;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.business.moduleconfiguration.businessinfo.BusinessInfoViewModel$intents$2$10", f = "BusinessInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends l1s implements hub<nx2$e, mp6<? super vzv>, Object>
{
    public final BusinessInfoViewModel F0;
    
    public a(final BusinessInfoViewModel f0, final mp6<? super a> mp6) {
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
        final kd4 v0 = this.F0.V0;
        v0.a(shw.R(v0.b, (String)null, "clear_data", 10));
        final kd4 v2 = this.F0.V0;
        v2.a(shw.L(v2.b, (String)null, "clear_data", 10));
        ((MviViewModel)this.F0).V((Object)lx2$g.a);
        return vzv.a;
    }
}
