// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.podcast;

@sa8(c = "com.twitter.rooms.ui.stationstab.podcast.StationsPodcastViewModel$intents$2$9", f = "StationsPodcastViewModel.kt", l = {}, m = "invokeSuspend")
public final class k extends p0s implements ftb<lcr$b, go6<? super fzv>, Object>
{
    public final StationsPodcastViewModel D0;
    
    public k(final StationsPodcastViewModel d0, final go6<? super k> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new k(this.D0, (go6<? super k>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final k k = (k)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        k.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final StationsPodcastViewModel d0 = this.D0;
        final kcr$b a = kcr$b.a;
        final StationsPodcastViewModel.c companion = StationsPodcastViewModel.Companion;
        d0.V((Object)a);
        return fzv.a;
    }
}
