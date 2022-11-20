// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.Map;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import com.twitter.rooms.model.helpers.CohostInvite;
import java.util.Set;

public final class f extends ste implements qsb<vqn, vqn>
{
    public final Set<CohostInvite> D0;
    public final Integer E0;
    
    public f(final Set<CohostInvite> d0, final Integer e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "$this$setState");
        return vqn.l(vqn, null, null, false, null, null, null, null, null, null, null, null, null, null, null, this.D0, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, this.E0, null, null, null, null, false, null, false, false, false, null, null, false, -1073758209, 2047);
    }
}
