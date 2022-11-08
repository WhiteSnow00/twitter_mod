import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import j$.util.Iterator;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class mc<E> implements ListIterator<E>, coe, j$.util.Iterator
{
    public int C0;
    public int D0;
    
    public mc(final int c0, final int d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final void a() {
        if (this.hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public void add(final E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void c() {
        if (this.hasPrevious()) {
            return;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final boolean hasNext() {
        return this.C0 < this.D0;
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.C0 > 0;
    }
    
    @Override
    public final int nextIndex() {
        return this.C0;
    }
    
    @Override
    public final int previousIndex() {
        return this.C0 - 1;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void set(final E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
