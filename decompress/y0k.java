import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y0k
{
    public static final Set<Integer> b;
    public final Map<String, String> a;
    
    static {
        b = aop.t((Object)4, (Object[])new Integer[] { 5, 6, 9, 22, 23, 24, 27, 74, 210, 219, 253, 274, 295, 307, 308 });
    }
    
    public y0k(final Map<String, String> a) {
        this.a = a;
    }
    
    public final String a(final pev pev, final String s) {
        final UserIdentifier e = this.e();
        if (s != null && s.equals("recommendations_2")) {
            if (lqi.a().d(e)) {
                return s;
            }
            if (lqi.a().c(e)) {
                return "recommendations_high_priority_2";
            }
            if (lqi.a().b(e)) {
                return "recommendations_default_priority_2";
            }
            if (pev.g(b1b.p(e.getStringId(), "recommendations_in_network")) != null) {
                nda.a().b(e, (tlm)new fg4(new String[] { "notification", "status_bar", "invalid_channel", s, "fallback" }));
                return "recommendations_in_network";
            }
            return s;
        }
        else if (s != null && s.equals("topics")) {
            if (lqi.a().d(e)) {
                return s;
            }
            if (lqi.a().c(e)) {
                return "topics_high_priority";
            }
            if (lqi.a().b(e)) {
                return "topics_default_priority";
            }
            return s;
        }
        else if (s != null && s.equals("tweet_notifications")) {
            if (pev.g(b1b.p(e.getStringId(), "tweet_notifications_silent")) != null) {
                return "tweet_notifications_silent";
            }
            return s;
        }
        else {
            if (s == null || (!s.equals("recommendations_in_network") && !s.equals("recommendations_out_of_network"))) {
                Objects.requireNonNull(lqi.a());
                e0e.f((Object)e, "userIdentifier");
                if (ita.a(e).b("android_notification_custom_sound_enabled", false) && s != null) {
                    if (s.equals("engagement")) {
                        return "engagement_sound";
                    }
                    if (s.equals("dms")) {
                        return "dms_sound";
                    }
                    if (s.equals("people")) {
                        return "people_sound";
                    }
                    if (s.equals("emergency_alerts")) {
                        return "emergency_alerts_sound";
                    }
                }
                return s;
            }
            if (pev.g(b1b.p(e.getStringId(), s)) == null) {
                nda.a().b(e, (tlm)new fg4(new String[] { "notification", "status_bar", "invalid_channel", s, "fallback" }));
                return this.a(pev, "recommendations_2");
            }
            return s;
        }
    }
    
    public final int b() {
        final boolean containsKey = this.a.containsKey("type");
        int n2;
        final int n = n2 = 9;
        if (containsKey) {
            final int n3 = flr.n((String)this.a.get("type"), 9);
            n2 = n;
            if (y0k.b.contains(n3)) {
                n2 = n3;
            }
        }
        final e9a a = r9a.b().a;
        if (((hyo)a).e()) {
            ((hyo)a).f((Object)"notification_category", (Object)n2);
        }
        return n2;
    }
    
    public final bwi c() {
        final String s = this.a.get("tweet");
        bwi bwi;
        if (flr.g((CharSequence)s)) {
            bwi = uih.e(s, bwi.class, false);
        }
        else {
            bwi = null;
        }
        return bwi;
    }
    
    public final ewi d() {
        final String s = this.a.get("users");
        ewi ewi;
        if (flr.g((CharSequence)s)) {
            ewi = uih.e(s, ewi.class, false);
        }
        else {
            ewi = null;
        }
        return ewi;
    }
    
    public final UserIdentifier e() {
        final ewi d = this.d();
        if (d != null) {
            return UserIdentifier.fromId(d.a.a);
        }
        return UserIdentifier.LOGGED_OUT;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("Payload{mPushBundle=");
        f.append(this.a);
        f.append('}');
        return f.toString();
    }
}
