// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.folder;

@sa8(c = "com.twitter.app.bookmarks.folders.folder.FolderTimelineViewModel$intents$2$2", f = "FolderTimelineViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<ngb$a$a, go6<? super fzv>, Object>
{
    public final FolderTimelineViewModel D0;
    
    public b(final FolderTimelineViewModel d0, final go6<? super b> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new b(this.D0, (go6<? super b>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final FolderTimelineViewModel d0 = this.D0;
        final mgb$b a = mgb$b.a;
        final coe<Object>[] p = FolderTimelineViewModel.P0;
        d0.V((Object)a);
        return fzv.a;
    }
}
