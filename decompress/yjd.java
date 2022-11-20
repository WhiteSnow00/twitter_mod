import java.util.NoSuchElementException;
import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class yjd<T> implements Iterator<T>, j$.util.Iterator
{
    public int D0;
    public int E0;
    public boolean F0;
    
    public yjd(final int d0) {
        this.D0 = d0;
    }
    
    public abstract T a(final int p0);
    
    public abstract void b(final int p0);
    
    public final void forEachRemaining(final Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
    }
    
    @Override
    public final void forEachRemaining(final java.util.function.Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
    }
    
    @Override
    public final boolean hasNext() {
        return this.E0 < this.D0;
    }
    
    @Override
    public final T next() {
        if (this.hasNext()) {
            final T a = this.a(this.E0);
            ++this.E0;
            this.F0 = true;
            return a;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        if (this.F0) {
            this.b(--this.E0);
            --this.D0;
            this.F0 = false;
            return;
        }
        throw new IllegalStateException();
    }
}
