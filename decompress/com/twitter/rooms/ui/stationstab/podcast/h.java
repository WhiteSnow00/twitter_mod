// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.podcast;

@sa8(c = "com.twitter.rooms.ui.stationstab.podcast.StationsPodcastViewModel$intents$2$6", f = "StationsPodcastViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends p0s implements ftb<lcr$f, go6<? super fzv>, Object>
{
    public final StationsPodcastViewModel D0;
    
    public h(final StationsPodcastViewModel d0, final go6<? super h> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new h(this.D0, (go6<? super h>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        this.D0.O0.a((o1o$a)o1o$a$f.a);
        this.D0.Q((qsb)h$a.D0);
        return fzv.a;
    }
}
