// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Map;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;

public final class t extends ste implements qsb<vqn, vqn>
{
    public final t21 D0;
    public final Set<RoomUserItem> E0;
    public final Set<RoomUserItem> F0;
    public final Map<String, lvj<RoomUserItem, Long>> G0;
    public final Map<Long, Long> H0;
    
    public t(final t21 d0, final Set<RoomUserItem> e0, final Set<RoomUserItem> f0, final Map<String, lvj<RoomUserItem, Long>> g0, final Map<Long, Long> h0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "$this$setState");
        return vqn.l(vqn, null, null, false, null, null, null, null, null, null, null, null, this.E0, this.F0, null, null, null, this.G0, this.H0, this.D0.b(), this.D0.d, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -989185, 2047);
    }
}
