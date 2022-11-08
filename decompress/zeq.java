import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zeq implements Iterator<Object>, coe, j$.util.Iterator
{
    public int C0;
    public final /* synthetic */ int D0;
    public final /* synthetic */ yeq E0;
    
    public zeq(final int c0, final int d0, final yeq e0) {
        this.D0 = d0;
        this.E0 = e0;
        this.C0 = c0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.C0 < this.D0;
    }
    
    @Override
    public final Object next() {
        Object o;
        if (this.hasNext()) {
            final yeq e0 = this.E0;
            o = e0.c[e0.h(this.C0++)];
        }
        else {
            o = null;
        }
        return o;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
