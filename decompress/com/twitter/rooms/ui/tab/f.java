// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.tab;

@sa8(c = "com.twitter.rooms.ui.tab.SpacesTabViewModel$loadSpacesFeed$2$2", f = "SpacesTabViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public Object D0;
    public final SpacesTabViewModel E0;
    
    public f(final SpacesTabViewModel e0, final go6<? super f> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final f f = new f(this.E0, (go6<? super f>)go6);
        f.D0 = d0;
        return (go6<fzv>)f;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f f = (f)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final Throwable t = (Throwable)this.D0;
        final SpacesTabViewModel e0 = this.E0;
        final f$a f$a = new f$a(t);
        final coe<Object>[] v0 = SpacesTabViewModel.V0;
        e0.Q((qsb)f$a);
        return fzv.a;
    }
}
