// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.rooms.manager.RoomStateManager;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$18", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class t extends p0s implements ftb<d1n$e, go6<? super fzv>, Object>
{
    public final RoomAudioSpaceViewModel D0;
    
    public t(final RoomAudioSpaceViewModel d0, final go6<? super t> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new t(this.D0, (go6<? super t>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final t t = (t)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        t.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        RoomStateManager.r0(this.D0.Q0, false, false, false, false, (nsb)null, 31);
        return fzv.a;
    }
}
