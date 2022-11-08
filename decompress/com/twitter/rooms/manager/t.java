// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Map;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;

public final class t extends gue implements rtb<gqn, gqn>
{
    public final /* synthetic */ x21 C0;
    public final /* synthetic */ Set<RoomUserItem> D0;
    public final /* synthetic */ Set<RoomUserItem> E0;
    public final /* synthetic */ Map<String, gvj<RoomUserItem, Long>> F0;
    public final /* synthetic */ Map<Long, Long> G0;
    
    public t(final x21 c0, final Set<RoomUserItem> d0, final Set<RoomUserItem> e0, final Map<String, gvj<RoomUserItem, Long>> f0, final Map<Long, Long> g0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gqn gqn = (gqn)o;
        zzd.f((Object)gqn, "$this$setState");
        return gqn.l(gqn, null, null, false, null, null, null, null, null, null, null, null, this.D0, this.E0, null, null, null, this.F0, this.G0, this.C0.b(), this.C0.d, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -989185, 2047);
    }
}
