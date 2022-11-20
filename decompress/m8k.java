import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m8k<K, V> extends yc<K>
{
    public final e8k<K, V> D0;
    
    public m8k(final e8k<K, V> d0) {
        czd.f((Object)d0, "builder");
        this.D0 = d0;
    }
    
    public final boolean add(final K k) {
        throw new UnsupportedOperationException();
    }
    
    public final void clear() {
        this.D0.clear();
    }
    
    public final boolean contains(final Object o) {
        return this.D0.containsKey(o);
    }
    
    public final int getSize() {
        return this.D0.d();
    }
    
    public final Iterator<K> iterator() {
        return (Iterator<K>)new o8k((e8k<Object, Object>)this.D0);
    }
    
    public final boolean remove(final Object o) {
        if (this.D0.containsKey(o)) {
            this.D0.remove(o);
            return true;
        }
        return false;
    }
}
