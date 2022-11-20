import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.manager.RoomStateManager$k0;
import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$joinRoomFirstTime$1$2$2$2", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class kao extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomStateManager E0;
    public final boolean F0;
    
    public kao(final RoomStateManager e0, final boolean f0, final go6<? super kao> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final kao kao = new kao(this.E0, this.F0, (go6<? super kao>)go6);
        kao.D0 = d0;
        return (go6<fzv>)kao;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final kao kao = (kao)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        kao.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final Throwable t = (Throwable)this.D0;
        final RoomStateManager e0 = this.E0;
        final kao$a d0 = kao$a.D0;
        final RoomStateManager$k0 companion = RoomStateManager.Companion;
        ((MviViewModel)e0).Q((qsb)d0);
        if (this.F0) {
            vjo.G(this.E0.b1, "periscope", "guest", "automatically_join", "failure", null, 48);
        }
        final RoomStateManager e2 = this.E0;
        final StringBuilder sb = new StringBuilder();
        sb.append("joinRoomFirstTime::joinAudioSpace failed ");
        sb.append(t);
        RoomStateManager.Z(e2, sb.toString());
        return fzv.a;
    }
}
