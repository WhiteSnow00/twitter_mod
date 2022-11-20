// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.tab.tabItem.card;

@sa8(c = "com.twitter.rooms.ui.tab.tabItem.card.SpacesTabCardViewModel$2$1$1", f = "SpacesTabCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements qsb<go6<? super fzv>, Object>
{
    public final SpacesTabCardViewModel D0;
    public final cwq E0;
    public final String F0;
    
    public a(final SpacesTabCardViewModel d0, final cwq e0, final String f0, final go6<? super a> go6) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1, (go6)go6);
    }
    
    public final go6<fzv> create(final go6<?> go6) {
        return (go6<fzv>)new a(this.D0, this.E0, this.F0, (go6<? super a>)go6);
    }
    
    public final Object invoke(final Object o) {
        final a a = (a)this.create((go6<?>)o);
        final fzv a2 = fzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final SpacesTabCardViewModel d0 = this.D0;
        final a$a a$a = new a$a(this.E0, this.F0);
        final SpacesTabCardViewModel.g companion = SpacesTabCardViewModel.Companion;
        d0.Q((qsb)a$a);
        return fzv.a;
    }
}
