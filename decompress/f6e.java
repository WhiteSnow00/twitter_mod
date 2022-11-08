import java.util.NoSuchElementException;
import java.util.ArrayDeque;
import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Deque;
import java.util.Objects;
import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f6e
{
    public static <T> boolean a(final Collection<T> collection, final Iterator<? extends T> iterator) {
        Objects.requireNonNull(iterator);
        boolean b = false;
        while (iterator.hasNext()) {
            b |= collection.add(iterator.next());
        }
        return b;
    }
    
    public static final class b<T> implements Iterator<T>, j$.util.Iterator
    {
        public Iterator<? extends T> C0;
        public Iterator<? extends T> D0;
        public Iterator<? extends Iterator<? extends T>> E0;
        public Deque<Iterator<? extends Iterator<? extends T>>> F0;
        
        public b(final Iterator<? extends Iterator<? extends T>> e0) {
            this.D0 = (Iterator<? extends T>)f6e$a.G0;
            this.E0 = e0;
        }
        
        @Override
        public final boolean hasNext() {
            while (true) {
                final Iterator<? extends T> d0 = this.D0;
                Objects.requireNonNull(d0);
                if (d0.hasNext()) {
                    return true;
                }
                Iterator<? extends Iterator<? extends T>> e2;
                while (true) {
                    final Iterator<? extends Iterator<? extends T>> e0 = this.E0;
                    if (e0 != null && e0.hasNext()) {
                        e2 = this.E0;
                        break;
                    }
                    final ArrayDeque f0 = this.F0;
                    if (f0 == null || f0.isEmpty()) {
                        e2 = null;
                        break;
                    }
                    this.E0 = this.F0.removeFirst();
                }
                this.E0 = e2;
                if (e2 == null) {
                    return false;
                }
                final Iterator d2 = (Iterator)e2.next();
                this.D0 = d2;
                if (!(d2 instanceof b)) {
                    continue;
                }
                final b b = (b)d2;
                this.D0 = b.D0;
                if (this.F0 == null) {
                    this.F0 = new ArrayDeque();
                }
                this.F0.addFirst(this.E0);
                if (b.F0 != null) {
                    while (!b.F0.isEmpty()) {
                        this.F0.addFirst(b.F0.removeLast());
                    }
                }
                this.E0 = b.E0;
            }
        }
        
        @Override
        public final T next() {
            if (this.hasNext()) {
                final Iterator<? extends T> d0 = this.D0;
                this.C0 = d0;
                return (T)d0.next();
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public final void remove() {
            final Iterator<? extends T> c0 = this.C0;
            if (c0 != null) {
                c0.remove();
                this.C0 = null;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }
    
    public enum c implements Iterator<Object>, j$.util.Iterator
    {
        C0;
        
        @Override
        public final boolean hasNext() {
            return false;
        }
        
        @Override
        public final Object next() {
            throw new NoSuchElementException();
        }
        
        @Override
        public final void remove() {
            j78.i(false);
        }
    }
}
