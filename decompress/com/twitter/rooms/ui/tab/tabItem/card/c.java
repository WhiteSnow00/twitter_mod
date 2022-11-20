// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.tab.tabItem.card;

@sa8(c = "com.twitter.rooms.ui.tab.tabItem.card.SpacesTabCardViewModel$2$1$3", f = "SpacesTabCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends p0s implements ftb<cgv, go6<? super fzv>, Object>
{
    public Object D0;
    public final SpacesTabCardViewModel E0;
    public final cwq F0;
    public final String G0;
    
    public c(final SpacesTabCardViewModel e0, final cwq f0, final String g0, final go6<? super c> go6) {
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final c c = new c(this.E0, this.F0, this.G0, (go6<? super c>)go6);
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
        final cgv cgv = (cgv)this.D0;
        final SpacesTabCardViewModel e0 = this.E0;
        final c$a c$a = new c$a(this.F0, this.G0, cgv);
        final SpacesTabCardViewModel.g companion = SpacesTabCardViewModel.Companion;
        e0.Q((qsb)c$a);
        return fzv.a;
    }
}
