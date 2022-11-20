// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

public final class e0 extends ste implements nsb<fzv>
{
    public final RoomStateManager D0;
    
    public e0(final RoomStateManager d0) {
        this.D0 = d0;
        super(0);
    }
    
    public final Object invoke() {
        vjo.G(this.D0.b1, "event", "heartbeat", "", "success", null, 48);
        return fzv.a;
    }
}
