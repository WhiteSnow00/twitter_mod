// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.core.consumptionpreview.RoomConsumptionPreviewViewModel$intents$2$7", f = "RoomConsumptionPreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class m extends p0s implements ftb<a9n$d, go6<? super fzv>, Object>
{
    public final RoomConsumptionPreviewViewModel D0;
    
    public m(final RoomConsumptionPreviewViewModel d0, final go6<? super m> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new m(this.D0, (go6<? super m>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final m m = (m)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        m.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final RoomConsumptionPreviewViewModel d0 = this.D0;
        final m$a m$a = new m$a(d0);
        final coe[] g1 = RoomConsumptionPreviewViewModel.g1;
        ((MviViewModel)d0).T((qsb)m$a);
        return fzv.a;
    }
}
