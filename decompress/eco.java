import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.manager.RoomStateManager;
import com.twitter.rooms.di.room.RoomObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eco extends pue implements hub<RoomObjectGraph, lrn, vzv>
{
    public final RoomStateManager F0;
    
    public eco(final RoomStateManager f0) {
        this.F0 = f0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final RoomObjectGraph roomObjectGraph = (RoomObjectGraph)o;
        final lrn lrn = (lrn)o2;
        e0e.f((Object)roomObjectGraph, "$this$withCurrentRoomAndState");
        e0e.f((Object)lrn, "it");
        this.F0.H0((hub)fdo.F0);
        roomObjectGraph.y6().a("POLLING_SCRIBE_HEART_BEAT");
        roomObjectGraph.y6().a("POLLING_AUDIO_SPACE");
        roomObjectGraph.U6().i();
        ((MviViewModel)this.F0).Q((stb)dco.F0);
        return vzv.a;
    }
}
