import java.util.List;
import java.util.AbstractCollection;
import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggy<E> extends tjy<Object>
{
    public final int D0;
    public int E0;
    public final yey<E> F0;
    
    public ggy(final yey<E> f0, final int e0) {
        final int size = ((AbstractCollection)f0).size();
        if (e0 >= 0 && e0 <= size) {
            this.D0 = size;
            this.E0 = e0;
            this.F0 = f0;
            return;
        }
        throw new IndexOutOfBoundsException(g63.h0(e0, size, "index"));
    }
    
    public final boolean hasNext() {
        return this.E0 < this.D0;
    }
    
    public final boolean hasPrevious() {
        return this.E0 > 0;
    }
    
    public final Object next() {
        if (this.hasNext()) {
            return ((List<Object>)this.F0).get(this.E0++);
        }
        throw new NoSuchElementException();
    }
    
    public final int nextIndex() {
        return this.E0;
    }
    
    public final Object previous() {
        if (this.hasPrevious()) {
            final int e0 = this.E0 - 1;
            this.E0 = e0;
            return this.F0.get(e0);
        }
        throw new NoSuchElementException();
    }
    
    public final int previousIndex() {
        return this.E0 - 1;
    }
}
