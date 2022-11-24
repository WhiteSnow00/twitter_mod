// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import java.util.List;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

public final class c extends pue implements stb<yh5, idq<? extends q4u<? extends GuestServiceJoinResponse, ? extends v01, ? extends z21>>>
{
    public final v01 F0;
    public final GuestServiceJoinResponse G0;
    public final z21 H0;
    
    public c(final v01 f0, final GuestServiceJoinResponse g0, final z21 h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final yh5 yh5 = (yh5)o;
        e0e.f((Object)yh5, "community");
        final x21 a = x21.a(this.F0.c, (String)null, (Long)null, false, (String)null, (List)null, false, jt5.Companion.a(yh5), -1, 786431);
        final GuestServiceJoinResponse g0 = this.G0;
        final v01 f0 = this.F0;
        e0e.e((Object)f0, "audioSpace");
        return bbq.v((Object)new q4u((Object)g0, (Object)v01.a(f0, a), (Object)this.H0));
    }
}
