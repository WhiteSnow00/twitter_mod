// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.replay;

import tv.periscope.model.NarrowcastSpaceType;
import java.util.Set;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.concurrent.TimeUnit;

public final class s extends ste implements qsb<d0o, d0o>
{
    public final d0o D0;
    
    public s(final d0o d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final d0o d0o = (d0o)o;
        czd.f((Object)d0o, "$this$setState");
        return d0o.l(d0o, false, false, false, (String)null, (String)null, (String)null, (String)null, (String)null, (String)null, (Long)null, (String)null, (nmk)null, 0L, 0L, 0L, false, false, (RoomUserItem)null, (RoomUserItem)null, false, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.D0.p)), false, false, false, false, false, false, (Set)null, (String)null, (NarrowcastSpaceType)null, -8388609, 7);
    }
}
