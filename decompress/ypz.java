import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ypz<E> extends qwz<Object>
{
    public final int C0;
    public int D0;
    public final btz<E> E0;
    
    public ypz(final btz<E> e0, final int d0) {
        final int size = e0.size();
        if (d0 >= 0 && d0 <= size) {
            this.C0 = size;
            this.D0 = d0;
            this.E0 = e0;
            return;
        }
        throw new IndexOutOfBoundsException(wvz.v(d0, size, "index"));
    }
    
    public final boolean hasNext() {
        return this.D0 < this.C0;
    }
    
    public final boolean hasPrevious() {
        return this.D0 > 0;
    }
    
    public final Object next() {
        if (this.hasNext()) {
            return this.E0.get(this.D0++);
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
