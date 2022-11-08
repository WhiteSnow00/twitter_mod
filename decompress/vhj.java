import java.util.Iterator;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import com.google.gson.Gson;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vhj implements zz<uhj, e3k>
{
    public static final a Companion;
    public final Gson a;
    public final UserIdentifier b;
    public final bu8 c;
    
    static {
        Companion = new a();
    }
    
    public vhj(final Gson a, final UserIdentifier b, final bu8 c) {
        zzd.f((Object)b, "userIdentifier");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final g00 a(final vz vz) {
        final uhj uhj = (uhj)vz;
        zzd.f((Object)uhj, "event");
        final boolean b = dta.b().b("on_device_metrics_enabled", false);
        final g00 g00 = null;
        final lhj lhj = null;
        e3k e3k = (e3k)g00;
        if (b) {
            final List g2 = dta.b().g("on_device_metrics_to_track");
            zzd.e((Object)g2, "getCurrent().getList(\n  \u2026ETRICS_TO_TRACK\n        )");
            if (!g2.contains(uhj.a)) {
                e3k = (e3k)g00;
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append("Received event ");
                sb.append(uhj);
                sb.append(" to convert to Performance Scribe Log");
                cag.a("OnDeviceMetric", sb.toString());
                final String h = this.a.h((Object)vkg.k1(new gvj[] { new gvj((Object)"recent_entries", (Object)uhj.c), new gvj((Object)"past_versions", (Object)uhj.d) }));
                final Iterator iterator = uhj.c.iterator();
                Object next;
                if (!iterator.hasNext()) {
                    next = lhj;
                }
                else {
                    next = iterator.next();
                    if (iterator.hasNext()) {
                        long d = ((lhj)next).d;
                        lhj lhj2 = (lhj)next;
                        do {
                            final Object next2 = iterator.next();
                            final long d2 = ((lhj)next2).d;
                            next = lhj2;
                            long n = d;
                            if (d < d2) {
                                next = next2;
                                n = d2;
                            }
                            lhj2 = (lhj)next;
                            d = n;
                        } while (iterator.hasNext());
                    }
                }
                final lhj lhj3 = (lhj)next;
                e3k = new e3k(l7k.c("on_device_metrics_", uhj.a), this.b, this.c);
                long t0;
                if (lhj3 != null) {
                    t0 = (long)lhj3.b;
                }
                else {
                    t0 = 0L;
                }
                final long u0 = uhj.b;
                e3k.p0 = 2;
                e3k.t0 = t0;
                e3k.u0 = u0;
                e3k.s0 = h;
            }
        }
        return (g00)e3k;
    }
    
    public static final class a
    {
    }
}
