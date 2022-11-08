// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

public final class d extends gue implements rtb<i3u<? extends GuestServiceJoinResponse, ? extends t01, ? extends x21>, ubq<? extends i3u<? extends GuestServiceJoinResponse, ? extends t01, ? extends x21>>>
{
    public final /* synthetic */ RoomConsumptionPreviewViewModel C0;
    
    public d(final RoomConsumptionPreviewViewModel c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final i3u i3u = (i3u)o;
        zzd.f((Object)i3u, "<name for destructuring parameter 0>");
        final GuestServiceJoinResponse guestServiceJoinResponse = (GuestServiceJoinResponse)i3u.C0;
        final t01 t01 = (t01)i3u.D0;
        final x21 x21 = (x21)i3u.E0;
        if (!oio.u()) {
            final String z = t01.c.Z;
            if (z != null) {
                return this.C0.Y0.I(z).p((qtb)new q3m((rtb)new c(t01, guestServiceJoinResponse, x21), 26));
            }
        }
        return n9q.v((Object)new i3u((Object)guestServiceJoinResponse, (Object)t01, (Object)x21));
    }
}
