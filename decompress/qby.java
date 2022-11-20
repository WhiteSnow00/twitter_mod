import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qby implements Iterator<Map.Entry>, j$.util.Iterator
{
    public final Iterator<Map.Entry> D0;
    public Collection E0;
    public final xby F0;
    
    public qby(final xby f0) {
        this.F0 = f0;
        this.D0 = f0.F0.entrySet().iterator();
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
        return this.D0.hasNext();
    }
    
    @Override
    public final /* bridge */ Object next() {
        final Map.Entry entry = this.D0.next();
        this.E0 = (Collection)entry.getValue();
        final xby f0 = this.F0;
        final Object key = entry.getKey();
        return new nky(key, (Object)f0.G0.c(key, (Collection)entry.getValue()));
    }
    
    @Override
    public final void remove() {
        gmw.g0(this.E0 != null, (Object)"no calls to next() since the last call to remove()");
        this.D0.remove();
        final ley g0 = this.F0.G0;
        g0.G0 -= this.E0.size();
        this.E0.clear();
        this.E0 = null;
    }
}
