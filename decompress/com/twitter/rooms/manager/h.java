// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import com.twitter.rooms.di.room.RoomObjectGraph;

public final class h extends gue implements gub<RoomObjectGraph, gqn, oyv>
{
    public final /* synthetic */ d7n C0;
    
    public h(final d7n c0) {
        this.C0 = c0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final RoomObjectGraph roomObjectGraph = (RoomObjectGraph)o;
        final gqn gqn = (gqn)o2;
        zzd.f((Object)roomObjectGraph, "$this$withCurrentRoomAndState");
        zzd.f((Object)gqn, "it");
        final d7n.a a = this.C0.a;
        if (a != null) {
            final r6n a2 = a.a;
            if (a2 != null) {
                kq9.Y0((otb)new v6n((t6n)a2));
            }
        }
        return oyv.a;
    }
}
