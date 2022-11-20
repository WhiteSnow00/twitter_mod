import com.twitter.rooms.manager.RoomStateManager;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zco extends ste implements qsb<pyh<vqn, GuestServiceJoinResponse>, fzv>
{
    public final boolean D0;
    public final RoomStateManager E0;
    public final vqn F0;
    public final z0r G0;
    
    public zco(final boolean d0, final RoomStateManager e0, final vqn f0, final z0r g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pyh pyh = (pyh)o;
        czd.f((Object)pyh, "$this$intoWeaver");
        pyh.e((ftb)new xco(this.D0, this.E0, this.F0, this.G0, (go6)null));
        pyh.c((ftb)new yco(this.E0, this.F0, (go6)null));
        return fzv.a;
    }
}
