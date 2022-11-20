// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.edit;

@sa8(c = "com.twitter.app.bookmarks.folders.edit.EditFolderViewModel$intents$2$2$1$2", f = "EditFolderViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends p0s implements ftb<tmi, go6<? super fzv>, Object>
{
    public final EditFolderViewModel D0;
    
    public e(final EditFolderViewModel d0, final go6<? super e> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new e(this.D0, (go6<? super e>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final EditFolderViewModel d0 = this.D0;
        final ufb$a a = ufb$a.a;
        final coe<Object>[] q0 = EditFolderViewModel.Q0;
        d0.V((Object)a);
        return fzv.a;
    }
}
