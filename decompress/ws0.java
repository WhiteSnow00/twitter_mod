import java.util.Iterator;
import java.lang.reflect.Array;
import java.util.Collection;
import j$.util.function.BiConsumer$VivifiedWrapper;
import j$.util.function.BiConsumer;
import java.util.Set;
import j$.util.function.Function$VivifiedWrapper;
import j$.util.function.Function;
import j$.util.function.BiFunction$VivifiedWrapper;
import j$.util.Map$_CC;
import j$.util.function.BiFunction;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ws0<K, V> extends z8q<K, V> implements Map<K, V>, j$.util.Map
{
    public ws0.ws0$a M0;
    public ws0.ws0$c N0;
    public ws0.ws0$e O0;
    
    public ws0() {
    }
    
    public ws0(final int n) {
        super(n);
    }
    
    public ws0(final z8q z8q) {
        if (z8q != null) {
            final int h0 = z8q.H0;
            this.c(super.H0 + h0);
            final int h2 = super.H0;
            int i = 0;
            if (h2 == 0) {
                if (h0 > 0) {
                    System.arraycopy(z8q.F0, 0, super.F0, 0, h0);
                    System.arraycopy(z8q.G0, 0, super.G0, 0, h0 << 1);
                    super.H0 = h0;
                }
            }
            else {
                while (i < h0) {
                    this.put(z8q.i(i), z8q.n(i));
                    ++i;
                }
            }
        }
    }
    
    public final Object compute(final Object o, final BiFunction biFunction) {
        return Map$_CC.$default$compute((Map)this, o, biFunction);
    }
    
    public final Object compute(final Object o, final java.util.function.BiFunction biFunction) {
        return Map$_CC.$default$compute((Map)this, o, BiFunction$VivifiedWrapper.convert(biFunction));
    }
    
    public final Object computeIfAbsent(final Object o, final Function function) {
        return Map$_CC.$default$computeIfAbsent((Map)this, o, function);
    }
    
    public final Object computeIfAbsent(final Object o, final java.util.function.Function function) {
        return Map$_CC.$default$computeIfAbsent((Map)this, o, Function$VivifiedWrapper.convert(function));
    }
    
    public final Object computeIfPresent(final Object o, final BiFunction biFunction) {
        return Map$_CC.$default$computeIfPresent((Map)this, o, biFunction);
    }
    
    public final Object computeIfPresent(final Object o, final java.util.function.BiFunction biFunction) {
        return Map$_CC.$default$computeIfPresent((Map)this, o, BiFunction$VivifiedWrapper.convert(biFunction));
    }
    
    public final Set<Entry<K, V>> entrySet() {
        ws0.ws0$a m0;
        if ((m0 = this.M0) == null) {
            m0 = new ws0.ws0$a(this);
            this.M0 = m0;
        }
        return (Set<Entry<K, V>>)m0;
    }
    
    public final void forEach(final BiConsumer biConsumer) {
        Map$_CC.$default$forEach((Map)this, biConsumer);
    }
    
    public final void forEach(final java.util.function.BiConsumer biConsumer) {
        Map$_CC.$default$forEach((Map)this, BiConsumer$VivifiedWrapper.convert(biConsumer));
    }
    
    public final Set<K> keySet() {
        ws0.ws0$c n0;
        if ((n0 = this.N0) == null) {
            n0 = new ws0.ws0$c(this);
            this.N0 = n0;
        }
        return (Set<K>)n0;
    }
    
    public final Object merge(final Object o, final Object o2, final BiFunction biFunction) {
        return Map$_CC.$default$merge((Map)this, o, o2, biFunction);
    }
    
    public final Object merge(final Object o, final Object o2, final java.util.function.BiFunction biFunction) {
        return Map$_CC.$default$merge((Map)this, o, o2, BiFunction$VivifiedWrapper.convert(biFunction));
    }
    
    public final boolean o(final Collection<?> collection) {
        final int h0 = super.H0;
        for (int i = h0 - 1; i >= 0; --i) {
            if (!collection.contains(this.i(i))) {
                this.j(i);
            }
        }
        return h0 != super.H0;
    }
    
    public final <T> T[] p(final T[] array, final int n) {
        final int h0 = super.H0;
        Object[] array2 = array;
        if (array.length < h0) {
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), h0);
        }
        for (int i = 0; i < h0; ++i) {
            array2[i] = super.G0[(i << 1) + n];
        }
        if (array2.length > h0) {
            array2[h0] = null;
        }
        return (T[])array2;
    }
    
    public final void putAll(final Map<? extends K, ? extends V> map) {
        this.c(map.size() + super.H0);
        for (final Entry<Object, V> entry : map.entrySet()) {
            this.put(entry.getKey(), (Object)entry.getValue());
        }
    }
    
    public final void replaceAll(final BiFunction biFunction) {
        Map$_CC.$default$replaceAll((Map)this, biFunction);
    }
    
    public final void replaceAll(final java.util.function.BiFunction biFunction) {
        Map$_CC.$default$replaceAll((Map)this, BiFunction$VivifiedWrapper.convert(biFunction));
    }
    
    public final Collection<V> values() {
        ws0.ws0$e o0;
        if ((o0 = this.O0) == null) {
            o0 = new ws0.ws0$e(this);
            this.O0 = o0;
        }
        return (Collection<V>)o0;
    }
    
    public final class b extends zkd<K>
    {
        public final ws0 I0;
        
        public b(final ws0 i0) {
            this.I0 = i0;
            super(i0.H0);
        }
        
        @Override
        public final K a(final int n) {
            return (K)this.I0.i(n);
        }
        
        @Override
        public final void b(final int n) {
            this.I0.j(n);
        }
    }
    
    public final class f extends zkd<V>
    {
        public final ws0 I0;
        
        public f(final ws0 i0) {
            this.I0 = i0;
            super(i0.H0);
        }
        
        @Override
        public final V a(final int n) {
            return (V)this.I0.n(n);
        }
        
        @Override
        public final void b(final int n) {
            this.I0.j(n);
        }
    }
}
