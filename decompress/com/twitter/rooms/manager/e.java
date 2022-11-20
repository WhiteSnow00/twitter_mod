// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.Set;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Map;

public final class e extends ste implements qsb<vqn, vqn>
{
    public final Map<String, Integer> D0;
    
    public e(final Map<String, Integer> d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "$this$setState");
        return vqn.l(vqn, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, this.D0, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -32769, 2047);
    }
}
