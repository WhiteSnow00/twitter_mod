// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.browsing;

@sa8(c = "com.twitter.rooms.ui.topics.browsing.RoomTopicsBrowsingViewModel$2$1", f = "RoomTopicsBrowsingViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<nsm<? extends zo2>, go6<? super fzv>, Object>
{
    public final RoomTopicsBrowsingViewModel D0;
    
    public b(final RoomTopicsBrowsingViewModel d0, final go6<? super b> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new b(this.D0, (go6<? super b>)go6);
    }
    
    public final Object invoke(Object d0, final Object o) {
        d0 = ((nsm)d0).D0;
        final b b = new b(this.D0, (go6<? super b>)o);
        final fzv a = fzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final RoomTopicsBrowsingViewModel d0 = this.D0;
        final b$a d2 = b$a.D0;
        final coe<Object>[] r0 = RoomTopicsBrowsingViewModel.R0;
        d0.Q((qsb)d2);
        return fzv.a;
    }
}
