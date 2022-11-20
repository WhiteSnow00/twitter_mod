// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.creation;

import java.util.concurrent.atomic.AtomicReference;

@sa8(c = "com.twitter.rooms.ui.core.creation.RoomCreationViewModel$5$2", f = "RoomCreationViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public Object D0;
    
    public b(final go6<? super b> go6) {
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final b b = new b((go6<? super b>)go6);
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
        ((Throwable)this.D0).getMessage();
        final AtomicReference a = y7g.a;
        return fzv.a;
    }
}
