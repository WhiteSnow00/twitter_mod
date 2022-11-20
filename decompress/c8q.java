import java.util.Map;
import java.util.ConcurrentModificationException;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c8q<K, V>
{
    public int[] a;
    public Object[] b;
    public int c;
    
    public c8q() {
        this(0, 1, null);
    }
    
    public c8q(final int n, final int n2, final rf8 rf8) {
        this.a = fli.G0;
        this.b = fli.H0;
        this.c = 0;
    }
    
    public final V a(final K k) {
        int n;
        if (k == null) {
            n = this.c();
        }
        else {
            n = this.b(k, k.hashCode());
        }
        Object o;
        if (n >= 0) {
            o = this.b[(n << 1) + 1];
        }
        else {
            o = null;
        }
        return (V)o;
    }
    
    public final int b(final Object o, final int n) {
        czd.f(o, "key");
        final int c = this.c;
        if (c == 0) {
            return -1;
        }
        final int l = fli.l(this.a, c, n);
        if (l < 0) {
            return l;
        }
        if (czd.a(o, this.b[l << 1])) {
            return l;
        }
        int n2;
        for (n2 = l + 1; n2 < c && this.a[n2] == n; ++n2) {
            if (czd.a(o, this.b[n2 << 1])) {
                return n2;
            }
        }
        for (int n3 = l - 1; n3 >= 0 && this.a[n3] == n; --n3) {
            if (czd.a(o, this.b[n3 << 1])) {
                return n3;
            }
        }
        return ~n2;
    }
    
    public final int c() {
        final int c = this.c;
        if (c == 0) {
            return -1;
        }
        int l = fli.l(this.a, c, 0);
        if (l < 0) {
            return l;
        }
        if (this.b[l << 1] == null) {
            return l;
        }
        int n;
        for (n = l + 1; n < c && this.a[n] == 0; ++n) {
            if (this.b[n << 1] == null) {
                return n;
            }
        }
        --l;
        while (l >= 0 && this.a[l] == 0) {
            if (this.b[l << 1] == null) {
                return l;
            }
            --l;
        }
        return ~n;
    }
    
    public final K d(final int n) {
        return (K)this.b[n << 1];
    }
    
    public final V e(final K k, final V v) {
        final int c = this.c;
        int hashCode;
        int n;
        if (k == null) {
            hashCode = 0;
            n = this.c();
        }
        else {
            hashCode = k.hashCode();
            n = this.b(k, hashCode);
        }
        if (n >= 0) {
            final int n2 = (n << 1) + 1;
            final Object[] b = this.b;
            final Object o = b[n2];
            b[n2] = v;
            return (V)o;
        }
        final int n3 = ~n;
        final int[] a = this.a;
        if (c >= a.length) {
            int n4 = 4;
            if (c >= 8) {
                n4 = (c >> 1) + c;
            }
            else if (c >= 4) {
                n4 = 8;
            }
            final int[] copy = Arrays.copyOf(a, n4);
            czd.e((Object)copy, "copyOf(this, newSize)");
            this.a = copy;
            final Object[] copy2 = Arrays.copyOf(this.b, n4 << 1);
            czd.e((Object)copy2, "copyOf(this, newSize)");
            this.b = copy2;
            if (c != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (n3 < c) {
            final int[] a2 = this.a;
            final int n5 = n3 + 1;
            bt0.x0(a2, a2, n5, n3, c);
            final Object[] b2 = this.b;
            bt0.y0(b2, b2, n5 << 1, n3 << 1, this.c << 1);
        }
        final int c2 = this.c;
        if (c == c2) {
            final int[] a3 = this.a;
            if (n3 < a3.length) {
                a3[n3] = hashCode;
                final Object[] b3 = this.b;
                final int n6 = n3 << 1;
                b3[n6] = k;
                b3[n6 + 1] = v;
                this.c = c2 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final boolean equals(Object d) {
        if (this == d) {
            return true;
        }
        try {
            if (d instanceof c8q) {
                final c8q c8q = (c8q)d;
                final int c = this.c;
                if (c != c8q.c) {
                    return false;
                }
                for (int i = 0; i < c; ++i) {
                    d = this.d(i);
                    final V f = this.f(i);
                    final V a = c8q.a(d);
                    if (f == null) {
                        if (a == null) {
                            int n;
                            if (d == null) {
                                n = c8q.c();
                            }
                            else {
                                n = c8q.b(d, d.hashCode());
                            }
                            if (n >= 0) {
                                continue;
                            }
                        }
                        return false;
                    }
                    if (!czd.a((Object)f, (Object)a)) {
                        return false;
                    }
                }
                return true;
            }
            else {
                if (!(d instanceof Map)) {
                    return false;
                }
                if (this.c != ((Map)d).size()) {
                    return false;
                }
                for (int c2 = this.c, j = 0; j < c2; ++j) {
                    final K d2 = this.d(j);
                    final V f2 = this.f(j);
                    final Object value = ((Map)d).get(d2);
                    if (f2 == null) {
                        if (value != null || !((Map)d).containsKey(d2)) {
                            return false;
                        }
                    }
                    else if (!czd.a((Object)f2, value)) {
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
    
    public final V f(final int n) {
        return (V)this.b[(n << 1) + 1];
    }
    
    @Override
    public final int hashCode() {
        final int[] a = this.a;
        final Object[] b = this.b;
        final int c = this.c;
        int n = 1;
        int i = 0;
        int n2 = 0;
        while (i < c) {
            final Object o = b[n];
            final int n3 = a[i];
            int hashCode;
            if (o != null) {
                hashCode = o.hashCode();
            }
            else {
                hashCode = 0;
            }
            n2 += (hashCode ^ n3);
            ++i;
            n += 2;
        }
        return n2;
    }
    
    @Override
    public final String toString() {
        final int c = this.c;
        final int n = 0;
        if (c <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(c * 28);
        sb.append('{');
        for (int c2 = this.c, i = n; i < c2; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final K d = this.d(i);
            if (d != this) {
                sb.append(d);
            }
            else {
                sb.append("(this Map)");
            }
            sb.append('=');
            final V f = this.f(i);
            if (f != this) {
                sb.append(f);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        final String string = sb.toString();
        czd.e((Object)string, "buffer.toString()");
        return string;
    }
}
