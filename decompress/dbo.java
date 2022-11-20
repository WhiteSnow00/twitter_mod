import com.twitter.rooms.manager.RoomStateManager$l0;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Map;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbo extends ste implements qsb<vqn, vqn>
{
    public final Set<RoomUserItem> D0;
    public final Map<String, Long> E0;
    
    public dbo(final Set<RoomUserItem> d0, final Map<String, Long> e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "$this$setState");
        return vqn.l(vqn, null, null, false, null, null, null, null, null, null, null, null, this.D0, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, null, false, this.E0, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -268437505, 2047);
    }
}
