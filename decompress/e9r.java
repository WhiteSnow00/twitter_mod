import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e9r<K, V> extends c9r<K, V> implements Iterator<V>, mne, j$.util.Iterator
{
    public e9r(final piq<K, V> piq, final Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
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
    public final V next() {
        final Map.Entry<? extends K, ? extends V> h0 = super.H0;
        if (h0 != null) {
            this.a();
            return (V)h0.getValue();
        }
        throw new IllegalStateException();
    }
}
