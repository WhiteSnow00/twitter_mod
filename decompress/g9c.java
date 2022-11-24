import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g9c implements Iterator<Object>, koe, j$.util.Iterator
{
    public final lgq F0;
    public final int G0;
    public int H0;
    public final int I0;
    
    public g9c(final lgq f0, final int h0, final int g0) {
        e0e.f((Object)f0, "table");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = f0.L0;
        if (!f0.K0) {
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
        return this.H0 < this.G0;
    }
    
    @Override
    public final Object next() {
        final lgq f0 = this.F0;
        if (f0.L0 == this.I0) {
            final int h0 = this.H0;
            this.H0 = kqe.m(f0.F0, h0) + h0;
            return new mgq(this.F0, h0, this.I0);
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
