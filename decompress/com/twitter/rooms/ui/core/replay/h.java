// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.replay;

import com.twitter.weaver.mvi.MviViewModel;

public final class h extends ste implements qsb<d0o, fzv>
{
    public final bdn D0;
    public final RoomReplayConsumptionViewModel E0;
    
    public h(final bdn d0, final RoomReplayConsumptionViewModel e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final d0o d0o = (d0o)o;
        czd.f((Object)d0o, "state");
        final String n = d0o.n;
        if (n != null) {
            final bdn d0 = this.D0;
            final RoomReplayConsumptionViewModel e0 = this.E0;
            d0.a();
            final yxn.k k = new yxn.k(n);
            final RoomReplayConsumptionViewModel$w companion = RoomReplayConsumptionViewModel.Companion;
            ((MviViewModel)e0).V((Object)k);
        }
        return fzv.a;
    }
}
