import java.util.Comparator;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pz5<T> extends apj<T> implements Serializable
{
    public final Comparator<T> F0;
    
    public pz5(final Comparator<T> f0) {
        this.F0 = f0;
    }
    
    public final int compare(final T t, final T t2) {
        return this.F0.compare(t, t2);
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof pz5 && this.F0.equals(((pz5)o).F0));
    }
    
    public final int hashCode() {
        return this.F0.hashCode();
    }
    
    public final String toString() {
        return this.F0.toString();
    }
}
