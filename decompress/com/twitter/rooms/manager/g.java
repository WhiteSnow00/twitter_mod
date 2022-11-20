// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import com.twitter.rooms.di.room.RoomObjectGraph;

public final class g extends ste implements ftb<RoomObjectGraph, vqn, fzv>
{
    public static final g D0;
    
    static {
        D0 = new g();
    }
    
    public g() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final RoomObjectGraph roomObjectGraph = (RoomObjectGraph)o;
        final vqn vqn = (vqn)o2;
        czd.f((Object)roomObjectGraph, "$this$withCurrentRoomAndState");
        czd.f((Object)vqn, "it");
        roomObjectGraph.h0().n();
        return fzv.a;
    }
}
