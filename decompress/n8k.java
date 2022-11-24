import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n8k<K, V> extends nc<K, V> implements dak<K, V>
{
    public static final a Companion;
    public static final n8k H0;
    public final x3u<K, V> F0;
    public final int G0;
    
    static {
        Companion = new a();
        Objects.requireNonNull(x3u.Companion);
        H0 = new n8k((x3u<K, V>)x3u.e, 0);
    }
    
    public n8k(final x3u<K, V> f0, final int g0) {
        e0e.f((Object)f0, "node");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Set<Entry<K, V>> a() {
        return (Set<Entry<K, V>>)new f9k(this);
    }
    
    public final Set c() {
        return (Set)new j9k(this);
    }
    
    public final boolean containsKey(final Object o) {
        final x3u<K, V> f0 = this.F0;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return f0.e(hashCode, o, 0);
    }
    
    public final int d() {
        return this.G0;
    }
    
    public final Collection e() {
        return (Collection)new n9k((n8k<Object, Object>)this);
    }
    
    public final n8k<K, V> f(final K k, final V v) {
        final x3u<K, V> f0 = this.F0;
        int hashCode;
        if (k != null) {
            hashCode = k.hashCode();
        }
        else {
            hashCode = 0;
        }
        final x3u$b w = f0.w(hashCode, (Object)k, (Object)v, 0);
        if (w == null) {
            return this;
        }
        return new n8k<K, V>((x3u<Object, Object>)w.a, this.G0 + w.b);
    }
    
    public final V get(final Object o) {
        final x3u<K, V> f0 = this.F0;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return (V)f0.i(hashCode, o, 0);
    }
    
    public final dak$a l() {
        return (dak$a)new s8k(this);
    }
    
    public static final class a
    {
        public final <K, V> n8k<K, V> a() {
            final n8k h0 = n8k.H0;
            e0e.d((Object)h0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return h0;
        }
    }
}
