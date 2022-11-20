import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$startScheduledRoom$2", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class kco extends p0s implements ftb<v47, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomStateManager E0;
    
    public kco(final RoomStateManager e0, final go6<? super kco> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final kco kco = new kco(this.E0, (go6<? super kco>)go6);
        kco.D0 = d0;
        return (go6<fzv>)kco;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final kco kco = (kco)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        kco.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        RoomStateManager.w0(this.E0, (v47)this.D0, (String)null, false, false, false, 30);
        return fzv.a;
    }
}
