import java.util.Map;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import com.twitter.util.connectivity.TwConnectivityChangeEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mxm implements fga, tca<TwConnectivityChangeEvent>
{
    public static final mxm.mxm$a Companion;
    public final kei F0;
    public final tsc G0;
    public final ksa H0;
    public final aef I0;
    public final kes J0;
    public final ii6 K0;
    public final lxt L0;
    public r1b M0;
    public String N0;
    public String O0;
    public com P0;
    public boolean Q0;
    public final znl<String> R0;
    public final b39 S0;
    
    static {
        Companion = new mxm.mxm$a();
    }
    
    public mxm(final kei f0, final tsc g0, final ksa h0, final aef i0, final kes j0, final ii6 k0, final lxt l0) {
        e0e.f((Object)f0, "networkSettingsManager");
        e0e.f((Object)g0, "httpRequestController");
        e0e.f((Object)j0, "telephonyUtil");
        e0e.f((Object)k0, "connectivityChangeBroadcaster");
        e0e.f((Object)l0, "scribeReporter");
        final bxo a = jxo.a();
        e0e.e((Object)a, "computation()");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        final znl r0 = new znl();
        this.R0 = (znl<String>)r0;
        Objects.requireNonNull(mxm.Companion);
        final rmv b = ita.b();
        int n = 30;
        final int f2 = b.f("traffic_test_before_fallback_throttle_seconds", 30);
        if (f2 > 0) {
            n = f2;
        }
        final b39 subscribe = ((t5j)r0).throttleFirst((long)n, TimeUnit.SECONDS, a).subscribe((rk6)new u5u((stb)new nxm(this), 23));
        e0e.e((Object)subscribe, "validateFallbackEvent\n  \u2026llbackHost(currentHost) }");
        this.S0 = subscribe;
        Objects.requireNonNull(oxt.Companion);
        final rmv b2 = ita.b();
        e0e.e((Object)b2, "getCurrent()");
        final t5j onErrorReturnItem = t5j.combineLatest((fbj)b2.o("traffic_fallback_host_enabled"), (fbj)b2.o("traffic_fallback_host_policy_success_rate_threshold"), (fbj)b2.o("traffic_fallback_host_policy_window_millis"), (fbj)b2.o("traffic_fallback_host_policy_min_requests"), (nub)new mxt((mub)new nxt(b2))).onErrorReturnItem((Object)lsa.a.a);
        e0e.e((Object)onErrorReturnItem, "featureConfig = FeatureC\u2026stConfiguration.Disabled)");
        onErrorReturnItem.subscribe((rk6)new dl7((stb)new lxm(this), 24));
    }
    
    public final void a(final asc<?, ?> asc) {
        e0e.f((Object)asc, "httpOperation");
        final String host = asc.c.getHost();
        final qsa a = this.H0.a((asc)asc, (Exception)null);
        e0e.e((Object)host, "host");
        this.h(a, host);
    }
    
    public final void b(final asc<?, ?> asc, final Exception ex) {
        e0e.f((Object)asc, "httpOperation");
        final qsa a = this.H0.a((asc)asc, ex);
        final String host = asc.c.getHost();
        e0e.e((Object)host, "host");
        this.h(a, host);
    }
    
    public final void c(final asc<?, ?> asc) {
    }
    
    public final void d(final asc<?, ?> asc) {
        e0e.f((Object)asc, "httpOperation");
    }
    
    public final String e(String s) {
        final String c = this.F0.c(s);
        if (c != null) {
            s = c;
        }
        return s;
    }
    
    public final Collection<String> f(final String s, String s2) {
        final ArrayList list = new ArrayList();
        Objects.requireNonNull(mxm.Companion);
        String s3 = ita.b().l("traffic_fallback_test_request_path", "/edgeprobe");
        e0e.c((Object)s3);
        if (!slr.q1(s3, "/", false)) {
            s3 = mqb.l("/", s3);
        }
        final Pattern a = flr.a;
        if (!slr.i1(s, s2, true)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s2);
            sb.append(s3);
            list.add(sb.toString());
        }
        Objects.requireNonNull(oxt.Companion);
        final List g = ita.b().g("traffic_fallback_host_map");
        e0e.e((Object)g, "getCurrent().getList<Str\u2026OST_MAP\n                )");
        final HashMap<Object, List> hashMap = new HashMap<Object, List>(5);
        final Iterator iterator = g.iterator();
        while (iterator.hasNext()) {
            final List n1 = wlr.N1((CharSequence)iterator.next(), new String[] { "|" });
            if (n1.size() == 2 && flr.g((CharSequence)n1.get(0)) && flr.g((CharSequence)n1.get(1))) {
                hashMap.put(n1.get(0), wlr.N1((CharSequence)n1.get(1), new String[] { "," }));
            }
        }
        final List list2 = hashMap.get(s2);
        if (list2 != null) {
            final Iterator iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                s2 = (String)iterator2.next();
                if (!slr.i1(s2, s, true)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(s2);
                    sb2.append(s3);
                    list.add(sb2.toString());
                }
            }
        }
        return rr4.i2((Iterable)list);
    }
    
    public final void g(final String s, final boolean b) {
        final String e = this.e(s);
        final com p2 = this.P0;
        if (p2 != null) {
            if (!b) {
                if (!this.Q0) {
                    return;
                }
                e0e.f((Object)e, "originalHost");
                final bom bom = p2.e.get(e);
                String a;
                if (bom != null) {
                    a = bom.a;
                }
                else {
                    a = null;
                }
                final boolean a2 = e0e.a((Object)a, (Object)s);
                int n2;
                final int n = n2 = 0;
                if (a2) {
                    n2 = n;
                    if (bom.b.a() - bom.h >= bom.d) {
                        n2 = n;
                        if (bom.g >= bom.e) {
                            n2 = n;
                            if (bom.f.c < bom.c) {
                                n2 = 1;
                            }
                        }
                    }
                }
                if (n2 == 0) {
                    return;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Fallback for ");
            sb.append(s);
            sb.append(", immediate: ");
            sb.append(b);
            e0e.f((Object)sb.toString(), "data");
            xw0.c((sj)new nt2((Object)this, (Object)s, 5));
        }
        else {
            this.j(e, s);
        }
    }
    
    public final void h(final qsa qsa, final String s) {
        if (qsa == qsa$b.a) {
            this.g(s, true);
        }
        else if (qsa == psa.a) {
            this.i(s, true);
        }
        else if (qsa == osa.a) {
            this.i(s, false);
            this.g(s, false);
        }
    }
    
    public final void i(final String s, final boolean b) {
        final com p2 = this.P0;
        if (this.Q0) {
            if (p2 != null) {
                final String e = this.e(s);
                if (b) {
                    e0e.f((Object)e, "originalHost");
                    p2.a(e, s, true);
                }
                else {
                    e0e.f((Object)e, "originalHost");
                    p2.a(e, s, false);
                }
            }
        }
    }
    
    public final void j(final String s, final String s2) {
        final Pattern a = flr.a;
        if (slr.i1(s, s2, true)) {
            return;
        }
        final Map<String, String> f = this.F0.f();
        e0e.e((Object)f, "networkSettingsManager.dynamicRewriteMap");
        if (!f.containsKey(s)) {
            return;
        }
        if (slr.i1((String)f.get(s), s2, true)) {
            final Map c0 = mlg.c0((Map)f);
            c0.remove(s);
            this.F0.a(mlg.b0(c0));
            final StringBuilder sb = new StringBuilder();
            sb.append("Removing ");
            sb.append(s2);
            sb.append(" -> ");
            sb.append(s);
            sb.append(" mapping from dynamic rewrite map due to request failures");
            e0e.f((Object)sb.toString(), "data");
            final lxt l0 = this.L0;
            Objects.requireNonNull(l0);
            final nso t = jba.t("scribe_traffic_fallback_host_event_sample_size", nso.b);
            e0e.e((Object)t, "obtainSampler(\n         \u2026r.ALWAYS_SELECT\n        )");
            l0.a(new fg4(lxt.a), t);
        }
        else {
            po.b().d();
        }
    }
    
    public void onEvent(TwConnectivityChangeEvent twConnectivityChangeEvent) {
        e0e.f((Object)twConnectivityChangeEvent, "connectivityChangeEvent");
        final boolean b = twConnectivityChangeEvent.b();
        if (this.Q0 != b) {
            this.Q0 = b;
            final com p0 = this.P0;
            if (!b && p0 != null) {
                synchronized (p0.e) {
                    p0.e.clear();
                }
            }
        }
    }
    
    public /* bridge */ void onEvent(final Object o) {
        this.onEvent((TwConnectivityChangeEvent)o);
    }
}
