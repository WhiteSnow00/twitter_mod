// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.core.consumptionpreview.RoomConsumptionPreviewViewModel$intents$2$6", f = "RoomConsumptionPreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class l extends p0s implements ftb<a9n$a, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomConsumptionPreviewViewModel E0;
    
    public l(final RoomConsumptionPreviewViewModel e0, final go6<? super l> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final l l = new l(this.E0, (go6<? super l>)go6);
        l.D0 = d0;
        return (go6<fzv>)l;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final l l = (l)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        l.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final a9n$a a9n$a = (a9n$a)this.D0;
        final RoomConsumptionPreviewViewModel e0 = this.E0;
        final l$a l$a = new l$a(e0, a9n$a);
        final coe[] g1 = RoomConsumptionPreviewViewModel.g1;
        ((MviViewModel)e0).T((qsb)l$a);
        return fzv.a;
    }
}
