// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.core.consumptionpreview.RoomConsumptionPreviewViewModel$intents$2$1", f = "RoomConsumptionPreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class g extends p0s implements ftb<a9n$c, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomConsumptionPreviewViewModel E0;
    
    public g(final RoomConsumptionPreviewViewModel e0, final go6<? super g> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final g g = new g(this.E0, (go6<? super g>)go6);
        g.D0 = d0;
        return (go6<fzv>)g;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final g g = (g)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        g.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final a9n$c a9n$c = (a9n$c)this.D0;
        final RoomConsumptionPreviewViewModel e0 = this.E0;
        final g$a g$a = new g$a(e0, a9n$c);
        final coe[] g1 = RoomConsumptionPreviewViewModel.g1;
        ((MviViewModel)e0).T((qsb)g$a);
        return fzv.a;
    }
}
