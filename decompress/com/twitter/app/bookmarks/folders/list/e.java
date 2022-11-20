// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.list;

@sa8(c = "com.twitter.app.bookmarks.folders.list.FolderListViewModel$intents$2$2$1$2", f = "FolderListViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends p0s implements ftb<tmi, go6<? super fzv>, Object>
{
    public final FolderListViewModel D0;
    public final fgb$e E0;
    
    public e(final FolderListViewModel d0, final fgb$e e0, final go6<? super e> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new e(this.D0, this.E0, (go6<? super e>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final FolderListViewModel d0 = this.D0;
        final fgb$e e0 = this.E0;
        final egb$e egb$e = new egb$e(e0.b, e0.a, e0.d);
        final coe<Object>[] q0 = FolderListViewModel.Q0;
        d0.V((Object)egb$e);
        return fzv.a;
    }
}
