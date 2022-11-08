import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class bmy<K, V> extends koy<K>
{
    public final Map<K, V> C0;
    
    public bmy(final Map<K, V> c0) {
        Objects.requireNonNull(c0);
        this.C0 = c0;
    }
    
    public final boolean contains(final Object o) {
        return this.C0.containsKey(o);
    }
    
    public final boolean isEmpty() {
        return this.C0.isEmpty();
    }
    
    public final int size() {
        return this.C0.size();
    }
}
