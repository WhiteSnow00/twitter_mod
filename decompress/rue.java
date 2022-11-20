import java.util.Locale;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rue
{
    public static final boolean N;
    public static final long O;
    public g0r A;
    public g0r B;
    public g0r C;
    public g0r D;
    public g0r E;
    public final boolean F;
    public boolean G;
    public boolean H;
    public final long I;
    public final boolean J;
    public boolean K;
    public long L;
    public long M;
    public final cah a;
    public final vvt b;
    public final ar0 c;
    public final long d;
    public final sbu e;
    public final mv1<taf> f;
    public final mv1<Void> g;
    public final fca<elm> h;
    public final wm0 i;
    public final wc6 j;
    public final wc6 k;
    public final yvk l;
    public z0b m;
    public z0b n;
    public z0b o;
    public z0b p;
    public z0b q;
    public y0k r;
    public g0r s;
    public g0r t;
    public g0r u;
    public g0r v;
    public g0r w;
    public g0r x;
    public g0r y;
    public y0k z;
    
    static {
        N = Log.isLoggable("TTFT", 3);
        O = TimeUnit.SECONDS.toMillis(5L);
    }
    
    public rue(final Context context, final cah a, final ar0 c, final sbu e, final fca<elm> h, final xbm xbm, final wm0 i) {
        final wc6 j = new wc6();
        this.j = j;
        final wc6 k = new wc6();
        this.k = k;
        this.a = a;
        final vvt b6 = ((s0k)((b5j)br0.a()).B((Class)s0k.class)).b6();
        this.b = b6;
        this.c = c;
        this.e = e;
        this.h = h;
        this.i = i;
        final long f = c.f();
        this.d = f;
        this.I = asa.b().h("metrics_launch_tracker_pct_ttft_cold_start_filter_heuristic", rue.O);
        this.J = asa.b().b("metrics_launch_tracker_background_launch_metrics_enabled", false);
        this.F = o70.j(context);
        final mv1 f2 = new mv1();
        this.f = (mv1<taf>)f2;
        this.g = (mv1<Void>)new mv1();
        final yvk l = new yvk((h5j<taf>)f2, e, xbm);
        this.l = l;
        this.e(f, false);
        final y0k g = b6.g("home-timeline-ttft", UserIdentifier.getCurrent(), 4);
        this.r = g;
        this.s = (g0r)vvt.d(b6, "app-init", g, (b0r)null, 16);
        this.t = (g0r)vvt.d(b6, "home-timeline-cached-ttft", this.r, (b0r)null, 16);
        this.u = (g0r)vvt.d(b6, "home-activity-init", this.r, (b0r)null, 16);
        this.v = (g0r)vvt.d(b6, "home-timeline-cache-load", this.r, (b0r)null, 16);
        this.w = (g0r)vvt.d(b6, "home-timeline-cache-render", this.r, (b0r)null, 16);
        this.x = (g0r)vvt.d(b6, "home-timeline-api-load", this.r, (b0r)null, 16);
        this.y = (g0r)vvt.d(b6, "home-timeline-api-render", this.r, (b0r)null, 16);
        final long n = e.b() - f;
        final y0k r = this.r;
        if (r != null) {
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            r.a(n, milliseconds);
            final y0k r2 = this.r;
            final long v = r2.V();
            final TimeUnit microseconds = TimeUnit.MICROSECONDS;
            k.a(new bbu(b6, r2, (h5j)f2, e, milliseconds.convert(v, microseconds), l).b());
            final y0k r3 = this.r;
            k.a(new cbu(b6, r3, (h5j)f2, milliseconds.convert(r3.V(), microseconds), e).b());
            k.a(((zau)new abu(b6, this.r, (h5j)f2)).b());
            k.a(new xau(b6, (b0r)this.x, (h5j)f2).b());
            k.a(((zau)new wau(b6, (b0r)this.x, (h5j)f2)).b());
            k.a(((zau)new yau(b6, (b0r)this.x, (h5j)f2)).b());
        }
        final g0r s = this.s;
        if (s != null) {
            s.a(n, TimeUnit.MILLISECONDS);
        }
        final g0r t = this.t;
        if (t != null) {
            t.a(n, TimeUnit.MILLISECONDS);
        }
        xbm.i((oj)new q9s(new wc6(new t19[] { c.b().B().subscribe((lj6)new iag(this, 11)), c.b().f().subscribe((lj6)new a1p((Object)this, 10)) }), 1));
        xbm.i((oj)new que(j, 0));
        xbm.i((oj)new i00(k, 1));
    }
    
    public static rue d() {
        return ((j2v)((b5j)br0.a()).B((Class)j2v.class)).Y1();
    }
    
    public final void a() {
        final oir g0 = oir.G0;
        synchronized (this) {
            this.G = false;
            this.H = false;
            final y0k r = this.r;
            if (r != null && r.a0()) {
                ((z0k)this.r.a).U(g0);
            }
            final y0k z = this.z;
            if (z != null && z.a0()) {
                ((z0k)this.z.a).U(g0);
            }
            ((cjg)this.p).k();
            ((cjg)this.o).k();
            ((cjg)this.n).k();
            ((cjg)this.m).k();
            ((cjg)this.q).k();
        }
    }
    
    public final void b() {
        final y0k r = this.r;
        if (r != null) {
            r.cancel();
        }
        this.k.e();
    }
    
    public final dat c(final String s, final long n, final boolean b) {
        final cjg b2 = this.a.b(s);
        if (b2 != null) {
            ((x9h)this.a).e(b2);
            b2.k();
        }
        final z0b z0b = new z0b(s, (w9h$b)w9h.k, s, (x9h)this.a, n);
        ((w9h)z0b).b = "TTFT";
        this.a.f((cjg)z0b);
        if (b) {
            ((cjg)z0b).h();
        }
        final int a = c5j.a;
        return (dat)z0b;
    }
    
    public final void e(final long n, final boolean b) {
        this.m = (z0b)this.c("app:ready_cold", n, b);
        this.n = (z0b)this.c("home:first_tweet_cold_cache", n, b);
        this.o = (z0b)this.c("home:first_tweet_request", n, b);
        this.p = (z0b)this.c("home:first_tweet_cold_api", n, b);
        this.q = (z0b)this.c("home:first_tweet_cold_cache_render", n, b);
    }
    
    public final void f(final taf taf) {
        final oir h0 = oir.H0;
        synchronized (this) {
            final boolean g = nti.g(this.g.D0.get());
            final int n = 0;
            boolean b = false;
            if (!g) {
                s9g.a("TTFT", String.format(Locale.US, "Attempt to fire lifecycle event %s before tracker is ready", taf));
                return;
            }
            if (rue.N) {
                s9g.a("TTFT", String.format(Locale.US, "%s lifecycle event %s", rue.class.getSimpleName(), taf));
            }
            final boolean b2 = taf instanceof taf$b;
            long n2 = 0L;
            if (b2) {
                if (this.e.b() > this.M + this.I) {
                    b = true;
                }
                if (b) {
                    this.b();
                    if (this.J && !this.K) {
                        final y0k g2 = this.b.g("home-timeline-ttft-warm", UserIdentifier.getCurrent(), 2);
                        this.z = g2;
                        this.A = (g0r)vvt.d(this.b, "home-activity-init", g2, (b0r)null, 16);
                        this.B = (g0r)vvt.d(this.b, "home-timeline-cache-load", this.z, (b0r)null, 16);
                        this.C = (g0r)vvt.d(this.b, "home-timeline-cache-render", this.z, (b0r)null, 16);
                        this.D = (g0r)vvt.d(this.b, "home-timeline-api-load", this.z, (b0r)null, 16);
                        this.E = (g0r)vvt.d(this.b, "home-timeline-api-render", this.z, (b0r)null, 16);
                        final y0k g3 = this.b.g("background-app-init", UserIdentifier.getCurrent(), 1);
                        if (g3 != null) {
                            g3.a(this.L, TimeUnit.MILLISECONDS);
                            g3.stop();
                        }
                        final y0k z = this.z;
                        if (z != null) {
                            z.start();
                        }
                        final g0r a = this.A;
                        if (a != null) {
                            a.start();
                        }
                        final wc6 j = this.j;
                        final vvt b3 = this.b;
                        final y0k z2 = this.z;
                        final mv1<taf> f = this.f;
                        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
                        final long v = z2.V();
                        final TimeUnit microseconds = TimeUnit.MICROSECONDS;
                        j.a(new cbu(b3, z2, (h5j)f, milliseconds.convert(v, microseconds), this.e).b());
                        final wc6 i = this.j;
                        final vvt b4 = this.b;
                        final y0k z3 = this.z;
                        i.a(new bbu(b4, z3, (h5j)this.f, this.e, milliseconds.convert(z3.V(), microseconds), this.l).b());
                        this.j.a(new xau(this.b, (b0r)this.D, (h5j)this.f).b());
                        this.j.a(((zau)new wau(this.b, (b0r)this.D, (h5j)this.f)).b());
                        this.j.a(((zau)new yau(this.b, (b0r)this.D, (h5j)this.f)).b());
                    }
                }
                else {
                    final y0k z4 = this.z;
                    if (z4 != null) {
                        z4.cancel();
                    }
                    this.j.e();
                }
                this.G = true;
                if (asa.b().b("metrics_launch_tracker_enabled", true) && this.L > 0L) {
                    this.e(this.e.b() - this.L, true);
                }
                final g0r u = this.u;
                if (u != null) {
                    u.start();
                }
            }
            else if (taf instanceof taf$a) {
                this.K = true;
                final UserIdentifier current = UserIdentifier.getCurrent();
                ((w9h)this.m).e = current;
                ((w9h)this.n).e = current;
                ((w9h)this.o).e = current;
                ((w9h)this.p).e = current;
                ((w9h)this.q).e = current;
                Label_0821: {
                    if (this.F) {
                        final g0r u2 = this.u;
                        if (u2 != null && ze.g(u2.l)) {
                            this.u.stop();
                            break Label_0821;
                        }
                    }
                    this.b();
                }
                final g0r a2 = this.A;
                if (a2 != null) {
                    a2.stop();
                }
                if (this.G) {
                    ((cjg)this.m).i();
                }
                else {
                    ((cjg)this.m).k();
                }
            }
            else if (taf instanceof taf$k) {
                this.g((dat)this.o);
                final yvk l = this.l;
                if (l.d) {
                    n2 = l.a.a() - l.c;
                }
                final g0r x = this.x;
                if (x != null) {
                    x.a(n2, TimeUnit.MILLISECONDS);
                }
                final g0r d = this.D;
                if (d != null) {
                    d.a(n2, TimeUnit.MILLISECONDS);
                }
            }
            else if (taf instanceof taf$d) {
                this.g((dat)this.p);
                final g0r x2 = this.x;
                if (x2 != null) {
                    x2.stop();
                }
                final g0r y = this.y;
                if (y != null) {
                    y.start();
                }
                final g0r d2 = this.D;
                if (d2 != null) {
                    d2.stop();
                }
                final g0r e = this.E;
                if (e != null) {
                    e.start();
                }
            }
            else if (taf instanceof taf$e) {
                final g0r x3 = this.x;
                if (x3 != null) {
                    if (!ze.g(x3.l)) {
                        this.x.start();
                    }
                    this.x.n(true, h0);
                }
                final y0k r = this.r;
                if (r != null && r.a0()) {
                    ((z0k)this.r.a).U(h0);
                }
                final y0k z5 = this.z;
                if (z5 != null && z5.a0()) {
                    ((z0k)this.z.a).U(h0);
                }
            }
            else if (taf instanceof taf$h) {
                final g0r y2 = this.y;
                if (y2 != null) {
                    y2.stop();
                }
                final y0k r2 = this.r;
                if (r2 != null) {
                    r2.stop();
                }
                final g0r e2 = this.E;
                if (e2 != null) {
                    e2.stop();
                }
                final y0k z6 = this.z;
                if (z6 != null) {
                    z6.stop();
                }
            }
            else if (taf instanceof taf$v) {
                final g0r v2 = this.v;
                if (v2 != null) {
                    v2.start();
                }
                final g0r b5 = this.B;
                if (b5 != null) {
                    b5.start();
                }
            }
            else if (taf instanceof taf$t) {
                this.g((dat)this.n);
                final g0r v3 = this.v;
                if (v3 != null && this.w != null && ze.g(v3.l)) {
                    this.v.stop();
                    this.w.start();
                }
                final g0r b6 = this.B;
                if (b6 != null) {
                    b6.stop();
                }
                final g0r c = this.C;
                if (c != null) {
                    c.start();
                }
            }
            else if (taf instanceof taf$u) {
                int n3 = n;
                if (((taf$u)taf).a > 0) {
                    n3 = 1;
                }
                if (n3 != 0) {
                    this.g((dat)this.q);
                }
                else {
                    ((cjg)this.n).k();
                }
                final g0r w = this.w;
                if (w != null && ze.g(w.l)) {
                    this.w.stop();
                }
                final g0r c2 = this.C;
                if (c2 != null) {
                    c2.stop();
                }
                final g0r t = this.t;
                if (t != null) {
                    if (n3 != 0) {
                        t.stop();
                    }
                    else {
                        t.cancel();
                    }
                }
            }
            else if (taf instanceof taf$x) {
                this.a();
            }
            this.f.onNext((Object)taf);
        }
    }
    
    public final void g(final dat dat) {
        if (this.G && this.H) {
            ((cjg)dat).i();
        }
        else {
            ((cjg)dat).k();
        }
    }
}
