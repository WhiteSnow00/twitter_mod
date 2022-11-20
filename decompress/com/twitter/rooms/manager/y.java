// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$observeAudioLevelChange$1$2", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class y extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomStateManager E0;
    
    public y(final RoomStateManager e0, final go6<? super y> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final y y = new y(this.E0, (go6<? super y>)go6);
        y.D0 = d0;
        return (go6<fzv>)y;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final y y = (y)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        y.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final Throwable t = (Throwable)this.D0;
        final RoomStateManager e0 = this.E0;
        final StringBuilder sb = new StringBuilder();
        sb.append("observeAudioLevelChange failed ");
        sb.append(t);
        RoomStateManager.Z(e0, sb.toString());
        return fzv.a;
    }
}
