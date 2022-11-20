// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.items;

@sa8(c = "com.twitter.rooms.ui.stationstab.items.SpacesStationsTabCarouselItemViewModel$intents$2$1", f = "SpacesStationsTabCarouselItemViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements ftb<ttq$c, go6<? super fzv>, Object>
{
    public final SpacesStationsTabCarouselItemViewModel D0;
    
    public a(final SpacesStationsTabCarouselItemViewModel d0, final go6<? super a> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new a(this.D0, (go6<? super a>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (go6<?>)o2);
        final fzv a2 = fzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        if (this.D0.R0.n() && this.D0.R0.s() != null) {
            final SpacesStationsTabCarouselItemViewModel d0 = this.D0;
            d0.V((Object)new stq$a(d0.R0.A()));
        }
        else {
            final SpacesStationsTabCarouselItemViewModel d2 = this.D0;
            d2.P0.a(d2.O0.a);
        }
        return fzv.a;
    }
}
