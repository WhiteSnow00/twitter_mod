// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.Map;
import java.util.Set;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.List;

public final class u extends ste implements qsb<vqn, vqn>
{
    public final boolean D0;
    public final vqn E0;
    public final List<RoomUserItem> F0;
    public final List<RoomUserItem> G0;
    
    public u(final boolean d0, final vqn e0, final List<RoomUserItem> f0, final List<RoomUserItem> g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "$this$setState");
        return vqn.l(vqn, null, null, this.D0 || (czd.a((Object)vqn.A, (Object)Boolean.TRUE) && !blz.I(this.E0)), null, null, null, null, null, null, null, null, null, mq4.R0((Iterable)this.F0), mq4.R0((Iterable)this.G0), null, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -12293, 2047);
    }
}
