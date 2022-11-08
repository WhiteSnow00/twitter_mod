// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import tv.periscope.model.NarrowcastSpaceType;
import java.util.List;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;

public final class a extends gue implements rtb<y9n, y9n>
{
    public final /* synthetic */ Set<RoomUserItem> C0;
    public final /* synthetic */ Set<RoomUserItem> D0;
    public final /* synthetic */ Set<RoomUserItem> E0;
    
    public a(final Set<RoomUserItem> c0, final Set<RoomUserItem> d0, final Set<RoomUserItem> e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final y9n y9n = (y9n)o;
        zzd.f((Object)y9n, "$this$setState");
        return y9n.l(y9n, (String)null, (pf3)null, (Set)this.C0, (Set)this.D0, (Set)this.E0, (String)null, (String)null, (Long)null, 0, false, (String)null, false, (String)null, 0, (mos)null, (knl)null, (List)null, false, false, false, false, false, (NarrowcastSpaceType)null, false, false, (elu)null, (lh5)null, 536870799);
    }
}
