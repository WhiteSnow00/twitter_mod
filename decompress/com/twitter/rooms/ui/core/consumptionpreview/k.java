// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.consumptionpreview;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.core.consumptionpreview.RoomConsumptionPreviewViewModel$intents$2$5", f = "RoomConsumptionPreviewViewModel.kt", l = {}, m = "invokeSuspend")
public final class k extends p0s implements ftb<a9n$g, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomConsumptionPreviewViewModel E0;
    
    public k(final RoomConsumptionPreviewViewModel e0, final go6<? super k> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final k k = new k(this.E0, (go6<? super k>)go6);
        k.D0 = d0;
        return (go6<fzv>)k;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final k k = (k)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        k.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        if (((a9n$g)this.D0).a instanceof qqp.n) {
            final RoomConsumptionPreviewViewModel e0 = this.E0;
            final k$a k$a = new k$a(e0);
            final coe[] g1 = RoomConsumptionPreviewViewModel.g1;
            ((MviViewModel)e0).T((qsb)k$a);
        }
        final RoomConsumptionPreviewViewModel e2 = this.E0;
        final y8n$a a = y8n$a.a;
        final coe[] g2 = RoomConsumptionPreviewViewModel.g1;
        ((MviViewModel)e2).V((Object)a);
        return fzv.a;
    }
}
