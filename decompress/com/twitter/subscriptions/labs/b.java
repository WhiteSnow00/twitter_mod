// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.labs;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.subscriptions.labs.LabsViewModel$1$2", f = "LabsViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public Object D0;
    public final LabsViewModel E0;
    
    public b(final LabsViewModel e0, final go6<? super b> go6) {
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
        this.E0.P0.f((Throwable)this.D0);
        final LabsViewModel e0 = this.E0;
        ((MviViewModel)e0).Q((qsb)new b$a(e0));
        return fzv.a;
    }
}
