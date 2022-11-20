import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e8c implements Iterator<Object>, mne, j$.util.Iterator
{
    public final ofq D0;
    public final int E0;
    public int F0;
    public final int G0;
    
    public e8c(final ofq d0, final int f0, final int e0) {
        czd.f((Object)d0, "table");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = d0.J0;
        if (!d0.I0) {
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
        return this.F0 < this.E0;
    }
    
    @Override
    public final Object next() {
        final ofq d0 = this.D0;
        if (d0.J0 == this.G0) {
            final int f0 = this.F0;
            this.F0 = lp.i(d0.D0, f0) + f0;
            return new pfq(this.D0, f0, this.G0);
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
