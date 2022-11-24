import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import android.view.ViewGroup;
import android.view.View;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k8x implements Iterator<View>, koe, j$.util.Iterator
{
    public int F0;
    public final ViewGroup G0;
    
    public k8x(final ViewGroup g0) {
        this.G0 = g0;
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
        return this.F0 < this.G0.getChildCount();
    }
    
    @Override
    public final Object next() {
        final View child = this.G0.getChildAt(this.F0++);
        if (child != null) {
            return child;
        }
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public final void remove() {
        this.G0.removeViewAt(--this.F0);
    }
}
