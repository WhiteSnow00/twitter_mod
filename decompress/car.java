import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class car<K, V> extends bar<K, V> implements Iterator<K>, koe, j$.util.Iterator
{
    public car(final ljq<K, V> ljq, final Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        e0e.f((Object)ljq, "map");
        e0e.f((Object)iterator, "iterator");
        super((ljq)ljq, (Iterator)iterator);
    }
    
    public final void forEachRemaining(final Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
    }
    
    public final void forEachRemaining(final java.util.function.Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
    }
    
    public final K next() {
        final Map.Entry j0 = super.J0;
        if (j0 != null) {
            this.a();
            return j0.getKey();
        }
        throw new IllegalStateException();
    }
}
