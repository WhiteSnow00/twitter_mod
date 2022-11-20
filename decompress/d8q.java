import java.util.Map;
import java.util.ConcurrentModificationException;

// 
// Decompiled by Procyon v0.6.0
// 

public class d8q<K, V>
{
    public static Object[] G0;
    public static int H0;
    public static Object[] I0;
    public static int J0;
    public int[] D0;
    public Object[] E0;
    public int F0;
    
    public d8q() {
        this.D0 = eli.E0;
        this.E0 = eli.G0;
        this.F0 = 0;
    }
    
    public d8q(final int n) {
        if (n == 0) {
            this.D0 = eli.E0;
            this.E0 = eli.G0;
        }
        else {
            this.a(n);
        }
        this.F0 = 0;
    }
    
    private void a(final int n) {
        Label_0145: {
            if (n == 8) {
                synchronized (d8q.class) {
                    final Object[] i0 = d8q.I0;
                    if (i0 != null) {
                        this.E0 = i0;
                        d8q.I0 = (Object[])i0[0];
                        this.D0 = (int[])i0[1];
                        i0[0] = (i0[1] = null);
                        --d8q.J0;
                        return;
                    }
                    break Label_0145;
                }
            }
            if (n == 4) {
                synchronized (d8q.class) {
                    final Object[] g0 = d8q.G0;
                    if (g0 != null) {
                        this.E0 = g0;
                        d8q.G0 = (Object[])g0[0];
                        this.D0 = (int[])g0[1];
                        g0[0] = (g0[1] = null);
                        --d8q.H0;
                        return;
                    }
                }
            }
        }
        this.D0 = new int[n];
        this.E0 = new Object[n << 1];
    }
    
    public static void d(final int[] array, final Object[] array2, int i) {
        if (array.length == 8) {
            synchronized (d8q.class) {
                if (d8q.J0 < 10) {
                    array2[0] = d8q.I0;
                    array2[1] = array;
                    for (i = (i << 1) - 1; i >= 2; --i) {
                        array2[i] = null;
                    }
                    d8q.I0 = array2;
                    ++d8q.J0;
                }
                return;
            }
        }
        if (array.length == 4) {
            synchronized (d8q.class) {
                if (d8q.H0 < 10) {
                    array2[0] = d8q.G0;
                    array2[1] = array;
                    for (i = (i << 1) - 1; i >= 2; --i) {
                        array2[i] = null;
                    }
                    d8q.G0 = array2;
                    ++d8q.H0;
                }
            }
        }
    }
    
