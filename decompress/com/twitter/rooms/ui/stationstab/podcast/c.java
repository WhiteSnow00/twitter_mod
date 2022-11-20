// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.podcast;

@sa8(c = "com.twitter.rooms.ui.stationstab.podcast.StationsPodcastViewModel$intents$2$10", f = "StationsPodcastViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends p0s implements ftb<lcr$g, go6<? super fzv>, Object>
{
    public Object D0;
    public final vjo E0;
    public final StationsPodcastViewModel F0;
    
    public c(final vjo e0, final StationsPodcastViewModel f0, final go6<? super c> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final c c = new c(this.E0, this.F0, (go6<? super c>)go6);
        c.D0 = d0;
        return (go6<fzv>)c;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c c = (c)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final qqp a = ((lcr$g)this.D0).a;
        if (czd.a((Object)a, (Object)qqp.l.b)) {
            vjo.G(this.E0, "podcast", "caret", "report_podcast_copyright", "click", null, 48);
            final StationsPodcastViewModel f0 = this.F0;
            final kcr$c a2 = kcr$c.a;
            final StationsPodcastViewModel.c companion = StationsPodcastViewModel.Companion;
            f0.V((Object)a2);
        }
        else if (czd.a((Object)a, (Object)qqp.m.b)) {
            final StationsPodcastViewModel f2 = this.F0;
            final c$a c$a = new c$a(f2);
            final StationsPodcastViewModel.c companion2 = StationsPodcastViewModel.Companion;
            f2.T((qsb)c$a);
        }
        return fzv.a;
    }
}
