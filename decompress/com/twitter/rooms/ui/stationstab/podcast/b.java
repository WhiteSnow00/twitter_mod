// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.podcast;

@sa8(c = "com.twitter.rooms.ui.stationstab.podcast.StationsPodcastViewModel$intents$2$1", f = "StationsPodcastViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<lcr$j, go6<? super fzv>, Object>
{
    public final StationsPodcastViewModel D0;
    public final vjo E0;
    public final zbr F0;
    
    public b(final StationsPodcastViewModel d0, final vjo e0, final zbr f0, final go6<? super b> go6) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new b(this.D0, this.E0, this.F0, (go6<? super b>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final StationsPodcastViewModel d0 = this.D0;
        final b$a b$a = new b$a(this.E0, this.F0);
        final StationsPodcastViewModel.c companion = StationsPodcastViewModel.Companion;
        d0.T((qsb)b$a);
        return fzv.a;
    }
}
