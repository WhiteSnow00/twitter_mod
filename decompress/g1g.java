import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g1g
{
    public static final long o;
    public static final long p;
    public static final long q;
    public zml<ifk> a;
    public nir b;
    public final n7m<String, c> c;
    public final Context d;
    public final psc e;
    public String f;
    public long g;
    public long h;
    public long i;
    public final qmr j;
    public final m29 k;
    public final zau l;
    public g1g.g1g$d m;
    public g1g.g1g$e n;
    
    static {
        o = TimeUnit.MINUTES.toMillis(2L);
        final TimeUnit seconds = TimeUnit.SECONDS;
        p = seconds.toMillis(10L);
        q = seconds.toMillis(60L);
    }
    
    public g1g(final Context context, final psc e) {
        this.g = g1g.o;
        this.k = new m29();
        this.e = e;
        final zml<ifk> d = this.d();
        this.a = d;
        this.b = new nir(context, e, (wbj<ifk>)d);
        this.d = context.getApplicationContext();
        this.j = new qmr(context, (ofk)new f1g(this));
        this.c = (n7m<String, c>)n7m.g();
        this.l = zau.d();
        kwe.b().c().subscribe((fk6)new tua(this, 11));
    }
    
    public final void a(final Collection<String> collection) {
        synchronized (this) {
            if (this.m == null) {
                this.m = new g1g.g1g$d(this);
            }
            this.n = new g1g.g1g$e(this, this.m.r);
            monitorexit(this);
            final nir b = this.b;
            final cw0$b<cw0<tsc<pmi, pav>>> cw0$b = (cw0$b<cw0<tsc<pmi, pav>>>)new cw0$b<cw0<tsc<pmi, pav>>>() {
                public final void b(final cw0<tsc<pmi, pav>> cw0) {
                    final tsc tsc = (tsc)cw0.M().e();
                    if (tsc != null) {
                        final xsc d = tsc.d();
                        if (d != null) {
                            final int[] z = d.z;
                            final g1g c0 = g1g.this;
                            final int n = z[2];
                            final int n2 = z[3];
                            final g1g.g1g$e n3 = c0.n;
                            if (n3 != null) {
                                n3.s = n + n2;
                            }
                            final long j = d.j;
                            final g1g.g1g$d m = c0.m;
                            if (m != null) {
                                ((b)m).o += j;
                            }
                            if (n3 != null) {
                                ((b)n3).o += j;
                            }
                        }
                    }
                    final g1g c2 = g1g.this;
                    synchronized (c2) {
                        final g1g.g1g$e n4 = c2.n;
                        int n6;
                        if (n4 != null) {
                            if (n4.w == 0) {
                                n4.w = c2.f((cw0)cw0);
                            }
                            final g1g.g1g$e n5 = c2.n;
                            n6 = n5.w;
                            ((i1g)n5).a();
                            final g1g.g1g$d i = c2.m;
                            if (i != null) {
                                final long c3 = ((i1g)c2.n).c();
                                final g1g.g1g$e n7 = c2.n;
                                i.s += c3 - i1g.d(n7.r, ((i1g)n7).a);
                            }
                            c2.n = null;
                        }
                        else {
                            n6 = c2.f((cw0)cw0);
                        }
                        c2.f = null;
                        monitorexit(c2);
                        c2.j.b(n6);
                        if (!q1a.d(n6)) {
                            final g1g.g1g$d k = c2.m;
                            if (k != null) {
                                ((i1g)k).a();
                                c2.m = null;
                            }
                            c2.a.onComplete();
                            c2.c.clear();
                            final zml<ifk> d2 = c2.d();
                            c2.a = d2;
                            c2.b = new nir(c2.d, c2.e, (wbj<ifk>)d2);
                        }
                        else {
                            c2.b();
                        }
                    }
                }
            };
            final long g = this.g;
            synchronized (b) {
                if (b.e != 1) {
                    monitorexit(b);
                }
                else {
                    b.e = 2;
                    ((kmm)(b.a = new lir(b, (wbj)b.b, b.d, g))).U((cw0$b)new mir(b));
                    ((kmm)b.a).U((cw0$b)cw0$b);
                    final Iterator<String> iterator = collection.iterator();
                    while (iterator.hasNext()) {
                        ((dfk)b.a).i1.add(iterator.next());
                    }
                    final long b2 = b.f.b();
                    final Long g2 = b.g;
                    long n;
                    if (g2 != null && b2 - g2 <= 2000L) {
                        n = b.g + 2000L - b2;
                    }
                    else {
                        n = 0L;
                    }
                    if (n > 0L) {
                        final n9q v = n9q.v((Object)b.a);
                        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
                        final n9q h = v.h(n);
                        final psc c = b.c;
                        Objects.requireNonNull(c);
                        h.G((fk6)new k4((Object)c, 4), (fk6)jvb.e);
                    }
                    else {
                        b.c.f((ksc)b.a);
                    }
                    monitorexit(b);
                }
                final Iterator<String> iterator2 = collection.iterator();
                while (iterator2.hasNext()) {
                    this.h(iterator2.next());
                }
            }
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (this.b.e == 1) {
                this.a(this.j.a());
            }
        }
    }
    
    public final b5j<ifk> c(final lfk lfk) {
        final String a = lfk.a;
        synchronized (this.c) {
            Object o = this.c.e((Object)a);
            if (o == null) {
                o = new c(a);
                this.c.i((Object)a, o);
            }
            monitorexit(this.c);
            return ((c)o).a;
        }
    }
    
    public final zml<ifk> d() {
        final zml zml = new zml();
        ((b5j)zml).filter((ptk)vno.R0).cast((Class)nf6.class).subscribe((fk6)new qcs((Object)this, (Object)zml, 7));
        ((b5j)zml).filter((ptk)o6.E0).cast((Class)umr.class).subscribe((fk6)kf2.K0);
        ((b5j)zml).filter((ptk)p71.U0).subscribe((fk6)new kce(this, 9));
        return (zml<ifk>)zml;
    }
    
    public final void e(final long n) {
        final StringBuilder g = w48.g("Scheduling resubscribe after ");
        g.append(this.h);
        g.append("ms at ");
        g.append(new Date(this.l.a()));
        cag.a("LivePipeline", g.toString());
        final String f = this.f;
        if (f != null) {
            final n9q v = n9q.v((Object)f);
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            v.h(n).I(yvo.a()).G((fk6)new lno((Object)this, 8), (fk6)thd.N0);
        }
    }
    
    public final void f(final cw0<tsc<pmi, pav>> cw0) {
        final qmr j = this.j;
        synchronized (j) {
            final boolean empty = j.f.isEmpty();
            final int n = 1;
            final boolean b = !empty || !j.g.containsAll(j.e);
            monitorexit(j);
            int n2;
            if (!b) {
                cag.a("LivePipeline", "Should not be connected because there are no active subscriptions");
                n2 = 2;
            }
            else {
                n2 = n;
                if (cw0 != null) {
                    if (cw0.M().e() != null) {
                        n2 = n;
                        if (((tsc)cw0.M().e()).b) {
                            return (void)n2;
                        }
                    }
                    cag.a("LivePipeline", "Should not be connected because the previous stream could not be connected to or failed in an unexpected way");
                    n2 = 3;
                }
            }
            return (void)n2;
        }
    }
    
    public final void g(final int v, final int w) {
        final g1g.g1g$e n = this.n;
        if (n != null) {
            n.v = v;
            n.w = w;
        }
        this.f = null;
        this.j.b(w);
        Object o = this.b;
        synchronized (o) {
            final lir a = ((nir)o).a;
            if (a != null) {
                ((cw0)a).H(true);
            }
            ((nir)o).e = 1;
            ((nir)o).a = null;
            monitorexit(o);
            o = w48.g("Client-side termination of stream: ");
            ((StringBuilder)o).append(o1a.k(v));
            cag.a("LivePipeline", ((StringBuilder)o).toString());
        }
    }
    
    public final void h(final String s) {
        final g1g.g1g$d m = this.m;
        if (m != null) {
            ++((b)m).p;
            if (!((HashSet)((b)m).k).contains(s)) {
                ((HashSet<String>)((b)this.m).k).add(s);
            }
        }
        final g1g.g1g$e n = this.n;
        if (n != null) {
            ++((b)n).p;
            if (!((HashSet)((b)n).k).contains(s)) {
                ((HashSet<String>)((b)this.n).k).add(s);
            }
        }
    }
    
    public abstract class b extends i1g
    {
        public final AtomicLong j;
        public final Set<String> k;
        public long l;
        public long m;
        public long n;
        public long o;
        public long p;
        
        public b(final String s) {
            super(s);
            this.l = -1L;
            this.m = -1L;
            this.n = -1L;
            this.o = 0L;
            this.p = 0L;
            this.j = new AtomicLong(0L);
            this.k = (iuh$a)iuh.a(0);
        }
        
        public final sjg<String, String> e() {
            final long value = this.j.get();
            long n;
            if (value != 0L) {
                n = this.c() / value;
            }
            else {
                n = -1L;
            }
            final sjg t = sjg.t();
            t.w((Object)"time_to_first_event", (Object)Long.toString(i1g.d(this.l, super.a)));
            t.w((Object)"time_to_last_event", (Object)Long.toString(i1g.d(this.m, super.a)));
            t.w((Object)"final_idle_time", (Object)Long.toString(i1g.d(super.b, this.m)));
            t.w((Object)"total_events", (Object)Long.toString(value));
            t.w((Object)"mean_time_between_events", (Object)Long.toString(n));
            t.w((Object)"total_unique_topics", (Object)Integer.toString(((HashSet)this.k).size()));
            t.w((Object)"total_subscriptions", (Object)Long.toString(this.p));
            t.w((Object)"total_bytes", (Object)Long.toString(this.o));
            t.w((Object)"max_time_between_events", (Object)Long.toString(this.n));
            return (sjg<String, String>)t;
        }
        
        public final void f(final long n) {
            if (this.j.get() == 0L) {
                this.l = n;
            }
            else {
                final long m = this.m;
                if (m != -1L) {
                    final long d = i1g.d(n, m);
                    if (d > this.n) {
                        this.n = d;
                    }
                }
            }
            this.m = n;
            this.j.incrementAndGet();
        }
    }
    
    public final class c
    {
        public final b5j<ifk> a;
        public int b;
        
        public c(final String s) {
            this.a = (b5j<ifk>)((b5j)g1g.this.a).filter((ptk)new wo(s, 1)).doOnSubscribe((fk6)new ue3((Object)this, (Object)s, 2)).doOnDispose((rj)new pj4((Object)this, (Object)s, 8));
        }
    }
}
