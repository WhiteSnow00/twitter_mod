// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.creation;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.core.creation.RoomCreationViewModel$intents$2$2", f = "RoomCreationViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends p0s implements ftb<fcn$c, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomCreationViewModel E0;
    
    public d(final RoomCreationViewModel e0, final go6<? super d> go6) {
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
        final fcn$c fcn$c = (fcn$c)this.D0;
        if (fcn$c.a == 0) {
            this.E0.R0.a.onNext((Object)new uzd(gpn.E0, (Integer)null, 6));
        }
        else {
            final RoomCreationViewModel e0 = this.E0;
            final d$a d$a = new d$a(fcn$c);
            final RoomCreationViewModel$h companion = RoomCreationViewModel.Companion;
            ((MviViewModel)e0).Q((qsb)d$a);
        }
        return fzv.a;
    }
}
