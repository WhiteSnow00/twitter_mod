// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.speakers.adapter.users;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.core.speakers.adapter.users.UserItemViewModel$intents$2$7", f = "UserItemViewModel.kt", l = {}, m = "invokeSuspend")
public final class g extends p0s implements ftb<rdw$a, go6<? super fzv>, Object>
{
    public final UserItemViewModel D0;
    
    public g(final UserItemViewModel d0, final go6<? super g> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new g(this.D0, (go6<? super g>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final g g = (g)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        g.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final UserItemViewModel d0 = this.D0;
        final g$a g$a = new g$a(d0);
        final coe[] u0 = UserItemViewModel.U0;
        ((MviViewModel)d0).T((qsb)g$a);
        return fzv.a;
    }
}
