// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.browsing;

@sa8(c = "com.twitter.rooms.ui.topics.browsing.RoomTopicsBrowsingViewModel$2$2", f = "RoomTopicsBrowsingViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends p0s implements qsb<go6<? super fzv>, Object>
{
    public final RoomTopicsBrowsingViewModel D0;
    
    public c(final RoomTopicsBrowsingViewModel d0, final go6<? super c> go6) {
        this.D0 = d0;
        super(1, (go6)go6);
    }
    
    public final go6<fzv> create(final go6<?> go6) {
        return (go6<fzv>)new c(this.D0, (go6<? super c>)go6);
    }
    
    public final Object invoke(final Object o) {
        final c c = (c)this.create((go6<?>)o);
        final fzv a = fzv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final RoomTopicsBrowsingViewModel d0 = this.D0;
        final c$a d2 = c$a.D0;
        final coe<Object>[] r0 = RoomTopicsBrowsingViewModel.R0;
        d0.Q((qsb)d2);
        return fzv.a;
    }
}
