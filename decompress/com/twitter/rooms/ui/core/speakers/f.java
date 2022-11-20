// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.speakers;

@sa8(c = "com.twitter.rooms.ui.core.speakers.RoomManageSpeakersViewModel$intents$2$5", f = "RoomManageSpeakersViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends p0s implements ftb<fqn.a, go6<? super fzv>, Object>
{
    public final RoomManageSpeakersViewModel D0;
    
    public f(final RoomManageSpeakersViewModel d0, final go6<? super f> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new f(this.D0, (go6<? super f>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f f = (f)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        vjo.G(this.D0.T0, "guests", "cohost", "remove_from_admins_cancel", "click", null, 48);
        return fzv.a;
    }
}
