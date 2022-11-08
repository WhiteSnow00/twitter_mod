import com.twitter.weaver.mvi.MviViewModel;
import tv.periscope.model.b;
import java.util.Map;
import java.util.Set;
import com.twitter.rooms.model.AudioSpaceCommunityRoleType;
import com.twitter.rooms.model.RaisedHand;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.List;
import java.util.Objects;
import com.twitter.rooms.manager.RoomStateManager;
import com.twitter.rooms.di.room.RoomObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gao extends gue implements gub<RoomObjectGraph, gqn, oyv>
{
    public final /* synthetic */ r57 C0;
    public final /* synthetic */ String D0;
    public final /* synthetic */ RoomStateManager E0;
    public final /* synthetic */ boolean F0;
    public final /* synthetic */ boolean G0;
    public final /* synthetic */ boolean H0;
    
    public gao(final r57 c0, final String d0, final RoomStateManager e0, final boolean f0, final boolean g0, final boolean h0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(2);
    }
    
    public final Object invoke(Object o, final Object o2) {
        final RoomObjectGraph roomObjectGraph = (RoomObjectGraph)o;
        final gqn gqn = (gqn)o2;
        zzd.f((Object)roomObjectGraph, "$this$withCurrentRoomAndState");
        zzd.f((Object)gqn, "state");
        roomObjectGraph.h0().u(this.C0, gqn.c, this.D0);
        final b b = this.C0.b();
        final iu3 d = this.C0.d();
        zzd.e((Object)d, "createdBroadcast.chatAccess()");
        this.E0.a1.d = b.w();
        final RoomStateManager e0 = this.E0;
        final gjo a1 = e0.a1;
        final String stringId = e0.m0().getStringId();
        final String n = this.E0.T0.n();
        a1.e = stringId;
        a1.f = n;
        this.E0.a1.g0(this.F0);
        this.E0.a1.d0(this.G0);
        final gjo a2 = this.E0.a1;
        final String w = this.C0.b().w();
        zzd.e((Object)w, "createdBroadcast.broadcast().id()");
        Objects.requireNonNull(a2);
        final oio a3 = oio.a;
        gjo.H(a2, "audiospace", "event", "creation", "", "success", w, null, null, null, null, null, null, dta.b().b("spaces_2022_h2_entity_enabled", false), null, null, null, null, null, null, 520128);
        gjo.G(this.E0.a1, "creation", "", "create", "click", null, 48);
        final String stringId2 = this.E0.S0.k().getStringId();
        String j0 = b.j0();
        if (j0 == null) {
            j0 = "";
        }
        String c = this.E0.S0.getUser().c();
        if (c == null) {
            c = "";
        }
        String d2 = this.E0.S0.getUser().D0;
        if (d2 == null) {
            d2 = "";
        }
        final hio c2 = hio.C0;
        final boolean m0 = this.E0.S0.getUser().M0;
        Boolean b2;
        if ((b2 = this.E0.S0.getUser().h()) == null) {
            b2 = Boolean.FALSE;
        }
        final boolean booleanValue = b2;
        String j2 = this.E0.S0.getUser().J0;
        if (j2 == null) {
            j2 = "";
        }
        final String w2 = this.C0.b().w();
        zzd.e((Object)w2, "createdBroadcast.broadcast().id()");
        o = new RoomUserItem(stringId2, j0, c, false, d2, c2, false, m0, booleanValue, j2, w2, (Boolean)null, Boolean.valueOf(gqn.c), true, (RaisedHand)null, false, false, false, false, (Integer)null, (AudioSpaceCommunityRoleType)null, 2082816, (hg8)null);
        final String w3 = b.w();
        Set<RoomUserItem> set;
        if (this.H0 && (gqn.n.isEmpty() ^ true)) {
            set = gqn.n;
        }
        else {
            set = rqu.K(o);
        }
        final gqn l = gqn.l(gqn, null, w3, false, null, b, null, null, null, d, null, null, null, null, set, null, null, null, null, 0, 0, null, null, null, false, this.D0, null, null, false, null, 0, null, null, null, null, null, false, null, false, false, false, null, null, false, -16785683, 2047);
        this.E0.Q0.a(l, (String)null, false);
        ((MviViewModel)this.E0).Q((rtb)new fao(l));
        return oyv.a;
    }
}
