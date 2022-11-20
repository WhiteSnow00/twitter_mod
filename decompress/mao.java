import com.twitter.weaver.mvi.MviViewModel;
import java.util.Map;
import java.util.Iterator;
import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;
import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mao extends ste implements nsb<fzv>
{
    public final RoomStateManager D0;
    public final Set<RoomUserItem> E0;
    public final int F0;
    public final Set<RoomUserItem> G0;
    public final Set<RoomUserItem> H0;
    public final int I0;
    public final String J0;
    public final boolean K0;
    public final boolean L0;
    public final boolean M0;
    public final String N0;
    public final boolean O0;
    
    public mao(final RoomStateManager d0, final Set<RoomUserItem> e0, final int f0, final Set<RoomUserItem> g0, final Set<RoomUserItem> h0, final int i0, final String j0, final boolean k0, final boolean l0, final boolean m0, final String n0, final boolean o0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        super(0);
    }
    
    public final Object invoke() {
        final RoomStateManager d0 = this.D0;
        final RoomObjectGraph a = d0.P0.a((vin$a)d0);
        a.E2().b((t5k.b)this.D0);
        final long millis = TimeUnit.SECONDS.toMillis(oun.Companion.a(false));
        final Set<RoomUserItem> e0 = this.E0;
        final ArrayList list = new ArrayList<lvj>(iq4.H((Iterable)e0, 10));
        final Iterator<Object> iterator = e0.iterator();
        while (iterator.hasNext()) {
            list.add(new lvj((Object)iterator.next().getTwitterUserIdLong(), (Object)(wa2.n() + millis)));
        }
        final lvj[] array = list.toArray(new lvj[0]);
        czd.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final lvj[] array2 = array;
        final Map n0 = tkg.n0((lvj[])Arrays.copyOf(array2, array2.length));
        final RoomStateManager d2 = this.D0;
        ((MviViewModel)d2).Q((qsb)new hao(d2, this.F0, (Set)this.G0, a, (Set)this.H0, (Set)this.E0, n0, this.I0, this.J0, this.K0, this.L0));
        this.D0.s0("joinRoomFirstTime request started");
        final RoomStateManager d3 = this.D0;
        final boolean m0 = this.M0;
        final String n2 = this.N0;
        final Set<RoomUserItem> g0 = this.G0;
        final boolean o0 = this.O0;
        final boolean l0 = this.L0;
        ((MviViewModel)d3).Q((qsb)iao.D0);
        if (m0) {
            vjo.G(d3.b1, "periscope", "guest", "automatically_join", "send", null, 48);
        }
        ((MviViewModel)d3).C((eaq)a.h0().h(m0, n2, false, null), (qsb)new lao(d3, m0, (Set)g0, n2, o0, a, l0));
        return fzv.a;
    }
}
