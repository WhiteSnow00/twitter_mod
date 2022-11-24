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

public abstract class BasePool<V> implements ark<V>
{
    public final Class<?> F0;
    public final x4h G0;
    public final drk H0;
    public final SparseArray<zq2<V>> I0;
    public final Set<V> J0;
    public boolean K0;
    public final BasePool.BasePool$a L0;
    public final BasePool.BasePool$a M0;
    public final erk N0;
    public boolean O0;
    
    public BasePool(final x4h g0, final drk h0, final erk n0) {
        this.F0 = this.getClass();
        Objects.requireNonNull(g0);
        this.G0 = g0;
        Objects.requireNonNull(h0);
        this.H0 = h0;
        Objects.requireNonNull(n0);
        this.N0 = n0;
        this.I0 = (SparseArray<zq2<V>>)new SparseArray();
        Objects.requireNonNull(h0);
        this.r(new SparseIntArray(0));
        this.J0 = Collections.newSetFromMap(new IdentityHashMap<V, Boolean>());
        this.M0 = new BasePool.BasePool$a();
        this.L0 = new BasePool.BasePool$a();
    }
    
    public final void b(final V v) {
        Objects.requireNonNull(v);
        final int l = this.l(v);
        final int m = this.m(l);
        synchronized (this) {
            synchronized (this) {
                final zq2 zq2 = (zq2)this.I0.get(l);
                monitorexit(this);
                final boolean remove = this.J0.remove(v);
                boolean b = false;
                if (!remove) {
                    fr0.o((Class)this.F0, "release (free, value unrecognized) (object, size) = (%x, %s)", new Object[] { System.identityHashCode(v), l });
                    this.i(v);
                    this.N0.d();
                }
                else if (zq2 != null && zq2.b() + zq2.e <= zq2.b && !this.p() && this.q(v)) {
                    zq2.d(v);
                    this.M0.b(m);
                    this.L0.a(m);
                    this.N0.c();
                    if (fr0.I(2)) {
                        System.identityHashCode(v);
                    }
                }
                else {
                    if (zq2 != null) {
                        if (zq2.e > 0) {
                            b = true;
                        }
                        xd.M(b);
                        --zq2.e;
                    }
                    if (fr0.I(2)) {
                        System.identityHashCode(v);
                    }
                    this.i(v);
                    this.L0.a(m);
                    this.N0.d();
                }
                this.s();
            }
        }
    }
    
