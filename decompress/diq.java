import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class diq<K, V, E> implements Set<E>, wne
{
    public final piq<K, V> D0;
    
    public diq(final piq<K, V> d0) {
        czd.f((Object)d0, "map");
        this.D0 = d0;
    }
    
    @Override
    public final void clear() {
        this.D0.clear();
    }
    
    @Override
    public final boolean isEmpty() {
        return this.D0.isEmpty();
    }
    
    @Override
    public final int size() {
        return this.D0.size();
    }
    
    @Override
    public final Object[] toArray() {
        return jee.t0((Collection)this);
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        czd.f((Object)array, "array");
        return (T[])jee.u0((Collection)this, (Object[])array);
    }
}
