// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.invite;

import java.util.Map;
import java.util.Set;
import java.util.List;

public final class e extends ste implements qsb<wpn, wpn>
{
    public final List<zon> D0;
    public final Set<uon> E0;
    
    public e(final List<zon> d0, final Set<uon> e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final wpn wpn = (wpn)o;
        czd.f((Object)wpn, "$this$setState");
        return wpn.l(wpn, (gpn)null, (List)this.D0, (Integer)null, false, (Set)this.E0, (List)null, false, (Set)null, (Map)null, (String)null, (String)null, (String)null, (String)null, (String)null, (Long)null, false, 0, 262107);
    }
}
