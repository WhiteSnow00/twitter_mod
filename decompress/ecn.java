import java.util.Map;
import tv.periscope.android.api.service.room.RoomGuestServiceApi;
import java.math.BigInteger;
import java.util.LinkedHashSet;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceDeclineReasonRequest;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceAllowDenyModificationRequest;
import java.util.Objects;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceAudiospaceSettingsModificationRequest;
import tv.periscope.chatman.api.IdempotenceHeaderMapImpl;
import tv.periscope.model.chat.Message;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ecn extends pue implements stb<nmn$a, vzv>
{
    public final hbn F0;
    
    public ecn(final hbn f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final nmn$a nmn$a = (nmn$a)o;
        if (nmn$a instanceof nmn$a.b) {
            final hbn f0 = this.F0;
            final jvc e = f0.E;
            if (e != null) {
                e.a(((nmn$a.b)nmn$a).a, true, (ptb)new vbn(f0));
            }
        }
        else if (nmn$a instanceof nmn$a.g) {
            final jvc e2 = this.F0.E;
            if (e2 != null) {
                final String a = ((nmn$a.g)nmn$a).a;
                e0e.f((Object)a, "userId");
                e2.f(a);
                e2.f.a(e2.b.l(a).G((rk6)new o0m((stb)new mvc(e2, a), 22), (rk6)new mt0((stb)new nvc(e2, a), 20)));
            }
        }
        else if (nmn$a instanceof nmn$a.j) {
            final LinkedHashSet i = this.F0.I;
            final nmn$a.j j = (nmn$a.j)nmn$a;
            i.remove(j.b);
            this.F0.A.a(j.b);
            final BigInteger n = Message.N(v7q.k());
            e0e.e((Object)n, "ntpForJson(Clock.currentMillis())");
            final hbn f2 = this.F0;
            final de6 c = f2.C;
            final RoomGuestServiceApi r = f2.r;
            final Map headerMap = IdempotenceHeaderMapImpl.Companion.create().getHeaderMap();
            final hbn f3 = this.F0;
            final String b = f3.B;
            final qu3 g = f3.G;
            if (g != null) {
                final String a2 = g.a();
                if (a2 != null) {
                    c.a(r.setAudiospaceSettings(headerMap, new GuestServiceAudiospaceSettingsModificationRequest(b, a2, rr4.i2((Iterable)this.F0.I), n, n)).I(this.F0.o).G((rk6)new c6l((stb)wbn.F0, 4), (rk6)new ppl((stb)xbn.F0, 11)));
                    final hbn f4 = this.F0;
                    final jvc e3 = f4.E;
                    if (e3 != null) {
                        final String a3 = j.a;
                        final qu3 g2 = f4.G;
                        if (g2 != null) {
                            e3.d(a3, g2);
                        }
                    }
                }
            }
        }
        else if (nmn$a instanceof nmn$a.f) {
            final qu3 g3 = this.F0.G;
            if (g3 != null) {
                final nmn$a.f f5 = (nmn$a.f)nmn$a;
                final String a4 = f5.a;
                final String b2 = f5.b;
                final BigInteger n2 = Message.N(v7q.k());
                e0e.e((Object)n2, "ntpForJson(Clock.currentMillis())");
                this.F0.I.add(b2);
                final wpn a5 = this.F0.A;
                Objects.requireNonNull(a5);
                e0e.f((Object)b2, "userId");
                a5.b.onNext((Object)b2);
                final String b3 = this.F0.B;
                final String a6 = g3.a();
                if (a6 != null) {
                    final GuestServiceAudiospaceSettingsModificationRequest guestServiceAudiospaceSettingsModificationRequest = new GuestServiceAudiospaceSettingsModificationRequest(b3, a6, rr4.i2((Iterable)this.F0.I), n2, n2);
                    final hbn f6 = this.F0;
                    f6.C.a(f6.r.setAudiospaceSettings(IdempotenceHeaderMapImpl.Companion.create().getHeaderMap(), guestServiceAudiospaceSettingsModificationRequest).I(this.F0.o).G((rk6)new gpl((stb)new ybn(this.F0, a4), 12), (rk6)new rm8((stb)zbn.F0, 16)));
                }
            }
        }
        else if (nmn$a instanceof nmn$a.c) {
            final hbn f7 = this.F0;
            final qu3 g4 = f7.G;
            if (g4 != null) {
                final LinkedHashSet k = f7.I;
                final nmn$a.c c2 = (nmn$a.c)nmn$a;
                k.remove(c2.b);
                this.F0.A.a(c2.b);
                final BigInteger n3 = Message.N(v7q.k());
                e0e.e((Object)n3, "ntpForJson(Clock.currentMillis())");
                o = new(tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceAudiospaceSettingsModificationRequest.class)();
                final String b4 = this.F0.B;
                final String a7 = g4.a();
                if (a7 != null) {
                    new GuestServiceAudiospaceSettingsModificationRequest(b4, a7, rr4.i2((Iterable)this.F0.I), n3, n3);
                    final hbn f8 = this.F0;
                    f8.C.a(f8.r.setAudiospaceSettings(IdempotenceHeaderMapImpl.Companion.create().getHeaderMap(), (GuestServiceAudiospaceSettingsModificationRequest)o).I(this.F0.o).G((rk6)new b6l((stb)acn.F0, 9), (rk6)new aic((stb)bcn.F0, 16)));
                }
            }
        }
        else if (nmn$a instanceof nmn$a.h) {
            final hbn f9 = this.F0;
            final qu3 g5 = f9.G;
            if (g5 != null) {
                final String b5 = f9.B;
                final String a8 = g5.a();
                if (a8 != null) {
                    final nmn$a.h h = (nmn$a.h)nmn$a;
                    final GuestServiceAllowDenyModificationRequest guestServiceAllowDenyModificationRequest = new GuestServiceAllowDenyModificationRequest(b5, a8, shw.x0((Object)h.b));
                    this.F0.I.remove(h.b);
                    this.F0.A.a(h.b);
                    final BigInteger n4 = Message.N(v7q.k());
                    e0e.e((Object)n4, "ntpForJson(Clock.currentMillis())");
                    o = new(tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceAudiospaceSettingsModificationRequest.class)();
                    final String b6 = this.F0.B;
                    final String a9 = g5.a();
                    if (a9 != null) {
                        new GuestServiceAudiospaceSettingsModificationRequest(b6, a9, rr4.i2((Iterable)this.F0.I), n4, n4);
                        final hbn f10 = this.F0;
                        f10.C.a(((bbq)new hcq((idq)f10.r.addTwitterUsersToDenyList(IdempotenceHeaderMapImpl.Companion.create().getHeaderMap(), guestServiceAllowDenyModificationRequest).I(this.F0.o), (rtb)new yql((stb)new ccn(this.F0, (GuestServiceAudiospaceSettingsModificationRequest)o), 17))).G((rk6)new xql((stb)dcn.F0, 19), (rk6)new ucj((stb)sbn.F0, 7)));
                    }
                }
            }
        }
        else if (nmn$a instanceof nmn$a.e) {
            final String b7 = this.F0.B;
            Objects.requireNonNull(nmn$a);
            final GuestServiceDeclineReasonRequest guestServiceDeclineReasonRequest = new GuestServiceDeclineReasonRequest(b7, 0);
            final hbn f11 = this.F0;
            f11.C.a(f11.r.updateDeclineReason(IdempotenceHeaderMapImpl.Companion.create().getHeaderMap(), guestServiceDeclineReasonRequest).I(this.F0.o).G((rk6)new c6l((stb)tbn.F0, 5), (rk6)new ltt((stb)ubn.F0, 10)));
        }
        return vzv.a;
    }
}
