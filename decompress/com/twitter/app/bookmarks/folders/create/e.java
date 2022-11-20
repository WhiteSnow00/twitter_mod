// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.create;

@sa8(c = "com.twitter.app.bookmarks.folders.create.CreateFolderViewModel$intents$2$1", f = "CreateFolderViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends p0s implements ftb<k37$a, go6<? super fzv>, Object>
{
    public Object D0;
    public final CreateFolderViewModel E0;
    
    public e(final CreateFolderViewModel e0, final go6<? super e> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final e e = new e(this.E0, (go6<? super e>)go6);
        e.D0 = d0;
        return (go6<fzv>)e;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final k37$a k37$a = (k37$a)this.D0;
        final CreateFolderViewModel e0 = this.E0;
        e0.C(e0.O0.f(k37$a.a, k37$a.b), (qsb)new e$a(this.E0));
        return fzv.a;
    }
}
