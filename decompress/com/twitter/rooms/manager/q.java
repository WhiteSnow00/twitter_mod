// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import com.twitter.rooms.di.room.RoomObjectGraph;

public final class q extends gue implements rtb<oyh<gqn, gvj<? extends t01, ? extends snj<iu3>>>, oyv>
{
    public final /* synthetic */ RoomStateManager C0;
    public final /* synthetic */ gqn D0;
    public final /* synthetic */ boolean E0;
    public final /* synthetic */ String F0;
    public final /* synthetic */ RoomObjectGraph G0;
    
    public q(final RoomStateManager c0, final gqn d0, final boolean e0, final String f0, final RoomObjectGraph g0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final oyh oyh = (oyh)o;
        zzd.f((Object)oyh, "$this$intoWeaver");
        oyh.e((gub)new o(this.C0, this.D0, this.E0, this.F0, this.G0, (ap6)null));
        oyh.c((gub)new p(this.C0, this.D0, (ap6)null));
        return oyv.a;
    }
}
