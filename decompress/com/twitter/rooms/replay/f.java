// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.replay;

@sa8(c = "com.twitter.rooms.replay.RoomReplayDockViewModel$1$2", f = "RoomReplayDockViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public Object D0;
    public final pyh<j1o, lvj<x1, s8x>> E0;
    
    public f(final pyh<j1o, lvj<x1, s8x>> e0, final go6<? super f> go6) {
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
        h6r.o(this.E0.getClass().getName(), (String)null, (Throwable)this.D0);
        return fzv.a;
    }
}
