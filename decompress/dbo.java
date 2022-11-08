import com.twitter.rooms.manager.RoomStateManager;
import com.twitter.rooms.di.room.RoomObjectGraph;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbo extends gue implements rtb<oyh<gqn, GuestServiceJoinResponse>, oyv>
{
    public final /* synthetic */ RoomObjectGraph C0;
    public final /* synthetic */ RoomStateManager D0;
    public final /* synthetic */ String E0;
    
    public dbo(final RoomObjectGraph c0, final RoomStateManager d0, final String e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final oyh oyh = (oyh)o;
        zzd.f((Object)oyh, "$this$intoWeaver");
        oyh.e((gub)new bbo(this.C0, this.D0, this.E0, (ap6)null));
        oyh.c((gub)new cbo(this.D0, (ap6)null));
        return oyv.a;
    }
}
