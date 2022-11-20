// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$19", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class u extends p0s implements ftb<d1n$n, go6<? super fzv>, Object>
{
    public final RoomAudioSpaceViewModel D0;
    
    public u(final RoomAudioSpaceViewModel d0, final go6<? super u> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new u(this.D0, (go6<? super u>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final u u = (u)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        u.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final RoomAudioSpaceViewModel d0 = this.D0;
        final u$a u$a = new u$a(d0);
        final coe[] n1 = RoomAudioSpaceViewModel.n1;
        ((MviViewModel)d0).T((qsb)u$a);
        return fzv.a;
    }
}
