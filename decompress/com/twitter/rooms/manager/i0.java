// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

public final class i0 extends ste implements qsb<pyh<vqn, GuestServiceJoinResponse>, fzv>
{
    public final RoomStateManager D0;
    public final int E0;
    public final boolean F0;
    public final String G0;
    
    public i0(final RoomStateManager d0, final int e0, final boolean f0, final String g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pyh pyh = (pyh)o;
        czd.f((Object)pyh, "$this$intoWeaver");
        pyh.e((ftb)new g0(this.D0, this.E0, this.F0, this.G0, null));
        pyh.c((ftb)new h0(this.F0, this.D0, this.E0, null));
        return fzv.a;
    }
}
