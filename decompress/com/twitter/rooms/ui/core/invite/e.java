// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.invite;

import java.util.Map;
import java.util.Set;
import java.util.List;

public final class e extends pue implements stb<mqn, mqn>
{
    public final List<qpn> F0;
    public final Set<lpn> G0;
    
    public e(final List<qpn> f0, final Set<lpn> g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final mqn mqn = (mqn)o;
        e0e.f((Object)mqn, "$this$setState");
        return mqn.l(mqn, (xpn)null, (List)this.F0, (Integer)null, false, (Set)this.G0, (List)null, false, (Set)null, (Map)null, (String)null, (String)null, (String)null, (String)null, (String)null, (Long)null, false, 0, 262107);
    }
}
