// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.tab.tabItem.card;

@sa8(c = "com.twitter.rooms.ui.tab.tabItem.card.SpacesTabCardViewModel$intents$2$6", f = "SpacesTabCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class i extends p0s implements ftb<bwq$e, go6<? super fzv>, Object>
{
    public final SpacesTabCardViewModel D0;
    
    public i(final SpacesTabCardViewModel d0, final go6<? super i> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new i(this.D0, (go6<? super i>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i i = (i)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        i.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final SpacesTabCardViewModel d0 = this.D0;
        final i$a i$a = new i$a(d0);
        final SpacesTabCardViewModel.g companion = SpacesTabCardViewModel.Companion;
        d0.T((qsb)i$a);
        return fzv.a;
    }
}
