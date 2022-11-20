import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import android.view.ViewGroup;
import android.view.View;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s7x implements Iterator<View>, mne, j$.util.Iterator
{
    public int D0;
    public final ViewGroup E0;
    
    public s7x(final ViewGroup e0) {
        this.E0 = e0;
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
        return this.D0 < this.E0.getChildCount();
    }
    
    @Override
    public final Object next() {
        final View child = this.E0.getChildAt(this.D0++);
        if (child != null) {
            return child;
        }
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public final void remove() {
        this.E0.removeViewAt(--this.D0);
    }
}
