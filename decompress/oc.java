import java.util.ConcurrentModificationException;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.RandomAccess;
import java.util.Set;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.SortedMap;
import java.util.NavigableMap;
import java.util.Objects;
import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class oc<K, V> extends uc<K, V> implements Serializable
{
    public transient Map<K, Collection<V>> G0;
    public transient int H0;
    
    public oc(final Map<K, Collection<V>> g0) {
        nza.D0(g0.isEmpty());
        this.G0 = g0;
    }
    
    public static int b(final oc oc) {
        return oc.H0++;
    }
    
    public static int c(final oc oc) {
        return oc.H0--;
    }
    
    public static int d(final oc oc, int h0) {
        h0 += oc.H0;
        return oc.H0 = h0;
    }
    
    public static int e(final oc oc, int h0) {
        h0 = oc.H0 - h0;
        return oc.H0 = h0;
    }
    
    public final void f() {
        final Iterator<Collection<V>> iterator = this.G0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().clear();
        }
        this.G0.clear();
        this.H0 = 0;
    }
    
    public abstract Collection<V> g();
    
    public abstract class b<T> implements Iterator<T>, j$.util.Iterator
    {
        public final Iterator<Map.Entry<K, Collection<V>>> D0;
        public K E0;
        public Collection<V> F0;
        public Iterator<V> G0;
        public final oc H0;
        
        public b(final oc h0) {
            this.H0 = h0;
            this.D0 = h0.G0.entrySet().iterator();
            this.E0 = null;
            this.F0 = null;
            this.G0 = (Iterator<V>)l5e$c.D0;
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
            return this.D0.hasNext() || this.G0.hasNext();
        }
        
        @Override
        public final T next() {
            if (!this.G0.hasNext()) {
                final Map.Entry entry = this.D0.next();
                this.E0 = entry.getKey();
                final Collection f0 = (Collection)entry.getValue();
                this.F0 = f0;
                this.G0 = f0.iterator();
            }
            return (T)this.G0.next();
        }
        
        @Override
        public final void remove() {
            this.G0.remove();
            final Collection<V> f0 = this.F0;
            Objects.requireNonNull(f0);
            if (f0.isEmpty()) {
                this.D0.remove();
            }
            oc.c(this.H0);
        }
    }
    
    public class c extends rkg.b<K, Collection<V>>
    {
        public final oc E0;
        
        public c(final oc e0, final Map<K, Collection<V>> map) {
            this.E0 = e0;
            super(map);
        }
        
        public final void clear() {
            final Iterator<K> iterator = this.iterator();
            while (true) {
                final Iterator<K> iterator2 = (oc$c$a)iterator;
                if (!iterator2.hasNext()) {
                    break;
                }
                iterator2.next();
                iterator2.remove();
            }
        }
        
        public final boolean containsAll(final Collection<?> collection) {
            return super.D0.keySet().containsAll(collection);
        }
        
        public final boolean equals(final Object o) {
            return this == o || super.D0.keySet().equals(o);
        }
        
        public final int hashCode() {
            return super.D0.keySet().hashCode();
        }
        
        public final Iterator<K> iterator() {
            return new Iterator<K>(this, super.D0.entrySet().iterator()) {
                public Map.Entry<K, Collection<V>> D0;
                public final Iterator E0;
                public final c F0;
                
                public final void forEachRemaining(final Consumer consumer) {
                    Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
                }
                
                @Override
                public final void forEachRemaining(final java.util.function.Consumer consumer) {
                    Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
                }
                
                @Override
                public final boolean hasNext() {
                    return this.E0.hasNext();
                }
                
                @Override
                public final K next() {
                    final Map.Entry<K, Collection<V>> d0 = this.E0.next();
                    this.D0 = d0;
                    return d0.getKey();
                }
                
                @Override
                public final void remove() {
                    nza.I0(this.D0 != null);
                    final Collection collection = this.D0.getValue();
                    this.E0.remove();
                    oc.e(this.F0.E0, collection.size());
                    collection.clear();
                    this.D0 = null;
                }
            };
        }
        
        public final boolean remove(final Object o) {
            final Collection collection = (Collection)super.D0.remove(o);
            boolean b = false;
            int size;
            if (collection != null) {
                size = collection.size();
                collection.clear();
                oc.e(this.E0, size);
            }
            else {
                size = 0;
            }
            if (size > 0) {
                b = true;
            }
            return b;
        }
    }
    
    public final class d extends g implements NavigableMap<K, Collection<V>>
    {
        public final oc J0;
        
        public d(final oc j0, final NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }
        
        @Override
        public final SortedSet c() {
            return (SortedSet)new oc$e(this.J0, (NavigableMap)this.h());
        }
        
        @Override
        public final Entry<K, Collection<V>> ceilingEntry(final K k) {
            final Map.Entry<K, Collection<V>> ceilingEntry = this.h().ceilingEntry(k);
            Entry<K, Collection<V>> a;
            if (ceilingEntry == null) {
                a = null;
            }
            else {
                a = this.a((Entry)ceilingEntry);
            }
            return a;
        }
        
        @Override
        public final K ceilingKey(final K k) {
            return this.h().ceilingKey(k);
        }
        
        @Override
        public final /* bridge */ SortedSet d() {
            return this.f();
        }
        
        @Override
        public final NavigableSet<K> descendingKeySet() {
            return ((d)this.descendingMap()).f();
        }
        
        @Override
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(this.h().descendingMap());
        }
        
        @Override
        public final /* bridge */ SortedMap e() {
            return this.h();
        }
        
        public final NavigableSet<K> f() {
            SortedSet<K> h0;
            if ((h0 = super.H0) == null) {
                h0 = this.c();
                super.H0 = h0;
            }
            return (NavigableSet<K>)h0;
        }
        
        @Override
        public final Entry<K, Collection<V>> firstEntry() {
            final Map.Entry<K, Collection<V>> firstEntry = this.h().firstEntry();
            Entry<K, Collection<V>> a;
            if (firstEntry == null) {
                a = null;
            }
            else {
                a = this.a((Entry)firstEntry);
            }
            return a;
        }
        
        @Override
        public final Entry<K, Collection<V>> floorEntry(final K k) {
            final Map.Entry<K, Collection<V>> floorEntry = this.h().floorEntry(k);
            Entry<K, Collection<V>> a;
            if (floorEntry == null) {
                a = null;
            }
            else {
                a = this.a((Entry)floorEntry);
            }
            return a;
        }
        
        @Override
        public final K floorKey(final K k) {
            return this.h().floorKey(k);
        }
        
        public final Entry<K, Collection<V>> g(final Iterator<Entry<K, Collection<V>>> iterator) {
            if (!iterator.hasNext()) {
                return null;
            }
            final Entry entry = (Entry)iterator.next();
            final Collection<Object> g = this.J0.g();
            g.addAll((Collection<?>)entry.getValue());
            iterator.remove();
            final Object key = entry.getKey();
            Objects.requireNonNull((lc)this.J0);
            return (Entry<K, Collection<V>>)new add(key, (Object)Collections.unmodifiableList((List<?>)g));
        }
        
        public final NavigableMap<K, Collection<V>> h() {
            return (NavigableMap)super.F0;
        }
        
        @Override
        public final NavigableMap<K, Collection<V>> headMap(final K k, final boolean b) {
            return new d(this.h().headMap(k, b));
        }
        
        @Override
        public final SortedMap headMap(final Object o) {
            return this.headMap(o, false);
        }
        
        @Override
        public final Entry<K, Collection<V>> higherEntry(final K k) {
            final Map.Entry<K, Collection<V>> higherEntry = this.h().higherEntry(k);
            Entry<K, Collection<V>> a;
            if (higherEntry == null) {
                a = null;
            }
            else {
                a = this.a((Entry)higherEntry);
            }
            return a;
        }
        
        @Override
        public final K higherKey(final K k) {
            return this.h().higherKey(k);
        }
        
        public final /* bridge */ Set keySet() {
            return this.f();
        }
        
        @Override
        public final Entry<K, Collection<V>> lastEntry() {
            final Map.Entry<K, Collection<V>> lastEntry = this.h().lastEntry();
            Entry<K, Collection<V>> a;
            if (lastEntry == null) {
                a = null;
            }
            else {
                a = this.a((Entry)lastEntry);
            }
            return a;
        }
        
        @Override
        public final Entry<K, Collection<V>> lowerEntry(final K k) {
            final Map.Entry<K, Collection<V>> lowerEntry = this.h().lowerEntry(k);
            Entry<K, Collection<V>> a;
            if (lowerEntry == null) {
                a = null;
            }
            else {
                a = this.a((Entry)lowerEntry);
            }
            return a;
        }
        
        @Override
        public final K lowerKey(final K k) {
            return this.h().lowerKey(k);
        }
        
        @Override
        public final NavigableSet<K> navigableKeySet() {
            return this.f();
        }
        
        @Override
        public final Entry<K, Collection<V>> pollFirstEntry() {
            return (Entry<K, Collection<V>>)this.g((Iterator<Entry<Object, Collection<V>>>)((rkg.d<Object, Object>)this).entrySet().iterator());
        }
        
        @Override
        public final Entry<K, Collection<V>> pollLastEntry() {
            return this.g(((rkg.d)this.descendingMap()).entrySet().iterator());
        }
        
        @Override
        public final NavigableMap<K, Collection<V>> subMap(final K k, final boolean b, final K i, final boolean b2) {
            return new d(this.h().subMap(k, b, i, b2));
        }
        
        @Override
        public final SortedMap subMap(final Object o, final Object o2) {
            return this.subMap(o, true, o2, false);
        }
        
        @Override
        public final NavigableMap<K, Collection<V>> tailMap(final K k, final boolean b) {
            return new d(this.h().tailMap(k, b));
        }
        
        @Override
        public final SortedMap tailMap(final Object o) {
            return this.tailMap(o, true);
        }
    }
    
    public final class f extends oc$j implements RandomAccess
    {
        public f(final oc oc, final K k, final List<V> list, final i i) {
            super(oc, (Object)k, (List)list, i);
        }
    }
    
    public class g extends oc$a implements SortedMap<K, Collection<V>>
    {
        public SortedSet<K> H0;
        public final oc I0;
        
        public g(final oc i0, final SortedMap<K, Collection<V>> sortedMap) {
            super(this.I0 = i0, (Map)sortedMap);
        }
        
        public SortedSet<K> c() {
            return new h(this.e());
        }
        
        public final Comparator<? super K> comparator() {
            return this.e().comparator();
        }
        
        public SortedSet<K> d() {
            SortedSet<K> h0;
            if ((h0 = this.H0) == null) {
                h0 = this.c();
                this.H0 = h0;
            }
            return h0;
        }
        
        public SortedMap<K, Collection<V>> e() {
            return (SortedMap)super.F0;
        }
        
        public final K firstKey() {
            return this.e().firstKey();
        }
        
        public SortedMap<K, Collection<V>> headMap(final K k) {
            return new g(this.e().headMap(k));
        }
        
        public /* bridge */ Set keySet() {
            return this.d();
        }
        
        public final K lastKey() {
            return this.e().lastKey();
        }
        
        public SortedMap<K, Collection<V>> subMap(final K k, final K i) {
            return new g(this.e().subMap(k, i));
        }
        
        public SortedMap<K, Collection<V>> tailMap(final K k) {
            return new g(this.e().tailMap(k));
        }
    }
    
    public class h extends c implements SortedSet<K>
    {
        public final oc F0;
        
        public h(final oc f0, final SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }
        
        @Override
        public final Comparator<? super K> comparator() {
            return this.e().comparator();
        }
        
        public SortedMap<K, Collection<V>> e() {
            return (SortedMap)super.D0;
        }
        
        @Override
        public final K first() {
            return this.e().firstKey();
        }
        
        @Override
        public SortedSet<K> headSet(final K k) {
            return new h(this.e().headMap(k));
        }
        
        @Override
        public final K last() {
            return this.e().lastKey();
        }
        
        @Override
        public SortedSet<K> subSet(final K k, final K i) {
            return new h(this.e().subMap(k, i));
        }
        
        @Override
        public SortedSet<K> tailSet(final K k) {
            return new h(this.e().tailMap(k));
        }
    }
    
    public class i extends AbstractCollection<V>
    {
        public final K D0;
        public Collection<V> E0;
        public final i F0;
        public final Collection<V> G0;
        public final oc H0;
        
        public i(final oc h0, final K d0, final Collection<V> e0, final i f0) {
            this.H0 = h0;
            this.D0 = d0;
            this.E0 = e0;
            this.F0 = f0;
            Collection<V> e2;
            if (f0 == null) {
                e2 = null;
            }
            else {
                e2 = f0.E0;
            }
            this.G0 = e2;
        }
        
        @Override
        public final boolean add(final V v) {
            this.g();
            final boolean empty = this.E0.isEmpty();
            final boolean add = this.E0.add(v);
            if (add) {
                oc.b(this.H0);
                if (empty) {
                    this.e();
                }
            }
            return add;
        }
        
        @Override
        public final boolean addAll(final Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            final int size = this.size();
            final boolean addAll = this.E0.addAll(collection);
            if (addAll) {
                oc.d(this.H0, this.E0.size() - size);
                if (size == 0) {
                    this.e();
                }
            }
            return addAll;
        }
        
        @Override
        public final void clear() {
            final int size = this.size();
            if (size == 0) {
                return;
            }
            this.E0.clear();
            oc.e(this.H0, size);
            this.i();
        }
        
        @Override
        public final boolean contains(final Object o) {
            this.g();
            return this.E0.contains(o);
        }
        
        @Override
        public final boolean containsAll(final Collection<?> collection) {
            this.g();
            return this.E0.containsAll(collection);
        }
        
        public final void e() {
            final i f0 = this.F0;
            if (f0 != null) {
                f0.e();
            }
            else {
                this.H0.G0.put(this.D0, this.E0);
            }
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            this.g();
            return this.E0.equals(o);
        }
        
        public final void g() {
            final i f0 = this.F0;
            if (f0 != null) {
                f0.g();
                if (this.F0.E0 != this.G0) {
                    throw new ConcurrentModificationException();
                }
            }
            else if (this.E0.isEmpty()) {
                final Collection e0 = this.H0.G0.get(this.D0);
                if (e0 != null) {
                    this.E0 = e0;
                }
            }
        }
        
        @Override
        public final int hashCode() {
            this.g();
            return this.E0.hashCode();
        }
        
        public final void i() {
            final i f0 = this.F0;
            if (f0 != null) {
                f0.i();
            }
            else if (this.E0.isEmpty()) {
                this.H0.G0.remove(this.D0);
            }
        }
        
        @Override
        public final Iterator<V> iterator() {
            this.g();
            return new a();
        }
        
        @Override
        public final boolean remove(final Object o) {
            this.g();
            final boolean remove = this.E0.remove(o);
            if (remove) {
                oc.c(this.H0);
                this.i();
            }
            return remove;
        }
        
        @Override
        public final boolean removeAll(final Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            final int size = this.size();
            final boolean removeAll = this.E0.removeAll(collection);
            if (removeAll) {
                oc.d(this.H0, this.E0.size() - size);
                this.i();
            }
            return removeAll;
        }
        
        @Override
        public final boolean retainAll(final Collection<?> collection) {
            Objects.requireNonNull(collection);
            final int size = this.size();
            final boolean retainAll = this.E0.retainAll(collection);
            if (retainAll) {
                oc.d(this.H0, this.E0.size() - size);
                this.i();
            }
            return retainAll;
        }
        
        @Override
        public final int size() {
            this.g();
            return this.E0.size();
        }
        
        @Override
        public final String toString() {
            this.g();
            return this.E0.toString();
        }
        
        public class a implements Iterator<V>, j$.util.Iterator
        {
            public final Iterator<V> D0;
            public final Collection<V> E0;
            public final i F0;
            
            public a(final i f0) {
                this.F0 = f0;
                final Collection<V> e0 = f0.E0;
                this.E0 = e0;
                Iterator d0;
                if (e0 instanceof List) {
                    d0 = ((List)e0).listIterator();
                }
                else {
                    d0 = e0.iterator();
                }
                this.D0 = d0;
            }
            
            public a(final i f0, final Iterator<V> d0) {
                this.F0 = f0;
                this.E0 = f0.E0;
                this.D0 = d0;
            }
            
            public final void a() {
                this.F0.g();
                if (this.F0.E0 == this.E0) {
                    return;
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
                this.a();
                return this.D0.hasNext();
            }
            
            @Override
            public final V next() {
                this.a();
                return this.D0.next();
            }
            
            @Override
            public final void remove() {
                this.D0.remove();
                oc.c(this.F0.H0);
                this.F0.i();
            }
        }
    }
}
