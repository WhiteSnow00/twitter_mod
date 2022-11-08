import java.util.Set;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tkg
{
    public static boolean a(final Map<?, ?> map, final Object o) {
        return map == o || (o instanceof Map && map.entrySet().equals(((Map)o).entrySet()));
    }
    
    public static final class c<K, V> extends AbstractCollection<V>
    {
        @Weak
        public final Map<K, V> C0;
        
        public c(final Map<K, V> c0) {
            Objects.requireNonNull(c0);
            this.C0 = c0;
        }
        
        @Override
        public final void clear() {
            this.C0.clear();
        }
        
        @Override
        public final boolean contains(final Object o) {
            return this.C0.containsValue(o);
        }
        
        @Override
        public final boolean isEmpty() {
            return this.C0.isEmpty();
        }
        
        @Override
        public final Iterator<V> iterator() {
            return new skg(this.C0.entrySet().iterator());
        }
        
        @Override
        public final boolean remove(final Object o) {
            try {
                return super.remove(o);
            }
            catch (final UnsupportedOperationException ex) {
                for (final Map.Entry<K, Object> entry : this.C0.entrySet()) {
                    if (asy.D(o, entry.getValue())) {
                        this.C0.remove(entry.getKey());
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
                for (final Map.Entry<K, Object> entry : this.C0.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        set.add(entry.getKey());
                    }
                }
                return this.C0.keySet().removeAll(set);
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
                for (final Map.Entry<K, Object> entry : this.C0.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        set.add(entry.getKey());
                    }
                }
                return this.C0.keySet().retainAll(set);
            }
        }
        
        @Override
        public final int size() {
            return this.C0.size();
        }
    }
    
    public abstract static class d<K, V> extends AbstractMap<K, V>
    {
        public transient Set<Entry<K, V>> C0;
        public transient Collection<V> D0;
        
        @Override
        public final Set<Entry<K, V>> entrySet() {
            qc$a$a c0;
            if ((c0 = this.C0) == null) {
                c0 = new qc$a$a((qc$a)this);
                this.C0 = c0;
            }
            return (Set<Entry<K, V>>)c0;
        }
        
        @Override
        public final Collection<V> values() {
            c d0;
            if ((d0 = this.D0) == null) {
                d0 = new c((Map<K, V>)this);
                this.D0 = d0;
            }
            return d0;
        }
    }
}
