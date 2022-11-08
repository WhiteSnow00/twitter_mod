import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osa<K, V> extends soo<K, V>
{
    public HashMap<K, soo$c<K, V>> G0;
    
    public osa() {
        this.G0 = new HashMap<K, soo$c<K, V>>();
    }
    
    public final boolean contains(final K k) {
        return this.G0.containsKey(k);
    }
    
    public final soo$c<K, V> e(final K k) {
        return this.G0.get(k);
    }
    
    public final V j(final K k, final V v) {
        final soo$c<K, V> e = this.e(k);
        if (e != null) {
            return (V)e.D0;
        }
        this.G0.put(k, (soo$c<K, V>)this.i((Object)k, (Object)v));
        return null;
    }
    
    public final V l(final K k) {
        final Object l = super.l((Object)k);
        this.G0.remove(k);
        return (V)l;
    }
}
