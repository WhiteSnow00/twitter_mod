// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import com.twitter.rooms.di.room.RoomObjectGraph;

public final class j0 extends gue implements rtb<gqn, oyv>
{
    public final /* synthetic */ gub<RoomObjectGraph, gqn, oyv> C0;
    public final /* synthetic */ RoomObjectGraph D0;
    
    public j0(final gub<? super RoomObjectGraph, ? super gqn, oyv> c0, final RoomObjectGraph d0) {
        this.C0 = (gub<RoomObjectGraph, gqn, oyv>)c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gqn gqn = (gqn)o;
        zzd.f((Object)gqn, "state");
        this.C0.invoke((Object)this.D0, (Object)gqn);
        return oyv.a;
    }
}
