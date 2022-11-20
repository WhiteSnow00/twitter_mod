// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.podcast;

@sa8(c = "com.twitter.rooms.ui.stationstab.podcast.StationsPodcastViewModel$intents$2$7", f = "StationsPodcastViewModel.kt", l = {}, m = "invokeSuspend")
public final class i extends p0s implements ftb<lcr$e, go6<? super fzv>, Object>
{
    public Object D0;
    public final StationsPodcastViewModel E0;
    
    public i(final StationsPodcastViewModel e0, final go6<? super i> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final i i = new i(this.E0, (go6<? super i>)go6);
        i.D0 = d0;
        return (go6<fzv>)i;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final i i = (i)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        i.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final lcr$e lcr$e = (lcr$e)this.D0;
        this.E0.O0.a((o1o$a)new o1o$a$g(lcr$e.a, true));
        this.E0.Q((qsb)new i$a(lcr$e));
        return fzv.a;
    }
}
