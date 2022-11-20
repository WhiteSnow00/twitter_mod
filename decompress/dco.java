import java.util.Iterator;
import com.twitter.rooms.manager.RoomStateManager$k0;
import com.twitter.weaver.mvi.MviViewModel;
import tv.periscope.android.api.Invitee;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import com.twitter.rooms.manager.RoomStateManager;
import java.util.Set;
import com.twitter.rooms.di.room.RoomObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dco extends ste implements ftb<RoomObjectGraph, vqn, fzv>
{
    public final Set<uon> D0;
    public final RoomStateManager E0;
    public final gpn F0;
    public final String G0;
    
    public dco(final Set<uon> d0, final RoomStateManager e0, final gpn f0, final String g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(2);
    }
    
    public final Object invoke(Object o, final Object o2) {
        final RoomObjectGraph roomObjectGraph = (RoomObjectGraph)o;
        final vqn vqn = (vqn)o2;
        czd.f((Object)roomObjectGraph, "$this$withCurrentRoomAndState");
        czd.f((Object)vqn, "state");
        if (this.D0.isEmpty() ^ true) {
            final String h = hmg.h("https://twitter.com/i/spaces/", vqn.b);
            final RoomStateManager e0 = this.E0;
            final gpn f0 = this.F0;
            final RoomStateManager$k0 companion = RoomStateManager.Companion;
            Objects.requireNonNull(e0);
            if (f0 == gpn.F0) {
                final qan h2 = roomObjectGraph.h0();
                final Set<uon> d0 = this.D0;
                o = new ArrayList(iq4.H((Iterable)d0, 10));
                final Iterator<Object> iterator = d0.iterator();
                while (iterator.hasNext()) {
                    ((ArrayList<String>)o).add(iterator.next().a);
                }
                h2.s((List<String>)o);
            }
            String j;
            if (this.F0 == gpn.H0) {
                j = h;
            }
            else {
                String s;
                if ((s = this.G0) == null) {
                    s = this.E0.O0.getString(2131953308);
                    czd.e((Object)s, "context.getString(R.stri\u2026_message_room_invitation)");
                }
                j = da8.j(s, " ", h);
            }
            final RoomStateManager e2 = this.E0;
            final bfv q0 = e2.Q0;
            final Set<uon> d2 = this.D0;
            final ArrayList list = new ArrayList<Invitee>(iq4.H((Iterable)d2, 10));
            final Iterator<Object> iterator2 = d2.iterator();
            while (iterator2.hasNext()) {
                list.add(new Invitee(iterator2.next().a, (String)null, (String)null, 0L, (String)null, false, 62, (rf8)null));
            }
            MviViewModel.E((MviViewModel)e2, q0.a(j, (List)list), (qsb)null, 1, (Object)null);
        }
        return fzv.a;
    }
}
