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

public final class u extends gue implements rtb<gqn, gqn>
{
    public final /* synthetic */ boolean C0;
    public final /* synthetic */ gqn D0;
    public final /* synthetic */ List<RoomUserItem> E0;
    public final /* synthetic */ List<RoomUserItem> F0;
    
    public u(final boolean c0, final gqn d0, final List<RoomUserItem> e0, final List<RoomUserItem> f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gqn gqn = (gqn)o;
        zzd.f((Object)gqn, "$this$setState");
        return gqn.l(gqn, null, null, this.C0 || (zzd.a((Object)gqn.A, (Object)Boolean.TRUE) && !tdy.V(this.D0)), null, null, null, null, null, null, null, null, null, or4.r2((Iterable)this.E0), or4.r2((Iterable)this.F0), null, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -12293, 2047);
    }
}
