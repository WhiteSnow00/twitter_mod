import tv.periscope.model.chat.Message$a;
import tv.periscope.android.api.PsUser;
import tv.periscope.model.chat.a$a;
import tv.periscope.model.chat.c;
import tv.periscope.model.chat.Message;
import java.util.Objects;
import com.twitter.rooms.di.room.RoomObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g7o extends ste implements qsb<RoomObjectGraph, fzv>
{
    public final bo6 D0;
    
    public g7o(final bo6 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final RoomObjectGraph roomObjectGraph = (RoomObjectGraph)o;
        czd.f((Object)roomObjectGraph, "$this$currentRoom");
        final a8n w4 = roomObjectGraph.w4();
        final bo6 d0 = this.D0;
        Objects.requireNonNull(w4);
        czd.f((Object)d0, "tweet");
        final s44 f0 = w4.F0;
        final PsUser q = w4.D0.q();
        czd.e((Object)q, "userCache.currentUser");
        final String x0 = d0.X0();
        czd.e((Object)x0, "tweet.stringId");
        final z21 z21 = new z21(x0);
        final String id = q.id;
        final String k0 = w4.O0.getUser().K0;
        String j = "";
        String i = k0;
        if (k0 == null) {
            i = "";
        }
        final String c = w4.O0.getUser().c();
        if (c != null) {
            j = c;
        }
        final String h = oke.a.h((Object)z21);
        final long participantIndex = q.participantIndex;
        final long b = w4.K0.b();
        final long b2 = w4.K0.b();
        long n = 0L;
        if (b2 != 0L) {
            n = wa2.n();
        }
        final String a = a8n$d.a(a8n.Companion, w4.K0.b());
        final Message$a g = Message.g();
        g.b(tv.periscope.model.chat.c.t1);
        final a$a a$a = (a$a)g;
        a$a.h0 = id;
        a$a.i = i;
        a$a.j = j;
        a$a.h = Message.L();
        a$a.n = h;
        a$a.e = participantIndex;
        a$a.f = Message.N(b);
        a$a.v = Message.N(n);
        a$a.Q = a;
        a$a.g = Message.R();
        f0.p(a$a.a());
        return fzv.a;
    }
}
