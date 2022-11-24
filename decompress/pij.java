import java.util.Iterator;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import com.google.gson.Gson;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pij implements yz<oij, x3k>
{
    public static final pij.pij$a Companion;
    public final Gson a;
    public final UserIdentifier b;
    public final qu8 c;
    
    static {
        Companion = new pij.pij$a();
    }
    
    public pij(final Gson a, final UserIdentifier b, final qu8 c) {
        e0e.f((Object)b, "userIdentifier");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final f00 a(final uz uz) {
        final oij oij = (oij)uz;
        e0e.f((Object)oij, "event");
        final boolean b = ita.b().b("on_device_metrics_enabled", false);
        final f00 f00 = null;
        final fij fij = null;
        x3k x3k = (x3k)f00;
        if (b) {
            final List g = ita.b().g("on_device_metrics_to_track");
            e0e.e((Object)g, "getCurrent().getList(\n  \u2026ETRICS_TO_TRACK\n        )");
            if (!g.contains(oij.a)) {
                x3k = (x3k)f00;
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append("Received event ");
                sb.append(oij);
                sb.append(" to convert to Performance Scribe Log");
                nag.a("OnDeviceMetric", sb.toString());
                final String h = this.a.h((Object)mlg.S(new awj[] { new awj((Object)"recent_entries", (Object)oij.c), new awj((Object)"past_versions", (Object)oij.d) }));
                final Iterator iterator = oij.c.iterator();
                Object next;
                if (!iterator.hasNext()) {
                    next = fij;
                }
                else {
                    next = iterator.next();
                    if (iterator.hasNext()) {
                        long d = ((fij)next).d;
                        fij fij2 = (fij)next;
                        do {
                            final Object next2 = iterator.next();
                            final long d2 = ((fij)next2).d;
                            next = fij2;
                            long n = d;
                            if (d < d2) {
                                next = next2;
                                n = d2;
                            }
                            fij2 = (fij)next;
                            d = n;
                        } while (iterator.hasNext());
                    }
                }
                final fij fij3 = (fij)next;
                x3k = new x3k(mqb.l("on_device_metrics_", oij.a), this.b, this.c);
                long t0;
                if (fij3 != null) {
                    t0 = (long)fij3.b;
                }
                else {
                    t0 = 0L;
                }
                final long u0 = oij.b;
                x3k.p0 = 2;
                x3k.t0 = t0;
                x3k.u0 = u0;
                x3k.s0 = h;
            }
        }
        return (f00)x3k;
    }
}
