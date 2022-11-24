// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

public final class b extends pue implements kub<GuestServiceJoinResponse, v01, z21, q4u<? extends GuestServiceJoinResponse, ? extends v01, ? extends z21>>
{
    public static final b F0;
    
    static {
        F0 = new b();
    }
    
    public b() {
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final GuestServiceJoinResponse guestServiceJoinResponse = (GuestServiceJoinResponse)o;
        final v01 v01 = (v01)o2;
        final z21 z21 = (z21)o3;
        e0e.f((Object)guestServiceJoinResponse, "joinResponse");
        e0e.f((Object)v01, "audioSpace");
        e0e.f((Object)z21, "participants");
        q4u q4u;
        if (vjo.u()) {
            final z21 b = v01.b;
            e0e.c((Object)b);
            q4u = new q4u((Object)guestServiceJoinResponse, (Object)v01, (Object)b);
        }
        else {
            q4u = new q4u((Object)guestServiceJoinResponse, (Object)v01, (Object)z21);
        }
        return q4u;
    }
}
