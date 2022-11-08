// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import com.twitter.rooms.di.room.RoomObjectGraph;

public final class g extends gue implements gub<RoomObjectGraph, gqn, oyv>
{
    public static final g C0;
    
    static {
        C0 = new g();
    }
    
    public g() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final RoomObjectGraph roomObjectGraph = (RoomObjectGraph)o;
        final gqn gqn = (gqn)o2;
        zzd.f((Object)roomObjectGraph, "$this$withCurrentRoomAndState");
        zzd.f((Object)gqn, "it");
        roomObjectGraph.h0().o();
        return oyv.a;
    }
}
