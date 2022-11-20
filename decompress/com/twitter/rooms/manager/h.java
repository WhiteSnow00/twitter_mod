// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import com.twitter.rooms.di.room.RoomObjectGraph;

public final class h extends ste implements ftb<RoomObjectGraph, vqn, fzv>
{
    public final s7n D0;
    
    public h(final s7n d0) {
        this.D0 = d0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final RoomObjectGraph roomObjectGraph = (RoomObjectGraph)o;
        final vqn vqn = (vqn)o2;
        czd.f((Object)roomObjectGraph, "$this$withCurrentRoomAndState");
        czd.f((Object)vqn, "it");
        final s7n$a a = this.D0.a;
        if (a != null) {
            final g7n a2 = a.a;
            if (a2 != null) {
                b1n.p((nsb)new k7n((i7n)a2));
            }
        }
        return fzv.a;
    }
}
