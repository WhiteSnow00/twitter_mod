// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.dock;

@sa8(c = "com.twitter.rooms.ui.stationstab.dock.StationsTabDockViewModel$intents$2$2", f = "StationsTabDockViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends p0s implements ftb<vdr, go6<? super fzv>, Object>
{
    public Object D0;
    public final StationsTabDockViewModel E0;
    public final vjo F0;
    
    public c(final StationsTabDockViewModel e0, final vjo f0, final go6<? super c> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final c c = new c(this.E0, this.F0, (go6<? super c>)go6);
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
        final vdr vdr = (vdr)this.D0;
        final StationsTabDockViewModel e0 = this.E0;
        final c$a c$a = new c$a(this.F0, vdr, e0);
        final StationsTabDockViewModel.h companion = StationsTabDockViewModel.Companion;
        e0.T((qsb)c$a);
        return fzv.a;
    }
}
