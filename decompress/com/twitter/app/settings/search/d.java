// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.search;

@vb8(c = "com.twitter.app.settings.search.SettingsSearchToolbarViewModel$2$1", f = "SettingsSearchToolbarViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends l1s implements hub<wqp, mp6<? super vzv>, Object>
{
    public Object F0;
    public final SettingsSearchToolbarViewModel G0;
    
    public d(final SettingsSearchToolbarViewModel g0, final mp6<? super d> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final d d = new d(this.G0, (mp6<? super d>)mp6);
        d.F0 = f0;
        return (mp6<vzv>)d;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final wqp wqp = (wqp)this.F0;
        final SettingsSearchToolbarViewModel g0 = this.G0;
        final d$a d$a = new d$a(wqp);
        final ape<Object>[] s0 = SettingsSearchToolbarViewModel.S0;
        g0.Q((stb)d$a);
        return vzv.a;
    }
}
