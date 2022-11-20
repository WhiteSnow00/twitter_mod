// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.edit;

@sa8(c = "com.twitter.app.bookmarks.folders.edit.EditFolderViewModel$intents$2$2", f = "EditFolderViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends p0s implements ftb<tfb$a, go6<? super fzv>, Object>
{
    public Object D0;
    public final EditFolderViewModel E0;
    
    public f(final EditFolderViewModel e0, final go6<? super f> go6) {
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
        final tfb$a tfb$a = (tfb$a)this.D0;
        final EditFolderViewModel e0 = this.E0;
        e0.C(e0.O0.a(tfb$a.a), (qsb)new f$a(this.E0));
        return fzv.a;
    }
}
