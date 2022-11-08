// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import java.util.Map;
import java.util.Set;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;

public final class d extends gue implements rtb<gqn, gqn>
{
    public final /* synthetic */ gqn C0;
    
    public d(final gqn c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gqn gqn = (gqn)o;
        zzd.f((Object)gqn, "$this$setState");
        final llq g = this.C0.G;
        zzd.f((Object)g, "<this>");
        llq llq;
        if (!poa.x(g)) {
            llq = llq.E0;
        }
        else {
            llq = llq.C0;
            if (g == llq) {
                llq = llq.D0;
            }
        }
        return gqn.l(gqn, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, null, null, llq, null, null, false, null, false, false, false, null, null, false, -1, 2046);
    }
}
