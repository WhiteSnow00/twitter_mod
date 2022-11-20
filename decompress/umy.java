import java.util.HashSet;
import java.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class umy<K, V> extends AbstractCollection<V>
{
    public final Map<K, V> D0;
    
    public umy(final Map<K, V> d0) {
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
        return (Iterator<V>)new imy((Iterator)this.D0.entrySet().iterator());
    }
    
    @Override
    public final boolean remove(final Object o) {
        try {
            return super.remove(o);
        }
        catch (final UnsupportedOperationException ex) {
            for (final Map.Entry<K, Object> entry : this.D0.entrySet()) {
                if (ffz.I0(o, entry.getValue())) {
                    this.D0.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        Objects.requireNonNull(collection);
        try {
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
        Objects.requireNonNull(collection);
        try {
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
