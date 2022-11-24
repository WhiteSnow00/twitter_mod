import java.util.Iterator;
import java.util.ArrayList;
import java.util.Objects;
import android.os.SystemClock;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efg<K, V> implements zz6<K, V>, k4h<K, V>
{
    public final b<K> F0;
    public final yz6<K, a<K, V>> G0;
    public final yz6<K, a<K, V>> H0;
    public final apw<V> I0;
    public final k4h$a J0;
    public final zzr<l4h> K0;
    public l4h L0;
    public long M0;
    
    public efg(final apw<V> i0, final k4h$a j0, final zzr<l4h> k0, final b<K> f0) {
        new WeakHashMap();
        this.I0 = i0;
        this.G0 = (yz6<K, a<K, V>>)new yz6((apw)new dfg(i0));
        this.H0 = (yz6<K, a<K, V>>)new yz6((apw)new dfg(i0));
        this.J0 = j0;
        this.K0 = k0;
        final l4h value = k0.get();
        xd.K(value, "mMemoryCacheParamsSupplier returned null");
        this.L0 = value;
        this.M0 = SystemClock.uptimeMillis();
        this.F0 = f0;
    }
    
    public static <K, V> void m(final a<K, V> a) {
        if (a != null) {
            final b<K> e = a.e;
            if (e != null) {
                ((v90$a)e).a((Object)a.a, false);
            }
        }
    }
    
    @Override
    public final cj4<V> a(final K k, final cj4<V> cj4) {
        return this.c(k, cj4, this.F0);
    }
    
    @Override
    public final cj4<V> c(final K k, final cj4<V> cj4, final b<K> b) {
        Objects.requireNonNull(k);
        Objects.requireNonNull(cj4);
        this.o();
        synchronized (this) {
            final a a = (a)this.G0.e((Object)k);
            final a a2 = (a)this.H0.e((Object)k);
            cj4<V> p3 = null;
            cj4<V> q;
            if (a2 != null) {
                this.i(a2);
                q = this.q(a2);
            }
            else {
                q = null;
            }
            if (this.g(cj4.h())) {
                final a a3 = new a(k, cj4, b);
                this.H0.d((Object)k, (Object)a3);
                p3 = this.p(a3);
            }
            monitorexit(this);
            cj4.e(q);
            m((a<Object, Object>)a);
            this.l();
            return p3;
        }
    }
    
    @Override
    public final boolean contains(final K k) {
        synchronized (this) {
            final yz6<K, a<K, V>> h0 = this.H0;
            synchronized (h0) {
                return h0.b.containsKey(k);
            }
        }
    }
    
    @Override
    public final int d(final puk<K> puk) {
        synchronized (this) {
            final ArrayList f = this.G0.f((puk)puk);
            final ArrayList f2 = this.H0.f((puk)puk);
            this.j(f2);
            monitorexit(this);
            this.k(f2);
            this.n(f);
            this.o();
            this.l();
            return f2.size();
        }
    }
    
    @Override
    public final cj4<V> e(final K k) {
        Objects.requireNonNull(k);
        synchronized (this) {
            final a a = (a)this.G0.e((Object)k);
            boolean b = false;
            boolean b2 = false;
            cj4<V> b3;
            if (a != null) {
                final a a2 = (a)this.H0.e((Object)k);
                Objects.requireNonNull(a2);
                if (a2.c == 0) {
                    b2 = true;
                }
                xd.M(b2);
                b3 = a2.b;
                b = true;
            }
            else {
                b3 = null;
            }
            monitorexit(this);
            if (b) {
                m((a<Object, Object>)a);
            }
            return (cj4<V>)b3;
        }
    }
    
    @Override
    public final void f(final v4h v4h) {
        final double a = this.J0.a(v4h);
        synchronized (this) {
            final ArrayList<a<K, V>> r = this.r(Integer.MAX_VALUE, Math.max(0, (int)((1.0 - a) * this.H0.b()) - this.h()));
            this.j(r);
            monitorexit(this);
            this.k(r);
            this.n(r);
            this.o();
            this.l();
        }
    }
    
    public final boolean g(final V v) {
        synchronized (this) {
            final int b = this.I0.b((Object)v);
            final int e = this.L0.e;
            boolean b2 = true;
            if (b <= e) {
                synchronized (this) {
                    final int a = this.H0.a();
                    final int a2 = this.G0.a();
                    monitorexit(this);
                    if (a - a2 <= this.L0.b - 1 && this.h() <= this.L0.a - b) {
                        return b2;
                    }
                }
            }
            b2 = false;
            return b2;
        }
    }
    
    @Override
    public final cj4<V> get(final K k) {
        Objects.requireNonNull(k);
        synchronized (this) {
            final a a = (a)this.G0.e((Object)k);
            final yz6<K, a<K, V>> h0 = this.H0;
            synchronized (h0) {
                final Object value = h0.b.get(k);
                monitorexit(h0);
                final a a2 = (a)value;
                cj4<V> p;
                if (a2 != null) {
                    p = this.p(a2);
                }
                else {
                    p = null;
                }
                monitorexit(this);
                m((a<Object, Object>)a);
                this.o();
                this.l();
                return p;
            }
        }
    }
    
    public final int h() {
        synchronized (this) {
            return this.H0.b() - this.G0.b();
        }
    }
    
    public final void i(final a<K, V> a) {
        synchronized (this) {
            Objects.requireNonNull(a);
            xd.M(!a.d);
            a.d = true;
        }
    }
    
    public final void j(final ArrayList<a<K, V>> list) {
        monitorenter(this);
        if (list != null) {
            try {
                final Iterator<a<K, V>> iterator = list.iterator();
                while (iterator.hasNext()) {
                    this.i((a)iterator.next());
                }
            }
            finally {
                monitorexit(this);
            }
        }
        monitorexit(this);
    }
    
    public final void k(final ArrayList<a<K, V>> list) {
        if (list != null) {
            final Iterator<a<K, V>> iterator = list.iterator();
            while (iterator.hasNext()) {
                cj4.e(this.q((a)iterator.next()));
            }
        }
    }
    
    public final void l() {
        synchronized (this) {
            final l4h l0 = this.L0;
            final int d = l0.d;
            final int b = l0.b;
            synchronized (this) {
                final int a = this.H0.a();
                final int a2 = this.G0.a();
                monitorexit(this);
                final int min = Math.min(d, b - (a - a2));
                final l4h l2 = this.L0;
                final ArrayList<a<K, V>> r = this.r(min, Math.min(l2.c, l2.a - this.h()));
                this.j(r);
                monitorexit(this);
                this.k(r);
                this.n(r);
            }
        }
    }
    
    public final void n(final ArrayList<a<K, V>> list) {
        if (list != null) {
            final Iterator<a<K, V>> iterator = list.iterator();
            while (iterator.hasNext()) {
                m((a<Object, Object>)(a)iterator.next());
            }
        }
    }
    
    public final void o() {
        synchronized (this) {
            if (this.M0 + this.L0.f > SystemClock.uptimeMillis()) {
                return;
            }
            this.M0 = SystemClock.uptimeMillis();
            final l4h value = this.K0.get();
            xd.K(value, "mMemoryCacheParamsSupplier returned null");
            this.L0 = value;
        }
    }
    
    public final cj4<V> p(final a<K, V> a) {
        synchronized (this) {
            synchronized (this) {
                xd.M(!a.d);
                ++a.c;
                monitorexit(this);
                return cj4.m(a.b.h(), (asm<V>)new asm<V>(this, a) {
                    public final a F0;
                    public final efg G0;
                    
                    public final void b(final V v) {
                        final efg g0 = this.G0;
                        a f0 = this.F0;
                        Objects.requireNonNull(g0);
                        Objects.requireNonNull(f0);
                        synchronized (g0) {
                            synchronized (g0) {
                                final int c = f0.c;
                                boolean b = false;
                                xd.M(c > 0);
                                --f0.c;
                                monitorexit(g0);
                                synchronized (g0) {
                                    if (!f0.d && f0.c == 0) {
                                        g0.G0.d((Object)f0.a, (Object)f0);
                                        monitorexit(g0);
                                        b = true;
                                    }
                                    else {
                                        monitorexit(g0);
                                    }
                                    final cj4<V> q = g0.q(f0);
                                    monitorexit(g0);
                                    cj4.e(q);
                                    if (!b) {
                                        f0 = null;
                                    }
                                    if (f0 != null) {
                                        final b<K> e = f0.e;
                                        if (e != null) {
                                            ((v90$a)e).a((Object)f0.a, true);
                                        }
                                    }
                                    g0.o();
                                    g0.l();
                                }
                            }
                        }
                    }
                });
            }
        }
    }
    
    public final cj4<V> q(final a<K, V> a) {
        synchronized (this) {
            Objects.requireNonNull(a);
            cj4<V> b;
            if (a.d && a.c == 0) {
                b = a.b;
            }
            else {
                b = null;
            }
            return b;
        }
    }
    
    public final ArrayList<a<K, V>> r(int max, int max2) {
        synchronized (this) {
            max = Math.max(max, 0);
            max2 = Math.max(max2, 0);
            if (this.G0.a() <= max && this.G0.b() <= max2) {
                return null;
            }
            final ArrayList<a<K, V>> list = new ArrayList<a<K, V>>();
            while (this.G0.a() > max || this.G0.b() > max2) {
                final yz6<K, a<K, V>> g0 = this.G0;
                synchronized (g0) {
                    Object next;
                    if (g0.b.isEmpty()) {
                        next = null;
                    }
                    else {
                        next = g0.b.keySet().iterator().next();
                    }
                    monitorexit(g0);
                    if (next != null) {
                        this.G0.e(next);
                        list.add((a<K, V>)this.H0.e(next));
                        continue;
                    }
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", this.G0.a(), this.G0.b()));
                }
            }
            return list;
        }
    }
}
