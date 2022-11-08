// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.Map;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Set;

public final class a extends gue implements rtb<gqn, gqn>
{
    public final /* synthetic */ Set<hon> C0;
    public final /* synthetic */ String D0;
    
    public a(final Set<hon> c0, final String d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gqn gqn = (gqn)o;
        zzd.f((Object)gqn, "$this$setState");
        final Set<hon> c0 = this.C0;
        final String d0 = this.D0;
        zzd.e((Object)d0, "twitterUserId");
        return gqn.l(gqn, null, null, false, null, null, null, null, null, null, null, ymp.b0((Set)c0, (Object)new hon(d0, 30)), null, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -1025, 2047);
    }
}
