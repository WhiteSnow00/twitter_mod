// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.follow.list;

@sa8(c = "com.twitter.rooms.ui.stationstab.follow.list.RoomFollowPodcastViewModel$intents$2$5", f = "RoomFollowPodcastViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends p0s implements ftb<gjn, go6<? super fzv>, Object>
{
    public final RoomFollowPodcastViewModel D0;
    
    public e(final RoomFollowPodcastViewModel d0, final go6<? super e> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new e(this.D0, (go6<? super e>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final Long q = ukr.Q(this.D0.O0.i);
        if (q != null) {
            this.D0.V((Object)new cjn$c(q.longValue()));
        }
        return fzv.a;
    }
}
