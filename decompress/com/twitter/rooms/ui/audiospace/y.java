// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

public final class y extends pue implements stb<gzh<l7n, String>, vzv>
{
    public final RoomAudioSpaceViewModel F0;
    public final l7n G0;
    
    public y(final RoomAudioSpaceViewModel f0, final l7n g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gzh gzh = (gzh)o;
        e0e.f((Object)gzh, "$this$intoWeaver");
        gzh.e((hub)new x(this.F0, this.G0, (mp6)null));
        return vzv.a;
    }
}
