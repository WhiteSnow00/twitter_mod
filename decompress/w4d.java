import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w4d<T> implements Set<T>, mne
{
    public int D0;
    public Object[] E0;
    
    public w4d() {
        this.E0 = new Object[16];
    }
    
    @Override
    public final boolean add(final T t) {
        czd.f((Object)t, "value");
        int e;
        if (this.D0 > 0) {
            if ((e = this.e(t)) >= 0) {
                return false;
            }
        }
        else {
            e = -1;
        }
        final int n = -(e + 1);
        final int d0 = this.D0;
        final Object[] e2 = this.E0;
        if (d0 == e2.length) {
            final Object[] e3 = new Object[e2.length * 2];
            bt0.y0(e2, e3, n + 1, n, d0);
            bt0.A0(this.E0, e3, 0, 0, n, 6);
            this.E0 = e3;
        }
        else {
            bt0.y0(e2, e2, n + 1, n, d0);
        }
        this.E0[n] = t;
        ++this.D0;
        return true;
    }
    
    @Override
    public final boolean addAll(final Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final void clear() {
        bt0.F0(this.E0, (Object)null);
        this.D0 = 0;
    }
    
    @Override
    public final boolean contains(final Object o) {
        boolean b = false;
        if (o == null) {
            return false;
        }
        if (this.e(o) >= 0) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final boolean containsAll(final Collection<?> collection) {
        czd.f((Object)collection, "elements");
        final boolean empty = collection.isEmpty();
        final boolean b = true;
        boolean b2;
        if (empty) {
            b2 = b;
        }
        else {
            final Iterator iterator = collection.iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (this.contains(iterator.next()));
            b2 = false;
        }
        return b2;
    }
    
    public final int e(final Object o) {
        int n = this.D0 - 1;
        final int identityHashCode = System.identityHashCode(o);
        int i = 0;
        while (i <= n) {
            final int n2 = i + n >>> 1;
            final T value = this.get(n2);
            final int identityHashCode2 = System.identityHashCode(value);
            if (identityHashCode2 < identityHashCode) {
                i = n2 + 1;
            }
            else if (identityHashCode2 > identityHashCode) {
                n = n2 - 1;
            }
            else {
                if (value == o) {
                    return n2;
                }
                for (int j = n2 - 1; -1 < j; --j) {
                    final Object o2 = this.E0[j];
                    if (o2 == o) {
                        return j;
                    }
                    if (System.identityHashCode(o2) != identityHashCode) {
                        break;
                    }
                }
                for (int j = n2 + 1; j < this.D0; ++j) {
                    final Object o3 = this.E0[j];
                    if (o3 == o) {
                        return j;
                    }
                    if (System.identityHashCode(o3) != identityHashCode) {
                        j = -(j + 1);
                        return j;
                    }
                }
                int j = this.D0;
                return -(j + 1);
            }
        }
        return -(i + 1);
    }
    
    public final boolean g() {
        return this.D0 > 0;
    }
    
    public final T get(final int n) {
        final Object o = this.E0[n];
        czd.d(o, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return (T)o;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.D0 == 0;
    }
    
    @Override
    public final Iterator<T> iterator() {
        return new Iterator<T>(this) {
            public int D0;
            public final w4d<T> E0;
            
            public final void forEachRemaining(final Consumer consumer) {
                Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
            }
            
            @Override
            public final void forEachRemaining(final java.util.function.Consumer consumer) {
                Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
            }
            
            @Override
            public final boolean hasNext() {
                return this.D0 < this.E0.D0;
            }
            
            @Override
            public final T next() {
                final Object o = this.E0.E0[this.D0++];
                czd.d(o, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                return (T)o;
            }
            
            @Override
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
    
    @Override
    public final boolean remove(final T t) {
        if (t == null) {
            return false;
        }
        final int e = this.e(t);
        if (e >= 0) {
            final int d0 = this.D0;
            if (e < d0 - 1) {
                final Object[] e2 = this.E0;
                bt0.y0(e2, e2, e, e + 1, d0);
            }
            final int d2 = this.D0 - 1;
            this.D0 = d2;
            this.E0[d2] = null;
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final int size() {
        return this.D0;
    }
    
    @Override
    public final Object[] toArray() {
        return jee.t0((Collection)this);
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        czd.f((Object)array, "array");
        return (T[])jee.u0((Collection)this, (Object[])array);
    }
}
