import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rfq implements Iterator<Object>, mne, j$.util.Iterator
{
    public int D0;
    public final int E0;
    public final qfq F0;
    
    public rfq(final int d0, final int e0, final qfq f0) {
        this.E0 = e0;
        this.F0 = f0;
        this.D0 = d0;
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
        return this.D0 < this.E0;
    }
    
    @Override
    public final Object next() {
        Object o;
        if (this.hasNext()) {
            final qfq f0 = this.F0;
            o = f0.c[f0.h(this.D0++)];
        }
        else {
            o = null;
        }
        return o;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
