import com.twitter.rooms.manager.RoomStateManager$l0;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Map;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d9o extends ste implements qsb<vqn, vqn>
{
    public final Set<RoomUserItem> D0;
    public final Set<RoomUserItem> E0;
    public final Map<String, lvj<RoomUserItem, Long>> F0;
    public final Map<Long, Long> G0;
    public final Map<String, Long> H0;
    
    public d9o(final Set<RoomUserItem> d0, final Set<RoomUserItem> e0, final Map<String, lvj<RoomUserItem, Long>> f0, final Map<Long, Long> g0, final Map<String, Long> h0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "$this$setState");
        return vqn.l(vqn, null, null, false, null, null, null, null, null, null, null, null, this.D0, this.E0, null, null, null, this.F0, this.G0, 0, 0, null, null, null, false, null, null, null, false, this.H0, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -268638209, 2047);
    }
}
