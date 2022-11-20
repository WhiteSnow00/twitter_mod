// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$15", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class n extends p0s implements ftb<d1n$u, go6<? super fzv>, Object>
{
    public final RoomAudioSpaceViewModel D0;
    
    public n(final RoomAudioSpaceViewModel d0, final go6<? super n> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new n(this.D0, (go6<? super n>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final n n = (n)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        n.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final RoomAudioSpaceViewModel d0 = this.D0;
        final n$a n$a = new n$a(d0);
        final coe[] n1 = RoomAudioSpaceViewModel.n1;
        ((MviViewModel)d0).T((qsb)n$a);
        return fzv.a;
    }
}
