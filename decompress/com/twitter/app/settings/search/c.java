// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.search;

import java.util.Objects;

@sa8(c = "com.twitter.app.settings.search.SettingsSearchResultsViewModel$intents$2$1", f = "SettingsSearchResultsViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends p0s implements ftb<npp$a, go6<? super fzv>, Object>
{
    public Object D0;
    public final SettingsSearchResultsViewModel E0;
    
    public c(final SettingsSearchResultsViewModel e0, final go6<? super c> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final c c = new c(this.E0, (go6<? super c>)go6);
        c.D0 = d0;
        return (go6<fzv>)c;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c c = (c)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final npp$a npp$a = (npp$a)this.D0;
        final SettingsSearchResultsViewModel e0 = this.E0;
        final mpp.a a = new mpp.a(npp$a.a.c);
        final coe<Object>[] p = SettingsSearchResultsViewModel.P0;
        e0.V((Object)a);
        Objects.requireNonNull(this.E0);
        final aqp a2 = aqp.a;
        cbw.b((elm)new af4(aqp.c));
        return fzv.a;
    }
}
