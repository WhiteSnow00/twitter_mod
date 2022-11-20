// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.Map;
import java.util.Set;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;

public final class d extends ste implements qsb<vqn, vqn>
{
    public final vqn D0;
    
    public d(final vqn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "$this$setState");
        final fmq g = this.D0.G;
        czd.f((Object)g, "<this>");
        fmq fmq;
        if (!xli.z(g)) {
            fmq = fmq.F0;
        }
        else {
            fmq = fmq.D0;
            if (g == fmq) {
                fmq = fmq.E0;
            }
        }
        return vqn.l(vqn, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, null, null, fmq, null, null, false, null, false, false, false, null, null, false, -1, 2046);
    }
}
