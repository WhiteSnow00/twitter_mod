import java.util.List;
import java.util.AbstractCollection;
import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wcy<E> extends uey<Object>
{
    public final int C0;
    public int D0;
    public final ndy<E> E0;
    
    public wcy(final ndy<E> e0, final int d0) {
        final int size = ((AbstractCollection)e0).size();
        if (d0 >= 0 && d0 <= size) {
            this.C0 = size;
            this.D0 = d0;
            this.E0 = e0;
            return;
        }
        throw new IndexOutOfBoundsException(rqu.X(d0, size, "index"));
    }
    
    public final boolean hasNext() {
        return this.D0 < this.C0;
    }
    
    public final boolean hasPrevious() {
        return this.D0 > 0;
    }
    
    public final Object next() {
        if (this.hasNext()) {
            return ((List<Object>)this.E0).get(this.D0++);
        }
        throw new NoSuchElementException();
    }
    
    public final int nextIndex() {
        return this.D0;
    }
    
    public final Object previous() {
        if (this.hasPrevious()) {
            final int d0 = this.D0 - 1;
            this.D0 = d0;
            return this.E0.get(d0);
        }
        throw new NoSuchElementException();
    }
    
    public final int previousIndex() {
        return this.D0 - 1;
    }
}
