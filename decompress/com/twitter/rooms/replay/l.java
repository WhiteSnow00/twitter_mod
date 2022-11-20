// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.replay;

import java.util.Objects;

@sa8(c = "com.twitter.rooms.replay.RoomReplayDockViewModel$intents$2$4", f = "RoomReplayDockViewModel.kt", l = {}, m = "invokeSuspend")
public final class l extends p0s implements ftb<g0o.c, go6<? super fzv>, Object>
{
    public final h0o D0;
    
    public l(final h0o d0, final go6<? super l> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new l(this.D0, (go6<? super l>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final l l = (l)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        l.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final h0o d0 = this.D0;
        final i0o i0o = new i0o();
        Objects.requireNonNull(d0);
        d0.a.onNext((Object)i0o);
        return fzv.a;
    }
}
