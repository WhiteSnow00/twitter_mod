// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$11$2$1", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends p0s implements ftb<ynj<bo6>, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomAudioSpaceViewModel E0;
    public final t6n F0;
    
    public e(final RoomAudioSpaceViewModel e0, final t6n f0, final go6<? super e> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final e e = new e(this.E0, this.F0, (go6<? super e>)go6);
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
        final ynj ynj = (ynj)this.D0;
        if (ynj.f()) {
            final RoomAudioSpaceViewModel e0 = this.E0;
            final Object c = ynj.c();
            czd.e(c, "it.get()");
            final t0n$l t0n$l = new t0n$l((bo6)c);
            final coe[] n1 = RoomAudioSpaceViewModel.n1;
            ((MviViewModel)e0).V((Object)t0n$l);
        }
        else {
            final RoomAudioSpaceViewModel e2 = this.E0;
            final t6n f0 = this.F0;
            RoomAudioSpaceViewModel.X(e2, f0, f0.r);
        }
        return fzv.a;
    }
}
