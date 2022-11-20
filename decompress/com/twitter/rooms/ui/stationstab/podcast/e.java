// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.podcast;

@sa8(c = "com.twitter.rooms.ui.stationstab.podcast.StationsPodcastViewModel$intents$2$3", f = "StationsPodcastViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends p0s implements ftb<lcr$h, go6<? super fzv>, Object>
{
    public final vjo D0;
    public final StationsPodcastViewModel E0;
    
    public e(final vjo d0, final StationsPodcastViewModel e0, final go6<? super e> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new e(this.D0, this.E0, (go6<? super e>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        vjo.G(this.D0, "podcast", "podcast_episode", "skip_back", "click", null, 48);
        this.E0.O0.a.onNext((Object)o1o$a$h.a);
        return fzv.a;
    }
}
