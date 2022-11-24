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

public abstract class jed<K, V> implements Map<K, V>, Serializable, j$.util.Map
{
    @RetainedWith
    public transient ped<Entry<K, V>> F0;
    @RetainedWith
    public transient ped<K> G0;
    @RetainedWith
    public transient xdd<V> H0;
    
    public static <K, V> a<K, V> a(final int n) {
        iuk.y(n, "expectedSize");
        return new a<K, V>(n);
    }
    
    public static <K, V> jed<K, V> c(final Map<? extends K, ? extends V> map) {
        if (map instanceof jed && !(map instanceof SortedMap)) {
            final jed jed = (jed)map;
            jed.h();
            return jed;
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
                copy = Arrays.copyOf(array, xdd$b.b(n, n3));
            }
        }
        for (final Entry<Object, V> entry : entrySet) {
            final Object key = entry.getKey();
            final V value = entry.getValue();
            final int n4 = n2 + 1;
            final int n5 = n4 * 2;
            Object[] copy2 = copy;
            if (n5 > copy.length) {
                copy2 = Arrays.copyOf(copy, xdd$b.b(copy.length, n5));
            }
            iuk.u(key, (Object)value);
            final int n6 = n2 * 2;
            copy2[n6] = key;
            copy2[n6 + 1] = value;
            n2 = n4;
            copy = copy2;
        }
        return (jed<K, V>)obm.p(n2, copy);
    }
    
    public static <K, V> jed<K, V> i(final K k, final V v) {
        iuk.u((Object)k, (Object)v);
        return (jed<K, V>)obm.p(1, new Object[] { k, v });
    }
    
    public static <K, V> jed<K, V> j(final K k, final V v, final K i, final V v2) {
        iuk.u((Object)k, (Object)v);
        iuk.u((Object)i, (Object)v2);
        return (jed<K, V>)obm.p(2, new Object[] { k, v, i, v2 });
    }
    
    public static <K, V> jed<K, V> k(final K k, final V v, final K i, final V v2, final K j, final V v3) {
        iuk.u((Object)k, (Object)v);
        iuk.u((Object)i, (Object)v2);
        iuk.u((Object)j, (Object)v3);
        return (jed<K, V>)obm.p(3, new Object[] { k, v, i, v2, j, v3 });
    }
    
    public static <K, V> jed<K, V> n(final K k, final V v, final K i, final V v2, final K j, final V v3, final K l, final V v4) {
        iuk.u((Object)k, (Object)v);
        iuk.u((Object)i, (Object)v2);
        iuk.u((Object)j, (Object)v3);
        iuk.u((Object)l, (Object)v4);
        return (jed<K, V>)obm.p(4, new Object[] { k, v, i, v2, j, v3, l, v4 });
    }
    
    public static <K, V> jed<K, V> o(final K k, final V v, final K i, final V v2, final K j, final V v3, final K l, final V v4, final K m, final V v5) {
        iuk.u((Object)k, (Object)v);
        iuk.u((Object)i, (Object)v2);
        iuk.u((Object)j, (Object)v3);
        iuk.u((Object)l, (Object)v4);
        iuk.u((Object)m, (Object)v5);
        return (jed<K, V>)obm.p(5, new Object[] { k, v, i, v2, j, v3, l, v4, m, v5 });
    }
    
    @Deprecated
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    public final Object compute(final Object o, final BiFunction biFunction) {
        return Map$_CC.$default$compute((Map)this, o, biFunction);
    }
    
    @Override
    public final Object compute(final Object o, final java.util.function.BiFunction biFunction) {
        return Map$_CC.$default$compute((Map)this, o, BiFunction$VivifiedWrapper.convert(biFunction));
    }
    
    public final Object computeIfAbsent(final Object o, final Function function) {
        return Map$_CC.$default$computeIfAbsent((Map)this, o, function);
    }
    
    @Override
    public final Object computeIfAbsent(final Object o, final java.util.function.Function function) {
        return Map$_CC.$default$computeIfAbsent((Map)this, o, Function$VivifiedWrapper.convert(function));
    }
    
    public final Object computeIfPresent(final Object o, final BiFunction biFunction) {
        return Map$_CC.$default$computeIfPresent((Map)this, o, biFunction);
    }
    
    @Override
    public final Object computeIfPresent(final Object o, final java.util.function.BiFunction biFunction) {
        return Map$_CC.$default$computeIfPresent((Map)this, o, BiFunction$VivifiedWrapper.convert(biFunction));
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.get(o) != null;
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        xdd<V> h0;
        if ((h0 = this.H0) == null) {
            h0 = this.f();
            this.H0 = h0;
        }
        return h0.contains(o);
    }
    
    public abstract ped<Entry<K, V>> d();
    
    public abstract ped<K> e();
    
    @Override
    public final /* bridge */ Set entrySet() {
        return (Set)this.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return klg.a((Map)this, o);
    }
    
    public abstract xdd<V> f();
    
    public final void forEach(final BiConsumer biConsumer) {
        Map$_CC.$default$forEach((Map)this, biConsumer);
    }
    
    @Override
    public final void forEach(final java.util.function.BiConsumer biConsumer) {
        Map$_CC.$default$forEach((Map)this, BiConsumer$VivifiedWrapper.convert(biConsumer));
    }
    
    public final ped<Entry<K, V>> g() {
        ped<Entry<K, V>> f0;
        if ((f0 = this.F0) == null) {
            f0 = this.d();
            this.F0 = f0;
        }
        return f0;
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
        return kop.c((Set)this.g());
    }
    
    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }
    
    @Override
    public final Set keySet() {
        ped<K> g0;
        if ((g0 = this.G0) == null) {
            g0 = this.e();
            this.G0 = g0;
        }
        return (Set)g0;
    }
    
    public final Object merge(final Object o, final Object o2, final BiFunction biFunction) {
        return Map$_CC.$default$merge((Map)this, o, o2, biFunction);
    }
    
    @Override
    public final Object merge(final Object o, final Object o2, final java.util.function.BiFunction biFunction) {
        return Map$_CC.$default$merge((Map)this, o, o2, BiFunction$VivifiedWrapper.convert(biFunction));
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
    
    @Override
    public final Object putIfAbsent(final Object o, final Object o2) {
        return Map$_CC.$default$putIfAbsent((Map)this, o, o2);
    }
    
    @Deprecated
    @Override
    public final V remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean remove(final Object o, final Object o2) {
        return Map$_CC.$default$remove((Map)this, o, o2);
    }
    
    @Override
    public final Object replace(final Object o, final Object o2) {
        return Map$_CC.$default$replace((Map)this, o, o2);
    }
    
    @Override
    public final boolean replace(final Object o, final Object o2, final Object o3) {
        return Map$_CC.$default$replace((Map)this, o, o2, o3);
    }
    
    public final void replaceAll(final BiFunction biFunction) {
        Map$_CC.$default$replaceAll((Map)this, biFunction);
    }
    
    @Override
    public final void replaceAll(final java.util.function.BiFunction biFunction) {
        Map$_CC.$default$replaceAll((Map)this, BiFunction$VivifiedWrapper.convert(biFunction));
    }
    
    @Override
    public final String toString() {
        final int size = this.size();
        iuk.y(size, "size");
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
        xdd<V> h0;
        if ((h0 = this.H0) == null) {
            h0 = this.f();
            this.H0 = h0;
        }
        return (Collection)h0;
    }
    
    public static final class a<K, V>
    {
        public Object[] a;
        public int b;
        
        public a(final int n) {
            this.a = new Object[n * 2];
            this.b = 0;
        }
        
        public final jed<K, V> a() {
            return this.b();
        }
        
        public final jed<K, V> b() {
            return (jed<K, V>)obm.p(this.b, this.a);
        }
        
        public final void c(int n) {
            n *= 2;
            final Object[] a = this.a;
            if (n > a.length) {
                this.a = Arrays.copyOf(a, xdd$b.b(a.length, n));
            }
        }
        
        public final a<K, V> d(final K k, final V v) {
            this.c(this.b + 1);
            iuk.u((Object)k, (Object)v);
            final Object[] a = this.a;
            final int b = this.b;
            a[b * 2] = k;
            a[b * 2 + 1] = v;
            this.b = b + 1;
            return this;
        }
    }
}
