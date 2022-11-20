// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.speakers;

@sa8(c = "com.twitter.rooms.ui.core.speakers.RoomManageSpeakersViewModel$intents$2$4", f = "RoomManageSpeakersViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends p0s implements ftb<fqn.c, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomManageSpeakersViewModel E0;
    
    public e(final RoomManageSpeakersViewModel e0, final go6<? super e> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final e e = new e(this.E0, (go6<? super e>)go6);
        e.D0 = d0;
        return (go6<fzv>)e;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final fqn.c c = (fqn.c)this.D0;
        vjo.G(this.E0.T0, "guests", "cohost", "remove_from_admins_confirm", "click", null, 48);
        final String string = this.E0.O0.getResources().getString(2131958299, new Object[] { c.c });
        czd.e((Object)string, "context.resources.getStr\u2026    it.name\n            )");
        this.E0.U0.a((vmj)new vmj.h(string, new Integer(62), false, 4));
        this.E0.S0.a.onNext((Object)new jnn$a$h(c.a, c.b));
        RoomManageSpeakersViewModel.W(this.E0);
        return fzv.a;
    }
}
