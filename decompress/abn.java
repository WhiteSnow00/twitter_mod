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

public final class abn extends gue implements rtb<iln$a, oyv>
{
    public final /* synthetic */ dan C0;
    
    public abn(final dan c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final iln$a iln$a = (iln$a)o;
        if (iln$a instanceof iln$a$b) {
            final dan c0 = this.C0;
            final dvc e = c0.E;
            if (e != null) {
                e.a(((iln$a$b)iln$a).a, true, (otb)new ran(c0));
            }
        }
        else if (iln$a instanceof iln$a$g) {
            final dvc e2 = this.C0.E;
            if (e2 != null) {
                final String a = ((iln$a$g)iln$a).a;
                zzd.f((Object)a, "userId");
                e2.f(a);
                e2.f.a(e2.b.l(a).G((fk6)new bor((rtb)new gvc(e2, a), 23), (fk6)new b5p((rtb)new hvc(e2, a), 14)));
            }
        }
        else if (iln$a instanceof iln$a$j) {
            final LinkedHashSet i = this.C0.I;
            final iln$a$j iln$a$j = (iln$a$j)iln$a;
            i.remove(iln$a$j.b);
            this.C0.A.a(iln$a$j.b);
            final BigInteger n = Message.N(r9i.e());
            zzd.e((Object)n, "ntpForJson(Clock.currentMillis())");
            final dan c2 = this.C0;
            final rd6 c3 = c2.C;
            final RoomGuestServiceApi r = c2.r;
            final Map headerMap = IdempotenceHeaderMapImpl.Companion.create().getHeaderMap();
            final dan c4 = this.C0;
            final String b = c4.B;
            final iu3 g = c4.G;
            if (g != null) {
                final String a2 = g.a();
                if (a2 != null) {
                    c3.a(r.setAudiospaceSettings(headerMap, new GuestServiceAudiospaceSettingsModificationRequest(b, a2, or4.m2((Iterable)this.C0.I), n, n)).I(this.C0.o).G((fk6)new ccj((rtb)san.C0, 9), (fk6)new aqi((rtb)tan.C0, 16)));
                    final dan c5 = this.C0;
                    final dvc e3 = c5.E;
                    if (e3 != null) {
                        final String a3 = iln$a$j.a;
                        final iu3 g2 = c5.G;
                        if (g2 != null) {
                            e3.d(a3, g2);
                        }
                    }
                }
            }
        }
        else if (iln$a instanceof iln$a$f) {
            final iu3 g3 = this.C0.G;
            if (g3 != null) {
                final iln$a$f iln$a$f = (iln$a$f)iln$a;
                final String a4 = iln$a$f.a;
                final String b2 = iln$a$f.b;
                final BigInteger n2 = Message.N(r9i.e());
                zzd.e((Object)n2, "ntpForJson(Clock.currentMillis())");
                this.C0.I.add(b2);
                final son a5 = this.C0.A;
                Objects.requireNonNull(a5);
                zzd.f((Object)b2, "userId");
                a5.b.onNext((Object)b2);
                final String b3 = this.C0.B;
                final String a6 = g3.a();
                if (a6 != null) {
                    final GuestServiceAudiospaceSettingsModificationRequest guestServiceAudiospaceSettingsModificationRequest = new GuestServiceAudiospaceSettingsModificationRequest(b3, a6, or4.m2((Iterable)this.C0.I), n2, n2);
                    final dan c6 = this.C0;
                    c6.C.a(c6.r.setAudiospaceSettings(IdempotenceHeaderMapImpl.Companion.create().getHeaderMap(), guestServiceAudiospaceSettingsModificationRequest).I(this.C0.o).G((fk6)new zgw((rtb)new uan(this.C0, a4), 8), (fk6)new hlx((rtb)van.C0, 11)));
                }
            }
        }
        else if (iln$a instanceof iln$a$c) {
            final dan c7 = this.C0;
            final iu3 g4 = c7.G;
            if (g4 != null) {
                final LinkedHashSet j = c7.I;
                final iln$a$c iln$a$c = (iln$a$c)iln$a;
                j.remove(iln$a$c.b);
                this.C0.A.a(iln$a$c.b);
                final BigInteger n3 = Message.N(r9i.e());
                zzd.e((Object)n3, "ntpForJson(Clock.currentMillis())");
                o = new(tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceAudiospaceSettingsModificationRequest.class)();
                final String b4 = this.C0.B;
                final String a7 = g4.a();
                if (a7 != null) {
                    new GuestServiceAudiospaceSettingsModificationRequest(b4, a7, or4.m2((Iterable)this.C0.I), n3, n3);
                    final dan c8 = this.C0;
                    c8.C.a(c8.r.setAudiospaceSettings(IdempotenceHeaderMapImpl.Companion.create().getHeaderMap(), (GuestServiceAudiospaceSettingsModificationRequest)o).I(this.C0.o).G((fk6)new xol((rtb)wan.C0, 12), (fk6)new yhc((rtb)xan.C0, 16)));
                }
            }
        }
        else if (iln$a instanceof iln$a$h) {
            final dan c9 = this.C0;
            final iu3 g5 = c9.G;
            if (g5 != null) {
                final String b5 = c9.B;
                final String a8 = g5.a();
                if (a8 != null) {
                    final iln$a$h iln$a$h = (iln$a$h)iln$a;
                    final GuestServiceAllowDenyModificationRequest guestServiceAllowDenyModificationRequest = new GuestServiceAllowDenyModificationRequest(b5, a8, tdy.u0((Object)iln$a$h.b));
                    this.C0.I.remove(iln$a$h.b);
                    this.C0.A.a(iln$a$h.b);
                    final BigInteger n4 = Message.N(r9i.e());
                    zzd.e((Object)n4, "ntpForJson(Clock.currentMillis())");
                    o = new(tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceAudiospaceSettingsModificationRequest.class)();
                    final String b6 = this.C0.B;
                    final String a9 = g5.a();
                    if (a9 != null) {
                        new GuestServiceAudiospaceSettingsModificationRequest(b6, a9, or4.m2((Iterable)this.C0.I), n4, n4);
                        final dan c10 = this.C0;
                        c10.C.a(((n9q)new taq((ubq)c10.r.addTwitterUsersToDenyList(IdempotenceHeaderMapImpl.Companion.create().getHeaderMap(), guestServiceAllowDenyModificationRequest).I(this.C0.o), (qtb)new wpl((rtb)new yan(this.C0, (GuestServiceAudiospaceSettingsModificationRequest)o), 16))).G((fk6)new nol((rtb)zan.C0, 16), (fk6)new c5l((rtb)oan.C0, 5)));
                    }
                }
            }
        }
        else if (iln$a instanceof iln$a$e) {
            final String b7 = this.C0.B;
            Objects.requireNonNull((iln$a$e)iln$a);
            final GuestServiceDeclineReasonRequest guestServiceDeclineReasonRequest = new GuestServiceDeclineReasonRequest(b7, 0);
            final dan c11 = this.C0;
            c11.C.a(c11.r.updateDeclineReason(IdempotenceHeaderMapImpl.Companion.create().getHeaderMap(), guestServiceDeclineReasonRequest).I(this.C0.o).G((fk6)new ccj((rtb)pan.C0, 10), (fk6)new tst((rtb)qan.C0, 11)));
        }
        return oyv.a;
    }
}
