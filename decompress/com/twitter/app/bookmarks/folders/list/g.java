// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.list;

@sa8(c = "com.twitter.app.bookmarks.folders.list.FolderListViewModel$intents$2$3", f = "FolderListViewModel.kt", l = {}, m = "invokeSuspend")
public final class g extends p0s implements ftb<fgb$c, go6<? super fzv>, Object>
{
    public Object D0;
    public final FolderListViewModel E0;
    
    public g(final FolderListViewModel e0, final go6<? super g> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final g g = new g(this.E0, (go6<? super g>)go6);
        g.D0 = d0;
        return (go6<fzv>)g;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final g g = (g)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        g.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final fgb$c fgb$c = (fgb$c)this.D0;
        final FolderListViewModel e0 = this.E0;
        final egb$c egb$c = new egb$c(fgb$c.a, fgb$c.b);
        final coe<Object>[] q0 = FolderListViewModel.Q0;
        e0.V((Object)egb$c);
        return fzv.a;
    }
}
