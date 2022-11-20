import java.util.Collection;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gth<K, V> extends lc<K, V>
{
    public transient azr<? extends List<V>> I0;
    
    public gth(final Map<K, Collection<V>> map, final azr<? extends List<V>> i0) {
        super((Map)map);
        this.I0 = i0;
    }
    
    public final Collection g() {
        return (List)this.I0.get();
    }
}
