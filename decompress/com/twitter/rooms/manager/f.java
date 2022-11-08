// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.Map;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import com.twitter.rooms.model.helpers.CohostInvite;
import java.util.Set;

public final class f extends gue implements rtb<gqn, gqn>
{
    public final /* synthetic */ Set<CohostInvite> C0;
    public final /* synthetic */ Integer D0;
    
    public f(final Set<CohostInvite> c0, final Integer d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gqn gqn = (gqn)o;
        zzd.f((Object)gqn, "$this$setState");
        return gqn.l(gqn, null, null, false, null, null, null, null, null, null, null, null, null, null, null, this.C0, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, this.D0, null, null, null, null, false, null, false, false, false, null, null, false, -1073758209, 2047);
    }
}
