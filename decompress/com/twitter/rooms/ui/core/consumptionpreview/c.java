// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import java.util.List;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

public final class c extends gue implements rtb<lh5, ubq<? extends i3u<? extends GuestServiceJoinResponse, ? extends t01, ? extends x21>>>
{
    public final /* synthetic */ t01 C0;
    public final /* synthetic */ GuestServiceJoinResponse D0;
    public final /* synthetic */ x21 E0;
    
    public c(final t01 c0, final GuestServiceJoinResponse d0, final x21 e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final lh5 lh5 = (lh5)o;
        zzd.f((Object)lh5, "community");
        final v21 a = v21.a(this.C0.c, (String)null, (Long)null, false, (String)null, (List)null, false, us5.Companion.a(lh5), -1, 786431);
        final GuestServiceJoinResponse d0 = this.D0;
        final t01 c0 = this.C0;
        zzd.e((Object)c0, "audioSpace");
        return n9q.v((Object)new i3u((Object)d0, (Object)t01.a(c0, a), (Object)this.E0));
    }
}
