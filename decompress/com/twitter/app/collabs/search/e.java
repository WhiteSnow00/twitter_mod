// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.collabs.search;

@sa8(c = "com.twitter.app.collabs.search.CollaboratorsSearchViewModel$intents$2$5", f = "CollaboratorsSearchViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends p0s implements ftb<po4, go6<? super fzv>, Object>
{
    public Object D0;
    public final CollaboratorsSearchViewModel E0;
    
    public e(final CollaboratorsSearchViewModel e0, final go6<? super e> go6) {
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
        ((wgm)this.E0.P0).a((Object)ynj.b((Object)new on4(s9i.r(new mn4(nn4.E0, ((po4)this.D0).a)))));
        this.E0.V((Object)jo4.b.a);
        return fzv.a;
    }
}
