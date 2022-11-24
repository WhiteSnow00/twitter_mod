import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ffy<K, V> extends xfy<K, V> implements Serializable
{
    public transient Map<K, Collection<V>> H0;
    public transient int I0;
    
    public ffy(final Map<K, Collection<V>> h0) {
        if (h0.isEmpty()) {
            this.H0 = h0;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public abstract Collection<V> b();
    
    public abstract Collection<V> c(final K p0, final Collection<V> p1);
    
    public final boolean p(final K k, final V v) {
        final Collection collection = this.H0.get(k);
        if (collection == null) {
            final Collection<V> b = this.b();
            if (((ArrayList<V>)b).add(v)) {
                ++this.I0;
                this.H0.put(k, b);
                return true;
            }
            throw new AssertionError((Object)"New Collection violated the Collection spec");
        }
        else {
            if (collection.add(v)) {
                ++this.I0;
                return true;
            }
            return false;
        }
    }
}
