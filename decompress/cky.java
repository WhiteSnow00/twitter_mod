import java.util.Iterator;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cky<E> extends mhy<E>
{
    public final transient E I0;
    public transient int J0;
    
    public cky(final E i0) {
        Objects.requireNonNull(i0);
        this.I0 = i0;
    }
    
    public cky(final E i0, final int j0) {
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final boolean contains(final Object o) {
        return this.I0.equals(o);
    }
    
    public final int e(final Object[] array) {
        array[0] = this.I0;
        return 1;
    }
    
    public final yjy<E> g() {
        return (yjy<E>)new ghy(this.I0);
    }
    
    public final int hashCode() {
        int j0;
        if ((j0 = this.J0) == 0) {
            j0 = this.I0.hashCode();
            this.J0 = j0;
        }
        return j0;
    }
    
    public final Iterator iterator() {
        return (Iterator)this.g();
    }
    
    public final boolean n() {
        return this.J0 != 0;
    }
    
    public final int size() {
        return 1;
    }
    
    public final String toString() {
        final String string = this.I0.toString();
        final StringBuilder sb = new StringBuilder(l58.g(string, 2));
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
