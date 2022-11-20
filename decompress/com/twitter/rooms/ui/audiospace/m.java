// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$14", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class m extends p0s implements ftb<d1n$k, go6<? super fzv>, Object>
{
    public final RoomAudioSpaceViewModel D0;
    
    public m(final RoomAudioSpaceViewModel d0, final go6<? super m> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new m(this.D0, (go6<? super m>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final m m = (m)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        m.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        vjo.F(this.D0.S0, "share_sheet", "entity_reply", "click", null, null, 24);
        final RoomAudioSpaceViewModel d0 = this.D0;
        ((MviViewModel)d0).T((qsb)new m$a(d0));
        return fzv.a;
    }
}
