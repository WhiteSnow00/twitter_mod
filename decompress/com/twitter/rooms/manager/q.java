// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import com.twitter.rooms.di.room.RoomObjectGraph;

public final class q extends ste implements qsb<pyh<vqn, lvj<? extends p01, ? extends ynj<qt3>>>, fzv>
{
    public final RoomStateManager D0;
    public final vqn E0;
    public final boolean F0;
    public final String G0;
    public final RoomObjectGraph H0;
    
    public q(final RoomStateManager d0, final vqn e0, final boolean f0, final String g0, final RoomObjectGraph h0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pyh pyh = (pyh)o;
        czd.f((Object)pyh, "$this$intoWeaver");
        pyh.e((ftb)new o(this.D0, this.E0, this.F0, this.G0, this.H0, null));
        pyh.c((ftb)new p(this.D0, this.E0, null));
        return fzv.a;
    }
}
