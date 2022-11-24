import java.util.Iterator;
import java.util.Objects;
import java.util.Map;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dse<T> implements rm9<T>
{
    public final dse.dse$b<T> a;
    
    public dse(final dse.dse$b<T> a) {
        this.a = a;
    }
    
    public final /* bridge */ qqw a(final liv liv) {
        return (qqw)this.f((liv<T, lc0>)liv);
    }
    
    @Override
    public final /* bridge */ uqw a(final liv liv) {
        return this.f((liv<T, lc0>)liv);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof dse && e0e.a((Object)this.a, (Object)((dse)o).a);
    }
    
    public final <V extends lc0> yqw<V> f(final liv<T, V> liv) {
        e0e.f((Object)liv, "converter");
        final LinkedHashMap b = this.a.b;
        final LinkedHashMap linkedHashMap = new LinkedHashMap(vmw.E(b.size()));
        for (final Map.Entry<Object, V> entry : b.entrySet()) {
            final Object key = entry.getKey();
            final dse.dse$a dse$a = (dse.dse$a)entry.getValue();
            final stb<T, V> a = liv.a();
            Objects.requireNonNull(dse$a);
            e0e.f((Object)a, "convertToVector");
            linkedHashMap.put(key, (Object)new awj(a.invoke(dse$a.a), (Object)dse$a.b));
        }
        return new yqw<V>((Map)linkedHashMap, this.a.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
