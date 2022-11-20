// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.list;

@sa8(c = "com.twitter.app.bookmarks.folders.list.FolderListViewModel$intents$2$6$1$2", f = "FolderListViewModel.kt", l = {}, m = "invokeSuspend")
public final class k extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public final FolderListViewModel D0;
    
    public k(final FolderListViewModel d0, final go6<? super k> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new k(this.D0, (go6<? super k>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final k k = (k)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        k.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final FolderListViewModel d0 = this.D0;
        final egb$f a = egb$f.a;
        final coe<Object>[] q0 = FolderListViewModel.Q0;
        d0.V((Object)a);
        return fzv.a;
    }
}
