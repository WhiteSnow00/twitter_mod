// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.search;

@vb8(c = "com.twitter.app.settings.search.SettingsSearchResultsViewModel$1$1", f = "SettingsSearchResultsViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends l1s implements hub<wqp, mp6<? super vzv>, Object>
{
    public Object F0;
    public final SettingsSearchResultsViewModel G0;
    
    public a(final SettingsSearchResultsViewModel g0, final mp6<? super a> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final a a = new a(this.G0, (mp6<? super a>)mp6);
        a.F0 = f0;
        return (mp6<vzv>)a;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (mp6<?>)o2);
        final vzv a2 = vzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final wqp wqp = (wqp)this.F0;
        final int length = wqp.b.length();
        boolean b = true;
        if (length <= 0 || !wqp.a.isEmpty()) {
            b = false;
        }
        final SettingsSearchResultsViewModel g0 = this.G0;
        final a$a a$a = new a$a(wqp, b);
        final ape<Object>[] r0 = SettingsSearchResultsViewModel.R0;
        g0.Q((stb)a$a);
        return vzv.a;
    }
}
