// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.tab;

@sa8(c = "com.twitter.rooms.ui.tab.SpacesTabViewModel$loadSpacesFeed$2$1", f = "SpacesTabViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends p0s implements qsb<go6<? super fzv>, Object>
{
    public final SpacesTabViewModel D0;
    public final boolean E0;
    
    public e(final SpacesTabViewModel d0, final boolean e0, final go6<? super e> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(1, (go6)go6);
    }
    
    public final go6<fzv> create(final go6<?> go6) {
        return (go6<fzv>)new e(this.D0, this.E0, (go6<? super e>)go6);
    }
    
    public final Object invoke(final Object o) {
        final e e = (e)this.create((go6<?>)o);
        final fzv a = fzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final SpacesTabViewModel d0 = this.D0;
        final e$a e$a = new e$a(this.E0);
        final coe<Object>[] v0 = SpacesTabViewModel.V0;
        d0.Q((qsb)e$a);
        return fzv.a;
    }
}
