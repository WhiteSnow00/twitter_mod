// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.edit;

@sa8(c = "com.twitter.app.bookmarks.folders.edit.EditFolderViewModel$intents$2$1$1$1", f = "EditFolderViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public Object D0;
    public final EditFolderViewModel E0;
    
    public a(final EditFolderViewModel e0, final go6<? super a> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final a a = new a(this.E0, (go6<? super a>)go6);
        a.D0 = d0;
        return (go6<fzv>)a;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (go6<?>)o2);
        final fzv a2 = fzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final Throwable t = (Throwable)this.D0;
        final EditFolderViewModel e0 = this.E0;
        final ufb$c ufb$c = new ufb$c(t, 2131953714);
        final coe<Object>[] q0 = EditFolderViewModel.Q0;
        e0.V((Object)ufb$c);
        return fzv.a;
    }
}
