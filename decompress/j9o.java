import com.twitter.rooms.manager.RoomStateManager;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceBaseResponse;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$endBroadcastAsAdmin$1$1", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class j9o extends p0s implements ftb<GuestServiceBaseResponse, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomStateManager E0;
    
    public j9o(final RoomStateManager e0, final go6<? super j9o> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final j9o j9o = new j9o(this.E0, (go6<? super j9o>)go6);
        j9o.D0 = d0;
        return (go6<fzv>)j9o;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final j9o j9o = (j9o)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        j9o.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final GuestServiceBaseResponse guestServiceBaseResponse = (GuestServiceBaseResponse)this.D0;
        this.E0.z1.onNext((Object)Boolean.TRUE);
        final RoomStateManager e0 = this.E0;
        final StringBuilder sb = new StringBuilder();
        sb.append("endBroadcastAsAdmin success ");
        sb.append(guestServiceBaseResponse);
        e0.s0(sb.toString());
        return fzv.a;
    }
}
