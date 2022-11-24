import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tsa<K, V> extends dqo<K, V>
{
    public HashMap<K, dqo$c<K, V>> J0;
    
    public tsa() {
        this.J0 = new HashMap<K, dqo$c<K, V>>();
    }
    
    public final boolean contains(final K k) {
        return this.J0.containsKey(k);
    }
    
    public final dqo$c<K, V> e(final K k) {
        return this.J0.get(k);
    }
    
    public final V j(final K k, final V v) {
        final dqo$c<K, V> e = this.e(k);
        if (e != null) {
            return (V)e.G0;
        }
        this.J0.put(k, (dqo$c<K, V>)this.i((Object)k, (Object)v));
        return null;
    }
    
    public final V k(final K k) {
        final Object i = super.k((Object)k);
        this.J0.remove(k);
        return (V)i;
    }
}
