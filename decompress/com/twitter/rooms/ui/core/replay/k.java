// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.replay;

import com.twitter.weaver.mvi.MviViewModel;

public final class k extends ste implements qsb<d0o, fzv>
{
    public final RoomReplayConsumptionViewModel D0;
    
    public k(final RoomReplayConsumptionViewModel d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final d0o d0o = (d0o)o;
        czd.f((Object)d0o, "state");
        final RoomReplayConsumptionViewModel d0 = this.D0;
        final yxn.b b = new yxn.b(d0o.C ^ true);
        final RoomReplayConsumptionViewModel$w companion = RoomReplayConsumptionViewModel.Companion;
        ((MviViewModel)d0).V((Object)b);
        return fzv.a;
    }
}
