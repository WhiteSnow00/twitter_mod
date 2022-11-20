// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.topics.browsing;

import java.util.Objects;

@sa8(c = "com.twitter.rooms.ui.topics.browsing.RoomTopicCategoryViewModel$intents$2$1", f = "RoomTopicCategoryViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements ftb<mfo$a, go6<? super fzv>, Object>
{
    public final RoomTopicCategoryViewModel D0;
    
    public a(final RoomTopicCategoryViewModel d0, final go6<? super a> go6) {
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
        b1n.u(o);
        final RoomTopicCategoryViewModel d0 = this.D0;
        final a$a a$a = new a$a(d0);
        final RoomTopicCategoryViewModel.b companion = RoomTopicCategoryViewModel.Companion;
        d0.T((qsb)a$a);
        final RoomTopicCategoryViewModel d2 = this.D0;
        final jfo p = d2.P0;
        final String d3 = d2.O0.d;
        Objects.requireNonNull(p);
        czd.f((Object)d3, "categoryTopicId");
        ((t9a)p).a.onNext((Object)d3);
        return fzv.a;
    }
}
