import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import j$.util.Iterator;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lc<E> implements ListIterator<E>, koe, j$.util.Iterator
{
    public int F0;
    public int G0;
    
    public lc(final int f0, final int g0) {
        this.F0 = f0;
        this.G0 = g0;
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
    
    public final void forEachRemaining(final Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
    }
    
    public final void forEachRemaining(final java.util.function.Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
    }
    
    @Override
    public final boolean hasNext() {
        return this.F0 < this.G0;
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.F0 > 0;
    }
    
    @Override
    public final int nextIndex() {
        return this.F0;
    }
    
    @Override
    public final int previousIndex() {
        return this.F0 - 1;
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
