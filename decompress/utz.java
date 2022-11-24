// 
// Decompiled by Procyon v0.6.0
// 

public final class utz implements ttz
{
    public static final eez A;
    public static final eez B;
    public static final eez C;
    public static final eez D;
    public static final eez E;
    public static final eez F;
    public static final eez G;
    public static final eez H;
    public static final oez I;
    public static final eez J;
    public static final eez a;
    public static final eez b;
    public static final eez c;
    public static final oez d;
    public static final oez e;
    public static final eez f;
    public static final eez g;
    public static final eez h;
    public static final eez i;
    public static final eez j;
    public static final eez k;
    public static final eez l;
    public static final eez m;
    public static final eez n;
    public static final eez o;
    public static final eez p;
    public static final eez q;
    public static final eez r;
    public static final eez s;
    public static final eez t;
    public static final eez u;
    public static final eez v;
    public static final eez w;
    public static final eez x;
    public static final eez y;
    public static final eez z;
    
    static {
        final sez sez = new sez(wdz.a(), false, true);
        a = (eez)sez.a("measurement.ad_id_cache_time", 10000L);
        b = (eez)sez.a("measurement.max_bundles_per_iteration", 100L);
        c = (eez)sez.a("measurement.config.cache_time", 86400000L);
        sez.b("measurement.log_tag", "FA");
        d = new oez(sez, "measurement.config.url_authority", "app-measurement.com");
        e = new oez(sez, "measurement.config.url_scheme", "https");
        f = (eez)sez.a("measurement.upload.debug_upload_interval", 1000L);
        g = (eez)sez.a("measurement.lifetimevalue.max_currency_tracked", 4L);
        h = (eez)sez.a("measurement.store.max_stored_events_per_app", 100000L);
        i = (eez)sez.a("measurement.experiment.max_ids", 50L);
        j = (eez)sez.a("measurement.audience.filter_result_max_count", 200L);
        k = (eez)sez.a("measurement.alarm_manager.minimum_interval", 60000L);
        l = (eez)sez.a("measurement.upload.minimum_delay", 500L);
        m = (eez)sez.a("measurement.monitoring.sample_period_millis", 86400000L);
        n = (eez)sez.a("measurement.upload.realtime_upload_interval", 10000L);
        o = (eez)sez.a("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        sez.a("measurement.config.cache_time.service", 3600000L);
        p = (eez)sez.a("measurement.service_client.idle_disconnect_millis", 5000L);
        sez.b("measurement.log_tag.service", "FA-SVC");
        q = (eez)sez.a("measurement.upload.stale_data_deletion_interval", 86400000L);
        r = (eez)sez.a("measurement.sdk.attribution.cache.ttl", 604800000L);
        s = (eez)sez.a("measurement.redaction.app_instance_id.ttl", 7200000L);
        t = (eez)sez.a("measurement.upload.backoff_period", 43200000L);
        u = (eez)sez.a("measurement.upload.initial_upload_delay_time", 15000L);
        v = (eez)sez.a("measurement.upload.interval", 3600000L);
        w = (eez)sez.a("measurement.upload.max_bundle_size", 65536L);
        x = (eez)sez.a("measurement.upload.max_bundles", 100L);
        y = (eez)sez.a("measurement.upload.max_conversions_per_day", 500L);
        z = (eez)sez.a("measurement.upload.max_error_events_per_day", 1000L);
        A = (eez)sez.a("measurement.upload.max_events_per_bundle", 1000L);
        B = (eez)sez.a("measurement.upload.max_events_per_day", 100000L);
        C = (eez)sez.a("measurement.upload.max_public_events_per_day", 50000L);
        D = (eez)sez.a("measurement.upload.max_queue_time", 2419200000L);
        E = (eez)sez.a("measurement.upload.max_realtime_events_per_day", 10L);
        F = (eez)sez.a("measurement.upload.max_batch_size", 65536L);
        G = (eez)sez.a("measurement.upload.retry_count", 6L);
        H = (eez)sez.a("measurement.upload.retry_time", 1800000L);
        I = new oez(sez, "measurement.upload.url", "https://app-measurement.com/a");
        J = (eez)sez.a("measurement.upload.window_interval", 3600000L);
    }
    
    public final long A() {
        return (long)utz.r.b();
    }
    
    public final long B() {
        return (long)utz.s.b();
    }
    
    public final long C() {
        return (long)utz.t.b();
    }
    
    public final long D() {
        return (long)utz.D.b();
    }
    
    public final long E() {
        return (long)utz.w.b();
    }
    
    public final long F() {
        return (long)utz.x.b();
    }
    
    public final long G() {
        return (long)utz.E.b();
    }
    
    public final long H() {
        return (long)utz.u.b();
    }
    
    public final long I() {
        return (long)utz.C.b();
    }
    
    public final long J() {
        return (long)utz.v.b();
    }
    
    public final long a() {
        return (long)utz.a.b();
    }
    
    public final long b() {
        return (long)utz.o.b();
    }
    
    public final long c() {
        return (long)utz.b.b();
    }
    
    public final long d() {
        return (long)utz.c.b();
    }
    
    public final long e() {
        return (long)utz.f.b();
    }
    
    public final long f() {
        return (long)utz.g.b();
    }
    
    public final long g() {
        return (long)utz.p.b();
    }
    
    public final long h() {
        return (long)utz.j.b();
    }
    
    public final long i() {
        return (long)utz.h.b();
    }
    
    public final long j() {
        return (long)utz.i.b();
    }
    
    public final long k() {
        return (long)utz.k.b();
    }
    
    public final long l() {
        return (long)utz.l.b();
    }
    
    public final long m() {
        return (long)utz.n.b();
    }
    
    public final long n() {
        return (long)utz.m.b();
    }
    
    public final long o() {
        return (long)utz.q.b();
    }
    
    public final long p() {
        return (long)utz.H.b();
    }
    
    public final long q() {
        return (long)utz.A.b();
    }
    
    public final long r() {
        return (long)utz.B.b();
    }
    
    public final long s() {
        return (long)utz.J.b();
    }
    
    public final long t() {
        return (long)utz.y.b();
    }
    
    public final long u() {
        return (long)utz.F.b();
    }
    
    public final long v() {
        return (long)utz.G.b();
    }
    
    public final long w() {
        return (long)utz.z.b();
    }
    
    public final String x() {
        return (String)((afz)utz.I).b();
    }
    
    public final String y() {
        return (String)((afz)utz.d).b();
    }
    
    public final String z() {
        return (String)((afz)utz.e).b();
    }
}
