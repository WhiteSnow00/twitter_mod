// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab;

@sa8(c = "com.twitter.rooms.ui.stationstab.SpacesStationsTabViewModel$subscribeToSpace$1$1", f = "SpacesStationsTabViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends p0s implements ftb<fzv, go6<? super fzv>, Object>
{
    public final qsb<Boolean, fzv> D0;
    public final SpacesStationsTabViewModel E0;
    public final r21 F0;
    
    public d(final qsb<? super Boolean, fzv> d0, final SpacesStationsTabViewModel e0, final r21 f0, final go6<? super d> go6) {
        this.D0 = (qsb<Boolean, fzv>)d0;
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new d(this.D0, this.E0, this.F0, (go6<? super d>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        this.D0.invoke((Object)Boolean.TRUE);
        this.E0.S0.g(this.F0.h, true);
        final c2o q0 = this.E0.Q0;
        final String h = this.F0.h;
        czd.f((Object)h, "value");
        q0.b(h, true);
        return fzv.a;
    }
}
