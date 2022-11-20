// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import com.twitter.rooms.di.room.RoomObjectGraph;

public final class j0 extends ste implements qsb<vqn, fzv>
{
    public final ftb<RoomObjectGraph, vqn, fzv> D0;
    public final RoomObjectGraph E0;
    
    public j0(final ftb<? super RoomObjectGraph, ? super vqn, fzv> d0, final RoomObjectGraph e0) {
        this.D0 = (ftb<RoomObjectGraph, vqn, fzv>)d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "state");
        this.D0.invoke((Object)this.E0, (Object)vqn);
        return fzv.a;
    }
}
