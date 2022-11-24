import java.util.Objects;
import java.util.List;
import java.util.RandomAccess;
import java.util.Iterator;
import java.util.Collection;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public class mr4<E> extends AbstractCollection<E>
{
    public final Collection<E> F0;
    public final muk<? super E> G0;
    
    public mr4(final Collection<E> f0, final muk<? super E> g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final boolean add(final E e) {
        v7q.d(this.G0.apply(e));
        return this.F0.add(e);
    }
    
    @Override
    public final boolean addAll(final Collection<? extends E> collection) {
        final Iterator<? extends E> iterator = collection.iterator();
        while (iterator.hasNext()) {
            v7q.d(this.G0.apply((Object)iterator.next()));
        }
        return this.F0.addAll(collection);
    }
    
    @Override
    public final void clear() {
        final Collection<E> f0 = this.F0;
        final muk<? super E> g0 = this.G0;
        if (f0 instanceof RandomAccess && f0 instanceof List) {
            final List list = (List)f0;
            Objects.requireNonNull(g0);
            int i = 0;
            int n = 0;
            while (i < list.size()) {
                final Object value = list.get(i);
                int n2 = n;
                if (!g0.apply(value)) {
                    if (i > n) {
                        try {
                            list.set(n, value);
                        }
                        catch (final IllegalArgumentException ex) {
                            tpz.S(list, g0, n, i);
                            return;
                        }
                        catch (final UnsupportedOperationException ex2) {
                            tpz.S(list, g0, n, i);
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
            final Iterator iterator = f0.iterator();
            Objects.requireNonNull(g0);
            while (iterator.hasNext()) {
                if (g0.apply(iterator.next())) {
                    iterator.remove();
                }
            }
        }
    }
    
    @Override
    public final boolean contains(final Object o) {
        final Collection<E> f0 = this.F0;
        Objects.requireNonNull(f0);
        boolean contains;
        try {
            contains = f0.contains(o);
        }
        catch (final ClassCastException | NullPointerException ex) {
            contains = false;
        }
        return contains && this.G0.apply((Object)o);
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
        final Collection<E> f0 = this.F0;
        final muk<? super E> g0 = this.G0;
        final Iterator<Object> iterator = f0.iterator();
        v7q.f((Object)g0, (Object)"predicate");
        boolean b = false;
        int n = 0;
        while (true) {
            while (iterator.hasNext()) {
                if (g0.apply(iterator.next())) {
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
        final Iterator<E> iterator = this.F0.iterator();
        final muk<? super E> g0 = this.G0;
        Objects.requireNonNull(iterator);
        Objects.requireNonNull(g0);
        return (Iterator<E>)new l6e(iterator, g0);
    }
    
    @Override
    public final boolean remove(final Object o) {
        return this.contains(o) && this.F0.remove(o);
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        final Iterator<E> iterator = this.F0.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final E next = iterator.next();
            if (this.G0.apply(next) && collection.contains(next)) {
                iterator.remove();
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        final Iterator<E> iterator = this.F0.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final E next = iterator.next();
            if (this.G0.apply(next) && !collection.contains(next)) {
                iterator.remove();
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final int size() {
        final Iterator<E> iterator = this.F0.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (this.G0.apply(iterator.next())) {
                ++n;
            }
        }
        return n;
    }
    
    @Override
    public final Object[] toArray() {
        return ak1.A((Iterator)this.iterator()).toArray();
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        return ak1.A((Iterator)this.iterator()).toArray(array);
    }
}
