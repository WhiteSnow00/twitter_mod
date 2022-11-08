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

public final class fwm implements sfa, dca<TwConnectivityChangeEvent>
{
    public static final a Companion;
    public final pdi C0;
    public final psc D0;
    public final fsa E0;
    public final xaz F0;
    public final xcs G0;
    public final wh6 H0;
    public final fwt I0;
    public v1b J0;
    public String K0;
    public String L0;
    public xmm M0;
    public boolean N0;
    public final zml<String> O0;
    public final j29 P0;
    
    static {
        Companion = new a();
    }
    
    public fwm(final pdi c0, final psc d0, final fsa e0, final xaz f0, final xcs g0, final wh6 h0, final fwt i0) {
        zzd.f((Object)c0, "networkSettingsManager");
        zzd.f((Object)d0, "httpRequestController");
        zzd.f((Object)g0, "telephonyUtil");
        zzd.f((Object)h0, "connectivityChangeBroadcaster");
        zzd.f((Object)i0, "scribeReporter");
        final qvo a = yvo.a();
        zzd.e((Object)a, "computation()");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        final zml o0 = new zml();
        this.O0 = (zml<String>)o0;
        Objects.requireNonNull(fwm.Companion);
        final hlv b = dta.b();
        int n = 30;
        final int f2 = b.f("traffic_test_before_fallback_throttle_seconds", 30);
        if (f2 > 0) {
            n = f2;
        }
        final j29 subscribe = ((b5j)o0).throttleFirst((long)n, TimeUnit.SECONDS, a).subscribe((fk6)new q15((rtb)new gwm(this), 28));
        zzd.e((Object)subscribe, "validateFallbackEvent\n  \u2026llbackHost(currentHost) }");
        this.P0 = subscribe;
        Objects.requireNonNull(iwt.Companion);
        final hlv b2 = dta.b();
        zzd.e((Object)b2, "getCurrent()");
        final b5j onErrorReturnItem = b5j.combineLatest((naj)b2.o("traffic_fallback_host_enabled"), (naj)b2.o("traffic_fallback_host_policy_success_rate_threshold"), (naj)b2.o("traffic_fallback_host_policy_window_millis"), (naj)b2.o("traffic_fallback_host_policy_min_requests"), (mub)new gwt((lub)new hwt(b2))).onErrorReturnItem((Object)gsa.a.a);
        zzd.e((Object)onErrorReturnItem, "featureConfig = FeatureC\u2026stConfiguration.Disabled)");
        onErrorReturnItem.subscribe((fk6)new ab6((rtb)new ewm(this), 20));
    }
    
    public final void a(final xrc<?, ?> xrc) {
        zzd.f((Object)xrc, "httpOperation");
        final String host = xrc.c.getHost();
        final lsa a = this.E0.a(xrc, null);
        zzd.e((Object)host, "host");
        this.h(a, host);
    }
    
    public final void b(final xrc<?, ?> xrc, final Exception ex) {
        zzd.f((Object)xrc, "httpOperation");
        final lsa a = this.E0.a(xrc, ex);
        final String host = xrc.c.getHost();
        zzd.e((Object)host, "host");
        this.h(a, host);
    }
    
    public final void c(final xrc<?, ?> xrc) {
    }
    
    public final void d(final xrc<?, ?> xrc) {
        zzd.f((Object)xrc, "httpOperation");
    }
    
    public final String e(String s) {
        final String c = this.C0.c(s);
        if (c != null) {
            s = c;
        }
        return s;
    }
    
