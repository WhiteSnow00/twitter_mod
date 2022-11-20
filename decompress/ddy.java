import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public class ddy implements Iterator, j$.util.Iterator
{
    public final Iterator D0;
    public final Collection E0;
    public final ody F0;
    
    public ddy(final ody f0) {
        this.F0 = f0;
        final Collection e0 = f0.E0;
        this.E0 = e0;
        Iterator d0;
        if (e0 instanceof List) {
            d0 = ((List)e0).listIterator();
        }
        else {
            d0 = e0.iterator();
        }
        this.D0 = d0;
    }
    
    public ddy(final ody f0, final Iterator d0) {
        this.F0 = f0;
        this.E0 = f0.E0;
        this.D0 = d0;
    }
    
    final void a() {
        this.F0.c();
        if (this.F0.E0 == this.E0) {
            return;
        }
        throw new ConcurrentModificationException();
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
        this.a();
        return this.D0.hasNext();
    }
    
    @Override
    public final Object next() {
        this.a();
        return this.D0.next();
    }
    
    @Override
    public final void remove() {
        this.D0.remove();
        final ody f0 = this.F0;
        final ley h0 = f0.H0;
        --h0.G0;
        f0.g();
    }
}
