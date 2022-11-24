import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccy extends iny
{
    public final rcy F0;
    
    public ccy(final rcy f0) {
        this.F0 = f0;
    }
    
    public final boolean contains(final Object o) {
        final Set entrySet = this.F0.H0.entrySet();
        Objects.requireNonNull(entrySet);
        boolean contains;
        try {
            contains = entrySet.contains(o);
        }
        catch (final ClassCastException | NullPointerException ex) {
            contains = false;
        }
        return contains;
    }
    
    public final Iterator<Map.Entry> iterator() {
        return (Iterator<Map.Entry>)new kcy(this.F0);
    }
    
    public final boolean remove(Object remove) {
        if (!this.contains(remove)) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)remove;
        Objects.requireNonNull(entry);
        final ffy i0 = this.F0.I0;
        final Object key = entry.getKey();
        final Map<K, Collection<V>> h0 = i0.H0;
        Objects.requireNonNull(h0);
        try {
            remove = h0.remove(key);
        }
        catch (final ClassCastException | NullPointerException ex) {
            remove = null;
        }
        final Collection collection = (Collection)remove;
        if (collection != null) {
            final int size = collection.size();
            collection.clear();
            i0.I0 -= size;
        }
        return true;
    }
}
