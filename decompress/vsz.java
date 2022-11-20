// 
// Decompiled by Procyon v0.6.0
// 

public final class vsz implements usz
{
    public static final fdz A;
    public static final fdz B;
    public static final fdz C;
    public static final fdz D;
    public static final fdz E;
    public static final fdz F;
    public static final fdz G;
    public static final fdz H;
    public static final pdz I;
    public static final fdz J;
    public static final fdz a;
    public static final fdz b;
    public static final fdz c;
    public static final pdz d;
    public static final pdz e;
    public static final fdz f;
    public static final fdz g;
    public static final fdz h;
    public static final fdz i;
    public static final fdz j;
    public static final fdz k;
    public static final fdz l;
    public static final fdz m;
    public static final fdz n;
    public static final fdz o;
    public static final fdz p;
    public static final fdz q;
    public static final fdz r;
    public static final fdz s;
    public static final fdz t;
    public static final fdz u;
    public static final fdz v;
    public static final fdz w;
    public static final fdz x;
    public static final fdz y;
    public static final fdz z;
    
    static {
        final tdz tdz = new tdz(xcz.a(), false, true);
        a = (fdz)tdz.a("measurement.ad_id_cache_time", 10000L);
        b = (fdz)tdz.a("measurement.max_bundles_per_iteration", 100L);
        c = (fdz)tdz.a("measurement.config.cache_time", 86400000L);
        tdz.b("measurement.log_tag", "FA");
        d = new pdz(tdz, "measurement.config.url_authority", "app-measurement.com");
        e = new pdz(tdz, "measurement.config.url_scheme", "https");
        f = (fdz)tdz.a("measurement.upload.debug_upload_interval", 1000L);
        g = (fdz)tdz.a("measurement.lifetimevalue.max_currency_tracked", 4L);
        h = (fdz)tdz.a("measurement.store.max_stored_events_per_app", 100000L);
        i = (fdz)tdz.a("measurement.experiment.max_ids", 50L);
        j = (fdz)tdz.a("measurement.audience.filter_result_max_count", 200L);
        k = (fdz)tdz.a("measurement.alarm_manager.minimum_interval", 60000L);
        l = (fdz)tdz.a("measurement.upload.minimum_delay", 500L);
        m = (fdz)tdz.a("measurement.monitoring.sample_period_millis", 86400000L);
        n = (fdz)tdz.a("measurement.upload.realtime_upload_interval", 10000L);
        o = (fdz)tdz.a("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        tdz.a("measurement.config.cache_time.service", 3600000L);
        p = (fdz)tdz.a("measurement.service_client.idle_disconnect_millis", 5000L);
        tdz.b("measurement.log_tag.service", "FA-SVC");
        q = (fdz)tdz.a("measurement.upload.stale_data_deletion_interval", 86400000L);
        r = (fdz)tdz.a("measurement.sdk.attribution.cache.ttl", 604800000L);
        s = (fdz)tdz.a("measurement.redaction.app_instance_id.ttl", 7200000L);
        t = (fdz)tdz.a("measurement.upload.backoff_period", 43200000L);
        u = (fdz)tdz.a("measurement.upload.initial_upload_delay_time", 15000L);
        v = (fdz)tdz.a("measurement.upload.interval", 3600000L);
        w = (fdz)tdz.a("measurement.upload.max_bundle_size", 65536L);
        x = (fdz)tdz.a("measurement.upload.max_bundles", 100L);
        y = (fdz)tdz.a("measurement.upload.max_conversions_per_day", 500L);
        z = (fdz)tdz.a("measurement.upload.max_error_events_per_day", 1000L);
        A = (fdz)tdz.a("measurement.upload.max_events_per_bundle", 1000L);
        B = (fdz)tdz.a("measurement.upload.max_events_per_day", 100000L);
        C = (fdz)tdz.a("measurement.upload.max_public_events_per_day", 50000L);
        D = (fdz)tdz.a("measurement.upload.max_queue_time", 2419200000L);
        E = (fdz)tdz.a("measurement.upload.max_realtime_events_per_day", 10L);
        F = (fdz)tdz.a("measurement.upload.max_batch_size", 65536L);
        G = (fdz)tdz.a("measurement.upload.retry_count", 6L);
        H = (fdz)tdz.a("measurement.upload.retry_time", 1800000L);
        I = new pdz(tdz, "measurement.upload.url", "https://app-measurement.com/a");
        J = (fdz)tdz.a("measurement.upload.window_interval", 3600000L);
    }
    
    public final long A() {
        return (long)vsz.r.b();
    }
    
    public final long B() {
        return (long)vsz.s.b();
    }
    
    public final long C() {
        return (long)vsz.t.b();
    }
    
    public final long D() {
        return (long)vsz.D.b();
    }
    
    public final long E() {
        return (long)vsz.w.b();
    }
    
    public final long F() {
        return (long)vsz.x.b();
    }
    
    public final long G() {
        return (long)vsz.E.b();
    }
    
    public final long H() {
        return (long)vsz.u.b();
    }
    
    public final long I() {
        return (long)vsz.C.b();
    }
    
    public final long J() {
        return (long)vsz.v.b();
    }
    
    public final long a() {
        return (long)vsz.a.b();
    }
    
    public final long b() {
        return (long)vsz.o.b();
    }
    
    public final long c() {
        return (long)vsz.b.b();
    }
    
    public final long d() {
        return (long)vsz.c.b();
    }
    
    public final long e() {
        return (long)vsz.f.b();
    }
    
    public final long f() {
        return (long)vsz.g.b();
    }
    
    public final long g() {
        return (long)vsz.h.b();
    }
    
    public final long h() {
        return (long)vsz.j.b();
    }
    
    public final long i() {
        return (long)vsz.i.b();
    }
    
    public final long j() {
        return (long)vsz.k.b();
    }
    
    public final long k() {
        return (long)vsz.l.b();
    }
    
    public final long l() {
        return (long)vsz.n.b();
    }
    
    public final long m() {
        return (long)vsz.m.b();
    }
    
    public final long n() {
        return (long)vsz.p.b();
    }
    
    public final long o() {
        return (long)vsz.q.b();
    }
    
    public final long p() {
        return (long)vsz.H.b();
    }
    
    public final long q() {
        return (long)vsz.A.b();
    }
    
    public final long r() {
        return (long)vsz.B.b();
    }
    
    public final long s() {
        return (long)vsz.J.b();
    }
    
    public final long t() {
        return (long)vsz.y.b();
    }
    
    public final long u() {
        return (long)vsz.F.b();
    }
    
    public final long v() {
        return (long)vsz.G.b();
    }
    
    public final long w() {
        return (long)vsz.z.b();
    }
    
    public final String x() {
        return (String)((bez)vsz.I).b();
    }
    
    public final String y() {
        return (String)((bez)vsz.d).b();
    }
    
    public final String z() {
        return (String)((bez)vsz.e).b();
    }
}
