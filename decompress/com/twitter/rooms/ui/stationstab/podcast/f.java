// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.podcast;

@sa8(c = "com.twitter.rooms.ui.stationstab.podcast.StationsPodcastViewModel$intents$2$4", f = "StationsPodcastViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends p0s implements ftb<lcr$a, go6<? super fzv>, Object>
{
    public final vjo D0;
    public final zbr E0;
    public final StationsPodcastViewModel F0;
    
    public f(final vjo d0, final zbr e0, final StationsPodcastViewModel f0, final go6<? super f> go6) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new f(this.D0, this.E0, this.F0, (go6<? super f>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f f = (f)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        vjo.G(this.D0, "podcast", "", "close", "click", null, 48);
        this.E0.a();
        final StationsPodcastViewModel f0 = this.F0;
        final kcr$a a = kcr$a.a;
        final StationsPodcastViewModel.c companion = StationsPodcastViewModel.Companion;
        f0.V((Object)a);
        return fzv.a;
    }
}
