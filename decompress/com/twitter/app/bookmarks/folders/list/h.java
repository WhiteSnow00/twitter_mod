// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.list;

@sa8(c = "com.twitter.app.bookmarks.folders.list.FolderListViewModel$intents$2$4", f = "FolderListViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends p0s implements ftb<fgb$b, go6<? super fzv>, Object>
{
    public final FolderListViewModel D0;
    
    public h(final FolderListViewModel d0, final go6<? super h> go6) {
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
        final FolderListViewModel d0 = this.D0;
        final egb$b a = egb$b.a;
        final coe<Object>[] q0 = FolderListViewModel.Q0;
        d0.V((Object)a);
        return fzv.a;
    }
}
