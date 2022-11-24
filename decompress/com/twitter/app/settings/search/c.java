// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.search;

import java.util.Objects;

@vb8(c = "com.twitter.app.settings.search.SettingsSearchResultsViewModel$intents$2$1", f = "SettingsSearchResultsViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends l1s implements hub<iqp.a, mp6<? super vzv>, Object>
{
    public Object F0;
    public final SettingsSearchResultsViewModel G0;
    
    public c(final SettingsSearchResultsViewModel g0, final mp6<? super c> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final c c = new c(this.G0, (mp6<? super c>)mp6);
        c.F0 = f0;
        return (mp6<vzv>)c;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c c = (c)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final iqp.a a = (iqp.a)this.F0;
        final SettingsSearchResultsViewModel g0 = this.G0;
        final hqp$a hqp$a = new hqp$a(a.a.c);
        final ape<Object>[] r0 = SettingsSearchResultsViewModel.R0;
        g0.V((Object)hqp$a);
        Objects.requireNonNull(this.G0);
        final vqp a2 = vqp.a;
        sbw.b((tlm)new fg4(vqp.c));
        return vzv.a;
    }
}
