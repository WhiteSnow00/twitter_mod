// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.schedule.edit;

import java.util.Set;
import java.util.Calendar;

public final class b extends ste implements qsb<g5o, g5o>
{
    public final RoomScheduledSpaceEditViewModel D0;
    public final g5o E0;
    
    public b(final RoomScheduledSpaceEditViewModel d0, final g5o e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final g5o g5o = (g5o)o;
        czd.f((Object)g5o, "$this$setState");
        this.D0.R0.M();
        final boolean b = this.E0.f ^ true;
        return g5o.l(g5o, (Calendar)null, RoomScheduledSpaceEditViewModel.W(this.D0, g5o, null, null, null, b, 7), (Set)null, b, 87);
    }
}
