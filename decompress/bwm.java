import java.util.Objects;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bwm<T> extends apj<T> implements Serializable
{
    public final apj<? super T> F0;
    
    public bwm(final apj<? super T> f0) {
        Objects.requireNonNull(f0);
        this.F0 = f0;
    }
    
    public final <S extends T> apj<S> b() {
        return (apj<S>)this.F0;
    }
    
    public final int compare(final T t, final T t2) {
        return this.F0.compare((Object)t2, (Object)t);
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof bwm && this.F0.equals(((bwm)o).F0));
    }
    
    public final int hashCode() {
        return -this.F0.hashCode();
    }
    
    public final String toString() {
        final String value = String.valueOf(this.F0);
        final StringBuilder sb = new StringBuilder(value.length() + 10);
        sb.append(value);
        sb.append(".reverse()");
        return sb.toString();
    }
}
