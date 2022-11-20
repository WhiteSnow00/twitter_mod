// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.replay;

public final class z extends ste implements qsb<pyh<d0o, String>, fzv>
{
    public final RoomReplayConsumptionViewModel D0;
    public final d0o E0;
    
    public z(final RoomReplayConsumptionViewModel d0, final d0o e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pyh pyh = (pyh)o;
        czd.f((Object)pyh, "$this$intoWeaver");
        pyh.e((ftb)new y(this.D0, this.E0, (go6)null));
        return fzv.a;
    }
}
