// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.speakers;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.core.speakers.RoomManageSpeakersViewModel$intents$2$3", f = "RoomManageSpeakersViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends p0s implements ftb<fqn.e, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomManageSpeakersViewModel E0;
    
    public d(final RoomManageSpeakersViewModel e0, final go6<? super d> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final d d2 = new d(this.E0, (go6<? super d>)go6);
        d2.D0 = d0;
        return (go6<fzv>)d2;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final fqn.e e = (fqn.e)this.D0;
        final RoomManageSpeakersViewModel e2 = this.E0;
        final d$a d$a = new d$a(e);
        final RoomManageSpeakersViewModel.d0 companion = RoomManageSpeakersViewModel.Companion;
        ((MviViewModel)e2).Q((qsb)d$a);
        return fzv.a;
    }
}
