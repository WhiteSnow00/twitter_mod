// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.replay;

import com.twitter.weaver.mvi.MviViewModel;

public final class l extends ste implements qsb<d0o, fzv>
{
    public final RoomReplayConsumptionViewModel D0;
    
    public l(final RoomReplayConsumptionViewModel d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final d0o d0o = (d0o)o;
        czd.f((Object)d0o, "state");
        final RoomReplayConsumptionViewModel d0 = this.D0;
        final String value = String.valueOf(d0o.j);
        final String n = d0o.n;
        if (n != null) {
            final Long m = d0o.m;
            if (m != null) {
                o = new yxn.h(value, n, m, d0o.p);
                final RoomReplayConsumptionViewModel$w companion = RoomReplayConsumptionViewModel.Companion;
                ((MviViewModel)d0).V(o);
            }
        }
        return fzv.a;
    }
}
