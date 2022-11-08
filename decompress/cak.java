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

public final class cak<E> implements Iterator<E>, coe, j$.util.Iterator
{
    public Object C0;
    public final Map<E, wif> D0;
    public int E0;
    
    public cak(final Object c0, final Map<E, wif> d0) {
        zzd.f((Object)d0, "map");
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.E0 < this.D0.size();
    }
    
    @Override
    public final E next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        final Object c0 = this.C0;
        ++this.E0;
        final wif value = this.D0.get(c0);
        if (value != null) {
            this.C0 = value.b;
            return (E)c0;
        }
        throw new ConcurrentModificationException(mag.j("Hash code of an element (", c0, ") has changed after it was added to the persistent set."));
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
