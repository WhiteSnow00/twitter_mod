import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import android.net.Uri$Builder;
import android.os.Build$VERSION;
import java.util.ArrayList;
import com.twitter.util.user.UserIdentifier;
import java.util.HashMap;
import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wnj implements vnj
{
    public static final a Companion;
    public final eo1 a;
    public final erl b;
    public final r9a c;
    public final wev d;
    public final pml<wql> e;
    public final kfw f;
    public final bxo g;
    public final bxo h;
    public final pev i;
    @SuppressLint({ "SimpleDateFormat" })
    public final SimpleDateFormat j;
    public final HashMap<String, Integer> k;
    
    static {
        Companion = new a();
    }
    
    public wnj(final eo1 a, final erl b, final r9a c, final wev d, final pml<wql> e, final kfw f, final bxo g, final bxo h, final pev i) {
        e0e.f((Object)a, "notificationController");
        e0e.f((Object)b, "notificationRepository");
        e0e.f((Object)c, "errorReporter");
        e0e.f((Object)d, "twitterOpenBack");
        e0e.f((Object)e, "pushNotificationPresenter");
        e0e.f((Object)f, "userManager");
        e0e.f((Object)g, "ioScheduler");
        e0e.f((Object)h, "mainScheduler");
        e0e.f((Object)i, "notificationManager");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        this.k = new HashMap<String, Integer>();
    }
    
    public final void a(final bti bti) {
        this.d.d(this.f(bti));
        final UserIdentifier b = bti.B;
        e0e.f((Object)b, "userIdentifier");
        nda.a().b(b, (tlm)new fg4(new String[] { "notifications:openback:message::dismiss" }));
    }
    
    public final void b(final bti bti) {
        this.d.c(this.f(bti));
        final UserIdentifier b = bti.B;
        e0e.f((Object)b, "userIdentifier");
        nda.a().b(b, (tlm)new fg4(new String[] { "notifications:openback:message::open" }));
    }
    
    public final void c(final k6h k6h) {
        final awj<UserIdentifier, Long> g = this.g(k6h);
        this.a.d(shw.x0(g.G0), (UserIdentifier)g.F0);
    }
    
    public final void d(final k6h k6h, final boolean b) {
        final e9a a = this.c.a;
        e0e.e((Object)a, "errorReporter.errorContext");
        ((hyo)this.c.a).a();
        ((hyo)a).f((Object)"Openback Message Id Pair", (Object)this.g(k6h));
        final List d = this.f.d();
        e0e.e((Object)d, "userManager.allLoggedIn");
        final ArrayList list = new ArrayList<String>(nr4.d1((Iterable)d, 10));
        final Iterator iterator = d.iterator();
        while (iterator.hasNext()) {
            list.add(((UserIdentifier)iterator.next()).getStringId());
        }
        ((hyo)a).f((Object)"Logged in Users", (Object)list);
        if (Build$VERSION.SDK_INT >= 23) {
            ((hyo)a).f((Object)"List of Notification Ids Showing", (Object)this.i.e());
        }
        final HashMap<String, Integer> k = this.k;
        final String messageId = k6h.messageId;
        e0e.e((Object)messageId, "message.messageId");
        Integer n;
        if ((n = k.get(messageId)) == null) {
            n = 0;
            k.put(messageId, n);
        }
        final int n2 = n.intValue() + 1;
        if (n2 > 1) {
            final UserIdentifier userIdentifier = (UserIdentifier)this.g(k6h).F0;
            e0e.f((Object)userIdentifier, "userIdentifier");
            nda.a().b(userIdentifier, (tlm)new fg4(new String[] { "notifications:openback:message::retry" }));
        }
        final HashMap<String, Integer> i = this.k;
        final String messageId2 = k6h.messageId;
        e0e.e((Object)messageId2, "message.messageId");
        i.put(messageId2, n2);
        final awj<UserIdentifier, Long> g = this.g(k6h);
        final Uri$Builder uri$Builder = new Uri$Builder();
        uri$Builder.scheme("notification").authority(m61.a);
        uri$Builder.appendQueryParameter("user_id", Long.toString(((UserIdentifier)g.F0).getId()));
        final String string = uri$Builder.toString();
        e0e.e((Object)string, "NotificationTag().append\u2026tIdPair.first).toString()");
        final wev d2 = this.d;
        final String messageId3 = k6h.messageId;
        e0e.e((Object)messageId3, "message.messageId");
        d2.a(messageId3, string, (int)((Number)g.G0).longValue());
        ((bbq)new hcq((idq)this.b.f((UserIdentifier)g.F0, ((Number)g.G0).longValue()).I(this.g).y(this.h), (rtb)new x2i((stb)new wnj$b(this), 6))).G((rk6)new p95((stb)new wnj$c(this, k6h, b), 29), (rk6)new cyt((stb)new wnj$d(this), 6));
    }
    
    public final void e(final bti bti) {
        final rrs$a c = rrs.c;
        final Calendar instance = Calendar.getInstance();
        e0e.e((Object)instance, "getCalendarInstance()");
        final Calendar instance2 = Calendar.getInstance();
        e0e.e((Object)instance2, "getCalendarInstance()");
        instance.add(12, ita.a(bti.B).f("android_notifications_signals_min_window", 1));
        instance2.add(12, ita.a(bti.B).f("android_notifications_signals_max_window", 120));
        final String format = this.j.format(instance.getTime());
        final String format2 = this.j.format(instance2.getTime());
        final String f = this.f(bti);
        final pnj pnj = new pnj(format, format2);
        final UserIdentifier b = bti.B;
        e0e.f((Object)b, "userIdentifier");
        final long h = ita.a(b).h("android_notifications_signals_delay", 0L);
        final UserIdentifier b2 = bti.B;
        e0e.f((Object)b2, "userIdentifier");
        final String k = ita.a(b2).k("android_notifications_signals_signal_type");
        e0e.e((Object)k, "get(userIdentifier)\n    \u2026OID_OPENBACK_SIGNAL_TYPE)");
        final int hashCode = k.hashCode();
        ynj ynj = null;
        Label_0517: {
            if (hashCode != -840442044) {
                if (hashCode != -203416690) {
                    if (hashCode != -92576669) {
                        switch (hashCode) {
                            case -116707828: {
                                if (!k.equals("decisions_4")) {
                                    break;
                                }
                                ynj = new ynj(null, new qnj(ku8.H0), null, null, 29);
                                break Label_0517;
                            }
                            case -116707829: {
                                if (!k.equals("decisions_3")) {
                                    break;
                                }
                                ynj = new ynj(null, new qnj(ku8.I0), null, null, 29);
                                break Label_0517;
                            }
                            case -116707830: {
                                if (!k.equals("decisions_2")) {
                                    break;
                                }
                                ynj = new ynj(null, new qnj(ku8.G0), null, null, 29);
                                break Label_0517;
                            }
                            case -116707831: {
                                if (!k.equals("decisions_1")) {
                                    break;
                                }
                                ynj = new ynj(null, new qnj(ku8.F0), null, null, 29);
                                break Label_0517;
                            }
                        }
                    }
                    else if (k.equals("battery_charging")) {
                        ynj = new ynj(null, null, null, new onj(true), 23);
                        break Label_0517;
                    }
                }
                else if (k.equals("headphone")) {
                    ynj = new ynj(null, null, new snj(true), null, 27);
                    break Label_0517;
                }
            }
            else if (k.equals("unlock")) {
                ynj = new ynj(new znj(true), null, null, null, 30);
                break Label_0517;
            }
            ynj = new ynj(null, null, null, null, 31);
        }
        final String a = fjh.a((Object)new unj(f, pnj, h, ynj, new rnj(0L, (String)null, false, 7, (wg8)null), new tnj(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, false, 1023, (wg8)null)));
        e0e.e((Object)a, "serialize(message)");
        this.d.e(a);
    }
    
    public final String f(final bti bti) {
        final UserIdentifier b = bti.B;
        final long a = bti.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append("-");
        sb.append(a);
        return sb.toString();
    }
    
    public final awj<UserIdentifier, Long> g(final k6h k6h) {
        final String messageId = k6h.messageId;
        e0e.e((Object)messageId, "this.messageId");
        final List n1 = wlr.N1((CharSequence)messageId, new String[] { "-" });
        return (awj<UserIdentifier, Long>)new awj((Object)UserIdentifier.Companion.a(Long.parseLong((String)rr4.C1(n1))), (Object)Long.parseLong((String)rr4.K1(n1)));
    }
    
    public static final class a
    {
    }
}
