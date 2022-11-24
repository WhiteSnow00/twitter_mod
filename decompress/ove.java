import java.util.Locale;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ove
{
    public static final boolean N;
    public static final long O;
    public d1r A;
    public d1r B;
    public d1r C;
    public d1r D;
    public d1r E;
    public final boolean F;
    public boolean G;
    public boolean H;
    public final long I;
    public final boolean J;
    public boolean K;
    public long L;
    public long M;
    public final tah a;
    public final mwt b;
    public final br0 c;
    public final long d;
    public final icu e;
    public final uv1<pbf> f;
    public final uv1<Void> g;
    public final nda<tlm> h;
    public final wm0 i;
    public final de6 j;
    public final de6 k;
    public final pwk l;
    public b2b m;
    public b2b n;
    public b2b o;
    public b2b p;
    public b2b q;
    public o1k r;
    public d1r s;
    public d1r t;
    public d1r u;
    public d1r v;
    public d1r w;
    public d1r x;
    public d1r y;
    public o1k z;
    
    static {
        N = Log.isLoggable("TTFT", 3);
        O = TimeUnit.SECONDS.toMillis(5L);
    }
    
    public ove(final Context context, final tah a, final br0 c, final icu e, final nda<tlm> h, final kcm kcm, final wm0 i) {
        final de6 j = new de6();
        this.j = j;
        final de6 k = new de6();
        this.k = k;
        this.a = a;
        final mwt b6 = ((i1k)((n5j)cr0.a()).B((Class)i1k.class)).b6();
        this.b = b6;
        this.c = c;
        this.e = e;
        this.h = h;
        this.i = i;
        final long f = c.f();
        this.d = f;
        this.I = ita.b().h("metrics_launch_tracker_pct_ttft_cold_start_filter_heuristic", ove.O);
        this.J = ita.b().b("metrics_launch_tracker_background_launch_metrics_enabled", false);
        this.F = p70.j(context);
        final uv1 f2 = new uv1();
        this.f = (uv1<pbf>)f2;
        this.g = (uv1<Void>)new uv1();
        final pwk l = new pwk((t5j)f2, e, kcm);
        this.l = l;
        this.e(f, false);
        final o1k g = b6.g("home-timeline-ttft", UserIdentifier.getCurrent(), 4);
        this.r = g;
        this.s = (d1r)mwt.d(b6, "app-init", g, (y0r)null, 16);
        this.t = (d1r)mwt.d(b6, "home-timeline-cached-ttft", this.r, (y0r)null, 16);
        this.u = (d1r)mwt.d(b6, "home-activity-init", this.r, (y0r)null, 16);
        this.v = (d1r)mwt.d(b6, "home-timeline-cache-load", this.r, (y0r)null, 16);
        this.w = (d1r)mwt.d(b6, "home-timeline-cache-render", this.r, (y0r)null, 16);
        this.x = (d1r)mwt.d(b6, "home-timeline-api-load", this.r, (y0r)null, 16);
        this.y = (d1r)mwt.d(b6, "home-timeline-api-render", this.r, (y0r)null, 16);
        final long n = e.b() - f;
        final o1k r = this.r;
        if (r != null) {
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            r.a(n, milliseconds);
            final o1k r2 = this.r;
            final long v = r2.V();
            final TimeUnit microseconds = TimeUnit.MICROSECONDS;
            k.a(((pbu)new rbu(b6, r2, (t5j)f2, e, milliseconds.convert(v, microseconds), l)).b());
            final o1k r3 = this.r;
            k.a(((pbu)new sbu(b6, r3, (t5j)f2, milliseconds.convert(r3.V(), microseconds), e)).b());
            k.a(((pbu)new qbu(b6, this.r, (t5j)f2)).b());
            k.a(((pbu)new nbu(b6, (y0r)this.x, (t5j)f2)).b());
            k.a(((pbu)new mbu(b6, (y0r)this.x, (t5j)f2)).b());
            k.a(((pbu)new obu(b6, (y0r)this.x, (t5j)f2)).b());
        }
        final d1r s = this.s;
        if (s != null) {
            s.a(n, TimeUnit.MILLISECONDS);
        }
        final d1r t = this.t;
        if (t != null) {
            t.a(n, TimeUnit.MILLISECONDS);
        }
        kcm.i((sj)new jas(new de6(new b39[] { c.b().B().subscribe((rk6)new dbg(this, 11)), c.b().f().subscribe((rk6)new u1p((Object)this, 10)) }), 1));
        kcm.i((sj)new nve(j, 0));
        kcm.i((sj)new g00(k, 1));
    }
    
    public static ove d() {
        return ((v2v)((n5j)cr0.a()).B((Class)v2v.class)).Y1();
    }
    
    public final void a() {
        final kjr i0 = kjr.I0;
        synchronized (this) {
            this.G = false;
            this.H = false;
            final o1k r = this.r;
            if (r != null && r.a0()) {
                ((p1k)this.r.a).U(i0);
            }
            final o1k z = this.z;
            if (z != null && z.a0()) {
                ((p1k)this.z.a).U(i0);
            }
            ((wjg)this.p).k();
            ((wjg)this.o).k();
            ((wjg)this.n).k();
            ((wjg)this.m).k();
            ((wjg)this.q).k();
        }
    }
    
    public final void b() {
        final o1k r = this.r;
        if (r != null) {
            r.cancel();
        }
        this.k.e();
    }
    
    public final zat c(final String s, final long n, final boolean b) {
        final wjg b2 = this.a.b(s);
        if (b2 != null) {
            ((oah)this.a).e(b2);
            b2.k();
        }
        final b2b b2b = new b2b(s, s, (oah)this.a, n);
        ((nah)b2b).b = "TTFT";
        this.a.f((wjg)b2b);
        if (b) {
            ((wjg)b2b).h();
        }
        final int a = o5j.a;
        return (zat)b2b;
    }
    
    public final void e(final long n, final boolean b) {
        this.m = (b2b)this.c("app:ready_cold", n, b);
        this.n = (b2b)this.c("home:first_tweet_cold_cache", n, b);
        this.o = (b2b)this.c("home:first_tweet_request", n, b);
        this.p = (b2b)this.c("home:first_tweet_cold_api", n, b);
        this.q = (b2b)this.c("home:first_tweet_cold_cache_render", n, b);
    }
    
    public final void f(final pbf pbf) {
        final kjr j0 = kjr.J0;
        synchronized (this) {
            final boolean g = eui.g(this.g.F0.get());
            boolean b = false;
            final int n = 0;
            if (!g) {
                nag.a("TTFT", String.format(Locale.US, "Attempt to fire lifecycle event %s before tracker is ready", pbf));
                return;
            }
            if (ove.N) {
                nag.a("TTFT", String.format(Locale.US, "%s lifecycle event %s", ove.class.getSimpleName(), pbf));
            }
            final boolean b2 = pbf instanceof pbf.b;
            long n2 = 0L;
            if (b2) {
                int n3 = n;
                if (this.e.b() > this.M + this.I) {
                    n3 = 1;
                }
                if (n3 != 0) {
                    this.b();
                    if (this.J && !this.K) {
                        final o1k g2 = this.b.g("home-timeline-ttft-warm", UserIdentifier.getCurrent(), 2);
                        this.z = g2;
                        this.A = (d1r)mwt.d(this.b, "home-activity-init", g2, (y0r)null, 16);
                        this.B = (d1r)mwt.d(this.b, "home-timeline-cache-load", this.z, (y0r)null, 16);
                        this.C = (d1r)mwt.d(this.b, "home-timeline-cache-render", this.z, (y0r)null, 16);
                        this.D = (d1r)mwt.d(this.b, "home-timeline-api-load", this.z, (y0r)null, 16);
                        this.E = (d1r)mwt.d(this.b, "home-timeline-api-render", this.z, (y0r)null, 16);
                        final o1k g3 = this.b.g("background-app-init", UserIdentifier.getCurrent(), 1);
                        if (g3 != null) {
                            g3.a(this.L, TimeUnit.MILLISECONDS);
                            g3.stop();
                        }
                        final o1k z = this.z;
                        if (z != null) {
                            z.start();
                        }
                        final d1r a = this.A;
                        if (a != null) {
                            a.start();
                        }
                        final de6 i = this.j;
                        final mwt b3 = this.b;
                        final o1k z2 = this.z;
                        final uv1<pbf> f = this.f;
                        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
                        final long v = z2.V();
                        final TimeUnit microseconds = TimeUnit.MICROSECONDS;
                        i.a(((pbu)new sbu(b3, z2, (t5j)f, milliseconds.convert(v, microseconds), this.e)).b());
                        final de6 k = this.j;
                        final mwt b4 = this.b;
                        final o1k z3 = this.z;
                        k.a(((pbu)new rbu(b4, z3, (t5j)this.f, this.e, milliseconds.convert(z3.V(), microseconds), this.l)).b());
                        this.j.a(((pbu)new nbu(this.b, (y0r)this.D, (t5j)this.f)).b());
                        this.j.a(((pbu)new mbu(this.b, (y0r)this.D, (t5j)this.f)).b());
                        this.j.a(((pbu)new obu(this.b, (y0r)this.D, (t5j)this.f)).b());
                    }
                }
                else {
                    final o1k z4 = this.z;
                    if (z4 != null) {
                        z4.cancel();
                    }
                    this.j.e();
                }
                this.G = true;
                if (ita.b().b("metrics_launch_tracker_enabled", true) && this.L > 0L) {
                    this.e(this.e.b() - this.L, true);
                }
                final d1r u = this.u;
                if (u != null) {
                    u.start();
                }
            }
            else if (pbf instanceof pbf.a) {
                this.K = true;
                final UserIdentifier current = UserIdentifier.getCurrent();
                ((nah)this.m).e = current;
                ((nah)this.n).e = current;
                ((nah)this.o).e = current;
                ((nah)this.p).e = current;
                ((nah)this.q).e = current;
                Label_0823: {
                    if (this.F) {
                        final d1r u2 = this.u;
                        if (u2 != null && lf.l(((cq1)u2).l)) {
                            ((cq1)this.u).stop();
                            break Label_0823;
                        }
                    }
                    this.b();
                }
                final d1r a2 = this.A;
                if (a2 != null) {
                    ((cq1)a2).stop();
                }
                if (this.G) {
                    ((wjg)this.m).i();
                }
                else {
                    ((wjg)this.m).k();
                }
            }
            else if (pbf instanceof pbf.k) {
                this.g((zat)this.o);
                final pwk l = this.l;
                if (l.d) {
                    n2 = l.a.a() - l.c;
                }
                final d1r x = this.x;
                if (x != null) {
                    x.a(n2, TimeUnit.MILLISECONDS);
                }
                final d1r d = this.D;
                if (d != null) {
                    d.a(n2, TimeUnit.MILLISECONDS);
                }
            }
            else if (pbf instanceof pbf.d) {
                this.g((zat)this.p);
                final d1r x2 = this.x;
                if (x2 != null) {
                    ((cq1)x2).stop();
                }
                final d1r y = this.y;
                if (y != null) {
                    y.start();
                }
                final d1r d2 = this.D;
                if (d2 != null) {
                    ((cq1)d2).stop();
                }
                final d1r e = this.E;
                if (e != null) {
                    e.start();
                }
            }
            else if (pbf instanceof pbf.e) {
                final d1r x3 = this.x;
                if (x3 != null) {
                    if (!lf.l(((cq1)x3).l)) {
                        this.x.start();
                    }
                    this.x.n(true, j0);
                }
                final o1k r = this.r;
                if (r != null && r.a0()) {
                    ((p1k)this.r.a).U(j0);
                }
                final o1k z5 = this.z;
                if (z5 != null && z5.a0()) {
                    ((p1k)this.z.a).U(j0);
                }
            }
            else if (pbf instanceof pbf.h) {
                final d1r y2 = this.y;
                if (y2 != null) {
                    ((cq1)y2).stop();
                }
                final o1k r2 = this.r;
                if (r2 != null) {
                    r2.stop();
                }
                final d1r e2 = this.E;
                if (e2 != null) {
                    ((cq1)e2).stop();
                }
                final o1k z6 = this.z;
                if (z6 != null) {
                    z6.stop();
                }
            }
            else if (pbf instanceof pbf.v) {
                final d1r v2 = this.v;
                if (v2 != null) {
                    v2.start();
                }
                final d1r b5 = this.B;
                if (b5 != null) {
                    b5.start();
                }
            }
            else if (pbf instanceof pbf.t) {
                this.g((zat)this.n);
                final d1r v3 = this.v;
                if (v3 != null && this.w != null && lf.l(((cq1)v3).l)) {
                    ((cq1)this.v).stop();
                    this.w.start();
                }
                final d1r b6 = this.B;
                if (b6 != null) {
                    ((cq1)b6).stop();
                }
                final d1r c = this.C;
                if (c != null) {
                    c.start();
                }
            }
            else if (pbf instanceof pbf.u) {
                if (((pbf.u)pbf).a > 0) {
                    b = true;
                }
                if (b) {
                    this.g((zat)this.q);
                }
                else {
                    ((wjg)this.n).k();
                }
                final d1r w = this.w;
                if (w != null && lf.l(((cq1)w).l)) {
                    ((cq1)this.w).stop();
                }
                final d1r c2 = this.C;
                if (c2 != null) {
                    ((cq1)c2).stop();
                }
                final d1r t = this.t;
                if (t != null) {
                    if (b) {
                        ((cq1)t).stop();
                    }
                    else {
                        ((cq1)t).cancel();
                    }
                }
            }
            else if (pbf instanceof pbf.x) {
                this.a();
            }
            this.f.onNext((Object)pbf);
        }
    }
    
    public final void g(final zat zat) {
        if (this.G && this.H) {
            ((wjg)zat).i();
        }
        else {
            ((wjg)zat).k();
        }
    }
}
