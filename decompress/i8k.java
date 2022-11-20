import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i8k<K, V> extends yc<Map.Entry<Object, Object>>
{
    public final e8k<K, V> D0;
    
    public i8k(final e8k<K, V> d0) {
        czd.f((Object)d0, "builder");
        this.D0 = d0;
    }
    
    public final boolean add(final Object o) {
        czd.f((Object)o, "element");
        throw new UnsupportedOperationException();
    }
    
    public final void clear() {
        this.D0.clear();
    }
    
    public final boolean contains(final Object o) {
        final boolean b = o instanceof Map.Entry;
        final boolean b2 = false;
        boolean a;
        if (!b) {
            a = b2;
        }
        else {
            final Map.Entry entry = (Map.Entry)o;
            czd.f((Object)entry, "element");
            final Object value = this.D0.get(entry.getKey());
            if (value != null) {
                a = czd.a(value, entry.getValue());
            }
            else {
                a = b2;
                if (entry.getValue() == null) {
                    a = b2;
                    if (this.D0.containsKey(entry.getKey())) {
                        a = true;
                    }
                }
            }
        }
        return a;
    }
    
    public final int getSize() {
        return this.D0.d();
    }
    
    public final Iterator<Map.Entry<K, V>> iterator() {
        return (Iterator<Map.Entry<K, V>>)new k8k((e8k)this.D0);
    }
    
    public final boolean remove(final Object o) {
        boolean remove;
        if (!(o instanceof Map.Entry)) {
            remove = false;
        }
        else {
            final Map.Entry entry = (Map.Entry)o;
            czd.f((Object)entry, "element");
            remove = this.D0.remove(entry.getKey(), entry.getValue());
        }
        return remove;
    }
}
