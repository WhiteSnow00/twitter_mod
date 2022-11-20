// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.schedule.multi;

import tv.periscope.android.api.PsCancelScheduledAudioBroadcastResponse;

public final class h extends ste implements qsb<pyh<vvo, PsCancelScheduledAudioBroadcastResponse>, fzv>
{
    public final ScheduledSpaceItemViewModel D0;
    public final vvo E0;
    
    public h(final ScheduledSpaceItemViewModel d0, final vvo e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pyh pyh = (pyh)o;
        czd.f((Object)pyh, "$this$intoWeaver");
        pyh.e((ftb)new f(this.D0, this.E0, (go6)null));
        pyh.c((ftb)new g(this.D0, (go6)null));
        return fzv.a;
    }
}
