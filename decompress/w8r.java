import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import j$.util.Iterator;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w8r<T> implements ListIterator<T>, mne, j$.util.Iterator
{
    public final niq<T> D0;
    public int E0;
    public int F0;
    
    public w8r(final niq<T> d0, final int n) {
        czd.f((Object)d0, "list");
        this.D0 = d0;
        this.E0 = n - 1;
        this.F0 = d0.e();
    }
    
    public final void a() {
        if (this.D0.e() == this.F0) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final void add(final T t) {
        this.a();
        this.D0.add(this.E0 + 1, (Object)t);
        ++this.E0;
        this.F0 = this.D0.e();
    }
    
    public final void forEachRemaining(final Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
    }
    
    public final void forEachRemaining(final java.util.function.Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
    }
    
    @Override
    public final boolean hasNext() {
        final int e0 = this.E0;
        final int size = this.D0.size();
        boolean b = true;
        if (e0 >= size - 1) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.E0 >= 0;
    }
    
    @Override
    public final T next() {
        this.a();
        final int e0 = this.E0 + 1;
        oiq.b(e0, this.D0.size());
        final Object value = this.D0.get(e0);
        this.E0 = e0;
        return (T)value;
    }
    
    @Override
    public final int nextIndex() {
        return this.E0 + 1;
    }
    
    @Override
    public final T previous() {
        this.a();
        oiq.b(this.E0, this.D0.size());
        final Object value = this.D0.get(this.E0);
        --this.E0;
        return (T)value;
    }
    
    @Override
    public final int previousIndex() {
        return this.E0;
    }
    
    @Override
    public final void remove() {
        this.a();
        this.D0.remove(this.E0);
        --this.E0;
        this.F0 = this.D0.e();
    }
    
    @Override
    public final void set(final T t) {
        this.a();
        this.D0.set(this.E0, (Object)t);
        this.F0 = this.D0.e();
    }
}
