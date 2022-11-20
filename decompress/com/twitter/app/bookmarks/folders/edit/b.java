// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.edit;

@sa8(c = "com.twitter.app.bookmarks.folders.edit.EditFolderViewModel$intents$2$1$1$2", f = "EditFolderViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<u42, go6<? super fzv>, Object>
{
    public Object D0;
    public final EditFolderViewModel E0;
    
    public b(final EditFolderViewModel e0, final go6<? super b> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final b b = new b(this.E0, (go6<? super b>)go6);
        b.D0 = d0;
        return (go6<fzv>)b;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final u42 u42 = (u42)this.D0;
        final EditFolderViewModel e0 = this.E0;
        final ufb$b ufb$b = new ufb$b(u42.b);
        final coe<Object>[] q0 = EditFolderViewModel.Q0;
        e0.V((Object)ufb$b);
        return fzv.a;
    }
}
