// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.speakers.adapter.users;

import java.util.Objects;

@sa8(c = "com.twitter.rooms.ui.core.speakers.adapter.users.UserItemViewModel$intents$2$3", f = "UserItemViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends p0s implements ftb<rdw$e, go6<? super fzv>, Object>
{
    public final UserItemViewModel D0;
    public final eig$c E0;
    
    public c(final UserItemViewModel d0, final eig$c e0, final go6<? super c> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new c(this.D0, this.E0, (go6<? super c>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c c = (c)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final gig o2 = this.D0.O0;
        final eig$c e0 = this.E0;
        Objects.requireNonNull(o2);
        czd.f((Object)e0, "user");
        o2.a.onNext((Object)new gig$a$g(e0.b));
        return fzv.a;
    }
}
