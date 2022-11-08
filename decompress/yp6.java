import java.util.Arrays;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import java.util.concurrent.TimeUnit;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yp6 extends dwt<aq6, bq6>
{
    public static final yp6.yp6$a Companion;
    public static final long q;
    public static final long r;
    public static final long s;
    public final Context h;
    public final iwt i;
    public final pdi j;
    public final cq6 k;
    public final gew l;
    public final rd6 m;
    public volatile jwt n;
    public volatile lwt o;
    public volatile boolean p;
    
    static {
        Companion = new yp6.yp6$a();
        final TimeUnit minutes = TimeUnit.MINUTES;
        q = minutes.toMillis(20L);
        r = minutes.toMillis(20L);
        s = minutes.toMillis(120L);
    }
    
    public yp6(final Context h, final hr0 hr0, final psc psc, final iwt i, final pdi j, final cq6 k, final qvo qvo, final ibm ibm) {
        zzd.f((Object)h, "context");
        zzd.f((Object)hr0, "applicationManager");
        zzd.f((Object)psc, "httpRequestController");
        zzd.f((Object)i, "configuration");
        zzd.f((Object)j, "networkSettingsManager");
        zzd.f((Object)k, "controlTowerResponsePersister");
        zzd.f((Object)qvo, "ioScheduler");
        zzd.f((Object)ibm, "releaseCompletable");
        super(hr0, psc, "TrafficControlTower", qvo);
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        final gew b = kwe.b();
        zzd.e((Object)b, "get()");
        this.l = b;
        this.m = new rd6();
        this.n = (jwt)pf8.D0;
        ibm.i((rj)new hj4((Object)this, 24));
    }
    
    public final void a() {
        this.s(aq6.e, (jwt)pf8.D0);
    }
    
    public final Object b() {
        this.p = true;
        final gvj f = this.i.f;
        final UserIdentifier b = this.l.b();
        zzd.e((Object)b, "userManager.current");
        return new bq6(f, b, (u93)new ngc((Object)this, 17), this.i.g);
    }
    
    public final long c() {
        final long b = this.n.b();
        final long r = yp6.r;
        final long s = yp6.s;
        final long q = yp6.q;
        if (b >= r) {
            final long n = b;
            if (b <= s) {
                return n;
            }
        }
        return q;
    }
    
    public final boolean d() {
        return this.n.isValid();
    }
    
    public final boolean e() {
        return this.i.e;
    }
    
    public final boolean f() {
        final Object f = super.f;
        final boolean b = true;
        final boolean b2 = f != null;
        boolean b3 = b;
        if (!b2) {
            b3 = (this.o != null && b);
        }
        return b3;
    }
    
    public final void h() {
        if (!this.n.isValid()) {
            this.s(aq6.e, (jwt)pf8.D0);
        }
        super.h();
    }
    
    public final void j() {
        super.j();
        final hlv b = dta.b();
        zzd.e((Object)b, "getCurrent()");
        this.m.a(b5j.merge((naj)b.p("traffic_control_tower_configuration_key"), (naj)b.p("traffic_control_tower_configuration_value"), (naj)b.p("traffic_control_tower_recommendations_should_send_client_details")).subscribe((fk6)new za6((rtb)new yp6$c(this), 24)));
    }
    
    public final boolean k() {
        return this.n.f();
    }
    
    public final boolean l() {
        final boolean e = this.e();
        boolean b = true;
        if (!e || super.f != null || this.o != null) {
            b = false;
        }
        return b;
    }
    
    public final void n() {
        Object o = this.k;
        synchronized (o) {
            Objects.requireNonNull(cq6.Companion);
            final hlv b = dta.b();
            boolean b2 = true;
            aq6 aq6 = null;
            Label_0115: {
                if (!b.b("traffic_should_persist_trafficmap", true)) {
                    aq6 = aq6.e;
                    zzd.e((Object)aq6, "EMPTY");
                    monitorexit(o);
                }
                else {
                    aq6 = (aq6)((cq6)o).a.f("control_tower_recommendations", (alp)((cq6)o).b);
                    if (aq6 != null) {
                        final long a = aq6.a;
                        final t3s a2 = mq1.a;
                        if (a > System.currentTimeMillis()) {
                            monitorexit(o);
                            break Label_0115;
                        }
                    }
                    aq6 = aq6.e;
                    zzd.e((Object)aq6, "EMPTY");
                    monitorexit(o);
                }
            }
            if (!aq6.c.isEmpty()) {
                o = mq1.a;
                if (System.currentTimeMillis() > aq6.a) {
                    b2 = false;
                }
                if (b2) {
                    o = Collections.singletonMap("startup", "1");
                    final ijf$a ijf$a = new ijf$a(aq6.c.size());
                    final Iterator iterator = aq6.c.iterator();
                    while (iterator.hasNext()) {
                        ((ijf)ijf$a).p((Object)((ulp)iterator.next()).b((Map)o));
                    }
                    this.t(new aq6(aq6.a, aq6.b, (List)((h4j)ijf$a).e()));
                }
            }
        }
    }
    
    public final void o(final jwt jwt) {
        this.j.a(jwt.d());
        nca nca;
        if (jwt.e()) {
            final ewt a = ewt.a;
            nca = ewt.b;
        }
        else {
            final ewt a2 = ewt.a;
            nca = ewt.c;
        }
        final ewt a3 = ewt.a;
        ewt.a(nca);
    }
    
    public final void p(final boolean b) {
        Object o;
        if (b) {
            o = this.n;
        }
        else {
            o = pf8.D0;
        }
        this.o((jwt)o);
    }
    
    public final void q(final lwt lwt, final aq6 aq6, final jwt jwt) {
        if (lwt != this.o) {
            return;
        }
        this.s(aq6, jwt);
        synchronized (this) {
            final boolean b = !this.p;
            this.o = null;
            monitorexit(this);
            if (b) {
                this.h();
            }
            else {
                this.i();
            }
        }
    }
    
    public final void r() {
        this.i.a();
    }
    
    public final void s(final aq6 aq6, final jwt n) {
        synchronized (this) {
            boolean b;
            if (!zzd.a((Object)n, (Object)this.n)) {
                this.n = n;
                b = true;
            }
            else {
                b = false;
            }
            monitorexit(this);
            if (b) {
                if (aq6 != null) {
                    this.k.a(aq6);
                }
                this.o(n);
            }
        }
    }
    
    public final void t(final aq6 aq6) {
        ij1.b(this.o == null);
        if (this.o != null) {
            return;
        }
        if (!(aq6.c.isEmpty() ^ true)) {
            ij1.b(aq6.c.isEmpty());
            this.s(aq6, (jwt)new kwt(aq6.a, aq6.b, (Map)Collections.emptyMap()));
            return;
        }
        final Context h = this.h;
        final UserIdentifier b = this.l.b();
        zzd.e((Object)b, "userManager.current");
        final lwt o = new lwt(this, h, b, super.b, aq6);
        final List c = o.e.c;
        zzd.e((Object)c, "controlTowerRecommendations.recommendations");
        final ArrayList list = new ArrayList<Object>(kr4.h1((Iterable)c, 10));
        for (final ulp ulp : c) {
            final o3m$a companion = o3m.Companion;
            zzd.e((Object)ulp, "r");
            final ngc ngc = new ngc((Object)o, 18);
            final Context b2 = o.b;
            final UserIdentifier c2 = o.c;
            final psc d = o.d;
            Objects.requireNonNull(companion);
            zzd.f((Object)b2, "context");
            zzd.f((Object)c2, "owner");
            zzd.f((Object)d, "httpRequestController");
            Object o2;
            if (ulp instanceof hwm) {
                o2 = new iwm((u93)ngc, b2, c2, d, (hwm)ulp);
            }
            else {
                if (!(ulp instanceof stk)) {
                    final Class<? extends ulp> class1 = ulp.getClass();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("No other recommendation types exist at the moment. Unknown type ");
                    sb.append(class1);
                    ij1.h(sb.toString());
                    final Class<? extends ulp> class2 = ulp.getClass();
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown recommendation type ");
                    sb2.append(class2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                o2 = new ttk((u93<o3m>)ngc, b2, c2, d, (stk)ulp);
            }
            list.add(o2);
        }
        final List m2 = or4.m2((Iterable)list);
        o.f = m2;
        zzd.e((Object)String.format(Locale.ENGLISH, "Validating %d recommendations", Arrays.copyOf(new Object[] { m2.size() }, 1)), "format(locale, format, *args)");
        final List f = o.f;
        zzd.c((Object)f);
        for (final o3m o3m : f) {
            Objects.requireNonNull(o3m);
            xw0.c((rj)new xak((Object)o3m, 13));
        }
        this.o = o;
    }
}
