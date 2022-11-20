// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$6", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class f0 extends p0s implements ftb<d1n$a, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomAudioSpaceViewModel E0;
    
    public f0(final RoomAudioSpaceViewModel e0, final go6<? super f0> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final f0 f0 = new f0(this.E0, (go6<? super f0>)go6);
        f0.D0 = d0;
        return (go6<fzv>)f0;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f0 f0 = (f0)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        f0.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final d1n$a d1n$a = (d1n$a)this.D0;
        final RoomAudioSpaceViewModel e0 = this.E0;
        final f0$a f0$a = new f0$a(e0, d1n$a);
        final coe[] n1 = RoomAudioSpaceViewModel.n1;
        ((MviViewModel)e0).T((qsb)f0$a);
        return fzv.a;
    }
}
