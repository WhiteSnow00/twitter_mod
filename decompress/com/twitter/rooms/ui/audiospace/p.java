// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$16$1$1$2", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class p extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomAudioSpaceViewModel E0;
    
    public p(final RoomAudioSpaceViewModel e0, final go6<? super p> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final p p2 = new p(this.E0, (go6<? super p>)go6);
        p2.D0 = d0;
        return (go6<fzv>)p2;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final p p2 = (p)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        p2.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final Throwable t = (Throwable)this.D0;
        this.E0.V0.c(2131953090, 0);
        m8a.d((Throwable)new Exception("Spaces: Failed to save description", t));
        return fzv.a;
    }
}
