import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Objects;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class toy implements Iterator, j$.util.Iterator
{
    public final /* synthetic */ int C0;
    public final Iterator D0;
    
    public toy(final Iterator iterator, final int c0) {
        this.C0 = c0;
        if (c0 != 1) {
            Objects.requireNonNull(iterator);
            this.D0 = iterator;
            return;
        }
        Objects.requireNonNull(iterator);
        this.D0 = iterator;
    }
    
    public abstract Object a(final Object p0);
    
    public abstract Object b(final Object p0);
    
    @Override
    public final boolean hasNext() {
        switch (this.C0) {
            default: {
                return this.D0.hasNext();
            }
            case 0: {
                return this.D0.hasNext();
            }
        }
    }
    
    @Override
    public final Object next() {
        switch (this.C0) {
            default: {
                return this.a(this.D0.next());
            }
            case 0: {
                return this.b(this.D0.next());
            }
        }
    }
    
    @Override
    public final void remove() {
        switch (this.C0) {
            default: {
                this.D0.remove();
                return;
            }
            case 0: {
                this.D0.remove();
            }
        }
    }
}
