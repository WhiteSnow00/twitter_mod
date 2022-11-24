import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n9k<K, V> extends cb<V>
{
    public final n8k<K, V> F0;
    
    public n9k(final n8k<K, V> f0) {
        e0e.f((Object)f0, "map");
        this.F0 = f0;
    }
    
    public final boolean contains(final Object o) {
        return this.F0.containsValue(o);
    }
    
    public final int getSize() {
        return this.F0.d();
    }
    
    public final Iterator<V> iterator() {
        return (Iterator<V>)new p9k((x3u<Object, Object>)this.F0.F0);
    }
}
