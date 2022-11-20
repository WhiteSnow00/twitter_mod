import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$endBroadcastAsAdmin$1$2", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class k9o extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomStateManager E0;
    
    public k9o(final RoomStateManager e0, final go6<? super k9o> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final k9o k9o = new k9o(this.E0, (go6<? super k9o>)go6);
        k9o.D0 = d0;
        return (go6<fzv>)k9o;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final k9o k9o = (k9o)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        k9o.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final Throwable t = (Throwable)this.D0;
        this.E0.z1.onNext((Object)Boolean.FALSE);
        final RoomStateManager e0 = this.E0;
        final StringBuilder sb = new StringBuilder();
        sb.append("endBroadcastAsAdmin failed ");
        sb.append(t);
        RoomStateManager.Z(e0, sb.toString());
        return fzv.a;
    }
}
