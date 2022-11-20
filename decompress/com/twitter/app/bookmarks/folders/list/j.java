// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.list;

import java.util.List;

@sa8(c = "com.twitter.app.bookmarks.folders.list.FolderListViewModel$intents$2$6$1$1", f = "FolderListViewModel.kt", l = {}, m = "invokeSuspend")
public final class j extends p0s implements ftb<List<? extends u42>, go6<? super fzv>, Object>
{
    public Object D0;
    public final FolderListViewModel E0;
    
    public j(final FolderListViewModel e0, final go6<? super j> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final j j = new j(this.E0, (go6<? super j>)go6);
        j.D0 = d0;
        return (go6<fzv>)j;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final j j = (j)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        j.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final List list = (List)this.D0;
        final FolderListViewModel e0 = this.E0;
        final egb$d egb$d = new egb$d(list);
        final coe<Object>[] q0 = FolderListViewModel.Q0;
        e0.V((Object)egb$d);
        return fzv.a;
    }
}
