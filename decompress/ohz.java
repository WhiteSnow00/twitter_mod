import java.util.NoSuchElementException;
import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import j$.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ohz implements j$.util.Iterator, Iterator
{
    public final int F0;
    
    public ohz(final int f0) {
        this.F0 = f0;
    }
    
    public abstract Object a();
    
    public abstract byte b();
    
    public final void forEachRemaining(final Consumer consumer) {
        switch (this.F0) {
            default: {
                Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
                return;
            }
            case 0: {
                Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
            }
        }
    }
    
    public final void forEachRemaining(final java.util.function.Consumer consumer) {
        switch (this.F0) {
            default: {
                this.forEachRemaining(Consumer$VivifiedWrapper.convert(consumer));
            }
        }
    }
    
    public final Object next() {
        switch (this.F0) {
            default: {
                if (this.hasNext()) {
                    return this.a();
                }
                throw new NoSuchElementException();
            }
            case 0: {
                return this.b();
            }
        }
    }
    
    public final void remove() {
        switch (this.F0) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 0: {
                throw new UnsupportedOperationException();
            }
        }
    }
}
