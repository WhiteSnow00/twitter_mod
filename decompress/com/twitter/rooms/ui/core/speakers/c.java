// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.speakers;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.core.speakers.RoomManageSpeakersViewModel$intents$2$2", f = "RoomManageSpeakersViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends p0s implements ftb<fqn.d, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomManageSpeakersViewModel E0;
    
    public c(final RoomManageSpeakersViewModel e0, final go6<? super c> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final c c = new c(this.E0, (go6<? super c>)go6);
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
        final fqn.d d = (fqn.d)this.D0;
        final RoomManageSpeakersViewModel e0 = this.E0;
        final c$a c$a = new c$a(d);
        final RoomManageSpeakersViewModel.d0 companion = RoomManageSpeakersViewModel.Companion;
        ((MviViewModel)e0).Q((qsb)c$a);
        return fzv.a;
    }
}
