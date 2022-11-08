import java.util.Map;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class wc<K, V> implements zsh<K, V>
{
    public transient Set<K> C0;
    public transient Collection<V> D0;
    public transient Map<K, Collection<V>> E0;
    
    public abstract Map<K, Collection<V>> a();
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof zsh && ((qc$a)((nc)this).a()).equals((Object)((zsh)o).a()));
    }
    
    @Override
    public final int hashCode() {
        return ((qc$a)this.a()).hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a().toString();
    }
}
