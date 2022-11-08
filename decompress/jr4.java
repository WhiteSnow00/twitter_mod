import java.util.Objects;
import java.util.List;
import java.util.RandomAccess;
import java.util.Iterator;
import java.util.Collection;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public class jr4<E> extends AbstractCollection<E>
{
    public final Collection<E> C0;
    public final ntk<? super E> D0;
    
    public jr4(final Collection<E> c0, final ntk<? super E> d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final boolean add(final E e) {
        j78.d(this.D0.apply((Object)e));
        return this.C0.add(e);
    }
    
    @Override
    public final boolean addAll(final Collection<? extends E> collection) {
        final Iterator<? extends E> iterator = collection.iterator();
        while (iterator.hasNext()) {
            j78.d(this.D0.apply((Object)iterator.next()));
        }
        return this.C0.addAll(collection);
    }
    
    @Override
    public final void clear() {
        final Collection<E> c0 = this.C0;
        final ntk<? super E> d0 = this.D0;
        if (c0 instanceof RandomAccess && c0 instanceof List) {
            final List list = (List)c0;
            Objects.requireNonNull(d0);
            int i = 0;
            int n = 0;
            while (i < list.size()) {
                final Object value = list.get(i);
                int n2 = n;
                if (!d0.apply(value)) {
                    if (i > n) {
                        try {
                            list.set(n, value);
                        }
                        catch (final IllegalArgumentException ex) {
                            fk7.B0(list, d0, n, i);
                            return;
                        }
                        catch (final UnsupportedOperationException ex2) {
                            fk7.B0(list, d0, n, i);
                            return;
                        }
                    }
                    n2 = n + 1;
                }
                ++i;
                n = n2;
            }
            list.subList(n, list.size()).clear();
        }
        else {
            final Iterator iterator = c0.iterator();
            Objects.requireNonNull(d0);
            while (iterator.hasNext()) {
                if (d0.apply(iterator.next())) {
                    iterator.remove();
                }
            }
        }
    }
    
    @Override
    public final boolean contains(final Object o) {
        final Collection<E> c0 = this.C0;
        Objects.requireNonNull(c0);
        boolean contains;
        try {
            contains = c0.contains(o);
        }
        catch (final ClassCastException | NullPointerException ex) {
            contains = false;
        }
        return contains && this.D0.apply(o);
    }
    
    @Override
    public final boolean containsAll(final Collection<?> collection) {
        final Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final boolean isEmpty() {
        final Collection<E> c0 = this.C0;
        final ntk<? super E> d0 = this.D0;
        final Iterator<Object> iterator = c0.iterator();
        j78.f(d0, "predicate");
        boolean b = false;
        int n = 0;
        while (true) {
            while (iterator.hasNext()) {
                if (d0.apply(iterator.next())) {
                    if (n != -1) {
                        b = true;
                    }
                    return true ^ b;
                }
                ++n;
            }
            n = -1;
            continue;
        }
    }
    
    @Override
    public final Iterator<E> iterator() {
        final Iterator<E> iterator = this.C0.iterator();
        final ntk<? super E> d0 = this.D0;
        Objects.requireNonNull(iterator);
        Objects.requireNonNull((ntk)d0);
        return (Iterator<E>)new d6e((Iterator)iterator, (ntk)d0);
    }
    
    @Override
    public final boolean remove(final Object o) {
        return this.contains(o) && this.C0.remove(o);
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        final Iterator<E> iterator = this.C0.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final E next = iterator.next();
            if (this.D0.apply((Object)next) && collection.contains(next)) {
                iterator.remove();
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        final Iterator<E> iterator = this.C0.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final E next = iterator.next();
            if (this.D0.apply((Object)next) && !collection.contains(next)) {
                iterator.remove();
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final int size() {
        final Iterator<E> iterator = this.C0.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (this.D0.apply((Object)iterator.next())) {
                ++n;
            }
        }
        return n;
    }
    
    @Override
    public final Object[] toArray() {
        return asy.o0((Iterator)this.iterator()).toArray();
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        return asy.o0((Iterator)this.iterator()).toArray(array);
    }
}
