// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import android.util.SparseIntArray;
import java.util.Objects;
import java.util.Set;
import android.util.SparseArray;

public abstract class BasePool<V> implements fqk<V>
{
    public final Class<?> C0;
    public final f4h D0;
    public final iqk E0;
    public final SparseArray<rq2<V>> F0;
    public final Set<V> G0;
    public boolean H0;
    public final BasePool.BasePool$a I0;
    public final BasePool.BasePool$a J0;
    public final jqk K0;
    public boolean L0;
    
    public BasePool(final f4h d0, final iqk e0, final jqk k0) {
        this.C0 = this.getClass();
        Objects.requireNonNull(d0);
        this.D0 = d0;
        Objects.requireNonNull(e0);
        this.E0 = e0;
        Objects.requireNonNull(k0);
        this.K0 = k0;
        this.F0 = (SparseArray<rq2<V>>)new SparseArray();
        Objects.requireNonNull(e0);
        this.r(new SparseIntArray(0));
        this.G0 = Collections.newSetFromMap(new IdentityHashMap<V, Boolean>());
        this.J0 = new BasePool.BasePool$a();
        this.I0 = new BasePool.BasePool$a();
    }
    
    public final void b(final V v) {
        Objects.requireNonNull(v);
        final int l = this.l(v);
        final int m = this.m(l);
        synchronized (this) {
            synchronized (this) {
                final rq2 rq2 = (rq2)this.F0.get(l);
                monitorexit(this);
                final boolean remove = this.G0.remove(v);
                boolean b = false;
                if (!remove) {
                    dli.n((Class)this.C0, "release (free, value unrecognized) (object, size) = (%x, %s)", new Object[] { System.identityHashCode(v), l });
                    this.i(v);
                    this.K0.d();
                }
                else if (rq2 != null && rq2.b() + rq2.e <= rq2.b && !this.p() && this.q(v)) {
                    rq2.d((Object)v);
                    this.J0.b(m);
                    this.I0.a(m);
                    this.K0.c();
                    if (dli.H(2)) {
                        System.identityHashCode(v);
                    }
                }
                else {
                    if (rq2 != null) {
                        if (rq2.e > 0) {
                            b = true;
                        }
                        ri4.w(b);
                        --rq2.e;
                    }
                    if (dli.H(2)) {
                        System.identityHashCode(v);
                    }
                    this.i(v);
                    this.I0.a(m);
                    this.K0.d();
                }
                this.s();
            }
        }
    }
    
    public final void f(final d4h d4h) {
        synchronized (this) {
            Objects.requireNonNull(this.E0);
            final ArrayList<rq2> list = new ArrayList<rq2>(this.F0.size());
            final SparseIntArray sparseIntArray = new SparseIntArray();
            final int n = 0;
            for (int i = 0; i < this.F0.size(); ++i) {
                final Object value = this.F0.valueAt(i);
                Objects.requireNonNull(value);
                final rq2 rq2 = (rq2)value;
                if (rq2.b() > 0) {
                    list.add(rq2);
                }
                sparseIntArray.put(this.F0.keyAt(i), rq2.e);
            }
            this.r(sparseIntArray);
            final BasePool.BasePool$a j0 = this.J0;
            j0.a = 0;
            j0.b = 0;
            this.s();
            monitorexit(this);
            for (int k = n; k < list.size(); ++k) {
                final rq2 rq3 = list.get(k);
                while (true) {
                    final Object c = rq3.c();
                    if (c == null) {
                        break;
                    }
                    this.i((V)c);
                }
            }
        }
    }
    
    public abstract V g(final int p0);
    
