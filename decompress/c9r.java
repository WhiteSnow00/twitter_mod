import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class c9r<K, V>
{
    public final piq<K, V> D0;
    public final Iterator<Map.Entry<K, V>> E0;
    public int F0;
    public Map.Entry<? extends K, ? extends V> G0;
    public Map.Entry<? extends K, ? extends V> H0;
    
    public c9r(final piq<K, V> d0, final Iterator<? extends Map.Entry<? extends K, ? extends V>> e0) {
        czd.f((Object)d0, "map");
        czd.f((Object)e0, "iterator");
        this.D0 = d0;
        this.E0 = (Iterator<Map.Entry<K, V>>)e0;
        this.F0 = d0.a();
        this.a();
    }
    
    public final void a() {
        this.G0 = this.H0;
        Map.Entry h0;
        if (this.E0.hasNext()) {
            h0 = this.E0.next();
        }
        else {
            h0 = null;
        }
        this.H0 = h0;
    }
    
    public final boolean hasNext() {
        return this.H0 != null;
    }
    
    public final void remove() {
        if (this.D0.a() != this.F0) {
            throw new ConcurrentModificationException();
        }
        final Map.Entry<? extends K, ? extends V> g0 = this.G0;
        if (g0 != null) {
            this.D0.remove((Object)g0.getKey());
            this.G0 = null;
            this.F0 = this.D0.a();
            return;
        }
        throw new IllegalStateException();
    }
}
