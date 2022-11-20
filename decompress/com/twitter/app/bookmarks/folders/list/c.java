// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.list;

@sa8(c = "com.twitter.app.bookmarks.folders.list.FolderListViewModel$intents$2$1", f = "FolderListViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends p0s implements ftb<fgb$a, go6<? super fzv>, Object>
{
    public Object D0;
    public final FolderListViewModel E0;
    
    public c(final FolderListViewModel e0, final go6<? super c> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final c c = new c(this.E0, (go6<? super c>)go6);
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
        final fgb$a fgb$a = (fgb$a)this.D0;
        final FolderListViewModel e0 = this.E0;
        final h52 o2 = e0.O0;
        final String b = fgb$a.b;
        final String c = fgb$a.c;
        czd.c((Object)c);
        final String b2 = fgb$a.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("folder");
        sb.append(b2);
        e0.C(o2.j(b, c, sb.toString()), (qsb)new c$a(this.E0, fgb$a));
        return fzv.a;
    }
}
