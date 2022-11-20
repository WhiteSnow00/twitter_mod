import java.util.Iterator;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import com.google.gson.Gson;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bij implements a00<aij, g3k>
{
    public static final a Companion;
    public final Gson a;
    public final UserIdentifier b;
    public final kt8 c;
    
    static {
        Companion = new a();
    }
    
    public bij(final Gson a, final UserIdentifier b, final kt8 c) {
        czd.f((Object)b, "userIdentifier");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final h00 a(final wz wz) {
        final aij aij = (aij)wz;
        czd.f((Object)aij, "event");
        final boolean b = asa.b().b("on_device_metrics_enabled", false);
        final h00 h00 = null;
        final rhj rhj = null;
        g3k g3k = (g3k)h00;
        if (b) {
            final List g = asa.b().g("on_device_metrics_to_track");
            czd.e((Object)g, "getCurrent().getList(\n  \u2026ETRICS_TO_TRACK\n        )");
            if (!g.contains(aij.a)) {
                g3k = (g3k)h00;
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append("Received event ");
                sb.append(aij);
                sb.append(" to convert to Performance Scribe Log");
                s9g.a("OnDeviceMetric", sb.toString());
                final String h2 = this.a.h((Object)tkg.n0(new lvj[] { new lvj((Object)"recent_entries", (Object)aij.c), new lvj((Object)"past_versions", (Object)aij.d) }));
                final Iterator iterator = aij.c.iterator();
                Object next;
                if (!iterator.hasNext()) {
                    next = rhj;
                }
                else {
                    next = iterator.next();
                    if (iterator.hasNext()) {
                        long d = ((rhj)next).d;
                        rhj rhj2 = (rhj)next;
                        do {
                            final Object next2 = iterator.next();
                            final long d2 = ((rhj)next2).d;
                            next = rhj2;
                            long n = d;
                            if (d < d2) {
                                next = next2;
                                n = d2;
                            }
                            rhj2 = (rhj)next;
                            d = n;
                        } while (iterator.hasNext());
                    }
                }
                final rhj rhj3 = (rhj)next;
                g3k = new g3k(hmg.h("on_device_metrics_", aij.a), this.b, this.c);
                long t0;
                if (rhj3 != null) {
                    t0 = (long)rhj3.b;
                }
                else {
                    t0 = 0L;
                }
                final long u0 = aij.b;
                g3k.p0 = 2;
                g3k.t0 = t0;
                g3k.u0 = u0;
                g3k.s0 = h2;
            }
        }
        return (h00)g3k;
    }
    
    public static final class a
    {
    }
}
