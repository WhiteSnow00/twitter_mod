import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b8k<K, V> extends ad<Map.Entry<Object, Object>>
{
    public final x7k<K, V> C0;
    
    public b8k(final x7k<K, V> c0) {
        zzd.f((Object)c0, "builder");
        this.C0 = c0;
    }
    
    public final boolean add(final Object o) {
        zzd.f((Object)o, "element");
        throw new UnsupportedOperationException();
    }
    
    public final void clear() {
        this.C0.clear();
    }
    
    public final boolean contains(Object value) {
        final boolean b = value instanceof Map.Entry;
        final boolean b2 = false;
        boolean a;
        if (!b) {
            a = b2;
        }
        else {
            final Map.Entry entry = (Map.Entry)value;
            zzd.f((Object)entry, "element");
            value = this.C0.get(entry.getKey());
            if (value != null) {
                a = zzd.a(value, entry.getValue());
            }
            else {
                a = b2;
                if (entry.getValue() == null) {
                    a = b2;
                    if (this.C0.containsKey(entry.getKey())) {
                        a = true;
                    }
                }
            }
        }
        return a;
    }
    
    public final int getSize() {
        return this.C0.d();
    }
    
    public final Iterator<Map.Entry<K, V>> iterator() {
        return (Iterator<Map.Entry<K, V>>)new d8k((x7k)this.C0);
    }
    
    public final boolean remove(final Object o) {
        boolean remove;
        if (!(o instanceof Map.Entry)) {
            remove = false;
        }
        else {
            final Map.Entry entry = (Map.Entry)o;
            zzd.f((Object)entry, "element");
            remove = this.C0.remove(entry.getKey(), entry.getValue());
        }
        return remove;
    }
}
