// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$14$1$1$1", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class l extends p0s implements ftb<fzv, go6<? super fzv>, Object>
{
    public final RoomAudioSpaceViewModel D0;
    
    public l(final RoomAudioSpaceViewModel d0, final go6<? super l> go6) {
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
        final RoomAudioSpaceViewModel d0 = this.D0;
        final l$a d2 = l$a.D0;
        final coe[] n1 = RoomAudioSpaceViewModel.n1;
        ((MviViewModel)d0).Q((qsb)d2);
        return fzv.a;
    }
}
