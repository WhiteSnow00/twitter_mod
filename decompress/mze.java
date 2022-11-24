import androidx.annotation.RecentlyNonNull;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class mze<K, V>
{
    public final Map<K, V> a;
    
    public mze() {
        this.a = new HashMap();
    }
    
    @RecentlyNonNull
    public abstract V a(@RecentlyNonNull final K p0);
    
    @RecentlyNonNull
    public final V b(@RecentlyNonNull final K k) {
        synchronized (this.a) {
            if (this.a.containsKey(k)) {
                return this.a.get(k);
            }
            final V a = this.a(k);
            this.a.put(k, a);
            return a;
        }
    }
}
