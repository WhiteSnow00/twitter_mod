// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings.search;

import java.util.Objects;

@vb8(c = "com.twitter.app.settings.search.SettingsSearchResultsViewModel$4$1", f = "SettingsSearchResultsViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends l1s implements hub<sqp, mp6<? super vzv>, Object>
{
    public Object F0;
    public final SettingsSearchResultsViewModel G0;
    
    public b(final SettingsSearchResultsViewModel g0, final mp6<? super b> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final b b = new b(this.G0, (mp6<? super b>)mp6);
        b.F0 = f0;
        return (mp6<vzv>)b;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final sqp sqp = (sqp)this.F0;
        if (sqp.d) {
            final SettingsSearchResultsViewModel g0 = this.G0;
            final ape<Object>[] r0 = SettingsSearchResultsViewModel.R0;
            Objects.requireNonNull(g0);
            final vqp a = vqp.a;
            sbw.b((tlm)new fg4(vqp.d));
        }
        if (sqp.b.isEmpty() ^ true) {
            final SettingsSearchResultsViewModel g2 = this.G0;
            final ape<Object>[] r2 = SettingsSearchResultsViewModel.R0;
            Objects.requireNonNull(g2);
            final vqp a2 = vqp.a;
            sbw.b((tlm)new fg4(vqp.e));
        }
        return vzv.a;
    }
}
