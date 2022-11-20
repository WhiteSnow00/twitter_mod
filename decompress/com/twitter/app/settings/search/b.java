// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.search;

import java.util.Objects;

@sa8(c = "com.twitter.app.settings.search.SettingsSearchResultsViewModel$4$1", f = "SettingsSearchResultsViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<xpp, go6<? super fzv>, Object>
{
    public Object D0;
    public final SettingsSearchResultsViewModel E0;
    
    public b(final SettingsSearchResultsViewModel e0, final go6<? super b> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final b b = new b(this.E0, (go6<? super b>)go6);
        b.D0 = d0;
        return (go6<fzv>)b;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final xpp xpp = (xpp)this.D0;
        if (xpp.d) {
            final SettingsSearchResultsViewModel e0 = this.E0;
            final coe<Object>[] p = SettingsSearchResultsViewModel.P0;
            Objects.requireNonNull(e0);
            final aqp a = aqp.a;
            cbw.b((elm)new af4(aqp.d));
        }
        if (xpp.b.isEmpty() ^ true) {
            final SettingsSearchResultsViewModel e2 = this.E0;
            final coe<Object>[] p2 = SettingsSearchResultsViewModel.P0;
            Objects.requireNonNull(e2);
            final aqp a2 = aqp.a;
            cbw.b((elm)new af4(aqp.e));
        }
        return fzv.a;
    }
}
