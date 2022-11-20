// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.Map;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Set;

public final class a extends ste implements qsb<vqn, vqn>
{
    public final Set<uon> D0;
    public final String E0;
    
    public a(final Set<uon> d0, final String e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "$this$setState");
        final Set<uon> d0 = this.D0;
        final String e0 = this.E0;
        czd.e((Object)e0, "twitterUserId");
        return vqn.l(vqn, null, null, false, null, null, null, null, null, null, null, onp.b1((Set)d0, (Object)new uon(e0, 30)), null, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -1025, 2047);
    }
}
