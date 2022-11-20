import java.util.Iterator;
import java.util.Map;
import com.twitter.analytics.tracking.b;
import com.twitter.analytics.tracking.b$a;
import com.twitter.analytics.tracking.a;
import com.twitter.util.user.UserIdentifier;
import android.provider.Settings$Secure;
import com.twitter.analytics.tracking.InstallationReferrer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsd implements oj
{
    public final InstallationReferrer D0;
    public final String E0;
    public final m40 F0;
    public final String G0;
    public final boolean H0;
    public final t4c I0;
    public final String J0;
    
    public hsd(final InstallationReferrer d0, final String e0, final m40 f0, final String g0, final boolean h0, final t4c i0, final String j0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final void run() {
        final InstallationReferrer d0 = this.D0;
        final String e0 = this.E0;
        final m40 f0 = this.F0;
        final String g0 = this.G0;
        final boolean h0 = this.H0;
        final t4c i0 = this.I0;
        final String j0 = this.J0;
        final String string = Settings$Secure.getString(d0.a.getContentResolver(), "android_id");
        final af4 af4 = new af4(UserIdentifier.LOGGED_OUT);
        ((u0p)af4).q(new String[] { "external::::referred" });
        ((u0p)af4).f("4", string);
        final lq value = d0.e.get();
        final iq k = d0.i;
        np.a();
        if (!k.a(value)) {
            np.c(value);
            if (value != null) {
                ((u0p)af4).f("6", value.a);
                ((u0p)af4).x(value.b);
            }
        }
        boolean b = false;
        if (e0 != null) {
            d0.c.g(e0, null);
            final Map<String, String> f2 = a.f(e0);
            final Iterator iterator = a.i.keySet().iterator();
            while (iterator.hasNext()) {
                if (f2.containsKey(iterator.next())) {
                    b = true;
                }
            }
            String s;
            if (b) {
                s = "twsrc";
            }
            else {
                s = "utm_source";
            }
            final String s2 = f2.get(s);
            String s3;
            if (b) {
                s3 = "twgr";
            }
            else {
                s3 = "utm_medium";
            }
            final String s4 = f2.get(s3);
            String s5;
            if (b) {
                s5 = "twcamp";
            }
            else {
                s5 = "utm_campaign";
            }
            final String s6 = f2.get(s5);
            String s7;
            if (b) {
                s7 = "twterm";
            }
            else {
                s7 = "utm_term";
            }
            final String s8 = f2.get(s7);
            String s9;
            if (b) {
                s9 = "twcon";
            }
            else {
                s9 = "utm_content";
            }
            final String s10 = f2.get(s9);
            Object o;
            if (b) {
                o = null;
            }
            else {
                o = "gclid";
            }
            ((u0p)af4).h(s2, s4, s6, s8, s10, (String)f2.get(o), e0);
            final b$a b$a = new b$a();
            b$a.c = g0;
            b$a.a = e0;
            b$a.f = i0;
            if (h0) {
                b$a.b = e0;
            }
            if (f0 != null) {
                b$a.e = f0;
            }
            d0.c.i(1, (b)((n4j)b$a).e());
        }
        else if (asa.b().b("app_event_track_non_referred_install_enabled", false)) {
            d0.c.h(6);
        }
        cbw.b((elm)af4);
        final af4 af5 = new af4(new String[] { "external::oem:referrer:set" });
        ((u0p)af5).t = j0;
        final int a = c5j.a;
        cbw.b((elm)af5);
    }
}
