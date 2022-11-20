// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.replay;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.replay.RoomReplayDockViewModel$1$1", f = "RoomReplayDockViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<lvj<? extends x1, ? extends s8x>, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomReplayDockViewModel E0;
    
    public b(final RoomReplayDockViewModel e0, final go6<? super b> go6) {
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
        final lvj lvj = (lvj)this.D0;
        final x1 x1 = (x1)lvj.D0;
        final s8x s8x = (s8x)lvj.E0;
        if (x1 instanceof zlk) {
            final RoomReplayDockViewModel e0 = this.E0;
            final b$a b$a = new b$a(e0);
            final coe[] t0 = RoomReplayDockViewModel.T0;
            ((MviViewModel)e0).T((qsb)b$a);
        }
        else if (x1 instanceof cnk) {
            final RoomReplayDockViewModel e2 = this.E0;
            final b$b b$b = new b$b(x1, s8x, e2);
            final coe[] t2 = RoomReplayDockViewModel.T0;
            ((MviViewModel)e2).T((qsb)b$b);
        }
        else if (x1 instanceof ink) {
            final RoomReplayDockViewModel e3 = this.E0;
            final b$c b$c = new b$c(e3);
            final coe[] t3 = RoomReplayDockViewModel.T0;
            ((MviViewModel)e3).T((qsb)b$c);
        }
        else if (x1 instanceof lhl) {
            final RoomReplayDockViewModel e4 = this.E0;
            final b$d b$d = new b$d(x1);
            final coe[] t4 = RoomReplayDockViewModel.T0;
            ((MviViewModel)e4).Q((qsb)b$d);
        }
        return fzv.a;
    }
}