    public final V get(int n) {
        synchronized (this) {
            final boolean p = this.p();
            final boolean b = false;
            ri4.w(!p || this.J0.b == 0);
            monitorexit(this);
            n = this.k(n);
            synchronized (this) {
                final rq2<Object> j = this.j(n);
                if (j != null) {
                    final Object n2 = this.n(j);
                    if (n2 != null) {
                        ri4.w(this.G0.add((V)n2));
                        n = this.m(this.l((V)n2));
                        this.I0.b(n);
                        this.J0.a(n);
                        this.K0.h();
                        this.s();
                        if (dli.H(2)) {
                            System.identityHashCode(n2);
                        }
                        return (V)n2;
                    }
                }
                final int m = this.m(n);
                if (this.h(m)) {
                    this.I0.b(m);
                    if (j != null) {
                        ++j.e;
                    }
                    monitorexit(this);
                    V g = null;
                    Label_0265: {
                        try {
                            g = this.g(n);
                            break Label_0265;
                        }
                        finally {
                            synchronized (this) {
                                this.I0.a(m);
                                final rq2<V> i = this.j(n);
                                if (i != null) {
                                    boolean b2 = b;
                                    if (i.e > 0) {
                                        b2 = true;
                                    }
                                    ri4.w(b2);
                                    --i.e;
                                }
                                monitorexit(this);
                                final Throwable t;
                                lux.i(t);
                                synchronized (this) {
                                    ri4.w(this.G0.add(g));
                                    synchronized (this) {
                                        if (this.p()) {
                                            this.u(this.E0.b);
                                        }
                                        monitorexit(this);
                                        this.K0.f();
                                        this.s();
                                        if (dli.H(2)) {
                                            System.identityHashCode(g);
                                        }
                                        return g;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new BasePool.BasePool$PoolSizeViolationException(this.E0.a, this.I0.b, this.J0.b, m);
            }
        }
    }
    
    public final boolean h(final int n) {
        synchronized (this) {
            if (this.L0) {
                return true;
            }
            final iqk e0 = this.E0;
            final int a = e0.a;
            final int b = this.I0.b;
            if (n > a - b) {
                this.K0.g();
                return false;
            }
            final int b2 = e0.b;
            if (n > b2 - (b + this.J0.b)) {
                this.u(b2 - n);
            }
            if (n > a - (this.I0.b + this.J0.b)) {
                this.K0.g();
                return false;
            }
            return true;
        }
    }
    
    public abstract void i(final V p0);
    
    public final rq2<V> j(final int n) {
        synchronized (this) {
            final rq2 rq2 = (rq2)this.F0.get(n);
            if (rq2 == null && this.H0) {
                if (dli.H(2)) {
                    final int d0 = dli.D0;
                }
                final rq2<V> t = this.t(n);
                this.F0.put(n, (Object)t);
                return t;
            }
            return (rq2<V>)rq2;
        }
    }
    
    public abstract int k(final int p0);
    
    public abstract int l(final V p0);
    
    public abstract int m(final int p0);
    
    public V n(final rq2<V> rq2) {
        synchronized (this) {
            final Object c = rq2.c();
            if (c != null) {
                ++rq2.e;
            }
            return (V)c;
        }
    }
    
    public final void o() {
        this.D0.a((e4h)this);
        this.K0.e();
    }
    
    public final boolean p() {
        synchronized (this) {
            final boolean b = this.I0.b + this.J0.b > this.E0.b;
            if (b) {
                this.K0.b();
            }
            return b;
        }
    }
    
    public boolean q(final V v) {
        Objects.requireNonNull(v);
        return true;
    }
    
    public final void r(final SparseIntArray sparseIntArray) {
        synchronized (this) {
            this.F0.clear();
            final SparseIntArray c = this.E0.c;
            if (c != null) {
                for (int i = 0; i < c.size(); ++i) {
                    final int key = c.keyAt(i);
                    final int value = c.valueAt(i);
                    final int value2 = sparseIntArray.get(key, 0);
                    final SparseArray<rq2<V>> f0 = this.F0;
                    final int m = this.m(key);
                    Objects.requireNonNull(this.E0);
                    f0.put(key, (Object)new rq2(m, value, value2));
                }
                this.H0 = false;
            }
            else {
                this.H0 = true;
            }
        }
    }
    
    @SuppressLint({ "InvalidAccessToGuardedField" })
    public final void s() {
        if (dli.H(2)) {
            final int a = this.I0.a;
            final int b = this.I0.b;
            final int a2 = this.J0.a;
            final int b2 = this.J0.b;
            final int d0 = dli.D0;
        }
    }
    
    public rq2<V> t(int m) {
        m = this.m(m);
        Objects.requireNonNull(this.E0);
        return (rq2<V>)new rq2(m, Integer.MAX_VALUE, 0);
    }
    
    public final void u(int n) {
        synchronized (this) {
            final int b = this.I0.b;
            final int b2 = this.J0.b;
            int i = Math.min(b + b2 - n, b2);
            if (i <= 0) {
                return;
            }
            if (dli.H(2)) {
                dli.b0("trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", (Object)n, (Object)(this.I0.b + this.J0.b), (Object)i);
            }
            this.s();
            Object value;
            rq2 rq2;
            Object c;
            int a;
            for (n = 0; n < this.F0.size() && i > 0; ++n) {
                value = this.F0.valueAt(n);
                Objects.requireNonNull(value);
                rq2 = (rq2)value;
                while (i > 0) {
                    c = rq2.c();
                    if (c == null) {
                        break;
                    }
                    this.i((V)c);
                    a = rq2.a;
                    i -= a;
                    this.J0.a(a);
                }
            }
            this.s();
            if (dli.H(2)) {
                n = this.I0.b;
                n = this.J0.b;
            }
        }
    }
}
