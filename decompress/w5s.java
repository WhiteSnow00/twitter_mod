import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w5s implements v5s
{
    public static final a Companion;
    public final gcu a;
    public final tsc b;
    public final oxt c;
    public final icu d;
    public volatile klp e;
    public Collection<String> f;
    public volatile h2c g;
    
    static {
        Companion = new a();
    }
    
    public w5s(final gcu a, final tsc b, final oxt c, final icu d) {
        e0e.f((Object)a, "preferences");
        e0e.f((Object)b, "httpRequestController");
        e0e.f((Object)c, "featureConfiguration");
        e0e.f((Object)d, "systemClock");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = (Collection<String>)h3a.F0;
        final rmv b2 = ita.b();
        e0e.e((Object)b2, "getCurrent()");
        t5j.merge((Iterable)new m5e((Object[])new t5j[] { b2.p("traffic_send_synthetic_probes"), b2.p("traffic_image_probe_urls"), b2.p("traffic_video_probe_urls") })).subscribe((rk6)new u5u((stb)new x5s(this), 24));
    }
    
    @Override
    public final void a(final UserIdentifier userIdentifier) {
        e0e.f((Object)userIdentifier, "owner");
        synchronized (this) {
            if (this.c.e && this.e == null && this.g == null) {
                final long d = this.a.d("last_synthetic_probe_timestamp", 0L);
                final long b = this.d.b();
                boolean b2 = false;
                if (b >= d) {
                    final long b3 = this.d.b();
                    Objects.requireNonNull(w5s.Companion);
                    final rmv b4 = ita.b();
                    final int n = 60;
                    int f = b4.f("traffic_api_probe_throttle_seconds", 60);
                    if (f <= 0) {
                        f = n;
                    }
                    if (b3 - d < f * 1000) {
                        b2 = true;
                    }
                }
                if (!b2) {
                    this.g = new h2c((fa3)new in((Object)this, 20), (awj)this.c.f, userIdentifier);
                    monitorexit(this);
                    final tsc b5 = this.b;
                    final h2c g = this.g;
                    e0e.c((Object)g);
                    b5.f(g);
                }
            }
        }
    }
    
    @Override
    public final void b(final UserIdentifier userIdentifier) {
        e0e.f((Object)userIdentifier, "owner");
        if (this.d()) {
            final oxt c = this.c;
            this.e(c.c(eei.I0, c.b, "traffic_image_probe_requests_per_session", 2), userIdentifier, ch4.x1, (z5s)z5s.d);
        }
    }
    
    @Override
    public final void c(final UserIdentifier userIdentifier) {
        e0e.f((Object)userIdentifier, "owner");
        if (this.d()) {
            final oxt c = this.c;
            this.e(c.c(eei.J0, c.c, "traffic_video_probe_requests_per_session", 1), userIdentifier, ch4.x1, (z5s)z5s.d);
        }
    }
    
    public final boolean d() {
        final gcu a = this.a;
        long d = 0L;
        final boolean e = nq1.e(a.d("synthetic_probe_day_start_ms", 0L));
        boolean b = true;
        if (!(e ^ true)) {
            d = this.a.d("synthetic_probe_bytes_received", 0L);
        }
        Objects.requireNonNull(oxt.Companion);
        if (d >= ita.b().h("traffic_synthetic_probe_daily_byte_budget", 2097152L)) {
            b = false;
        }
        return b;
    }
    
    public final void e(final Collection<String> collection, final UserIdentifier userIdentifier, final ch4 ch4, final z5s z5s) {
        synchronized (this) {
            if (this.e == null && !collection.isEmpty()) {
                this.e = new klp((fa3)new kg1((Object)this, 18), userIdentifier, this.b, collection, ch4, z5s);
                monitorexit(this);
                final klp e = this.e;
                if (e != null) {
                    e.d();
                }
            }
        }
    }
    
    public static final class a
    {
    }
}
