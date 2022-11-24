import java.util.Iterator;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gqy<F, T> extends cqy implements ListIterator<T>
{
    public gqy(final ListIterator<? extends F> listIterator) {
        super((Iterator)listIterator, 0);
    }
    
    public final void add(final T t) {
        throw new UnsupportedOperationException();
    }
    
    public final boolean hasPrevious() {
        return ((ListIterator)super.G0).hasPrevious();
    }
    
    public final int nextIndex() {
        return ((ListIterator)super.G0).nextIndex();
    }
    
    public final T previous() {
        return (T)this.b(((ListIterator)super.G0).previous());
    }
    
    public final int previousIndex() {
        return ((ListIterator)super.G0).previousIndex();
    }
    
    public final void set(final T t) {
        throw new UnsupportedOperationException();
    }
}
