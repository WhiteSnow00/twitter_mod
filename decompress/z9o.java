import java.util.Iterator;
import com.twitter.rooms.manager.RoomStateManager$l0;
import java.util.Map;
import tv.periscope.model.b;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.ArrayList;
import com.twitter.rooms.di.room.RoomObjectGraph;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z9o extends ste implements qsb<vqn, vqn>
{
    public final Set<s21> D0;
    public final Set<s21> E0;
    public final RoomObjectGraph F0;
    public final String G0;
    public final String H0;
    public final String I0;
    
    public z9o(final Set<s21> d0, final Set<s21> e0, final RoomObjectGraph f0, final String g0, final String h0, final String i0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "$this$setState");
        final wqn d0 = wqn.D0;
        final wg6 d2 = wg6.D0;
        final Set<s21> d3 = this.D0;
        final String g0 = this.G0;
        final String i0 = this.I0;
        final ArrayList list = new ArrayList<RoomUserItem>(iq4.H((Iterable)d3, 10));
        for (final s21 s21 : d3) {
            list.add(fli.I0(s21, wio.D0, (Set)p2a.D0, g0, czd.a((Object)s21.a, (Object)i0)));
        }
        final Set r0 = mq4.R0((Iterable)list);
        final Set<s21> e0 = this.E0;
        final String g2 = this.G0;
        final ArrayList list2 = new ArrayList<RoomUserItem>(iq4.H((Iterable)e0, 10));
        final Iterator<Object> iterator2 = e0.iterator();
        while (iterator2.hasNext()) {
            list2.add(fli.J0((s21)iterator2.next(), wio.E0, (Set)p2a.D0, g2, false, 8));
        }
        return vqn.l(vqn, this.F0, this.G0, false, d2, null, null, null, null, null, null, null, null, mq4.R0((Iterable)list2), r0, null, null, null, null, 0, 0, d0, null, null, false, null, null, null, false, null, 0, null, null, null, this.H0, this.I0, false, kmk.E0, false, false, false, null, null, false, -1060876, 2025);
    }
}
