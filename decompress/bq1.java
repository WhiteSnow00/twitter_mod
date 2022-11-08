import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Collections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bq1 implements q0k
{
    public static final a Companion;
    public static final z9m t;
    public final String a;
    public final bq1 b;
    public final wut c;
    public final zau d;
    public final xca<okm> e;
    public final bvt f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final String j;
    public final v0k$b k;
    public volatile int l;
    public volatile long m;
    public volatile long n;
    public volatile z06 o;
    public final Set<bq1> p;
    public final Set<v0k$c> q;
    public Long r;
    public final AtomicInteger s;
    
    static {
        Companion = new a();
        t = new z9m("^[a-zA-Z0-9-]+$");
    }
    
    public bq1(String s, final bq1 b, final wut c, final zau d, final xca e, final bvt f, boolean g, boolean h, int n) {
        if ((n & 0x40) != 0x0) {
            g = true;
        }
        if ((n & 0x80) != 0x0) {
            h = false;
        }
        if ((n & 0x100) != 0x0) {
            bl0.a().t();
        }
        zzd.f((Object)s, "name");
        zzd.f((Object)c, "traceContext");
        zzd.f((Object)d, "systemClock");
        zzd.f((Object)e, "eventReporter");
        this.a = s;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (xca<okm>)e;
        this.f = f;
        this.g = g;
        this.h = h;
        if (bq1.t.c((CharSequence)s)) {
            if (b != null) {
                if (!hi.c(b.l)) {
                    throw new IllegalArgumentException("Span cannot be added to the parent");
                }
                final Set<bq1> p9 = b.p;
                Label_0213: {
                    if (!(p9 instanceof Collection) || !p9.isEmpty()) {
                        final Iterator iterator = p9.iterator();
                        while (iterator.hasNext()) {
                            if (ckr.f1(((v0k)iterator.next()).getName(), this.a, true)) {
                                n = 1;
                                break Label_0213;
                            }
                        }
                    }
                    n = 0;
                }
                if (n != 0) {
                    throw new IllegalArgumentException("Sibling span with the same name already exists");
                }
            }
            this.i = this.c.e.getAndIncrement();
            final bq1 b2 = this.b;
            if (b2 != null) {
                s = zi.y(b2.j, "/", this.a);
            }
            else {
                s = this.a;
            }
            this.j = s;
            s = Thread.currentThread().getName();
            zzd.e((Object)s, "currentThread().name");
            this.k = new v0k$b(s);
            this.l = 1;
            this.m = -1L;
            this.n = -1L;
            this.o = z06.H0;
            final Set<bq1> setFromMap = Collections.newSetFromMap((Map<bq1, Boolean>)new ConcurrentHashMap());
            zzd.e((Object)setFromMap, "newSetFromMap(Concurrent\u2026Map<BaseSpan, Boolean>())");
            this.p = setFromMap;
            this.q = new LinkedHashSet(0);
            this.s = new AtomicInteger(0);
            return;
        }
        throw new IllegalArgumentException(zi.y("Provided name is not valid. Only alphanumeric characters and '-' may be used: '", s, "'"));
    }
    
    public final boolean P() {
        return this.l == 4;
    }
    
    public final boolean Q() {
        return hi.f(this.l);
    }
    
    public final wut R() {
        return this.c;
    }
    
    public final z06 S() {
        return this.o;
    }
    
    public final v0k$b T() {
        return this.k;
    }
    
    public final long V() {
        return this.m;
    }
    
    public final boolean W() {
        return this.b == null;
    }
    
    public final List<v0k$c> X() {
        return or4.m2((Iterable)this.q);
    }
    
    public final int Y() {
        return this.c.d;
    }
    
    public final long Z() {
        return this.n;
    }
    
    public final boolean a0() {
        return hi.h(this.l);
    }
    
    public final void b(final Long r) {
        this.r = r;
    }
    
    public final boolean b0(final String s) {
        synchronized (this) {
            return hi.b(this.l) && this.q.add(new v0k$c(this.d.a(), s));
        }
    }
    
    public final List<q0k> c() {
        bq1 bq1 = this.b;
        final rs0 rs0 = new rs0();
        while (bq1 != null) {
            rs0.addFirst((Object)bq1);
            bq1 = bq1.b;
        }
        return or4.m2((Iterable)rs0);
    }
    
    public final boolean cancel() {
        synchronized (this.c) {
            if (this.i()) {
                this.m(5);
                final ConcurrentLinkedQueue<bq1> concurrentLinkedQueue = new ConcurrentLinkedQueue<bq1>();
                concurrentLinkedQueue.add(this);
                bq1 bq1;
                do {
                    bq1 = concurrentLinkedQueue.poll();
                    if (bq1 != null) {
                        final Set<bq1> p = bq1.p;
                        if (p == null) {
                            continue;
                        }
                        for (final bq1 bq2 : p) {
                            if (hi.d(bq2.l)) {
                                bq2.m(5);
                                concurrentLinkedQueue.add(bq2);
                            }
                        }
                    }
                } while (bq1 != null);
            }
            return this.l == 5;
        }
    }
    
    public final Long d() {
        return this.r;
    }
    
    public final int e() {
        return this.i;
    }
    
    public final String f() {
        return this.j;
    }
    
    public final boolean g(final bq1 bq1) {
        synchronized (this.c) {
            return hi.c(this.l) && zzd.a((Object)bq1.b, (Object)this) && this.p.add(bq1);
        }
    }
    
    public final String getName() {
        return this.a;
    }
    
    public int h() {
        return this.s.decrementAndGet();
    }
    
    public final boolean i() {
        if (!hi.d(this.l)) {
            return false;
        }
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        concurrentLinkedQueue.add(this);
        bq1 bq1;
        do {
            bq1 = concurrentLinkedQueue.poll();
            if (bq1 != null) {
                final Set<bq1> p = bq1.p;
                if (p == null) {
                    continue;
                }
                for (final bq1 bq2 : p) {
                    if (!hi.d(bq2.l)) {
                        return false;
                    }
                    concurrentLinkedQueue.add(bq2);
                }
            }
        } while (bq1 != null);
        return true;
    }
    
    public final boolean j(final long n) {
        final boolean g = hi.g(this.l);
        boolean b2;
        final boolean b = b2 = false;
        if (g) {
            final bq1 b3 = this.b;
            if (b3 != null) {
                b2 = b;
                if (!hi.e(b3.l)) {
                    return b2;
                }
                b2 = b;
                if (this.b.m > TimeUnit.MILLISECONDS.toMicros(n)) {
                    return b2;
                }
            }
            if (this.h) {
                final Set<bq1> p = this.p;
                boolean b4 = false;
                Label_0148: {
                    if (!(p instanceof Collection) || !p.isEmpty()) {
                        final Iterator iterator = p.iterator();
                        while (iterator.hasNext()) {
                            if (hi.g(((bq1)iterator.next()).l)) {
                                b4 = true;
                                break Label_0148;
                            }
                        }
                    }
                    b4 = false;
                }
                b2 = b;
                if (!b4) {
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    public final boolean k() {
        synchronized (this.c) {
            boolean b;
            if (hi.f(this.l)) {
                this.l();
                final ConcurrentLinkedQueue<bq1> concurrentLinkedQueue = new ConcurrentLinkedQueue<bq1>();
                concurrentLinkedQueue.add(this);
                bq1 bq1;
                do {
                    bq1 = concurrentLinkedQueue.poll();
                    if (bq1 != null) {
                        final Set<bq1> p = bq1.p;
                        if (p == null) {
                            continue;
                        }
                        for (final bq1 bq2 : p) {
                            if (hi.f(bq2.l)) {
                                bq2.l();
                                concurrentLinkedQueue.add(bq2);
                            }
                            else {
                                bq2.cancel();
                            }
                        }
                    }
                } while (bq1 != null);
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
    }
    
    public final void l() {
        this.m(4);
        if (this.c.c) {
            xw0.d(yvo.a(), (rj)new aq1((Object)this, 0));
        }
    }
    
    public final void m(final int l) {
        synchronized (this) {
            k1b.i(l, "newState");
            this.l = l;
            if (this.l == 2) {
                final bq1 b = this.b;
                if (b != null) {
                    b.s.incrementAndGet();
                }
            }
            else if (this.l == 5 || this.l == 3) {
                final bq1 b2 = this.b;
                if (b2 != null) {
                    b2.h();
                }
                final bvt f = this.f;
                if (f != null) {
                    Objects.requireNonNull(bvt.Companion);
                    if (this.W()) {
                        f.a.remove((Object)this.c.b);
                    }
                }
            }
        }
    }
    
    public final boolean stop() {
        return ((v0k)this).U(uhr.E0);
    }
    
    @Override
    public final String toString() {
        return af.z(g9m.a((Class)this.getClass()).o(), "(", this.j, ")");
    }
    
    public static final class a
    {
    }
}
