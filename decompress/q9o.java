import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Set;
import com.twitter.rooms.manager.RoomStateManager;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q9o extends gue implements rtb<oyh<gqn, GuestServiceJoinResponse>, oyv>
{
    public final /* synthetic */ RoomStateManager C0;
    public final /* synthetic */ Set<w21> D0;
    public final /* synthetic */ String E0;
    public final /* synthetic */ RoomObjectGraph F0;
    public final /* synthetic */ RoomObjectGraph G0;
    public final /* synthetic */ boolean H0;
    public final /* synthetic */ boolean I0;
    
    public q9o(final RoomStateManager c0, final Set<w21> d0, final String e0, final RoomObjectGraph f0, final RoomObjectGraph g0, final boolean h0, final boolean i0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final oyh oyh = (oyh)o;
        zzd.f((Object)oyh, "$this$intoWeaver");
        oyh.e((gub)new o9o(this.C0, (Set)this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, (ap6)null));
        oyh.c((gub)new p9o(this.C0, (ap6)null));
        return oyv.a;
    }
}
