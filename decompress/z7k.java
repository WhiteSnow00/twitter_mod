import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z7k<K, V> extends mc<K, V> implements r9k<K, V>
{
    public static final z7k.z7k$a Companion;
    public static final z7k F0;
    public final e3u<K, V> D0;
    public final int E0;
    
    static {
        Companion = new z7k.z7k$a();
        Objects.requireNonNull(e3u.Companion);
        F0 = new z7k((e3u<K, V>)e3u.e, 0);
    }
    
    public z7k(final e3u<K, V> d0, final int e0) {
        czd.f((Object)d0, "node");
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final Set<Entry<K, V>> a() {
        return (Set<Entry<K, V>>)new u8k(this);
    }
    
    public final Set c() {
        return (Set)new y8k(this);
    }
    
    public final boolean containsKey(final Object o) {
        final e3u<K, V> d0 = this.D0;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return d0.e(hashCode, o, 0);
    }
    
    public final int d() {
        return this.E0;
    }
    
    public final Collection e() {
        return (Collection)new c9k(this);
    }
    
    public final z7k<K, V> f(final K k, final V v) {
        final e3u<K, V> d0 = this.D0;
        int hashCode;
        if (k != null) {
            hashCode = k.hashCode();
        }
        else {
            hashCode = 0;
        }
        final e3u$b w = d0.w(hashCode, (Object)k, (Object)v, 0);
        if (w == null) {
            return this;
        }
        return new z7k<K, V>((e3u<Object, Object>)w.a, this.E0 + w.b);
    }
    
    public final V get(final Object o) {
        final e3u<K, V> d0 = this.D0;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return (V)d0.i(hashCode, o, 0);
    }
    
    public final r9k$a k() {
        return (r9k$a)new e8k(this);
    }
}