    public final void c(final int n) {
        final int f0 = this.F0;
        final int[] d0 = this.D0;
        if (d0.length < n) {
            final Object[] e0 = this.E0;
            this.a(n);
            if (this.F0 > 0) {
                System.arraycopy(d0, 0, this.D0, 0, f0);
                System.arraycopy(e0, 0, this.E0, 0, f0 << 1);
            }
            d(d0, e0, f0);
        }
        if (this.F0 == f0) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public final void clear() {
        final int f0 = this.F0;
        if (f0 > 0) {
            final int[] d0 = this.D0;
            final Object[] e0 = this.E0;
            this.D0 = eli.E0;
            this.E0 = eli.G0;
            this.F0 = 0;
            d(d0, e0, f0);
        }
        if (this.F0 <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public final boolean containsKey(final Object o) {
        return this.f(o) >= 0;
    }
    
    public final boolean containsValue(final Object o) {
        return this.h(o) >= 0;
    }
    
    public final int e(final Object o, final int n) {
        final int f0 = this.F0;
        if (f0 == 0) {
            return -1;
        }
        final int[] d0 = this.D0;
        try {
            final int f2 = eli.f(d0, f0, n);
            if (f2 < 0) {
                return f2;
            }
            if (o.equals(this.E0[f2 << 1])) {
                return f2;
            }
            int n2;
            for (n2 = f2 + 1; n2 < f0 && this.D0[n2] == n; ++n2) {
                if (o.equals(this.E0[n2 << 1])) {
                    return n2;
                }
            }
            for (int n3 = f2 - 1; n3 >= 0 && this.D0[n3] == n; --n3) {
                if (o.equals(this.E0[n3 << 1])) {
                    return n3;
                }
            }
            return ~n2;
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw new ConcurrentModificationException();
        }
    }
    
    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        try {
            if (o instanceof d8q) {
                final d8q d8q = (d8q)o;
                if (this.F0 != d8q.F0) {
                    return false;
                }
                for (int i = 0; i < this.F0; ++i) {
                    final K j = this.i(i);
                    o = this.m(i);
                    final Object orDefault = d8q.getOrDefault(j, null);
                    if (o == null) {
                        if (orDefault != null || !d8q.containsKey(j)) {
                            return false;
                        }
                    }
                    else if (!o.equals(orDefault)) {
                        return false;
                    }
                }
                return true;
            }
            else {
                if (!(o instanceof Map)) {
                    return false;
                }
                final Map map = (Map)o;
                if (this.F0 != map.size()) {
                    return false;
                }
                for (int k = 0; k < this.F0; ++k) {
                    final K l = this.i(k);
                    final V m = this.m(k);
                    o = map.get(l);
                    if (m == null) {
                        if (o != null || !map.containsKey(l)) {
                            return false;
                        }
                    }
                    else if (!m.equals(o)) {
                        return false;
                    }
                }
                return true;
            }
        }
        catch (final NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    public final int f(final Object o) {
        int n;
        if (o == null) {
            n = this.g();
        }
        else {
            n = this.e(o, o.hashCode());
        }
        return n;
    }
    
    public final int g() {
        final int f0 = this.F0;
        if (f0 == 0) {
            return -1;
        }
        final int[] d0 = this.D0;
        try {
            final int f2 = eli.f(d0, f0, 0);
            if (f2 < 0) {
                return f2;
            }
            if (this.E0[f2 << 1] == null) {
                return f2;
            }
            int n;
            for (n = f2 + 1; n < f0 && this.D0[n] == 0; ++n) {
                if (this.E0[n << 1] == null) {
                    return n;
                }
            }
            for (int n2 = f2 - 1; n2 >= 0 && this.D0[n2] == 0; --n2) {
                if (this.E0[n2 << 1] == null) {
                    return n2;
                }
            }
            return ~n;
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw new ConcurrentModificationException();
        }
    }
    
    public final V get(final Object o) {
        return this.getOrDefault(o, null);
    }
    
    public final V getOrDefault(final Object o, V v) {
        final int f = this.f(o);
        if (f >= 0) {
            v = (V)this.E0[(f << 1) + 1];
        }
        return v;
    }
    
    final int h(final Object o) {
        final int n = this.F0 * 2;
        final Object[] e0 = this.E0;
        if (o == null) {
            for (int i = 1; i < n; i += 2) {
                if (e0[i] == null) {
                    return i >> 1;
                }
            }
        }
        else {
            for (int j = 1; j < n; j += 2) {
                if (o.equals(e0[j])) {
                    return j >> 1;
                }
            }
        }
        return -1;
    }
    
    @Override
    public final int hashCode() {
        final int[] d0 = this.D0;
        final Object[] e0 = this.E0;
        final int f0 = this.F0;
        int n = 1;
        int i = 0;
        int n2 = 0;
        while (i < f0) {
            final Object o = e0[n];
            final int n3 = d0[i];
            int hashCode;
            if (o == null) {
                hashCode = 0;
            }
            else {
                hashCode = o.hashCode();
            }
            n2 += (hashCode ^ n3);
            ++i;
            n += 2;
        }
        return n2;
    }
    
    public final K i(final int n) {
        return (K)this.E0[n << 1];
    }
    
    public final boolean isEmpty() {
        return this.F0 <= 0;
    }
    
    public final V j(int n) {
        final Object[] e0 = this.E0;
        final int n2 = n << 1;
        final Object o = e0[n2 + 1];
        final int f0 = this.F0;
        if (f0 <= 1) {
            this.clear();
        }
        else {
            final int f2 = f0 - 1;
            final int[] d0 = this.D0;
            final int length = d0.length;
            int n3 = 8;
            if (length > 8 && f0 < d0.length / 3) {
                if (f0 > 8) {
                    n3 = f0 + (f0 >> 1);
                }
                this.a(n3);
                if (f0 != this.F0) {
                    throw new ConcurrentModificationException();
                }
                if (n > 0) {
                    System.arraycopy(d0, 0, this.D0, 0, n);
                    System.arraycopy(e0, 0, this.E0, 0, n2);
                }
                if (n < f2) {
                    final int n4 = n + 1;
                    final int[] d2 = this.D0;
                    final int n5 = f2 - n;
                    System.arraycopy(d0, n4, d2, n, n5);
                    System.arraycopy(e0, n4 << 1, this.E0, n2, n5 << 1);
                }
            }
            else {
                if (n < f2) {
                    final int n6 = n + 1;
                    final int n7 = f2 - n;
                    System.arraycopy(d0, n6, d0, n, n7);
                    final Object[] e2 = this.E0;
                    System.arraycopy(e2, n6 << 1, e2, n2, n7 << 1);
                }
                final Object[] e3 = this.E0;
                n = f2 << 1;
                e3[n + 1] = (e3[n] = null);
            }
            if (f0 != this.F0) {
                throw new ConcurrentModificationException();
            }
            this.F0 = f2;
        }
        return (V)o;
    }
    
    public final V l(int n, final V v) {
        n = (n << 1) + 1;
        final Object[] e0 = this.E0;
        final Object o = e0[n];
        e0[n] = v;
        return (V)o;
    }
    
    public final V m(final int n) {
        return (V)this.E0[(n << 1) + 1];
    }
    
    public final V put(final K k, final V v) {
        final int f0 = this.F0;
        int n;
        int hashCode;
        if (k == null) {
            n = this.g();
            hashCode = 0;
        }
        else {
            hashCode = k.hashCode();
            n = this.e(k, hashCode);
        }
        if (n >= 0) {
            final int n2 = (n << 1) + 1;
            final Object[] e0 = this.E0;
            final Object o = e0[n2];
            e0[n2] = v;
            return (V)o;
        }
        final int n3 = ~n;
        final int[] d0 = this.D0;
        if (f0 >= d0.length) {
            int n4 = 4;
            if (f0 >= 8) {
                n4 = (f0 >> 1) + f0;
            }
            else if (f0 >= 4) {
                n4 = 8;
            }
            final Object[] e2 = this.E0;
            this.a(n4);
            if (f0 != this.F0) {
                throw new ConcurrentModificationException();
            }
            final int[] d2 = this.D0;
            if (d2.length > 0) {
                System.arraycopy(d0, 0, d2, 0, d0.length);
                System.arraycopy(e2, 0, this.E0, 0, e2.length);
            }
            d(d0, e2, f0);
        }
        if (n3 < f0) {
            final int[] d3 = this.D0;
            final int n5 = n3 + 1;
            System.arraycopy(d3, n3, d3, n5, f0 - n3);
            final Object[] e3 = this.E0;
            System.arraycopy(e3, n3 << 1, e3, n5 << 1, this.F0 - n3 << 1);
        }
        final int f2 = this.F0;
        if (f0 == f2) {
            final int[] d4 = this.D0;
            if (n3 < d4.length) {
                d4[n3] = hashCode;
                final Object[] e4 = this.E0;
                final int n6 = n3 << 1;
                e4[n6] = k;
                e4[n6 + 1] = v;
                this.F0 = f2 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }
    
    public final V putIfAbsent(final K k, final V v) {
        Object o;
        if ((o = this.getOrDefault(k, null)) == null) {
            o = this.put(k, v);
        }
        return (V)o;
    }
    
    public final V remove(final Object o) {
        final int f = this.f(o);
        if (f >= 0) {
            return this.j(f);
        }
        return null;
    }
    
    public final boolean remove(Object m, final Object o) {
        final int f = this.f(m);
        if (f >= 0) {
            m = this.m(f);
            if (o == m || (o != null && o.equals(m))) {
                this.j(f);
                return true;
            }
        }
        return false;
    }
    
    public final V replace(final K k, final V v) {
        final int f = this.f(k);
        if (f >= 0) {
            return this.l(f, v);
        }
        return null;
    }
    
    public final boolean replace(final K k, final V v, final V v2) {
        final int f = this.f(k);
        if (f >= 0) {
            final V m = this.m(f);
            if (m == v || (v != null && v.equals(m))) {
                this.l(f, v2);
                return true;
            }
        }
        return false;
    }
    
    public final int size() {
        return this.F0;
    }
    
    @Override
    public final String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.F0 * 28);
        sb.append('{');
        for (int i = 0; i < this.F0; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final K j = this.i(i);
            if (j != this) {
                sb.append(j);
            }
            else {
                sb.append("(this Map)");
            }
            sb.append('=');
            final V m = this.m(i);
            if (m != this) {
                sb.append(m);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
