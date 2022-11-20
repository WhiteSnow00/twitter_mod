import java.util.Set;
import java.util.AbstractMap;
import java.util.AbstractCollection;
import com.google.j2objc.annotations.Weak;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rkg
{
    public static boolean a(final Map<?, ?> map, final Object o) {
        return map == o || (o instanceof Map && map.entrySet().equals(((Map)o).entrySet()));
    }
    
    public abstract static class a<K, V> extends nnp$d<Map.Entry<K, V>>
    {
        public final void clear() {
            ((oc$a.a)this).D0.clear();
        }
        
        public abstract boolean contains(final Object p0);
        
        public final boolean isEmpty() {
            return ((Map)((oc$a.a)this).D0).isEmpty();
        }
        
        public final boolean removeAll(final Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.removeAll((Collection)collection);
            }
            catch (final UnsupportedOperationException ex) {
                final Iterator<?> iterator = collection.iterator();
                boolean b = false;
                while (iterator.hasNext()) {
                    b |= ((oc$a.a)this).remove(iterator.next());
                }
                return b;
            }
        }
        
        public final boolean retainAll(final Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.retainAll((Collection)collection);
            }
            catch (final UnsupportedOperationException ex) {
                int size = collection.size();
                if (size < 3) {
                    wj1.f(size, "expectedSize");
                    ++size;
                }
                else if (size < 1073741824) {
                    size = (int)(size / 0.75f + 1.0f);
                }
                else {
                    size = Integer.MAX_VALUE;
                }
                final HashSet set = new HashSet<Object>(size);
                for (final Object next : collection) {
                    if (this.contains(next) && next instanceof Map.Entry) {
                        set.add(((Map.Entry<Object, V>)next).getKey());
                    }
                }
                return ((Map<Object, V>)((oc$a.a)this).D0).keySet().retainAll(set);
            }
        }
        
        public final int size() {
            return ((oc$a.a)this).D0.size();
        }
    }
    
    public static class b<K, V> extends nnp$d<K>
    {
        @Weak
        public final Map<K, V> D0;
        
        public b(final Map<K, V> d0) {
            Objects.requireNonNull(d0);
            this.D0 = d0;
        }
        
        public final boolean contains(final Object o) {
            return this.D0.containsKey(o);
        }
        
        public final boolean isEmpty() {
            return this.D0.isEmpty();
        }
        
        public final int size() {
            return this.D0.size();
        }
    }
    
    public static final class c<K, V> extends AbstractCollection<V>
    {
        @Weak
        public final Map<K, V> D0;
        
        public c(final Map<K, V> d0) {
            Objects.requireNonNull(d0);
            this.D0 = d0;
        }
        
        @Override
        public final void clear() {
            this.D0.clear();
        }
        
        @Override
        public final boolean contains(final Object o) {
            return this.D0.containsValue(o);
        }
        
        @Override
        public final boolean isEmpty() {
            return this.D0.isEmpty();
        }
        
        @Override
        public final Iterator<V> iterator() {
            return (Iterator<V>)new qkg((Iterator)this.D0.entrySet().iterator());
        }
        
        @Override
        public final boolean remove(final Object o) {
            try {
                return super.remove(o);
            }
            catch (final UnsupportedOperationException ex) {
                for (final Map.Entry<K, Object> entry : this.D0.entrySet()) {
                    if (af8.o(o, entry.getValue())) {
                        this.D0.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }
        
        @Override
        public final boolean removeAll(final Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.removeAll(collection);
            }
            catch (final UnsupportedOperationException ex) {
                final HashSet set = new HashSet();
                for (final Map.Entry<K, Object> entry : this.D0.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        set.add(entry.getKey());
                    }
                }
                return this.D0.keySet().removeAll(set);
            }
        }
        
        @Override
        public final boolean retainAll(final Collection<?> collection) {
            try {
                Objects.requireNonNull(collection);
                return super.retainAll(collection);
            }
            catch (final UnsupportedOperationException ex) {
                final HashSet set = new HashSet();
                for (final Map.Entry<K, Object> entry : this.D0.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        set.add(entry.getKey());
                    }
                }
                return this.D0.keySet().retainAll(set);
            }
        }
        
        @Override
        public final int size() {
            return this.D0.size();
        }
    }
    
    public abstract static class d<K, V> extends AbstractMap<K, V>
    {
        public transient Set<Entry<K, V>> D0;
        public transient Collection<V> E0;
        
        @Override
        public final Set<Entry<K, V>> entrySet() {
            oc$a.a d0;
            if ((d0 = this.D0) == null) {
                d0 = (oc$a)this.new a();
                this.D0 = d0;
            }
            return (Set<Entry<K, V>>)d0;
        }
        
        @Override
        public final Collection<V> values() {
            c e0;
            if ((e0 = this.E0) == null) {
                e0 = new c((Map<K, V>)this);
                this.E0 = e0;
            }
            return e0;
        }
    }
}
