// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$16", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class r extends p0s implements ftb<d1n$i, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomAudioSpaceViewModel E0;
    
    public r(final RoomAudioSpaceViewModel e0, final go6<? super r> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final r r = new r(this.E0, (go6<? super r>)go6);
        r.D0 = d0;
        return (go6<fzv>)r;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final r r = (r)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        r.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final d1n$i d1n$i = (d1n$i)this.D0;
        final RoomAudioSpaceViewModel e0 = this.E0;
        final r$a r$a = new r$a(e0, d1n$i);
        final coe[] n1 = RoomAudioSpaceViewModel.n1;
        ((MviViewModel)e0).T((qsb)r$a);
        return fzv.a;
    }
}
