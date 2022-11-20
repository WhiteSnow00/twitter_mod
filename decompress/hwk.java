import java.util.Objects;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwk
{
    public final a a;
    public final eaq<ut8> b;
    public final eaq<rt8> c;
    public final ubk d;
    public final g7k e;
    public final Activity f;
    public final w19 g;
    public final OcfEventReporter h;
    public final xba<bo> i;
    public final sbk j;
    
    public hwk(final a a, final eaq<ut8> b, final eaq<rt8> c, final ubk d, final g7k e, final Activity f, final OcfEventReporter h, final xba<bo> i, final xbm xbm, final sbk j) {
        final w19 g = new w19();
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.i = i;
        this.j = j;
        xbm.i((oj)new srf(g, 3));
    }
    
    public final boolean a() {
        final boolean b = m1f.c().b();
        boolean b2 = true;
        if (b) {
            Objects.requireNonNull(this.j);
            final fmv c = asa.c();
            String s = "none";
            final String l = c.l("gp_android_show_phone_number_and_email_hint", "none");
            if (l != null) {
                s = l;
            }
            if (czd.a((Object)s, (Object)"phone_only") || czd.a((Object)s, (Object)"email_only") || czd.a((Object)s, (Object)"phone_and_email")) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    public interface a
    {
        void b(final Boolean p0);
        
        void g(final String p0);
        
        void i(final String p0);
    }
}
