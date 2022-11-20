import com.twitter.rooms.manager.RoomStateManager$l0;
import java.util.Map;
import tv.periscope.model.b;
import com.twitter.rooms.di.room.RoomObjectGraph;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddo extends ste implements qsb<vqn, vqn>
{
    public final Set<RoomUserItem> D0;
    public final Set<RoomUserItem> E0;
    
    public ddo(final Set<RoomUserItem> d0, final Set<RoomUserItem> e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "$this$setState");
        return vqn.l(vqn, null, null, false, null, null, null, null, null, null, null, null, this.D0, this.E0, null, null, null, null, null, 0, 0, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -6145, 2047);
    }
}
