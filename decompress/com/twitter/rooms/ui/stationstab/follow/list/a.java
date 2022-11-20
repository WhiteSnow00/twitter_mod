// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.follow.list;

@sa8(c = "com.twitter.rooms.ui.stationstab.follow.list.RoomFollowPodcastViewModel$intents$2$1", f = "RoomFollowPodcastViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements ftb<ejn, go6<? super fzv>, Object>
{
    public final RoomFollowPodcastViewModel D0;
    
    public a(final RoomFollowPodcastViewModel d0, final go6<? super a> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new a(this.D0, (go6<? super a>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (go6<?>)o2);
        final fzv a2 = fzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        final djb f0 = djb.F0;
        b1n.u(o);
        final int ordinal = ((Enum)this.D0.O0.a).ordinal();
        boolean b = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                final RoomFollowPodcastViewModel d0 = this.D0;
                final int ordinal2 = d0.O0.f.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 2) {
                        d0.V((Object)new cjn$a(d0.O0.b));
                    }
                }
                else {
                    d0.W(f0);
                }
            }
        }
        else {
            final RoomFollowPodcastViewModel d2 = this.D0;
            final djb f2 = d2.O0.f;
            czd.f((Object)f2, "<this>");
            if (f2 != f0) {
                b = false;
            }
            djb d3 = f0;
            if (b) {
                d3 = djb.D0;
            }
            d2.W(d3);
        }
        return fzv.a;
    }
}
