import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wak<E> implements Iterator<E>, koe, j$.util.Iterator
{
    public Object F0;
    public final Map<E, djf> G0;
    public int H0;
    
    public wak(final Object f0, final Map<E, djf> g0) {
        e0e.f((Object)g0, "map");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void forEachRemaining(final Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
    }
    
    @Override
    public final void forEachRemaining(final java.util.function.Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
    }
    
    @Override
    public final boolean hasNext() {
        return this.H0 < this.G0.size();
    }
    
    @Override
    public final E next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        final Object f0 = this.F0;
        ++this.H0;
        final djf value = this.G0.get(f0);
        if (value != null) {
            this.F0 = value.b;
            return (E)f0;
        }
        throw new ConcurrentModificationException(ffe.n("Hash code of an element (", f0, ") has changed after it was added to the persistent set."));
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
