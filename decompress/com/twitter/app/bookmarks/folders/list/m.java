// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.list;

@sa8(c = "com.twitter.app.bookmarks.folders.list.FolderListViewModel$intents$2$6", f = "FolderListViewModel.kt", l = {}, m = "invokeSuspend")
public final class m extends p0s implements ftb<fgb$f, go6<? super fzv>, Object>
{
    public Object D0;
    public final FolderListViewModel E0;
    
    public m(final FolderListViewModel e0, final go6<? super m> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final m m = new m(this.E0, (go6<? super m>)go6);
        m.D0 = d0;
        return (go6<fzv>)m;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final m m = (m)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        m.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final fgb$f fgb$f = (fgb$f)this.D0;
        final FolderListViewModel e0 = this.E0;
        e0.C(e0.O0.d(fgb$f.a), (qsb)new m$a(this.E0));
        return fzv.a;
    }
}
