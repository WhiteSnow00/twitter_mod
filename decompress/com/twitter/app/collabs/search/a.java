// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.collabs.search;

import java.util.Objects;

@sa8(c = "com.twitter.app.collabs.search.CollaboratorsSearchViewModel$intents$2$1", f = "CollaboratorsSearchViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements ftb<oo4, go6<? super fzv>, Object>
{
    public Object D0;
    public final CollaboratorsSearchViewModel E0;
    
    public a(final CollaboratorsSearchViewModel e0, final go6<? super a> go6) {
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
        final oo4 oo4 = (oo4)this.D0;
        final CollaboratorsSearchViewModel e0 = this.E0;
        final String a = oo4.a;
        final coe<Object>[] r0 = CollaboratorsSearchViewModel.R0;
        Objects.requireNonNull(e0);
        e0.T((qsb)new vo4(a, e0));
        return fzv.a;
    }
}
