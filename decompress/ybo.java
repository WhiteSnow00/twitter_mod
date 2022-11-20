import com.twitter.rooms.manager.RoomStateManager$l0;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Map;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ybo extends ste implements qsb<vqn, vqn>
{
    public final Set<RoomUserItem> D0;
    public final Map<String, lvj<RoomUserItem, Long>> E0;
    public final Map<Long, Long> F0;
    public final Map<String, Long> G0;
    
    public ybo(final Set<RoomUserItem> d0, final Map<String, lvj<RoomUserItem, Long>> e0, final Map<Long, Long> f0, final Map<String, Long> g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "$this$setState");
        return vqn.l(vqn, null, null, false, null, null, null, null, null, null, null, null, null, this.D0, null, null, null, this.E0, this.F0, 0, 0, null, null, null, false, null, null, null, false, this.G0, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -268636161, 2047);
    }
}
