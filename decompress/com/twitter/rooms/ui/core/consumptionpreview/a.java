// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import tv.periscope.model.NarrowcastSpaceType;
import java.util.List;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;

public final class a extends pue implements stb<dbn, dbn>
{
    public final Set<RoomUserItem> F0;
    public final Set<RoomUserItem> G0;
    public final Set<RoomUserItem> H0;
    
    public a(final Set<RoomUserItem> f0, final Set<RoomUserItem> g0, final Set<RoomUserItem> h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final dbn dbn = (dbn)o;
        e0e.f((Object)dbn, "$this$setState");
        return dbn.l(dbn, null, null, this.F0, this.G0, this.H0, null, null, null, 0, false, null, false, null, 0, null, null, null, false, false, false, false, false, null, false, false, null, null, 536870799);
    }
}
