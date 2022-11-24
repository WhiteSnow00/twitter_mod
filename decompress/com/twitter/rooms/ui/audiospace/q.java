// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

public final class q extends pue implements stb<gzh<l7n, vzv>, vzv>
{
    public final RoomAudioSpaceViewModel F0;
    public final t1n.i G0;
    
    public q(final RoomAudioSpaceViewModel f0, final t1n.i g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gzh gzh = (gzh)o;
        e0e.f((Object)gzh, "$this$intoWeaver");
        gzh.e((hub)new o(this.F0, this.G0, (mp6)null));
        gzh.c((hub)new p(this.F0, (mp6)null));
        return vzv.a;
    }
}
