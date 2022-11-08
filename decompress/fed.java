import j$.util.function.BiConsumer$VivifiedWrapper;
import j$.util.function.BiConsumer;
import j$.util.function.Function$VivifiedWrapper;
import j$.util.function.Function;
import j$.util.function.BiFunction$VivifiedWrapper;
import j$.util.Map$_CC;
import j$.util.function.BiFunction;
import java.util.Iterator;
import java.util.Set;
import java.util.Arrays;
import java.util.Collection;
import java.util.SortedMap;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fed<K, V> implements Map<K, V>, Serializable, j$.util.Map
{
    @RetainedWith
    public transient led<Entry<K, V>> C0;
    @RetainedWith
    public transient led<K> D0;
    @RetainedWith
    public transient tdd<V> E0;
    
    public static <K, V> a<K, V> a(final int n) {
        wvz.i(n, "expectedSize");
        return new a<K, V>(n);
    }
    
    public static <K, V> fed<K, V> c(final Map<? extends K, ? extends V> map) {
        if (map instanceof fed && !(map instanceof SortedMap)) {
            final fed fed = (fed)map;
            fed.h();
            return fed;
        }
        final Set entrySet = map.entrySet();
        final boolean b = entrySet instanceof Collection;
        int size;
        if (b) {
            size = entrySet.size();
        }
        else {
            size = 4;
        }
        final int n = size * 2;
        final Object[] array = new Object[n];
        int n2 = 0;
        Object[] copy = array;
        if (b) {
            final int n3 = (entrySet.size() + 0) * 2;
            copy = array;
            if (n3 > n) {
                copy = Arrays.copyOf(array, tdd.b.b(n, n3));
            }
        }
        for (final Entry<Object, V> entry : entrySet) {
            final Object key = entry.getKey();
            final V value = entry.getValue();
            final int n4 = n2 + 1;
            final int n5 = n4 * 2;
            Object[] copy2 = copy;
            if (n5 > copy.length) {
                copy2 = Arrays.copyOf(copy, tdd.b.b(copy.length, n5));
            }
            wvz.h(key, (Object)value);
            final int n6 = n2 * 2;
            copy2[n6] = key;
            copy2[n6 + 1] = value;
            n2 = n4;
            copy = copy2;
        }
        return (fed<K, V>)mam.p(n2, copy);
    }
    
    public static <K, V> fed<K, V> i(final K k, final V v) {
        wvz.h((Object)k, (Object)v);
        return (fed<K, V>)mam.p(1, new Object[] { k, v });
    }
    
    public static <K, V> fed<K, V> j(final K k, final V v, final K i, final V v2) {
        wvz.h((Object)k, (Object)v);
        wvz.h((Object)i, (Object)v2);
        return (fed<K, V>)mam.p(2, new Object[] { k, v, i, v2 });
    }
    
    public static <K, V> fed<K, V> l(final K k, final V v, final K i, final V v2, final K j, final V v3) {
        wvz.h((Object)k, (Object)v);
        wvz.h((Object)i, (Object)v2);
        wvz.h((Object)j, (Object)v3);
        return (fed<K, V>)mam.p(3, new Object[] { k, v, i, v2, j, v3 });
    }
    
    public static <K, V> fed<K, V> m(final K k, final V v, final K i, final V v2, final K j, final V v3, final K l, final V v4) {
        wvz.h((Object)k, (Object)v);
        wvz.h((Object)i, (Object)v2);
        wvz.h((Object)j, (Object)v3);
        wvz.h((Object)l, (Object)v4);
        return (fed<K, V>)mam.p(4, new Object[] { k, v, i, v2, j, v3, l, v4 });
    }
    
    public static <K, V> fed<K, V> o(final K k, final V v, final K i, final V v2, final K j, final V v3, final K l, final V v4, final K m, final V v5) {
        wvz.h((Object)k, (Object)v);
        wvz.h((Object)i, (Object)v2);
        wvz.h((Object)j, (Object)v3);
        wvz.h((Object)l, (Object)v4);
        wvz.h((Object)m, (Object)v5);
        return (fed<K, V>)mam.p(5, new Object[] { k, v, i, v2, j, v3, l, v4, m, v5 });
    }
    
    @Deprecated
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.get(o) != null;
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        tdd<V> e0;
        if ((e0 = this.E0) == null) {
            e0 = this.f();
            this.E0 = e0;
        }
        return e0.contains(o);
    }
    
    public abstract led<Entry<K, V>> d();
    
    public abstract led<K> e();
    
    @Override
    public final boolean equals(final Object o) {
        return tkg.a(this, o);
    }
    
    public abstract tdd<V> f();
    
    public final led<Entry<K, V>> g() {
        led<Entry<K, V>> c0;
        if ((c0 = this.C0) == null) {
            c0 = this.d();
            this.C0 = c0;
        }
        return c0;
    }
    
    @Override
    public abstract V get(final Object p0);
    
    @Override
    public final V getOrDefault(Object value, final V v) {
        value = this.get(value);
        if (value != null) {
            return (V)value;
        }
        return v;
    }
    
    public abstract void h();
    
    @Override
    public final int hashCode() {
        return xmp.c(this.g());
    }
    
    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }
    
    @Override
    public final Set keySet() {
        led<K> d0;
        if ((d0 = this.D0) == null) {
            d0 = this.e();
            this.D0 = d0;
        }
        return d0;
    }
    
    @Deprecated
    @Override
    public final V put(final K k, final V v) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final void putAll(final Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final V remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final String toString() {
        final int size = this.size();
        wvz.i(size, "size");
        final StringBuilder sb = new StringBuilder((int)Math.min(size * 8L, 1073741824L));
        sb.append('{');
        int n = 1;
        for (final Entry<Object, V> entry : this.entrySet()) {
            if (n == 0) {
                sb.append(", ");
            }
            n = 0;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public final Collection values() {
        tdd<V> e0;
        if ((e0 = this.E0) == null) {
            e0 = this.f();
            this.E0 = e0;
        }
        return e0;
    }
    
    public static final class a<K, V>
    {
        public Object[] a;
        public int b;
        
        public a(final int n) {
            this.a = new Object[n * 2];
            this.b = 0;
        }
        
        public final fed<K, V> a() {
            return this.b();
        }
        
        public final fed<K, V> b() {
            return (fed<K, V>)mam.p(this.b, this.a);
        }
        
        public final void c(int n) {
            n *= 2;
            final Object[] a = this.a;
            if (n > a.length) {
                this.a = Arrays.copyOf(a, tdd.b.b(a.length, n));
            }
        }
        
        public final a<K, V> d(final K k, final V v) {
            this.c(this.b + 1);
            wvz.h((Object)k, (Object)v);
            final Object[] a = this.a;
            final int b = this.b;
            a[b * 2] = k;
            a[b * 2 + 1] = v;
            this.b = b + 1;
            return this;
        }
    }
}
