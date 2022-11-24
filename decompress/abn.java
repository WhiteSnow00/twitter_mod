import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;
import com.twitter.rooms.ui.core.consumptionpreview.RoomConsumptionPreviewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abn extends pue implements stb<dbn, vzv>
{
    public final RoomConsumptionPreviewViewModel F0;
    public final boolean G0;
    
    public abn(final RoomConsumptionPreviewViewModel f0, final boolean g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final dbn dbn = (dbn)o;
        e0e.f((Object)dbn, "state");
        final String c = dbn.c;
        if (c == null || c.length() == 0) {
            final RoomConsumptionPreviewViewModel f0 = this.F0;
            final p9n$b p9n$b = new p9n$b(new Throwable("Expected a non empty broadcastId"));
            final ape[] i1 = RoomConsumptionPreviewViewModel.i1;
            ((MviViewModel)f0).V((Object)p9n$b);
        }
        else if (dbn.l) {
            final RoomConsumptionPreviewViewModel f2 = this.F0;
            final p9n$i p9n$i = new p9n$i(this.G0);
            final ape[] i2 = RoomConsumptionPreviewViewModel.i1;
            ((MviViewModel)f2).V((Object)p9n$i);
        }
        else {
            final zps q = dbn.q;
            if (q == null || q.c) {
                final boolean g0 = this.G0;
                if (g0 && dbn.u) {
                    final RoomConsumptionPreviewViewModel f3 = this.F0;
                    final String c2 = dbn.c;
                    final Set<RoomUserItem> e = dbn.e;
                    final Set<RoomUserItem> f4 = dbn.f;
                    final Set<RoomUserItem> g2 = dbn.g;
                    final int k = dbn.k;
                    String o2 = dbn.o;
                    if (o2 == null) {
                        o2 = "";
                    }
                    o = new p9n$e(c2, k6m.G0, (Set)e, (Set)f4, (Set)g2, k, o2, dbn.p);
                    final ape[] i3 = RoomConsumptionPreviewViewModel.i1;
                    ((MviViewModel)f3).V(o);
                }
                else if (dbn.t && g0 && vjo.M()) {
                    final RoomConsumptionPreviewViewModel f5 = this.F0;
                    final String c3 = dbn.c;
                    final Set<RoomUserItem> e2 = dbn.e;
                    final Set<RoomUserItem> f6 = dbn.f;
                    final Set<RoomUserItem> g3 = dbn.g;
                    final int j = dbn.k;
                    String o3 = dbn.o;
                    if (o3 == null) {
                        o3 = "";
                    }
                    final p9n$e p9n$e = new p9n$e(c3, k6m.F0, (Set)e2, (Set)f6, (Set)g3, j, o3, dbn.p);
                    final ape[] i4 = RoomConsumptionPreviewViewModel.i1;
                    ((MviViewModel)f5).V((Object)p9n$e);
                }
                else {
                    RoomConsumptionPreviewViewModel.W(this.F0, dbn.c, (Set)dbn.e, (Set)dbn.f, (Set)dbn.g, dbn.k, this.G0, dbn.o, dbn.p, dbn.t, dbn.C != null);
                }
            }
        }
        return vzv.a;
    }
}
