import com.twitter.rooms.manager.RoomStateManager;
import com.twitter.rooms.di.room.RoomObjectGraph;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sbo extends ste implements qsb<pyh<vqn, GuestServiceJoinResponse>, fzv>
{
    public final RoomObjectGraph D0;
    public final RoomStateManager E0;
    public final String F0;
    
    public sbo(final RoomObjectGraph d0, final RoomStateManager e0, final String f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pyh pyh = (pyh)o;
        czd.f((Object)pyh, "$this$intoWeaver");
        pyh.e((ftb)new qbo(this.D0, this.E0, this.F0, (go6)null));
        pyh.c((ftb)new rbo(this.E0, (go6)null));
        return fzv.a;
    }
}
