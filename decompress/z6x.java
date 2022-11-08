import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import android.view.ViewGroup;
import android.view.View;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z6x implements Iterator<View>, coe, j$.util.Iterator
{
    public int C0;
    public final /* synthetic */ ViewGroup D0;
    
    public z6x(final ViewGroup d0) {
        this.D0 = d0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.C0 < this.D0.getChildCount();
    }
    
    @Override
    public final Object next() {
        final View child = this.D0.getChildAt(this.C0++);
        if (child != null) {
            return child;
        }
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public final void remove() {
        this.D0.removeViewAt(--this.C0);
    }
}
