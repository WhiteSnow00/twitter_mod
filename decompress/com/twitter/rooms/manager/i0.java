// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

public final class i0 extends gue implements rtb<oyh<gqn, GuestServiceJoinResponse>, oyv>
{
    public final /* synthetic */ RoomStateManager C0;
    public final /* synthetic */ int D0;
    public final /* synthetic */ boolean E0;
    public final /* synthetic */ String F0;
    
    public i0(final RoomStateManager c0, final int d0, final boolean e0, final String f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final oyh oyh = (oyh)o;
        zzd.f((Object)oyh, "$this$intoWeaver");
        oyh.e((gub)new g0(this.C0, this.D0, this.E0, this.F0, (ap6)null));
        oyh.c((gub)new h0(this.E0, this.C0, this.D0, (ap6)null));
        return oyv.a;
    }
}
