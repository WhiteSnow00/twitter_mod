// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.list;

@sa8(c = "com.twitter.app.bookmarks.folders.list.FolderListViewModel$intents$2$6$1$3", f = "FolderListViewModel.kt", l = {}, m = "invokeSuspend")
public final class l extends p0s implements qsb<go6<? super fzv>, Object>
{
    public final FolderListViewModel D0;
    
    public l(final FolderListViewModel d0, final go6<? super l> go6) {
        this.D0 = d0;
        super(1, (go6)go6);
    }
    
    public final go6<fzv> create(final go6<?> go6) {
        return (go6<fzv>)new l(this.D0, (go6<? super l>)go6);
    }
    
    public final Object invoke(final Object o) {
        final l l = (l)this.create((go6<?>)o);
        final fzv a = fzv.a;
        l.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final FolderListViewModel d0 = this.D0;
        final egb$h a = egb$h.a;
        final coe<Object>[] q0 = FolderListViewModel.Q0;
        d0.V((Object)a);
        return fzv.a;
    }
}
