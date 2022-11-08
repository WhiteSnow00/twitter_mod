import com.twitter.weaver.mvi.MviViewModel;
import java.util.Set;
import com.twitter.rooms.manager.RoomStateManager;
import com.twitter.rooms.di.room.RoomObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lco extends gue implements gub<RoomObjectGraph, gqn, oyv>
{
    public final /* synthetic */ f0r C0;
    public final /* synthetic */ RoomStateManager D0;
    public final /* synthetic */ String E0;
    
    public lco(final f0r c0, final RoomStateManager d0, final String e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final RoomObjectGraph roomObjectGraph = (RoomObjectGraph)o;
        final gqn gqn = (gqn)o2;
        zzd.f((Object)roomObjectGraph, "$this$withCurrentRoomAndState");
        zzd.f((Object)gqn, "state");
        final Integer e = gqn.E;
        boolean b = false;
        int intValue;
        if (e != null) {
            intValue = e;
        }
        else {
            intValue = 0;
        }
        final boolean b2 = intValue > 0;
        if (this.C0 == f0r.E0) {
            b = true;
        }
        if (b2) {
            if (b) {
                final RoomStateManager d0 = this.D0;
                final gco c0 = gco.C0;
                final RoomStateManager.k0 companion = RoomStateManager.Companion;
                ((MviViewModel)d0).Q((rtb)c0);
            }
            if (this.C0 == f0r.D0) {
                ((MviViewModel)this.D0).Q((rtb)new hco(RoomStateManager.g0(this.D0, (Set)gqn.l, true)));
            }
            else {
                final RoomStateManager d2 = this.D0;
                final ban h0 = roomObjectGraph.h0();
                final String e2 = this.E0;
                final iu3 i = gqn.i;
                String a;
                if (i != null) {
                    a = i.a();
                }
                else {
                    a = null;
                }
                ((MviViewModel)d2).C(h0.h(true, e2, true, a), (rtb)new kco(b, this.D0, gqn, this.C0));
            }
        }
        return oyv.a;
    }
}
