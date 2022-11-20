// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.manager.RoomStateManager;
import java.util.Objects;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$16$1$1$1", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class o extends p0s implements ftb<fzv, go6<? super fzv>, Object>
{
    public final RoomAudioSpaceViewModel D0;
    public final d1n$i E0;
    
    public o(final RoomAudioSpaceViewModel d0, final d1n$i e0, final go6<? super o> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new o(this.D0, this.E0, (go6<? super o>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final o o3 = (o)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        o3.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final RoomStateManager q0 = this.D0.Q0;
        final String a = this.E0.a;
        Objects.requireNonNull(q0);
        czd.f((Object)a, "description");
        ((MviViewModel)q0).T((qsb)new fco(q0, a));
        return fzv.a;
    }
}
