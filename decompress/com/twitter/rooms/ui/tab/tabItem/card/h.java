// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.tab.tabItem.card;

@sa8(c = "com.twitter.rooms.ui.tab.tabItem.card.SpacesTabCardViewModel$intents$2$5", f = "SpacesTabCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends p0s implements ftb<bwq$a, go6<? super fzv>, Object>
{
    public final SpacesTabCardViewModel D0;
    
    public h(final SpacesTabCardViewModel d0, final go6<? super h> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new h(this.D0, (go6<? super h>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final SpacesTabCardViewModel d0 = this.D0;
        final h$a h$a = new h$a(d0);
        final SpacesTabCardViewModel.g companion = SpacesTabCardViewModel.Companion;
        d0.T((qsb)h$a);
        return fzv.a;
    }
}
