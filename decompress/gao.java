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

public final class gao extends ste implements nsb<fzv>
{
    public final RoomStateManager D0;
    public final Set<s21> E0;
    public final String F0;
    public final String G0;
    public final boolean H0;
    public final boolean I0;
    public final boolean J0;
    
    public gao(final RoomStateManager d0, final Set<s21> e0, final String f0, final String g0, final boolean h0, final boolean i0, final boolean j0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        super(0);
    }
    
    public final Object invoke() {
        final RoomStateManager d0 = this.D0;
        final RoomObjectGraph a = d0.P0.a((vin$a)d0);
        a.E2().b((t5k.b)this.D0);
        this.D0.b1.h = "replay";
        final Set<s21> e0 = this.E0;
        final String f0 = this.F0;
        final String g0 = this.G0;
        final ArrayList list = new ArrayList<RoomUserItem>(iq4.H((Iterable)e0, 10));
        for (final s21 s21 : e0) {
            list.add(fli.I0(s21, wio.D0, (Set)p2a.D0, f0, czd.a((Object)s21.a, (Object)g0)));
        }
        ((MviViewModel)this.D0).Q((qsb)new cao(a, mq4.R0((Iterable)list), this.G0, this.H0, this.I0));
        this.D0.s0("joinReplay request started");
        final RoomStateManager d2 = this.D0;
        final String f2 = this.F0;
        ((MviViewModel)d2).C((eaq)a.h0().h(false, f2, false, null), (qsb)new fao(d2, (Set)this.E0, f2, a, a, this.J0, this.I0));
        return fzv.a;
    }
}
