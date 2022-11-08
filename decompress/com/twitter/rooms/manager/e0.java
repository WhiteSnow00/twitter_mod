// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

public final class e0 extends gue implements otb<oyv>
{
    public final /* synthetic */ RoomStateManager C0;
    
    public e0(final RoomStateManager c0) {
        this.C0 = c0;
        super(0);
    }
    
    public final Object invoke() {
        gjo.G(this.C0.a1, "event", "heartbeat", "", "success", null, 48);
        return oyv.a;
    }
}
