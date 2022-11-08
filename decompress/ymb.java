import java.util.Collection;
import java.util.List;
import java.util.Set;
import com.google.android.exoplayer2.upstream.e;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ymb<K, V> extends zmb implements Map<K, V>
{
    public final void clear() {
        ((e.b)this).C0.clear();
    }
    
    public boolean containsKey(final Object o) {
        return ((e.b)this).C0.containsKey(o);
    }
    
    public Set<Entry<K, V>> entrySet() {
        return (Set<Entry<K, V>>)((e.b)this).C0.entrySet();
    }
    
    public V get(final Object o) {
        return (V)((e.b)this).C0.get(o);
    }
    
    public boolean isEmpty() {
        return ((e.b)this).C0.isEmpty();
    }
    
    public Set<K> keySet() {
        return (Set<K>)((e.b)this).C0.keySet();
    }
    
    public final V put(final K k, final V v) {
        return (V)((e.b)this).C0.put((String)k, (List<String>)v);
    }
    
    public final void putAll(final Map<? extends K, ? extends V> map) {
        ((e.b)this).C0.putAll((Map<? extends String, ? extends List<String>>)map);
    }
    
    public final V remove(final Object o) {
        return (V)((e.b)this).C0.remove(o);
    }
    
    public int size() {
        return ((e.b)this).C0.size();
    }
    
    public final Collection<V> values() {
        return (Collection<V>)((e.b)this).C0.values();
    }
}
