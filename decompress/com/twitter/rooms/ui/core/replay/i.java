// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.replay;

import com.twitter.weaver.mvi.MviViewModel;

public final class i extends ste implements qsb<d0o, fzv>
{
    public final RoomReplayConsumptionViewModel D0;
    
    public i(final RoomReplayConsumptionViewModel d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final d0o d0o = (d0o)o;
        czd.f((Object)d0o, "state");
        final String n = d0o.n;
        if (n != null) {
            final RoomReplayConsumptionViewModel d0 = this.D0;
            final yxn.m m = new yxn.m(n);
            final RoomReplayConsumptionViewModel$w companion = RoomReplayConsumptionViewModel.Companion;
            ((MviViewModel)d0).V((Object)m);
        }
        return fzv.a;
    }
}
