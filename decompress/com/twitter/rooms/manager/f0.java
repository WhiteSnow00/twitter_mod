// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import com.twitter.rooms.di.room.RoomObjectGraph;

public final class f0 extends ste implements nsb<fzv>
{
    public final RoomStateManager D0;
    public final RoomObjectGraph E0;
    public final String F0;
    
    public f0(final RoomStateManager d0, final RoomObjectGraph e0, final String f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(0);
    }
    
    public final Object invoke() {
        this.D0.k0(this.E0, this.F0);
        return fzv.a;
    }
}
