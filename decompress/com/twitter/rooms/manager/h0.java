// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$switchGuestType$2$1$2", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class h0 extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public Object D0;
    public final boolean E0;
    public final RoomStateManager F0;
    public final int G0;
    
    public h0(final boolean e0, final RoomStateManager f0, final int g0, final go6<? super h0> go6) {
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final h0 h0 = new h0(this.E0, this.F0, this.G0, (go6<? super h0>)go6);
        h0.D0 = d0;
        return (go6<fzv>)h0;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h0 h0 = (h0)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        h0.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final Throwable t = (Throwable)this.D0;
        if (this.E0) {
            vjo.G(this.F0.b1, "periscope", "guest", "automatically_join", "failure", null, 48);
        }
        final RoomStateManager f0 = this.F0;
        final qsb<vqn, vqn> d0 = (qsb<vqn, vqn>)h0$a.D0;
        final RoomStateManager$k0 companion = RoomStateManager.Companion;
        ((MviViewModel)f0).Q((qsb)d0);
        final RoomStateManager f2 = this.F0;
        final int g0 = this.G0;
        final StringBuilder sb = new StringBuilder();
        sb.append("switchGuestType::joinAudioSpace failed ");
        sb.append(g0);
        sb.append("  ");
        sb.append(t);
        RoomStateManager.Z(f2, sb.toString());
        return fzv.a;
    }
}
