import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import android.net.Uri$Builder;
import java.util.Comparator;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chm implements vtd
{
    public static final chm.chm$a Companion;
    public final eo1 a;
    public final pev b;
    public final wql c;
    public final vrl d;
    public final vgq e;
    
    static {
        Companion = new chm.chm$a();
    }
    
    public chm(final eo1 a, final pev b, final wql c, final vrl d, final vgq e) {
        e0e.f((Object)a, "notificationController");
        e0e.f((Object)b, "notificationManager");
        e0e.f((Object)c, "pushNotificationPresenter");
        e0e.f((Object)d, "pushScoreCalculator");
        e0e.f((Object)e, "actionScriber");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final bti bti, final List<bti> list) {
        e0e.f((Object)bti, "receivedPush");
        e0e.f((Object)list, "notificationsList");
        final wvi k = bti.K;
        e0e.c((Object)k);
        final int c = k.b.c;
        final String s = "delete";
        if (c > 1) {
            final ArrayList list2 = new ArrayList();
            for (final bti next : list) {
                if (next.K != null) {
                    list2.add(next);
                }
            }
            final int size = list2.size();
            vgq.c(this.e, bti, "overridden", 0.0, 0, size, (String)null, (String)null, 108);
            final wvi i = bti.K;
            e0e.c((Object)i);
            final int c2 = i.b.c;
            if (c2 > size) {
                vgq.c(this.e, bti, "Add_push_without_override", 0.0, c2, size, (String)null, (String)null, 100);
                this.c.b(bti);
            }
            else if (k.c > -1.0) {
                final ArrayList list3 = new ArrayList<awj>(nr4.d1((Iterable)list2, 10));
                final Iterator iterator2 = list2.iterator();
                final String s2 = s;
                while (iterator2.hasNext()) {
                    final bti bti2 = (bti)iterator2.next();
                    Objects.requireNonNull(this.d);
                    e0e.f((Object)bti2, "targetPush");
                    final wvi j = bti2.K;
                    double c3;
                    if (j != null) {
                        c3 = j.c;
                    }
                    else {
                        c3 = 0.0;
                    }
                    final g5s a = nq1.a;
                    final long n = System.currentTimeMillis() - bti2.M;
                    final UserIdentifier b = bti2.B;
                    Label_0445: {
                        if (mw.A(dsi.Companion, b, "userIdentifier", b, "android_override_highest_relevancy_decay_enabled", false)) {
                            c3 *= Math.pow(2.0, n * -1.0 / (ita.a(b).f("android_override_highest_relevancy_half_life", 48) * 3600000L));
                        }
                        else {
                            if (ita.a(b).b("android_override_highest_relevancy_ttl_enabled", false)) {
                                if (ita.a(b).f("android_override_highest_relevancy_ttl_threshold", 8) * 3600000L >= n) {
                                    c3 = 1.0;
                                    break Label_0445;
                                }
                            }
                            else if (ita.a(b).b("android_override_highest_relevancy_raw_score_enabled", false) && 604800000L >= n) {
                                break Label_0445;
                            }
                            c3 = 0.0;
                        }
                    }
                    list3.add(new awj((Object)bti2, (Object)c3));
                }
                final List b2 = rr4.b2((Iterable)list3, (Comparator)new dhm());
                final bti bti3 = (bti)((awj)rr4.K1(b2)).F0;
                final bti bti4 = (bti)((awj)rr4.C1(b2)).F0;
                final double doubleValue = ((Number)((awj)rr4.C1(b2)).G0).doubleValue();
                final UserIdentifier b3 = bti.B;
                final wvi l = bti.K;
                e0e.c((Object)l);
                if (doubleValue < l.c) {
                    final wvi m = bti.K;
                    e0e.c((Object)m);
                    final int c4 = m.b.c;
                    final String c5 = bti4.c;
                    this.a.d(shw.x0((Object)bti4.a), b3);
                    this.c.b(bti);
                    this.e.b(bti, "override", doubleValue, c4, list2.size(), String.valueOf(c5), "score");
                    this.e.a(bti, s2);
                }
                else {
                    final Uri$Builder uri$Builder = new Uri$Builder();
                    uri$Builder.scheme("notification").authority(m61.a);
                    uri$Builder.appendQueryParameter("user_id", Long.toString(b3.getId()));
                    final String string = uri$Builder.toString();
                    e0e.e((Object)string, "NotificationTag().append\u2026rId(recipient).toString()");
                    this.b.h(string, bti3.a);
                    this.c.b(bti3);
                    vgq.c(this.e, bti, "score_failure", doubleValue, 0, 0, (String)null, (String)null, 120);
                }
            }
            else {
                final bti bti5 = rr4.b2((Iterable)list2, (Comparator)new ehm()).get(0);
                final int size2 = list2.size();
                final wvi k2 = bti.K;
                e0e.c((Object)k2);
                final int c6 = k2.b.c;
                final String c7 = bti5.c;
                this.a.d(shw.x0((Object)bti5.a), bti.B);
                this.c.b(bti);
                vgq.c(this.e, bti, "override", 0.0, c6, size2, String.valueOf(c7), "time_stamp", 4);
                this.e.a(bti, "delete");
            }
        }
        else {
            this.e.a(bti, "overridden");
            final ArrayList list4 = new ArrayList();
            final UserIdentifier b4 = bti.B;
            final Iterator iterator3 = k.b.a.iterator();
            boolean b5 = false;
            while (iterator3.hasNext()) {
                final String s3 = (String)iterator3.next();
                final Iterator<Object> iterator4 = list.iterator();
                boolean b6 = false;
                while (iterator4.hasNext()) {
                    final bti bti6 = iterator4.next();
                    if (lb0.a(bti6, s3)) {
                        list4.add(bti6.a);
                        this.e.a(bti6, "delete");
                        b6 = true;
                        b5 = true;
                    }
                }
                if (!b6) {
                    this.e.a(bti, "delete_failure");
                    b5 = true;
                }
            }
            this.a.d((List)list4, b4);
            if (b5) {
                this.c.b(bti);
            }
        }
    }
}
