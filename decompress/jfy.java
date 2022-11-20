import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jfy<E> implements ListIterator<E>, Iterator<Object>, j$.util.Iterator
{
    @Deprecated
    @Override
    public final void add(final E e) {
        throw new UnsupportedOperationException();
    }
    
    public final void forEachRemaining(final Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
    }
    
    @Override
    public final void forEachRemaining(final java.util.function.Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final void set(final E e) {
        throw new UnsupportedOperationException();
    }
}
