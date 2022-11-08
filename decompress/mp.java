import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mp
{
    public static lq a;
    
    public static lq a() {
        synchronized (mp.class) {
            final int a = l10.a;
            Objects.requireNonNull(m10.Companion);
            if (((m10)((v4j)jr0.Companion.a()).B((Class)m10.class)).h2().d()) {
                return null;
            }
            lq lq = mp.a;
            if (lq == null) {
                lq = b();
            }
            return lq;
        }
    }
    
    public static lq b() {
        final xau c = wau.c();
        final boolean e = c.e("adid_no_tracking_enabled", false);
        final String j = c.j("adid_identifier", "");
        lq lq;
        if (pjr.g((CharSequence)j)) {
            lq = new lq(j, e);
        }
        else {
            lq = null;
        }
        return lq;
    }
    
    public static void c(final lq lq) {
        synchronized (mp.class) {
            final int a = l10.a;
            Objects.requireNonNull(m10.Companion);
            if (((m10)((v4j)jr0.Companion.a()).B((Class)m10.class)).h2().d()) {
                return;
            }
            d(lq);
        }
    }
    
    public static void d(final lq a) {
        synchronized (mp.class) {
            mp.a = a;
            if (a != null) {
                wau.c().i().f("adid_no_tracking_enabled", a.b).b("adid_identifier", a.a).e();
            }
            else {
                wau.c().i().a("adid_identifier").a("adid_no_tracking_enabled").e();
            }
            nds.a((Class)mp.class);
        }
    }
}
