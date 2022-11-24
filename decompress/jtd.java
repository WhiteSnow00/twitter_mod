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

public final class jtd implements sj
{
    public final InstallationReferrer F0;
    public final String G0;
    public final l40 H0;
    public final String I0;
    public final boolean J0;
    public final v5c K0;
    public final String L0;
    
    public jtd(final InstallationReferrer f0, final String g0, final l40 h0, final String i0, final boolean j0, final v5c k0, final String l0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
    }
    
    public final void run() {
        final InstallationReferrer f0 = this.F0;
        final String g0 = this.G0;
        final l40 h0 = this.H0;
        final String i0 = this.I0;
        final boolean j0 = this.J0;
        final v5c k0 = this.K0;
        final String l0 = this.L0;
        final String string = Settings$Secure.getString(f0.a.getContentResolver(), "android_id");
        final fg4 fg4 = new fg4(UserIdentifier.LOGGED_OUT);
        ((o1p)fg4).q(new String[] { "external::::referred" });
        ((o1p)fg4).f("4", string);
        final nq value = f0.e.get();
        final kq m = f0.i;
        pp.a();
        if (!m.a(value)) {
            pp.c(value);
            if (value != null) {
                ((o1p)fg4).f("6", value.a);
                ((o1p)fg4).x(value.b);
            }
        }
        boolean b = false;
        if (g0 != null) {
            f0.c.g(g0, (String)null);
            final Map f2 = a.f(g0);
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
            ((o1p)fg4).h(s2, s4, s6, s8, s10, (String)f2.get(o), g0);
            final b$a b$a = new b$a();
            b$a.c = i0;
            b$a.a = g0;
            b$a.f = k0;
            if (j0) {
                b$a.b = g0;
            }
            if (h0 != null) {
                b$a.e = h0;
            }
            f0.c.i(1, (b)((z4j)b$a).e());
        }
        else if (ita.b().b("app_event_track_non_referred_install_enabled", false)) {
            f0.c.h(6);
        }
        sbw.b((tlm)fg4);
        final fg4 fg5 = new fg4(new String[] { "external::oem:referrer:set" });
        ((o1p)fg5).t = l0;
        final int a = o5j.a;
        sbw.b((tlm)fg5);
    }
}
