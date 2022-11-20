// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$1", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class v extends p0s implements ftb<d1n$o, go6<? super fzv>, Object>
{
    public final RoomAudioSpaceViewModel D0;
    
    public v(final RoomAudioSpaceViewModel d0, final go6<? super v> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new v(this.D0, (go6<? super v>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final v v = (v)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        v.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        this.D0.R0.a.onNext((Object)ynj.b((Object)n8s.H0));
        return fzv.a;
    }
}
