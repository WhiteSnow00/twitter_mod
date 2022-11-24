import java.util.Set;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.SortedMap;
import java.util.List;
import java.util.RandomAccess;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pc<K, V> extends vc<K, V> implements Serializable
{
    public transient Map<K, Collection<V>> I0;
    public transient int J0;
    
    public pc(final Map<K, Collection<V>> i0) {
        v7q.d(i0.isEmpty());
        this.I0 = i0;
    }
    
    public static int b(final pc pc) {
        return pc.J0++;
    }
    
    public static int c(final pc pc) {
        return pc.J0--;
    }
    
    public static int d(final pc pc, int j0) {
        j0 += pc.J0;
        return pc.J0 = j0;
    }
    
    public static int e(final pc pc, int j0) {
        j0 = pc.J0 - j0;
        return pc.J0 = j0;
    }
    
    public final void f() {
        final Iterator<Collection<V>> iterator = this.I0.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().clear();
        }
        this.I0.clear();
        this.J0 = 0;
    }
    
    public abstract Collection<V> g();
    
    public class c extends b<K, Collection<V>>
    {
        public final pc G0;
        
        public c(final pc g0, final Map<K, Collection<V>> map) {
            this.G0 = g0;
            super(map);
        }
        
        public final void clear() {
            final Iterator<K> iterator = this.iterator();
            while (true) {
                final pc$c$a pc$c$a = (pc$c$a)iterator;
                if (!pc$c$a.hasNext()) {
                    break;
                }
                pc$c$a.next();
                pc$c$a.remove();
            }
        }
        
        public final boolean containsAll(final Collection<?> collection) {
            return super.F0.keySet().containsAll(collection);
        }
        
        public final boolean equals(final Object o) {
            return this == o || super.F0.keySet().equals(o);
        }
        
        public final int hashCode() {
            return super.F0.keySet().hashCode();
        }
        
        public final Iterator<K> iterator() {
            return (Iterator<K>)new pc$c$a(this, (Iterator)super.F0.entrySet().iterator());
        }
        
        public final boolean remove(final Object o) {
            final Collection collection = (Collection)super.F0.remove(o);
            boolean b = false;
            int size;
            if (collection != null) {
                size = collection.size();
                collection.clear();
                pc.e(this.G0, size);
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
    
    public final class f extends pc$j implements RandomAccess
    {
        public f(final pc pc, final K k, final List<V> list, final pc$i pc$i) {
            super(pc, (Object)k, (List)list, pc$i);
        }
    }
    
    public class g extends pc$a implements SortedMap<K, Collection<V>>
    {
        public SortedSet<K> J0;
        public final pc K0;
        
        public g(final pc k0, final SortedMap<K, Collection<V>> sortedMap) {
            super(this.K0 = k0, (Map)sortedMap);
        }
        
        public SortedSet<K> c() {
            return (SortedSet<K>)new pc$h(this.K0, (SortedMap)this.e());
        }
        
        public final Comparator<? super K> comparator() {
            return this.e().comparator();
        }
        
        public SortedSet<K> d() {
            SortedSet<K> j0;
            if ((j0 = this.J0) == null) {
                j0 = this.c();
                this.J0 = j0;
            }
            return j0;
        }
        
        public SortedMap<K, Collection<V>> e() {
            return (SortedMap)super.H0;
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
}
