import android.os.BaseBundle;
import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fgy implements Iterator, j$.util.Iterator
{
    public final Iterator D0;
    
    public fgy(final kgy kgy) {
        this.D0 = ((BaseBundle)kgy.D0).keySet().iterator();
    }
    
    public final String a() {
        return this.D0.next();
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
        return this.a();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
