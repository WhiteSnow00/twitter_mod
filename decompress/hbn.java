import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceAudiospaceSettingsModificationRequest;
import java.util.Collection;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceBaseResponse;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceJoinResponse;
import tv.periscope.model.NarrowcastSpaceType;
import java.math.BigInteger;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceRemoveAdminRequest;
import tv.periscope.chatman.api.IdempotenceHeaderMapImpl;
import tv.periscope.model.chat.Message;
import java.util.Objects;
import java.util.LinkedHashSet;
import com.twitter.rooms.manager.RoomStateManager;
import tv.periscope.android.api.service.room.RoomGuestServiceApi;
import tv.periscope.android.signer.SignerClient;
import android.content.Context;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbn implements gbn
{
    public static final hbn.hbn$a Companion;
    public final wpn A;
    public String B;
    public final de6 C;
    public pn0 D;
    public jvc E;
    public xmn F;
    public qu3 G;
    public List<? extends qgv> H;
    public final Set<String> I;
    public final Context a;
    public final cvc b;
    public final f4k c;
    public final o93 d;
    public final baw e;
    public final rmn f;
    public final mun g;
    public final kcm h;
    public final g6k i;
    public final aba j;
    public final SignerClient k;
    public final to2 l;
    public final vo2 m;
    public final u0d n;
    public final bxo o;
    public final bxo p;
    public final mk2 q;
    public final RoomGuestServiceApi r;
    public final r8n s;
    public final byc t;
    public final RoomStateManager u;
    public final r8o v;
    public final qyn w;
    public final geo x;
    public final fz0 y;
    public final fnw z;
    
    static {
        Companion = new hbn.hbn$a();
    }
    
    public hbn(final Context a, final cvc b, final f4k c, final o93 d, final baw e, final rmn f, final mun g, final kcm h, final g6k i, final aba j, final SignerClient k, final to2 l, final vo2 m, final u0d n, final bxo o, final bxo p30, final mk2 q, final RoomGuestServiceApi r, final r8n s, final nmn nmn, final byc t, final RoomStateManager u, final r8o v, final qyn w, final geo x, final fz0 y, final bon bon, final yio yio, final fnw z, final wpn a2) {
        e0e.f((Object)a, "context");
        e0e.f((Object)b, "hydraBroadcasterController");
        e0e.f((Object)c, "periscopeApiManager");
        e0e.f((Object)d, "callInParams");
        e0e.f((Object)e, "userCache");
        e0e.f((Object)f, "roomGuestControllerImpl");
        e0e.f((Object)g, "roomPeriscopeAuthenticator");
        e0e.f((Object)h, "releaseCompletable");
        e0e.f((Object)i, "periscopeRunnableInterceptor");
        e0e.f((Object)j, "eventBus");
        e0e.f((Object)k, "signerClient");
        e0e.f((Object)l, "broadcasterGuestServiceManager");
        e0e.f((Object)m, "sessionStateResolver");
        e0e.f((Object)n, "hydraUserActionStateLock");
        e0e.f((Object)o, "ioScheduler");
        e0e.f((Object)p30, "mainScheduler");
        e0e.f((Object)q, "roomLogger");
        e0e.f((Object)r, "guestServiceApi");
        e0e.f((Object)s, "roomChatManager");
        e0e.f((Object)nmn, "guestActionsEventDispatcher");
        e0e.f((Object)t, "guestStatusCache");
        e0e.f((Object)u, "roomStateManager");
        e0e.f((Object)v, "roomSoundEffectsManager");
        e0e.f((Object)w, "removedListEventDispatcher");
        e0e.f((Object)x, "roomStreamPresenterImpl");
        e0e.f((Object)y, "audioFocusManager");
        e0e.f((Object)bon, "roomHostEventDispatcher");
        e0e.f((Object)yio, "userEventDispatcher");
        e0e.f((Object)z, "usersRepository");
        e0e.f((Object)a2, "roomInviteToSpeakEventDispatcher");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p30;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a2;
        this.B = "";
        final de6 c2 = new de6();
        this.C = c2;
        this.H = (List<? extends qgv>)h3a.F0;
        this.I = new LinkedHashSet();
        c2.a(((t5j)w.a).subscribe((rk6)new b6l((stb)new rcn(this), 7)));
        c2.a(t.d().subscribe((rk6)new xql((stb)new gcn(this), 18)));
        c2.a(((t5j)nmn.a).subscribe((rk6)new aic((stb)new ecn(this), 14)));
        c2.a(((t5j)bon.a).subscribe((rk6)new ltt((stb)new qcn(this), 8)));
        c2.a(((t5j)bon.a).subscribe((rk6)new cyt((stb)new jcn(this), 21)));
        c2.a(((t5j)yio.a).subscribe((rk6)new ucj((stb)new fcn(this), 6)));
        h.i((sj)new lv1(c2, 5));
        h.i((sj)new p00((Object)this, 25));
    }
    
    public static final void b(final hbn hbn, final String s, String b, final String s2, final qu3 qu3) {
        Objects.requireNonNull(hbn);
        if (s2 != null) {
            if (qu3 != null) {
                final String a = qu3.a();
                if (a != null) {
                    final BigInteger n = Message.N(v7q.k());
                    e0e.e((Object)n, "ntpForJson(Clock.currentMillis())");
                    if (b != null) {
                        b = hbn.l.k().b(b);
                    }
                    else {
                        b = null;
                    }
                    hbn.C.a(hbn.r.removeAdmin(IdempotenceHeaderMapImpl.Companion.create().getHeaderMap(), new GuestServiceRemoveAdminRequest(s2, s, a, b, n, (BigInteger)null, 32, (wg8)null)).I(hbn.o).G((rk6)new c6l((stb)pbn.F0, 3), (rk6)new ltt((stb)qbn.F0, 9)));
                }
            }
        }
    }
    
    public final void a() {
        final rmn f = this.f;
        final String b = this.B;
        Objects.requireNonNull(f);
        e0e.f((Object)b, "currentBroadcastId");
        f.m.a(f.q(b));
        this.c((stb<? super pn0, vzv>)hbn$i.F0);
    }
    
    public final void c(final stb<? super pn0, vzv> stb) {
        jb2.y0((ptb)new hbn$e(this, (stb)stb));
    }
    
    public final void d() {
        final cvc b = this.b;
        final nxw c = b.C;
        if (c != null) {
            c.unpublishLocalVideoAndAudio();
        }
        final nxw c2 = b.C;
        if (c2 != null) {
            c2.leave(true);
        }
    }
    
    public final void e(final String b) {
        e0e.f((Object)b, "broadcastId");
        this.B = b;
    }
    
    public final bbq<a67> f(final String s, final int n, final Set<String> set, final boolean b, final boolean b2, final NarrowcastSpaceType narrowcastSpaceType, final String s2) {
        this.w(s, n, set);
        return (bbq<a67>)((bbq)new hcq((idq)new hcq((idq)this.g.b(), (rtb)new x0i((stb)new hbn$c(this), 14)), (rtb)new kzf((stb)new hbn$d(this, s, (Set)set, b, b2, narrowcastSpaceType, s2), 10))).f(this.g.c());
    }
    
    public final bbq<x5m> g(final String s) {
        this.w("", 0, (Set<String>)r3a.F0);
        return (bbq<x5m>)((bbq)new hcq((idq)this.g.b(), (rtb)new wsn((stb)new hbn$l(this, s), 3))).f(this.g.c());
    }
    
    public final bbq<GuestServiceJoinResponse> h(final boolean b, final String s, final boolean b2, final String s2) {
        e0e.f((Object)s, "roomId");
        return (bbq<GuestServiceJoinResponse>)this.g.b().p((rtb)new t3i((stb)new hbn$f(this, b, s, b2, s2), 18)).f(this.g.c());
    }
    
    public final void i(final String s, final String s2) {
        this.l.m(this.B, s, s2).G((rk6)new cyt((stb)hbn$g.F0, 20), (rk6)new xql((stb)hbn$h.F0, 17));
    }
    
    public final bbq<GuestServiceBaseResponse> j(final String s) {
        final cvc b = this.b;
        final int n = 1;
        b.b(true);
        this.c((stb<? super pn0, vzv>)hbn$b.F0);
        final rmn f = this.f;
        Objects.requireNonNull(f);
        final String h = f.f.h();
        if (llr.b((CharSequence)s)) {
            int n2;
            if (h != null && h.length() > 0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                final String uploadBroadcasterLogs = f.j.uploadBroadcasterLogs(s, h);
                final jdq jdq = new jdq();
                ((bbq)jdq).G((rk6)new gpl((stb)new pmn(f), 14), (rk6)new rm8((stb)new qmn(f), 18));
                e0e.e((Object)uploadBroadcasterLogs, "requestId");
                final aba b2;
                b2.i((Object)new omn(uploadBroadcasterLogs, jdq, new Error("Could not upload logs"), b2 = f.b));
            }
        }
        return (bbq<GuestServiceBaseResponse>)f.c.j(s);
    }
    
    public final void k() {
        this.b.d(false);
    }
    
    public final yz5 l(final qu3 qu3) {
        final rmn f = this.f;
        Objects.requireNonNull(f);
        if (qu3 != null) {
            final String a = qu3.a();
            if (a != null) {
                final String a2 = f.l.a();
                if (a2 == null) {
                    final Object o = i06.F0;
                    return (yz5)o;
                }
                final gcu$c i = f.l.a.i();
                ((gcu$d)i).a("unclosed_session");
                i.e();
                final bbq h = f.k.h(a, a2);
                Objects.requireNonNull(h);
                final Object o = new o06((idq)h);
                return (yz5)o;
            }
        }
        final Object o = i06.F0;
        return (yz5)o;
    }
    
    public final void m(final String s, final boolean b) {
        this.b.b(b);
        this.c((stb<? super pn0, vzv>)hbn$b.F0);
    }
    
    public final void n() {
        this.c((stb<? super pn0, vzv>)hbn$m.F0);
    }
    
    public final void o(final Set<String> set) {
        this.I.clear();
        this.I.addAll(set);
    }
    
    public final void p() {
        this.b.d(true);
    }
    
    public final void q() {
        final rmn f = this.f;
        final String b = this.B;
        Objects.requireNonNull(f);
        e0e.f((Object)b, "currentBroadcastId");
        f.m.b(f.q(b));
        final jvc e = this.E;
        if (e != null) {
            e.b();
        }
    }
    
    public final void r(final String s, final String s2, final String s3) {
        this.l.p(this.B, s, s2, s3).G((rk6)new ppl((stb)hbn$j.F0, 9), (rk6)new gpl((stb)hbn$k.F0, 10));
    }
    
    public final void s(final List<String> list) {
        final qu3 g = this.G;
        if (g == null) {
            return;
        }
        final BigInteger n = Message.N(v7q.k());
        e0e.e((Object)n, "ntpForJson(Clock.currentMillis())");
        this.I.addAll(list);
        final wpn a = this.A;
        final Set n2 = rr4.n2((Iterable)list);
        Objects.requireNonNull(a);
        a.a.onNext((Object)n2);
        final String b = this.B;
        final String a2 = g.a();
        if (a2 == null) {
            return;
        }
        this.C.a(this.r.setAudiospaceSettings(IdempotenceHeaderMapImpl.Companion.create().getHeaderMap(), new GuestServiceAudiospaceSettingsModificationRequest(b, a2, rr4.i2((Iterable)this.I), n, n)).I(this.o).D());
    }
    
    public final void t(final a67 a67, final boolean b, final String s) {
        e0e.f((Object)a67, "createdBroadcast");
        this.G = a67.d();
        if (s != null) {
            final String n = this.e.n();
            if (n != null) {
                this.l.u(n, s);
            }
        }
        this.h.i((sj)new ku1(this.g.b().m((rk6)new rm8((stb)hbn$o.F0, 14)).G((rk6)new b6l((stb)new hbn$p(this, a67), 6), (rk6)new aic((stb)hbn$q.F0, 13)), 10));
        this.b.e(a67, true, (stb)new hbn$r(this));
        final jvc e = this.E;
        if (e != null) {
            e.b();
        }
        final d7e d = this.b.D;
        if (d == null) {
            return;
        }
        this.E = new jvc(d, this.l, this.m, this.n, (y9q)this.q);
        final cvc b2 = this.b;
        final nxw c = b2.C;
        if (c != null) {
            c.join();
        }
        b2.h.o();
        b2.i.o();
        this.b.d(b);
    }
    
    public final bbq<a67> u(final String s, final String s2) {
        this.w(s2, 0, (Set<String>)r3a.F0);
        return (bbq<a67>)((bbq)new hcq((idq)new hcq((idq)this.g.b(), (rtb)new uti((stb)new hbn$s(this), 15)), (rtb)new d6i((stb)new hbn$t(this, s), 15))).f(this.g.c());
    }
    
    public final void v(final d7e d7e, final String b, final qu3 g) {
        e0e.f((Object)d7e, "delegate");
        this.B = b;
        this.G = g;
        final rmn f = this.f;
        Objects.requireNonNull(f);
        f.c.A(g.a());
        f.m.a(f.q(b));
        final jvc e = this.E;
        if (e != null) {
            e.b();
        }
        this.E = new jvc(d7e, this.l, this.m, this.n, (y9q)this.q);
    }
    
    public final void w(final String s, final int n, final Set<String> set) {
        this.C.a(((t5j)this.b.v).subscribe((rk6)new ppl((stb)new hbn$n(this, s, n, (Set)set), 10)));
    }
}
