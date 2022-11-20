import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b9r<K, V> extends c9r<K, V> implements Iterator<Map.Entry<K, V>>, mne, j$.util.Iterator
{
    public b9r(final piq<K, V> piq, final Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        czd.f((Object)piq, "map");
        czd.f((Object)iterator, "iterator");
        super(piq, iterator);
    }
    
    public final void forEachRemaining(final Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
    }
    
    @Override
    public final void forEachRemaining(final java.util.function.Consumer consumer) {
        Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
    }
    
    @Override
    public final Object next() {
        this.a();
        if (super.G0 != null) {
            return new a9r(this);
        }
        throw new IllegalStateException();
    }
}
