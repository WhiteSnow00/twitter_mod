// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

public final class d extends pue implements stb<q4u<? extends GuestServiceJoinResponse, ? extends v01, ? extends z21>, idq<? extends q4u<? extends GuestServiceJoinResponse, ? extends v01, ? extends z21>>>
{
    public final RoomConsumptionPreviewViewModel F0;
    
    public d(final RoomConsumptionPreviewViewModel f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final q4u q4u = (q4u)o;
        e0e.f((Object)q4u, "<name for destructuring parameter 0>");
        final GuestServiceJoinResponse guestServiceJoinResponse = (GuestServiceJoinResponse)q4u.F0;
        final v01 v01 = (v01)q4u.G0;
        final z21 z21 = (z21)q4u.H0;
        if (!vjo.u()) {
            final String z22 = v01.c.Z;
            if (z22 != null) {
                return this.F0.b1.I(z22).p((rtb)new d6i((stb)new c(v01, guestServiceJoinResponse, z21), 27));
            }
        }
        return bbq.v((Object)new q4u((Object)guestServiceJoinResponse, (Object)v01, (Object)z21));
    }
}
