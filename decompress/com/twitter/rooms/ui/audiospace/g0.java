// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$7", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class g0 extends p0s implements ftb<d1n$l, go6<? super fzv>, Object>
{
    public final RoomAudioSpaceViewModel D0;
    
    public g0(final RoomAudioSpaceViewModel d0, final go6<? super g0> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new g0(this.D0, (go6<? super g0>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final g0 g0 = (g0)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        g0.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final RoomAudioSpaceViewModel d0 = this.D0;
        final g0$a g0$a = new g0$a(d0);
        final coe[] n1 = RoomAudioSpaceViewModel.n1;
        ((MviViewModel)d0).T((qsb)g0$a);
        return fzv.a;
    }
}
