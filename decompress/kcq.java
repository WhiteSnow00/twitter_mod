import java.util.Iterator;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcq<E> extends led<E>
{
    public final transient E F0;
    
    public kcq(final E f0) {
        Objects.requireNonNull(f0);
        this.F0 = f0;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.F0.equals(o);
    }
    
    @Override
    public final aed<E> e() {
        return (aed<E>)aed.t((Object)this.F0);
    }
    
    @Override
    public final int g(final Object[] array, final int n) {
        array[n] = this.F0;
        return n + 1;
    }
    
    @Override
    public final int hashCode() {
        return this.F0.hashCode();
    }
    
    @Override
    public final boolean m() {
        return false;
    }
    
    @Override
    public final ozv<E> n() {
        return (ozv<E>)new e6e(this.F0);
    }
    
    @Override
    public final int size() {
        return 1;
    }
    
    @Override
    public final String toString() {
        final String string = this.F0.toString();
        final StringBuilder sb = new StringBuilder(dia.o(string, 2));
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
