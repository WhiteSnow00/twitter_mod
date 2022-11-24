import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Objects;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class a4u<K, V, T> implements Iterator<T>, koe, j$.util.Iterator
{
    public Object[] F0;
    public int G0;
    public int H0;
    
    public a4u() {
        Objects.requireNonNull(x3u.Companion);
        this.F0 = x3u.e.d;
    }
    
    public final boolean a() {
        return this.H0 < this.G0;
    }
    
    public final boolean c() {
        return this.H0 < this.F0.length;
    }
    
    public final void d(final Object[] array, final int n) {
        e0e.f((Object)array, "buffer");
        this.e(array, n, 0);
    }
    
    public final void e(final Object[] f0, final int g0, final int h0) {
        e0e.f((Object)f0, "buffer");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
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
        return this.a();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
