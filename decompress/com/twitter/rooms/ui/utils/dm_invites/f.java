// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.dm_invites;

import java.util.Map;
import java.util.Set;
import java.util.List;

public final class f extends ste implements qsb<vdn, vdn>
{
    public final List<yon> D0;
    public final Set<ton> E0;
    
    public f(final List<yon> d0, final Set<ton> e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vdn vdn = (vdn)o;
        czd.f((Object)vdn, "$this$setState");
        return vdn.l(vdn, null, this.D0, null, false, this.E0, null, false, null, null, 987);
    }
}
