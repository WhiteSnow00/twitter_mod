import java.util.NoSuchElementException;
import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class zkd<T> implements Iterator<T>, j$.util.Iterator
{
    public int F0;
    public int G0;
    public boolean H0;
    
    public zkd(final int f0) {
        this.F0 = f0;
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
        return this.G0 < this.F0;
    }
    
    @Override
    public final T next() {
        if (this.hasNext()) {
            final T a = this.a(this.G0);
            ++this.G0;
            this.H0 = true;
            return a;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        if (this.H0) {
            this.b(--this.G0);
            --this.F0;
            this.H0 = false;
            return;
        }
        throw new IllegalStateException();
    }
}
