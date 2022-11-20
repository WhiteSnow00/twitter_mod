// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.list;

@sa8(c = "com.twitter.app.bookmarks.folders.list.FolderListViewModel$intents$2$2", f = "FolderListViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends p0s implements ftb<fgb$e, go6<? super fzv>, Object>
{
    public Object D0;
    public final FolderListViewModel E0;
    
    public f(final FolderListViewModel e0, final go6<? super f> go6) {
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
        final fgb$e fgb$e = (fgb$e)this.D0;
        final FolderListViewModel e0 = this.E0;
        final h52 o2 = e0.O0;
        final String b = fgb$e.b;
        final String c = fgb$e.c;
        czd.c((Object)c);
        final String b2 = fgb$e.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("folder");
        sb.append(b2);
        e0.C(o2.c(b, c, sb.toString()), (qsb)new f$a(this.E0, fgb$e));
        return fzv.a;
    }
}
