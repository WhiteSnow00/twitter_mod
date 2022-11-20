// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$9", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class j0 extends p0s implements ftb<d1n$p, go6<? super fzv>, Object>
{
    public final RoomAudioSpaceViewModel D0;
    
    public j0(final RoomAudioSpaceViewModel d0, final go6<? super j0> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new j0(this.D0, (go6<? super j0>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final j0 j0 = (j0)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        j0.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        ktn.a(this.D0.R0);
        return fzv.a;
    }
}
