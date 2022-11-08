import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qbo extends gue implements rtb<gqn, oyv>
{
    public final /* synthetic */ RoomStateManager C0;
    public final /* synthetic */ String D0;
    
    public qbo(final RoomStateManager c0, final String d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gqn gqn = (gqn)o;
        zzd.f((Object)gqn, "state");
        if (tdy.V(gqn)) {
            final RoomStateManager c0 = this.C0;
            final pbo pbo = new pbo(this.D0);
            final RoomStateManager.k0 companion = RoomStateManager.Companion;
            ((MviViewModel)c0).Q((rtb)pbo);
        }
        return oyv.a;
    }
}
