// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.replay;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.manager.RoomStateManager;

@sa8(c = "com.twitter.rooms.replay.RoomReplayDockViewModel$intents$2$3", f = "RoomReplayDockViewModel.kt", l = {}, m = "invokeSuspend")
public final class k extends p0s implements ftb<g0o.a, go6<? super fzv>, Object>
{
    public final RoomReplayDockViewModel D0;
    public final RoomStateManager E0;
    
    public k(final RoomReplayDockViewModel d0, final RoomStateManager e0, final go6<? super k> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new k(this.D0, this.E0, (go6<? super k>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final k k = (k)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        k.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final RoomReplayDockViewModel d0 = this.D0;
        final k$a k$a = new k$a(d0, this.E0);
        final coe[] t0 = RoomReplayDockViewModel.T0;
        ((MviViewModel)d0).T((qsb)k$a);
        return fzv.a;
    }
}