    public final void f(final v4h v4h) {
        synchronized (this) {
            Objects.requireNonNull(this.H0);
            final ArrayList<zq2> list = new ArrayList<zq2>(this.I0.size());
            final SparseIntArray sparseIntArray = new SparseIntArray();
            final int n = 0;
            for (int i = 0; i < this.I0.size(); ++i) {
                final Object value = this.I0.valueAt(i);
                Objects.requireNonNull(value);
                final zq2 zq2 = (zq2)value;
                if (zq2.b() > 0) {
                    list.add(zq2);
                }
                sparseIntArray.put(this.I0.keyAt(i), zq2.e);
            }
            this.r(sparseIntArray);
            final BasePool.BasePool$a m0 = this.M0;
            m0.a = 0;
            m0.b = 0;
            this.s();
            monitorexit(this);
            for (int j = n; j < list.size(); ++j) {
                final zq2 zq3 = list.get(j);
                while (true) {
                    final Object c = zq3.c();
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
            xd.M(!p || this.M0.b == 0);
            monitorexit(this);
            final int k = this.k(n);
            synchronized (this) {
                final zq2<V> j = this.j(k);
                if (j != null) {
                    final Object n2 = this.n((zq2<Object>)j);
                    if (n2 != null) {
                        xd.M(this.J0.add((V)n2));
                        n = this.m(this.l((V)n2));
                        this.L0.b(n);
                        this.M0.a(n);
                        this.N0.h();
                        this.s();
                        if (fr0.I(2)) {
                            System.identityHashCode(n2);
                        }
                        return (V)n2;
                    }
                }
                n = this.m(k);
                if (this.h(n)) {
                    this.L0.b(n);
                    if (j != null) {
                        ++j.e;
                    }
                    monitorexit(this);
                    V g = null;
                    Label_0263: {
                        try {
                            g = this.g(k);
                            break Label_0263;
                        }
                        finally {
                            synchronized (this) {
                                this.L0.a(n);
                                final zq2<V> i = this.j(k);
                                if (i != null) {
                                    boolean b2 = b;
                                    if (i.e > 0) {
                                        b2 = true;
                                    }
                                    xd.M(b2);
                                    --i.e;
                                }
                                monitorexit(this);
                                final Throwable t;
                                lp7.s0(t);
                                synchronized (this) {
                                    xd.M(this.J0.add(g));
                                    synchronized (this) {
                                        if (this.p()) {
                                            this.u(this.H0.b);
                                        }
                                        monitorexit(this);
                                        this.N0.f();
                                        this.s();
                                        if (fr0.I(2)) {
                                            System.identityHashCode(g);
                                        }
                                        return g;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new BasePool.BasePool$PoolSizeViolationException(this.H0.a, this.L0.b, this.M0.b, n);
            }
        }
    }
    
    public final boolean h(final int n) {
        synchronized (this) {
            if (this.O0) {
                return true;
            }
            final drk h0 = this.H0;
            final int a = h0.a;
            final int b = this.L0.b;
            if (n > a - b) {
                this.N0.g();
                return false;
            }
            final int b2 = h0.b;
            if (n > b2 - (b + this.M0.b)) {
                this.u(b2 - n);
            }
            if (n > a - (this.L0.b + this.M0.b)) {
                this.N0.g();
                return false;
            }
            return true;
        }
    }
    
    public abstract void i(final V p0);
    
    public final zq2<V> j(final int n) {
        synchronized (this) {
            final zq2 zq2 = (zq2)this.I0.get(n);
            if (zq2 == null && this.K0) {
                if (fr0.I(2)) {
                    final int f0 = fr0.F0;
                }
                final zq2<V> t = this.t(n);
                this.I0.put(n, (Object)t);
                return t;
            }
            return zq2;
        }
    }
    
    public abstract int k(final int p0);
    
    public abstract int l(final V p0);
    
    public abstract int m(final int p0);
    
    public V n(final zq2<V> zq2) {
        synchronized (this) {
            final V c = zq2.c();
            if (c != null) {
                ++zq2.e;
            }
            return c;
        }
    }
    
    public final void o() {
        this.G0.a((w4h)this);
        this.N0.e();
    }
    
    public final boolean p() {
        synchronized (this) {
            final boolean b = this.L0.b + this.M0.b > this.H0.b;
            if (b) {
                this.N0.b();
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
            this.I0.clear();
            final SparseIntArray c = this.H0.c;
            if (c != null) {
                for (int i = 0; i < c.size(); ++i) {
                    final int key = c.keyAt(i);
                    final int value = c.valueAt(i);
                    final int value2 = sparseIntArray.get(key, 0);
                    final SparseArray<zq2<V>> i2 = this.I0;
                    final int m = this.m(key);
                    Objects.requireNonNull(this.H0);
                    i2.put(key, (Object)new zq2(m, value, value2));
                }
                this.K0 = false;
            }
            else {
                this.K0 = true;
            }
        }
    }
    
    @SuppressLint({ "InvalidAccessToGuardedField" })
    public final void s() {
        if (fr0.I(2)) {
            final int a = this.L0.a;
            final int b = this.L0.b;
            final int a2 = this.M0.a;
            final int b2 = this.M0.b;
            final int f0 = fr0.F0;
        }
    }
    
    public zq2<V> t(int m) {
        m = this.m(m);
        Objects.requireNonNull(this.H0);
        return new zq2<V>(m, Integer.MAX_VALUE, 0);
    }
    
    public final void u(int n) {
        synchronized (this) {
            final int b = this.L0.b;
            final int b2 = this.M0.b;
            int i = Math.min(b + b2 - n, b2);
            if (i <= 0) {
                return;
            }
            if (fr0.I(2)) {
                fr0.j0("trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", (Object)n, (Object)(this.L0.b + this.M0.b), (Object)i);
            }
            this.s();
            Object value;
            zq2 zq2;
            Object c;
            int a;
            for (n = 0; n < this.I0.size() && i > 0; ++n) {
                value = this.I0.valueAt(n);
                Objects.requireNonNull(value);
                zq2 = (zq2)value;
                while (i > 0) {
                    c = zq2.c();
                    if (c == null) {
                        break;
                    }
                    this.i((V)c);
                    a = zq2.a;
                    i -= a;
                    this.M0.a(a);
                }
            }
            this.s();
            if (fr0.I(2)) {
                n = this.L0.b;
                n = this.M0.b;
            }
        }
    }
}
