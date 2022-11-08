// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.Map;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;

public final class w extends gue implements rtb<gqn, gqn>
{
    public final /* synthetic */ Set<RoomUserItem> C0;
    public final /* synthetic */ Set<RoomUserItem> D0;
    
    public w(final Set<RoomUserItem> c0, final Set<RoomUserItem> d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gqn gqn = (gqn)o;
        zzd.f((Object)gqn, "$this$setState");
        return gqn.l(gqn, null, null, false, null, null, null, null, null, null, null, null, null, this.C0, this.D0, null, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -12289, 2047);
    }
}
