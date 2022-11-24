import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class lny<K, V> extends upy<K>
{
    public final Map<K, V> F0;
    
    public lny(final Map<K, V> f0) {
        Objects.requireNonNull(f0);
        this.F0 = f0;
    }
    
    public final boolean contains(final Object o) {
        return this.F0.containsKey(o);
    }
    
    public final boolean isEmpty() {
        return this.F0.isEmpty();
    }
    
    public final int size() {
        return this.F0.size();
    }
}
