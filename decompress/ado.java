import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.manager.RoomStateManager$k0;
import java.util.Set;
import com.twitter.rooms.manager.RoomStateManager;
import com.twitter.rooms.di.room.RoomObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ado extends ste implements ftb<RoomObjectGraph, vqn, fzv>
{
    public final z0r D0;
    public final RoomStateManager E0;
    public final String F0;
    
    public ado(final z0r d0, final RoomStateManager e0, final String f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final RoomObjectGraph roomObjectGraph = (RoomObjectGraph)o;
        final vqn vqn = (vqn)o2;
        czd.f((Object)roomObjectGraph, "$this$withCurrentRoomAndState");
        czd.f((Object)vqn, "state");
        final Integer e = vqn.E;
        boolean b = false;
        int intValue;
        if (e != null) {
            intValue = e;
        }
        else {
            intValue = 0;
        }
        final boolean b2 = intValue > 0;
        if (this.D0 == z0r.F0) {
            b = true;
        }
        if (b2) {
            if (b) {
                final RoomStateManager e2 = this.E0;
                final vco d0 = vco.D0;
                final RoomStateManager$k0 companion = RoomStateManager.Companion;
                ((MviViewModel)e2).Q((qsb)d0);
            }
            if (this.D0 == z0r.E0) {
                ((MviViewModel)this.E0).Q((qsb)new wco(RoomStateManager.g0(this.E0, (Set)vqn.l, true)));
            }
            else {
                final RoomStateManager e3 = this.E0;
                final qan h0 = roomObjectGraph.h0();
                final String f0 = this.F0;
                final qt3 i = vqn.i;
                String a;
                if (i != null) {
                    a = i.a();
                }
                else {
                    a = null;
                }
                ((MviViewModel)e3).C((eaq)h0.h(true, f0, true, a), (qsb)new zco(b, this.E0, vqn, this.D0));
            }
        }
        return fzv.a;
    }
}
