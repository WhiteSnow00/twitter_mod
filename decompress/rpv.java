import java.util.HashMap;
import java.nio.ByteBuffer;
import android.annotation.SuppressLint;
import java.util.Iterator;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Collection;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rpv extends qqv
{
    public static final cba M1;
    public static final Map<Integer, String> N1;
    public static final Map<Integer, String> O1;
    public Set<String> E1;
    public final String F1;
    public final String G1;
    public final fmv H1;
    public List<k2t<?>> I1;
    public g7c J1;
    public final boolean K1;
    public final rue L1;
    
    static {
        M1 = (cba)aba.c("app", "twitter_service", "timeline", "request");
        final qjg$a qjg$a = new qjg$a(2);
        ((qjg)qjg$a).w((Object)17, (Object)"/2/timeline/home.json");
        ((qjg)qjg$a).w((Object)34, (Object)"/2/timeline/home_latest.json");
        N1 = kdd.c((Map)((n4j)qjg$a).e());
        final qjg$a qjg$a2 = new qjg$a(2);
        ((qjg)qjg$a2).w((Object)17, (Object)"home_timeline");
        ((qjg)qjg$a2).w((Object)34, (Object)"home_timeline_latest");
        O1 = kdd.c((Map)((n4j)qjg$a2).e());
    }
    
    public rpv(final Context context, final UserIdentifier userIdentifier, final int n, int a, final String g1, final yov yov, final vav vav, final boolean k1, final rue l1) {
        super(context, userIdentifier, userIdentifier, n, a, yov, null, pqv.c, vav);
        final qdd$b e0 = qdd.E0;
        a = c5j.a;
        this.E1 = (Set<String>)e0;
        final fmv b = asa.b();
        this.H1 = b;
        this.I1 = vth.a(0);
        ((fh0)this).c1 = 30000;
        ((wv0<Object>)this).I();
        ((wv0<Object>)this).G((qtm<Object>)new zci());
        ((wv0<Object>)this).G((qtm<Object>)new jog(1));
        ((wv0<Object>)this).G((qtm<Object>)new dj8());
        this.G1 = g1;
        this.K1 = k1;
        this.L1 = l1;
        final Map<Integer, String> n2 = rpv.N1;
        if (n2.containsKey(n)) {
            this.F1 = (String)n2.get(n);
        }
        else {
            final StringBuilder j = fu8.j("Expected home TimelineType to be one of ");
            j.append(n2.keySet());
            j.append(" but got ");
            j.append(n);
            final IllegalStateException ex = new IllegalStateException(j.toString());
            wk0.b().a();
            m8a.d((Throwable)ex);
            this.F1 = (String)n2.get(17);
        }
        ((a2p$a)((anm<Object, Object>)this).Y()).c(xf4.T0);
        if (b.b("timeline_request_scribe_sample", false)) {
            ((a2p$a)((anm<Object, Object>)this).Y()).a.K0 = (bba)rpv.M1;
        }
    }
    
    @Override
    public final g7c B0() {
        if (this.J1 == null) {
            this.E1 = super.B1.a();
            final g7c$a g7c$a = new g7c$a();
            final String s = rpv.O1.get(super.o1.a);
            boolean b = false;
            g7c$a.a = (String)c5j.b((Object[])new String[] { s, "home_timeline" });
            g7c$a.b = new f7c(new String[] { "timeline_response", "timeline" });
            if (!fq4.t((Collection)this.E1)) {
                g7c$a.o("seen_tweet_ids", (Object)this.E1);
            }
            final edq k = pcx.k(super.q1);
            final qjg t = qjg.t();
            t.w((Object)"width", (Object)k.a);
            t.w((Object)"height", (Object)k.b);
            t.w((Object)"dpi", (Object)m5s.b);
            final Map map = (Map)((n4j)t).e();
            if (fq4.u(map)) {
                g7c$a.o("display_size", (Object)map);
            }
            if (super.k1 == 2) {
                b = true;
            }
            g7c$a.o("autoplay_enabled", (Object)b);
            g7c$a.o("includeTweetVisibilityNudge", (Object)xa8.p());
            if (ikr.g((CharSequence)this.G1)) {
                g7c$a.p("request_context", this.G1);
            }
            if (this.K1) {
                ((qjg)g7c$a.d).w((Object)"X-Twitter-Polling", (Object)"true");
            }
            this.J1 = (g7c)((n4j)g7c$a).e();
        }
        return this.J1;
    }
    
    @Override
    public final boolean C0() {
        return false;
    }
    
    @Override
    public final boolean D0() {
        return false;
    }
    
    @Override
    public final void d0(final boolean b) {
        final vba r0 = ((anm)this).R0;
        final mmc a = mmc.a;
        final boolean b2 = false;
        int n;
        if (r0 == null) {
            n = (b2 ? 1 : 0);
        }
        else {
            n = (b2 ? 1 : 0);
            if (mmc.c.contains(r0.a)) {
                n = (b2 ? 1 : 0);
                if (mmc.b.containsValue(r0.e)) {
                    n = 1;
                }
            }
        }
        if (n == 0) {
            super.d0(b);
        }
    }
    
    @Override
    public final asc<r2t, kbv> g0() {
        final asc<r2t, kbv> g0 = super.g0();
        if (this.H1.b("android_urt_request_home_timeline_debug_sanitization_enabled", true)) {
            Object f0;
            if (this.t0()) {
                f0 = new opv();
            }
            else {
                f0 = new xa8();
            }
            g0.F0 = (bsm)f0;
        }
        return g0;
    }
    
    public final xrc<r2t, kbv> i0(final xrc<r2t, kbv> xrc) {
        if (xrc.f != null && xrc.b && m2t.a() && !zcw.d().k().getStringId().equals("7777777") && !this.I1.isEmpty()) {
            try {
                synchronized ("rpv") {
                    final rif h = rif.H();
                    for (final k2t k2t : this.I1) {
                        if (k2t instanceof inc) {
                            final int a = c5j.a;
                            final inc inc = (inc)k2t;
                            final String x = xrc.f.n.x;
                            Objects.requireNonNull(inc);
                            h.p((Object)eaq.v((Object)new qhe(wa2.k(x.getBytes(StandardCharsets.UTF_8)))));
                        }
                        else if (k2t instanceof rus) {
                            final int a2 = c5j.a;
                            final rus rus = (rus)k2t;
                            final String databaseName = ((ok1)super.r1).getDatabaseName();
                            Objects.requireNonNull(rus);
                            h.p((Object)new paq((gcq)new dga((Object)rus, (Object)databaseName, 10)));
                        }
                        else {
                            if (!(k2t instanceof icp)) {
                                continue;
                            }
                            final int a3 = c5j.a;
                            final icp icp = (icp)k2t;
                            final s22 y0 = super.r1.Y0;
                            Objects.requireNonNull(icp);
                            h.p((Object)eaq.v((Object)new hcp(wa2.k(klp.e((Object)new gcp$b(y0.a), (rlp)gcp$b.c)))));
                        }
                    }
                    ((eaq)new adq((Iterable)((n4j)h).e(), (psb)new gy0((Object)UserIdentifier.getCurrent().getStringId(), 1))).c((ecq)new qpv());
                }
            }
            finally {
                final Throwable t;
                m8a.d(t);
            }
        }
        final xrc i0 = super.i0((xrc)xrc);
        if (i0.b) {
            super.B1.b((Iterable)this.E1);
            final qdd$b e0 = qdd.E0;
            final int a4 = c5j.a;
            this.E1 = (Set<String>)e0;
        }
        else {
            if (!(i0.d instanceof IOException) && !this.E1.isEmpty()) {
                final h8a h8a = new h8a(new Throwable(i0.e, i0.d));
                ((HashMap<String, Integer>)h8a.a).put("error_code", Integer.valueOf(i0.c));
                ((HashMap<String, Integer>)h8a.a).put("num_seen_ids", Integer.valueOf(this.E1.size()));
                ((HashMap<String, ndi>)h8a.a).put("network_quality", oci.d().f());
                ((HashMap<String, nre>)h8a.a).put("upload_capacity", oci.d().h());
                m8a.c(h8a);
            }
            if (this.G1.equals("ptr")) {
                enl.a().c(9);
            }
        }
        return (xrc<r2t, kbv>)i0;
    }
    
    @Override
    public final void n0(final xrc<r2t, kbv> xrc) {
        final rue l1 = this.L1;
        if (l1 != null) {
            l1.f((taf)new taf$g(((wv0)this).D0));
        }
        super.n0(xrc);
        final rue l2 = this.L1;
        if (l2 != null) {
            l2.f((taf)new taf$f(((wv0)this).D0));
        }
    }
    
    @SuppressLint({ "MissingPropagatedAnnotation" })
    @Override
    public final p6c p0() {
        final p6c p0 = super.p0();
        final String s = (String)c5j.b((Object[])new String[] { rpv.O1.get(super.o1.a), "home_timeline" });
        Objects.requireNonNull(s);
        arc$b e;
        if (this.E1.isEmpty()) {
            e = arc$b.F0;
        }
        else {
            e = arc$b.G0;
        }
        p0.r(s);
        p0.e = e;
        p0.p("includeTweetVisibilityNudge", (Object)xa8.p());
        if (this.K1) {
            ((qjg)p0.i).w((Object)"X-Twitter-Polling", (Object)"true");
        }
        if (asa.b().b("view_counts_home_api_enabled", false)) {
            p0.p("includeTweetImpression", (Object)Boolean.TRUE);
        }
        return p0;
    }
    
    public final g7c r0() {
        final int a = super.o1.a;
        boolean b = false;
        if (a == 17) {
            b = asa.c().b("android_graphql_home_timeline_enabled", false);
        }
        else if (a == 34) {
            b = asa.c().b("android_graphql_home_timeline_latest_enabled", false);
        }
        g7c b2;
        if (b) {
            b2 = this.B0();
        }
        else {
            b2 = null;
        }
        return b2;
    }
    
    public final zvl s0() {
        cj1.e();
        final zvl$a zvl$a = new zvl$a();
        zvl$a.a = this.F1;
        zvl$a.o("include_my_retweet");
        zvl$a.q("Twitter-Display-Size", pcx.l(super.q1));
        if (this.K1) {
            zvl$a.q("X-Twitter-Polling", "true");
        }
        if (ikr.g((CharSequence)this.G1)) {
            zvl$a.p("request_context", this.G1);
        }
        final fmv h1 = this.H1;
        int n = 0;
        if (h1.b("home_timeline_latest_timeline_switch_enabled", false)) {
            zvl$a.o("lca");
        }
        if (asa.b().b("view_counts_home_api_enabled", false)) {
            zvl$a.o("include_ext_view_count");
        }
        final Set a = super.B1.a();
        this.E1 = a;
        if (!fq4.t((Collection)a)) {
            zvl$a.d = arc$b.G0;
            final Set<String> e1 = this.E1;
            final int min = Math.min(200, fq4.l((Collection)e1));
            final int n2 = min * 8;
            final ByteBuffer allocate = ByteBuffer.allocate(n2);
            for (Iterator<String> iterator = e1.iterator(); iterator.hasNext() && n < min; ++n) {
                allocate.putLong(Long.valueOf(iterator.next()));
            }
            final byte[] array = new byte[n2];
            allocate.rewind();
            allocate.get(array);
            zvl$a.e = new q53(array, lm6.I0);
        }
        return (zvl)((n4j)zvl$a).e();
    }
    
    @Override
    public final uro w0() {
        return uro.a(asa.b().f("scribe_tlnav_home_sample_size", 10000));
    }
    
    @Override
    public final boolean y0() {
        return false;
    }
    
    @Override
    public final boolean z0() {
        return super.l1 == 2;
    }
}
