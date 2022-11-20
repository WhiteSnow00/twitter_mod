import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i0k
{
    public static final Set<Integer> b;
    public final Map<String, String> a;
    
    static {
        b = dnp.t((Object)4, (Object[])new Integer[] { 5, 6, 9, 22, 23, 24, 27, 74, 210, 219, 253, 274, 295, 307, 308 });
    }
    
    public i0k(final Map<String, String> a) {
        this.a = a;
    }
    
    public final String a(final bev bev, final String s) {
        final UserIdentifier e = this.e();
        if (s != null && s.equals("recommendations_2")) {
            if (vpi.a().d(e)) {
                return s;
            }
            if (vpi.a().c(e)) {
                return "recommendations_high_priority_2";
            }
            if (vpi.a().b(e)) {
                return "recommendations_default_priority_2";
            }
            if (bev.g(lp.K(e.getStringId(), "recommendations_in_network")) != null) {
                fca.a().b(e, (elm)new af4(new String[] { "notification", "status_bar", "invalid_channel", s, "fallback" }));
                return "recommendations_in_network";
            }
            return s;
        }
        else if (s != null && s.equals("topics")) {
            if (vpi.a().d(e)) {
                return s;
            }
            if (vpi.a().c(e)) {
                return "topics_high_priority";
            }
            if (vpi.a().b(e)) {
                return "topics_default_priority";
            }
            return s;
        }
        else if (s != null && s.equals("tweet_notifications")) {
            if (bev.g(lp.K(e.getStringId(), "tweet_notifications_silent")) != null) {
                return "tweet_notifications_silent";
            }
            return s;
        }
        else {
            if (s == null || (!s.equals("recommendations_in_network") && !s.equals("recommendations_out_of_network"))) {
                Objects.requireNonNull(vpi.a());
                czd.f((Object)e, "userIdentifier");
                if (asa.a(e).b("android_notification_custom_sound_enabled", false) && s != null) {
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
            if (bev.g(lp.K(e.getStringId(), s)) == null) {
                fca.a().b(e, (elm)new af4(new String[] { "notification", "status_bar", "invalid_channel", s, "fallback" }));
                return this.a(bev, "recommendations_2");
            }
            return s;
        }
    }
    
    public final int b() {
        final boolean containsKey = this.a.containsKey("type");
        int n2;
        final int n = n2 = 9;
        if (containsKey) {
            final int n3 = ikr.n((String)this.a.get("type"), 9);
            n2 = n;
            if (i0k.b.contains(n3)) {
                n2 = n3;
            }
        }
        final z7a a = m8a.b().a;
        if (((mxo)a).e()) {
            ((mxo)a).f((Object)"notification_category", (Object)n2);
        }
        return n2;
    }
    
    public final kvi c() {
        final String s = this.a.get("tweet");
        kvi kvi;
        if (ikr.g((CharSequence)s)) {
            kvi = (kvi)gih.e(s, (Class)kvi.class, false);
        }
        else {
            kvi = null;
        }
        return kvi;
    }
    
    public final nvi d() {
        final String s = this.a.get("users");
        nvi nvi;
        if (ikr.g((CharSequence)s)) {
            nvi = (nvi)gih.e(s, (Class)nvi.class, false);
        }
        else {
            nvi = null;
        }
        return nvi;
    }
    
    public final UserIdentifier e() {
        final nvi d = this.d();
        if (d != null) {
            return UserIdentifier.fromId(d.a.a);
        }
        return UserIdentifier.LOGGED_OUT;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("Payload{mPushBundle=");
        j.append(this.a);
        j.append('}');
        return j.toString();
    }
}
