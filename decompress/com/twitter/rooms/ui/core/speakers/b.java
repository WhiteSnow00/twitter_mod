// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.speakers;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.core.speakers.RoomManageSpeakersViewModel$intents$2$1", f = "RoomManageSpeakersViewModel.kt", l = {}, m = "invokeSuspend")
public final class b extends p0s implements ftb<fqn.b, go6<? super fzv>, Object>
{
    public final RoomManageSpeakersViewModel D0;
    
    public b(final RoomManageSpeakersViewModel d0, final go6<? super b> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new b(this.D0, (go6<? super b>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final b b = (b)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        b.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        this.D0.P0.a();
        ((MviViewModel)this.D0).V((Object)dqn$b.a);
        return fzv.a;
    }
}
