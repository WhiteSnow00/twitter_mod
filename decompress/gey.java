import java.util.AbstractCollection;
import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gey<E> extends egy<Object>
{
    public final int F0;
    public int G0;
    public final xey<E> H0;
    
    public gey(final xey<E> h0, final int g0) {
        final int size = ((AbstractCollection)h0).size();
        if (g0 >= 0 && g0 <= size) {
            this.F0 = size;
            this.G0 = g0;
            this.H0 = h0;
            return;
        }
        throw new IndexOutOfBoundsException(bs4.C0(g0, size, "index"));
    }
    
    public final boolean hasNext() {
        return this.G0 < this.F0;
    }
    
    public final boolean hasPrevious() {
        return this.G0 > 0;
    }
    
    public final Object next() {
        if (this.hasNext()) {
            return this.H0.get(this.G0++);
        }
        throw new NoSuchElementException();
    }
    
    public final int nextIndex() {
        return this.G0;
    }
    
    public final Object previous() {
        if (this.hasPrevious()) {
            final int g0 = this.G0 - 1;
            this.G0 = g0;
            return this.H0.get(g0);
        }
        throw new NoSuchElementException();
    }
    
    public final int previousIndex() {
        return this.G0 - 1;
    }
}