    public final Collection<String> f(final String s, final String s2) {
        final ArrayList list = new ArrayList();
        Objects.requireNonNull(fwm.Companion);
        String s3 = dta.b().l("traffic_fallback_test_request_path", "/edgeprobe");
        zzd.c((Object)s3);
        if (!ckr.n1(s3, "/", false)) {
            s3 = l7k.c("/", s3);
        }
        final Pattern a = pjr.a;
        if (!ckr.f1(s, s2, true)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s2);
            sb.append(s3);
            list.add(sb.toString());
        }
        Objects.requireNonNull(iwt.Companion);
        final List g = dta.b().g("traffic_fallback_host_map");
        zzd.e((Object)g, "getCurrent().getList<Str\u2026OST_MAP\n                )");
        final HashMap<Object, List> hashMap = new HashMap<Object, List>(5);
        final Iterator iterator = g.iterator();
        while (iterator.hasNext()) {
            final List k1 = gkr.K1((CharSequence)iterator.next(), new String[] { "|" });
            if (k1.size() == 2 && pjr.g((CharSequence)k1.get(0)) && pjr.g((CharSequence)k1.get(1))) {
                hashMap.put(k1.get(0), gkr.K1((CharSequence)k1.get(1), new String[] { "," }));
            }
        }
        final List list2 = hashMap.get(s2);
        if (list2 != null) {
            for (final String s4 : list2) {
                if (!ckr.f1(s4, s, true)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(s4);
                    sb2.append(s3);
                    list.add(sb2.toString());
                }
            }
        }
        return or4.m2((Iterable)list);
    }
    
    public final void g(final String s, final boolean b) {
        final String e = this.e(s);
        final xmm m0 = this.M0;
        if (m0 != null) {
            if (!b) {
                if (!this.N0) {
                    return;
                }
                zzd.f((Object)e, "originalHost");
                final wmm wmm = m0.e.get(e);
                String a;
                if (wmm != null) {
                    a = wmm.a;
                }
                else {
                    a = null;
                }
                final boolean a2 = zzd.a((Object)a, (Object)s);
                int n2;
                final int n = n2 = 0;
                if (a2) {
                    n2 = n;
                    if (wmm.b.a() - wmm.h >= wmm.d) {
                        n2 = n;
                        if (wmm.g >= wmm.e) {
                            n2 = n;
                            if (wmm.f.c < wmm.c) {
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
            zzd.f((Object)sb.toString(), "data");
            xw0.c((rj)new it1((Object)this, (Object)s, 5));
        }
        else {
            this.j(e, s);
        }
    }
    
    public final void h(final lsa lsa, final String s) {
        if (lsa == lsa$b.a) {
            this.g(s, true);
        }
        else if (lsa == ksa.a) {
            this.i(s, true);
        }
        else if (lsa == jsa.a) {
            this.i(s, false);
            this.g(s, false);
        }
    }
    
    public final void i(final String s, final boolean b) {
        final xmm m0 = this.M0;
        if (this.N0) {
            if (m0 != null) {
                final String e = this.e(s);
                if (b) {
                    zzd.f((Object)e, "originalHost");
                    m0.a(e, s, true);
                }
                else {
                    zzd.f((Object)e, "originalHost");
                    m0.a(e, s, false);
                }
            }
        }
    }
    
    public final void j(final String s, final String s2) {
        final Pattern a = pjr.a;
        if (ckr.f1(s, s2, true)) {
            return;
        }
        final Map f = this.C0.f();
        zzd.e((Object)f, "networkSettingsManager.dynamicRewriteMap");
        if (!f.containsKey(s)) {
            return;
        }
        if (ckr.f1((String)f.get(s), s2, true)) {
            final Map u1 = vkg.u1(f);
            u1.remove(s);
            this.C0.a(vkg.t1(u1));
            final StringBuilder sb = new StringBuilder();
            sb.append("Removing ");
            sb.append(s2);
            sb.append(" -> ");
            sb.append(s);
            sb.append(" mapping from dynamic rewrite map due to request failures");
            zzd.f((Object)sb.toString(), "data");
            final fwt i0 = this.I0;
            Objects.requireNonNull(i0);
            final cro q = ffa.q("scribe_traffic_fallback_host_event_sample_size", cro.b);
            zzd.e((Object)q, "obtainSampler(\n         \u2026r.ALWAYS_SELECT\n        )");
            i0.a(new zf4(fwt.a), q);
        }
        else {
            bl0.a().d();
        }
    }
    
    public void onEvent(final TwConnectivityChangeEvent twConnectivityChangeEvent) {
        zzd.f((Object)twConnectivityChangeEvent, "connectivityChangeEvent");
        final boolean b = twConnectivityChangeEvent.b();
        if (this.N0 != b) {
            this.N0 = b;
            final xmm m0 = this.M0;
            if (!b && m0 != null) {
                synchronized (m0.e) {
                    m0.e.clear();
                }
            }
        }
    }
    
    public static final class a
    {
    }
}
