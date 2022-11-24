import com.twitter.weaver.mvi.MviViewModel;
import java.util.Iterator;
import com.twitter.rooms.di.room.RoomObjectGraph;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.ArrayList;
import java.util.Set;
import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abo extends pue implements ptb<vzv>
{
    public final RoomStateManager F0;
    public final Set<y21> G0;
    public final String H0;
    public final String I0;
    public final boolean J0;
    public final boolean K0;
    public final boolean L0;
    
    public abo(final RoomStateManager f0, final Set<y21> g0, final String h0, final String i0, final boolean j0, final boolean k0, final boolean l0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        super(0);
    }
    
    public final Object invoke() {
        final RoomStateManager f0 = this.F0;
        final RoomObjectGraph a = f0.R0.a((njn$a)f0);
        a.E2().b((g6k$b)this.F0);
        this.F0.d1.h = "replay";
        final Set<y21> g0 = this.G0;
        final String h0 = this.H0;
        final String i0 = this.I0;
        final ArrayList list = new ArrayList<RoomUserItem>(nr4.d1((Iterable)g0, 10));
        for (final y21 y21 : g0) {
            list.add(eg8.I0(y21, ojo.F0, (Set)r3a.F0, h0, e0e.a((Object)y21.a, (Object)i0)));
        }
        ((MviViewModel)this.F0).Q((stb)new wao(a, rr4.n2((Iterable)list), this.I0, this.J0, this.K0));
        this.F0.s0("joinReplay request started");
        final RoomStateManager f2 = this.F0;
        final String h2 = this.H0;
        ((MviViewModel)f2).C(a.h0().h(false, h2, false, (String)null), (stb)new zao(f2, (Set)this.G0, h2, a, a, this.L0, this.K0));
        return vzv.a;
    }
}
