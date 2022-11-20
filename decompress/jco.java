import java.util.Map;
import java.util.Set;
import tv.periscope.model.b;
import com.twitter.rooms.manager.RoomStateManager$l0;
import tv.periscope.model.NarrowcastSpaceType$None;
import com.twitter.rooms.di.room.RoomObjectGraph;
import tv.periscope.model.NarrowcastSpaceType;
import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jco extends ste implements qsb<vqn, vqn>
{
    public final RoomStateManager D0;
    public final NarrowcastSpaceType E0;
    public final RoomObjectGraph F0;
    public final String G0;
    
    public jco(final RoomStateManager d0, final NarrowcastSpaceType e0, final RoomObjectGraph f0, final String g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "$this$setState");
        final wqn e0 = wqn.E0;
        final wg6 e2 = wg6.E0;
        final z0r f0 = z0r.F0;
        final String n = this.D0.U0.n();
        final RoomStateManager$l0 p = vqn.P;
        return vqn.l(vqn, this.F0, null, false, e2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, e0, null, f0, false, null, this.G0, null, false, null, 0, null, null, null, null, n, false, null, false, false, false, null, new RoomStateManager$l0(p.a, p.b, czd.a((Object)this.E0, (Object)NarrowcastSpaceType$None.INSTANCE) ^ true), false, -38797322, 1531);
    }
}
