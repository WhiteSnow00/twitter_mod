// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

@sa8(c = "com.twitter.rooms.ui.core.consumptionpreview.RoomConsumptionPreviewViewModel$intents$2$2", f = "RoomConsumptionPreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends p0s implements ftb<a9n$b, go6<? super fzv>, Object>
{
    public final RoomConsumptionPreviewViewModel D0;
    
    public h(final RoomConsumptionPreviewViewModel d0, final go6<? super h> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new h(this.D0, (go6<? super h>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        this.D0.S0.a();
        vjo.G(this.D0.U0, "preview", "", "close", "click", null, 48);
        return fzv.a;
    }
}
