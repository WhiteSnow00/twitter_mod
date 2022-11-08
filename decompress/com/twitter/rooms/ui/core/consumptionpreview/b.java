// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

public final class b extends gue implements jub<GuestServiceJoinResponse, t01, x21, i3u<? extends GuestServiceJoinResponse, ? extends t01, ? extends x21>>
{
    public static final b C0;
    
    static {
        C0 = new b();
    }
    
    public b() {
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final GuestServiceJoinResponse guestServiceJoinResponse = (GuestServiceJoinResponse)o;
        final t01 t01 = (t01)o2;
        final x21 x21 = (x21)o3;
        zzd.f((Object)guestServiceJoinResponse, "joinResponse");
        zzd.f((Object)t01, "audioSpace");
        zzd.f((Object)x21, "participants");
        i3u i3u;
        if (oio.u()) {
            final x21 b = t01.b;
            zzd.c((Object)b);
            i3u = new i3u((Object)guestServiceJoinResponse, (Object)t01, (Object)b);
        }
        else {
            i3u = new i3u((Object)guestServiceJoinResponse, (Object)t01, (Object)x21);
        }
        return i3u;
    }
}
