import java.util.Iterator;
import java.util.List;
import tv.periscope.model.NarrowcastSpaceType$SuperFollowerOnly;
import java.util.Set;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.ArrayList;
import com.twitter.rooms.ui.core.hostreconnect.RoomHostReconnectViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epn extends pue implements stb<gpn, gpn>
{
    public final x21 F0;
    public final z21 G0;
    public final RoomHostReconnectViewModel H0;
    public final String I0;
    
    public epn(final x21 f0, final z21 g0, final RoomHostReconnectViewModel h0, final String i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gpn gpn = (gpn)o;
        e0e.f((Object)gpn, "$this$setState");
        final String x = this.F0.x;
        final List a = this.G0.a;
        final String i0 = this.I0;
        final ArrayList list = new ArrayList<RoomUserItem>(nr4.d1((Iterable)a, 10));
        for (final y21 y21 : a) {
            list.add(eg8.I0(y21, ojo.F0, (Set)r3a.F0, i0, e0e.a((Object)y21.a, (Object)x)));
        }
        final List b = this.G0.b;
        final String i2 = this.I0;
        final ArrayList list2 = new ArrayList<RoomUserItem>(nr4.d1((Iterable)b, 10));
        final Iterator iterator2 = b.iterator();
        while (iterator2.hasNext()) {
            list2.add(eg8.J0((y21)iterator2.next(), ojo.G0, (Set)r3a.F0, i2, false, 8));
        }
        final RoomHostReconnectViewModel h0 = this.H0;
        final ArrayList<RoomUserItem> list3 = new ArrayList<RoomUserItem>();
        final Iterator<RoomUserItem> iterator3 = list2.iterator();
        while (true) {
            final boolean hasNext = iterator3.hasNext();
            boolean b2 = true;
            if (!hasNext) {
                break;
            }
            final RoomUserItem next = iterator3.next();
            if (next.getTwitterUserIdLong() == h0.U0.k().getId()) {
                b2 = false;
            }
            if (!b2) {
                continue;
            }
            list3.add(next);
        }
        final List c = this.G0.c;
        final String i3 = this.I0;
        final ArrayList list4 = new ArrayList<RoomUserItem>(nr4.d1((Iterable)c, 10));
        final Iterator iterator4 = c.iterator();
        while (iterator4.hasNext()) {
            list4.add(eg8.J0((y21)iterator4.next(), ojo.J0, (Set)r3a.F0, i3, false, 8));
        }
        final RoomHostReconnectViewModel h2 = this.H0;
        final ArrayList<RoomUserItem> list5 = new ArrayList<RoomUserItem>();
        for (final RoomUserItem next2 : list4) {
            if (next2.getTwitterUserIdLong() != h2.U0.k().getId()) {
                list5.add(next2);
            }
        }
        final Set a2 = this.H0.V0.a(rr4.n2((Iterable)list), (k22)null);
        final Set a3 = this.H0.V0.a(rr4.n2((Iterable)list3), (k22)null);
        final Set a4 = this.H0.V0.a(rr4.n2((Iterable)list5), (k22)null);
        final int b3 = this.G0.b();
        final x21 f0 = this.F0;
        final int w = f0.w;
        final Set k = xli.k(f0);
        final int d = this.G0.d;
        final x21 f2 = this.F0;
        return new gpn(gpn.a, a2, a3, a4, k, b3, w, d, f2.L, f2.J, f2.K, e0e.a((Object)f2.T, (Object)NarrowcastSpaceType$SuperFollowerOnly.INSTANCE));
    }
}
