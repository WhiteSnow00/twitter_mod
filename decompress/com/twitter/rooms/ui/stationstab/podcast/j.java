// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.podcast;

@sa8(c = "com.twitter.rooms.ui.stationstab.podcast.StationsPodcastViewModel$intents$2$8", f = "StationsPodcastViewModel.kt", l = {}, m = "invokeSuspend")
public final class j extends p0s implements ftb<lcr$d, go6<? super fzv>, Object>
{
    public final vjo D0;
    public final StationsPodcastViewModel E0;
    
    public j(final vjo d0, final StationsPodcastViewModel e0, final go6<? super j> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new j(this.D0, this.E0, (go6<? super j>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final j j = (j)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        j.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        vjo.G(this.D0, "podcast", "caret", "", "impression", null, 48);
        final StationsPodcastViewModel e0 = this.E0;
        final kcr$e a = kcr$e.a;
        final StationsPodcastViewModel.c companion = StationsPodcastViewModel.Companion;
        e0.V((Object)a);
        return fzv.a;
    }
}
