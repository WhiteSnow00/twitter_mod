// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$21", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class a0 extends p0s implements ftb<d1n$t, go6<? super fzv>, Object>
{
    public final RoomAudioSpaceViewModel D0;
    
    public a0(final RoomAudioSpaceViewModel d0, final go6<? super a0> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new a0(this.D0, (go6<? super a0>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a0 a0 = (a0)this.create(o, (go6<?>)o2);
        final fzv a2 = fzv.a;
        a0.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final RoomAudioSpaceViewModel d0 = this.D0;
        final a0$a a0$a = new a0$a(d0);
        final coe[] n1 = RoomAudioSpaceViewModel.n1;
        ((MviViewModel)d0).T((qsb)a0$a);
        return fzv.a;
    }
}
