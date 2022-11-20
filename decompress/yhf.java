import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.AbstractSet;
import java.util.Objects;
import java.util.Set;
import java.util.Map;
import java.util.Comparator;
import java.io.Serializable;
import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yhf<K, V> extends AbstractMap<K, V> implements Serializable
{
    public static final Comparator<Comparable> K0;
    public Comparator<? super K> D0;
    public e<K, V> E0;
    public int F0;
    public int G0;
    public final e<K, V> H0;
    public b I0;
    public c J0;
    
    static {
        yhf.K0 = new Comparator<Comparable>() {
            @Override
            public final int compare(final Object o, final Object o2) {
                return ((Comparable)o).compareTo(o2);
            }
        };
    }
    
    public yhf() {
        final Comparator<Comparable> k0 = yhf.K0;
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = new e<K, V>();
        this.D0 = (Comparator<? super K>)k0;
    }
    
    public final e<K, V> a(final K k, final boolean b) {
        final Comparator<? super K> d0 = this.D0;
        e<K, V> e0 = this.E0;
        int n;
        if (e0 != null) {
            Comparable comparable;
            if (d0 == yhf.K0) {
                comparable = (Comparable)k;
            }
            else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    n = comparable.compareTo(e0.I0);
                }
                else {
                    n = d0.compare(k, e0.I0);
                }
                if (n == 0) {
                    return e0;
                }
                e<K, V> e2;
                if (n < 0) {
                    e2 = e0.E0;
                }
                else {
                    e2 = e0.F0;
                }
                if (e2 == null) {
                    break;
                }
                e0 = e2;
            }
        }
        else {
            n = 0;
        }
        if (!b) {
            return null;
        }
        final e<K, V> h0 = this.H0;
        e f0;
        if (e0 == null) {
            if (d0 == yhf.K0 && !(k instanceof Comparable)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(k.getClass().getName());
                sb.append(" is not Comparable");
                throw new ClassCastException(sb.toString());
            }
            f0 = new e<K, V>((e<Object, Object>)e0, k, (e<Object, Object>)h0, (e<Object, Object>)h0.H0);
            this.E0 = (e<K, V>)f0;
        }
        else {
            f0 = new e<K, V>(e0, k, h0, h0.H0);
            if (n < 0) {
                e0.E0 = (e<K, V>)f0;
            }
            else {
                e0.F0 = (e<K, V>)f0;
            }
            this.e(e0, true);
        }
        ++this.F0;
        ++this.G0;
        return (e<K, V>)f0;
    }
    
    public final e<K, V> c(final Entry<?, ?> entry) {
        final e<K, V> d = this.d(entry.getKey());
        int n = 0;
        if (d != null) {
            final V j0 = d.J0;
            final Object value = entry.getValue();
            final boolean b = j0 == value || (j0 != null && j0.equals(value));
            n = n;
            if (b) {
                n = 1;
            }
        }
        e<K, V> e;
        if (n != 0) {
            e = d;
        }
        else {
            e = null;
        }
        return e;
    }
    
    @Override
    public final void clear() {
        this.E0 = null;
        this.F0 = 0;
        ++this.G0;
        final e<K, V> h0 = this.H0;
        h0.H0 = h0;
        h0.G0 = h0;
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.d(o) != null;
    }
    
    public final e<K, V> d(final Object o) {
        Object a;
        final Object o2 = a = null;
        if (o == null) {
            return (e<K, V>)a;
        }
        try {
            a = this.a(o, false);
            return (e<K, V>)a;
        }
        catch (final ClassCastException ex) {
            a = o2;
            return (e<K, V>)a;
        }
    }
    
    public final void e(e<K, V> d0, final boolean b) {
        while (d0 != null) {
            final e<K, V> e0 = d0.E0;
            final e<K, V> f0 = d0.F0;
            final int n = 0;
            final int n2 = 0;
            int k0;
            if (e0 != null) {
                k0 = e0.K0;
            }
            else {
                k0 = 0;
            }
            int k2;
            if (f0 != null) {
                k2 = f0.K0;
            }
            else {
                k2 = 0;
            }
            final int n3 = k0 - k2;
            if (n3 == -2) {
                final e<K, V> e2 = f0.E0;
                final e<K, V> f2 = f0.F0;
                int k3;
                if (f2 != null) {
                    k3 = f2.K0;
                }
                else {
                    k3 = 0;
                }
                int k4 = n2;
                if (e2 != null) {
                    k4 = e2.K0;
                }
                final int n4 = k4 - k3;
                if (n4 != -1 && (n4 != 0 || b)) {
                    this.i(f0);
                    this.h(d0);
                }
                else {
                    this.h(d0);
                }
                if (b) {
                    break;
                }
            }
            else if (n3 == 2) {
                final e<K, V> e3 = e0.E0;
                final e<K, V> f3 = e0.F0;
                int k5;
                if (f3 != null) {
                    k5 = f3.K0;
                }
                else {
                    k5 = 0;
                }
                int k6 = n;
                if (e3 != null) {
                    k6 = e3.K0;
                }
                final int n5 = k6 - k5;
                if (n5 != 1 && (n5 != 0 || b)) {
                    this.h(e0);
                    this.i(d0);
                }
                else {
                    this.i(d0);
                }
                if (b) {
                    break;
                }
            }
            else if (n3 == 0) {
                d0.K0 = k0 + 1;
                if (b) {
                    break;
                }
            }
            else {
                d0.K0 = Math.max(k0, k2) + 1;
                if (!b) {
                    break;
                }
            }
            d0 = d0.D0;
        }
    }
    
    @Override
    public final Set<Entry<K, V>> entrySet() {
        b i0 = this.I0;
        if (i0 == null) {
            i0 = new b();
            this.I0 = i0;
        }
        return i0;
    }
    
    public final void f(final e<K, V> e, final boolean b) {
        if (b) {
            final e<K, V> h0 = e.H0;
            h0.G0 = e.G0;
            e.G0.H0 = h0;
        }
        final e<K, V> e2 = e.E0;
        e<K, V> f0 = e.F0;
        final e<K, V> d0 = e.D0;
        int k0 = 0;
        if (e2 != null && f0 != null) {
            e<K, V> e4;
            if (e2.K0 > f0.K0) {
                final e<K, V> f2 = e2.F0;
                e<K, V> e3 = e2;
                e<K, V> f3 = f2;
                while (true) {
                    e4 = e3;
                    e3 = f3;
                    if (e3 == null) {
                        break;
                    }
                    f3 = e3.F0;
                }
            }
            else {
                e<K, V> e5 = f0.E0;
                while (true) {
                    e4 = f0;
                    if (e5 == null) {
                        break;
                    }
                    final e<K, V> e6 = e5.E0;
                    f0 = e5;
                    e5 = e6;
                }
            }
            this.f(e4, false);
            final e<K, V> e7 = e.E0;
            int k2;
            if (e7 != null) {
                k2 = e7.K0;
                e4.E0 = e7;
                e7.D0 = e4;
                e.E0 = null;
            }
            else {
                k2 = 0;
            }
            final e<K, V> f4 = e.F0;
            if (f4 != null) {
                k0 = f4.K0;
                e4.F0 = f4;
                f4.D0 = e4;
                e.F0 = null;
            }
            e4.K0 = Math.max(k2, k0) + 1;
            this.g(e, e4);
            return;
        }
        if (e2 != null) {
            this.g(e, e2);
            e.E0 = null;
        }
        else if (f0 != null) {
            this.g(e, f0);
            e.F0 = null;
        }
        else {
            this.g(e, null);
        }
        this.e(d0, false);
        --this.F0;
        ++this.G0;
    }
    
    public final void g(final e<K, V> e, final e<K, V> e2) {
        final e<K, V> d0 = e.D0;
        e.D0 = null;
        if (e2 != null) {
            e2.D0 = d0;
        }
        if (d0 != null) {
            if (d0.E0 == e) {
                d0.E0 = e2;
            }
            else {
                d0.F0 = e2;
            }
        }
        else {
            this.E0 = e2;
        }
    }
    
    @Override
    public final V get(Object j0) {
        final e<K, V> d = this.d(j0);
        if (d != null) {
            j0 = d.J0;
        }
        else {
            j0 = null;
        }
        return (V)j0;
    }
    
    public final void h(final e<K, V> e) {
        final e<K, V> e2 = e.E0;
        final e<K, V> f0 = e.F0;
        final e<K, V> e3 = f0.E0;
        final e<K, V> f2 = f0.F0;
        e.F0 = e3;
        if (e3 != null) {
            e3.D0 = e;
        }
        this.g(e, f0);
        f0.E0 = e;
        e.D0 = f0;
        final int n = 0;
        int k0;
        if (e2 != null) {
            k0 = e2.K0;
        }
        else {
            k0 = 0;
        }
        int k2;
        if (e3 != null) {
            k2 = e3.K0;
        }
        else {
            k2 = 0;
        }
        final int k3 = Math.max(k0, k2) + 1;
        e.K0 = k3;
        int k4 = n;
        if (f2 != null) {
            k4 = f2.K0;
        }
        f0.K0 = Math.max(k3, k4) + 1;
    }
    
    public final void i(final e<K, V> e) {
        final e<K, V> e2 = e.E0;
        final e<K, V> f0 = e.F0;
        final e<K, V> e3 = e2.E0;
        final e<K, V> f2 = e2.F0;
        e.E0 = f2;
        if (f2 != null) {
            f2.D0 = e;
        }
        this.g(e, e2);
        e2.F0 = e;
        e.D0 = e2;
        final int n = 0;
        int k0;
        if (f0 != null) {
            k0 = f0.K0;
        }
        else {
            k0 = 0;
        }
        int k2;
        if (f2 != null) {
            k2 = f2.K0;
        }
        else {
            k2 = 0;
        }
        final int k3 = Math.max(k0, k2) + 1;
        e.K0 = k3;
        int k4 = n;
        if (e3 != null) {
            k4 = e3.K0;
        }
        e2.K0 = Math.max(k3, k4) + 1;
    }
    
    @Override
    public final Set<K> keySet() {
        c j0 = this.J0;
        if (j0 == null) {
            j0 = new c();
            this.J0 = j0;
        }
        return j0;
    }
    
    @Override
    public final V put(final K k, final V j0) {
        Objects.requireNonNull(k, "key == null");
        final e<K, V> a = this.a(k, true);
        final V j2 = a.J0;
        a.J0 = j0;
        return j2;
    }
    
    @Override
    public final V remove(Object j0) {
        final e<K, V> d = this.d(j0);
        if (d != null) {
            this.f(d, true);
        }
        if (d != null) {
            j0 = d.J0;
        }
        else {
            j0 = null;
        }
        return (V)j0;
    }
    
    @Override
    public final int size() {
        return this.F0;
    }
    
    public final class b extends AbstractSet<Entry<K, V>>
    {
        public final yhf D0;
        
        public b(final yhf d0) {
            this.D0 = d0;
        }
        
        @Override
        public final void clear() {
            this.D0.clear();
        }
        
        @Override
        public final boolean contains(final Object o) {
            return o instanceof Entry && this.D0.c((Entry<?, ?>)o) != null;
        }
        
        @Override
        public final Iterator<Entry<K, V>> iterator() {
            return (Iterator<Entry<K, V>>)new yhf$b$a(this);
        }
        
        @Override
        public final boolean remove(final Object o) {
            if (!(o instanceof Entry)) {
                return false;
            }
            final e<K, V> c = this.D0.c((Entry<?, ?>)o);
            if (c == null) {
                return false;
            }
            this.D0.f(c, true);
            return true;
        }
        
        @Override
        public final int size() {
            return this.D0.F0;
        }
    }
    
    public final class c extends AbstractSet<K>
    {
        public final yhf D0;
        
        public c(final yhf d0) {
            this.D0 = d0;
        }
        
        @Override
        public final void clear() {
            this.D0.clear();
        }
        
        @Override
        public final boolean contains(final Object o) {
            return this.D0.containsKey(o);
        }
        
        @Override
        public final Iterator<K> iterator() {
            return (Iterator<K>)new yhf$c$a(this);
        }
        
        @Override
        public final boolean remove(final Object o) {
            final yhf d0 = this.D0;
            final e<K, V> d2 = d0.d(o);
            boolean b = true;
            if (d2 != null) {
                d0.f(d2, true);
            }
            if (d2 == null) {
                b = false;
            }
            return b;
        }
        
        @Override
        public final int size() {
            return this.D0.F0;
        }
    }
    
    public abstract class d<T> implements Iterator<T>, j$.util.Iterator
    {
        public e<K, V> D0;
        public e<K, V> E0;
        public int F0;
        public final yhf G0;
        
        public d(final yhf g0) {
            this.G0 = g0;
            this.D0 = g0.H0.G0;
            this.E0 = null;
            this.F0 = g0.G0;
        }
        
        public final e<K, V> a() {
            final e<K, V> d0 = this.D0;
            final yhf g0 = this.G0;
            if (d0 == g0.H0) {
                throw new NoSuchElementException();
            }
            if (g0.G0 == this.F0) {
                this.D0 = d0.G0;
                return this.E0 = d0;
            }
            throw new ConcurrentModificationException();
        }
        
        public final void forEachRemaining(final Consumer consumer) {
            Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
        }
        
        @Override
        public final void forEachRemaining(final java.util.function.Consumer consumer) {
            Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
        }
        
        @Override
        public final boolean hasNext() {
            return this.D0 != this.G0.H0;
        }
        
        @Override
        public final void remove() {
            final e<K, V> e0 = this.E0;
            if (e0 != null) {
                this.G0.f(e0, true);
                this.E0 = null;
                this.F0 = this.G0.G0;
                return;
            }
            throw new IllegalStateException();
        }
    }
    
    public static final class e<K, V> implements Entry<K, V>
    {
        public e<K, V> D0;
        public e<K, V> E0;
        public e<K, V> F0;
        public e<K, V> G0;
        public e<K, V> H0;
        public final K I0;
        public V J0;
        public int K0;
        
        public e() {
            this.I0 = null;
            this.H0 = this;
            this.G0 = this;
        }
        
        public e(final e<K, V> d0, final K i0, final e<K, V> g0, final e<K, V> h0) {
            this.D0 = d0;
            this.I0 = i0;
            this.K0 = 1;
            this.G0 = g0;
            this.H0 = h0;
            h0.G0 = this;
            g0.H0 = this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            final boolean b = o instanceof Entry;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final Entry entry = (Entry)o;
                final K i0 = this.I0;
                if (i0 == null) {
                    b3 = b2;
                    if (entry.getKey() != null) {
                        return b3;
                    }
                }
                else {
                    b3 = b2;
                    if (!i0.equals(entry.getKey())) {
                        return b3;
                    }
                }
                final V j0 = this.J0;
                if (j0 == null) {
                    b3 = b2;
                    if (entry.getValue() != null) {
                        return b3;
                    }
                }
                else {
                    b3 = b2;
                    if (!j0.equals(entry.getValue())) {
                        return b3;
                    }
                }
                b3 = true;
            }
            return b3;
        }
        
        @Override
        public final K getKey() {
            return this.I0;
        }
        
        @Override
        public final V getValue() {
            return this.J0;
        }
        
        @Override
        public final int hashCode() {
            final K i0 = this.I0;
            int hashCode = 0;
            int hashCode2;
            if (i0 == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = i0.hashCode();
            }
            final V j0 = this.J0;
            if (j0 != null) {
                hashCode = j0.hashCode();
            }
            return hashCode2 ^ hashCode;
        }
        
        @Override
        public final V setValue(final V j0) {
            final V j2 = this.J0;
            this.J0 = j0;
            return j2;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.I0);
            sb.append("=");
            sb.append(this.J0);
            return sb.toString();
        }
    }
}
