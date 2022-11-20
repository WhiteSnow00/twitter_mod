// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.dialog;

@sa8(c = "com.twitter.app.bookmarks.folders.dialog.BookmarkFolderSheetViewModel$intents$2$2", f = "BookmarkFolderSheetViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<q52.a, go6<? super fzv>, Object>
{
    public final BookmarkFolderSheetViewModel D0;
    
    public b(final BookmarkFolderSheetViewModel d0, final go6<? super b> go6) {
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
        final BookmarkFolderSheetViewModel d0 = this.D0;
        int n;
        if (d0.O0.d) {
            n = 2;
        }
        else {
            n = 1;
        }
        d0.Q((qsb)new u52(n));
        return fzv.a;
    }
}
