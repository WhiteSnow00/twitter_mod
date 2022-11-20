// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab;

@sa8(c = "com.twitter.rooms.ui.stationstab.SpacesStationsTabViewModel$unsubscribeFromSpace$1$2", f = "SpacesStationsTabViewModel.kt", l = {}, m = "invokeSuspend")
public final class g extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public final qsb<Boolean, fzv> D0;
    
    public g(final qsb<? super Boolean, fzv> d0, final go6<? super g> go6) {
        this.D0 = (qsb<Boolean, fzv>)d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new g(this.D0, (go6<? super g>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final g g = (g)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        g.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        this.D0.invoke((Object)Boolean.FALSE);
        return fzv.a;
    }
}
