import j$.util.Iterator$_CC;
import j$.util.function.IntFunction$VivifiedWrapper;
import j$.util.function.IntFunction;
import j$.util.Spliterator$Wrapper;
import j$.util.List$_CC;
import j$.util.Spliterator;
import java.util.Comparator;
import j$.util.function.UnaryOperator$VivifiedWrapper;
import j$.util.function.UnaryOperator;
import j$.util.function.Predicate$VivifiedWrapper;
import j$.util.function.Predicate;
import j$.util.stream.Stream$Wrapper;
import j$.util.Collection$_CC;
import j$.util.stream.Stream;
import java.util.ListIterator;
import java.util.Arrays;
import j$.util.function.Consumer$VivifiedWrapper;
import j$.lang.Iterable$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class plc<T> implements List<T>, coe, j$.util.List
{
    public Object[] C0;
    public long[] D0;
    public int E0;
    public int F0;
    
    public plc() {
        this.C0 = new Object[16];
        this.D0 = new long[16];
        this.E0 = -1;
    }
    
    @Override
    public final void add(final int n, final T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean add(final T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean addAll(final int n, final Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean addAll(final Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final void clear() {
        this.E0 = -1;
        this.j();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    @Override
    public final boolean containsAll(final Collection<?> collection) {
        zzd.f((Object)collection, "elements");
        final Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public final long e() {
        final long g = x3j.g(Float.POSITIVE_INFINITY, false);
        int n = this.E0 + 1;
        final int s = tdy.S((List)this);
        long n2 = g;
        if (n <= s) {
            long n3 = g;
            while (true) {
                final long n4 = this.D0[n];
                long n5 = n3;
                if (h6q.p(n4, n3) < 0) {
                    n5 = n4;
                }
                if (h6q.u(n5) < 0.0f && h6q.G(n5)) {
                    return n5;
                }
                n2 = n5;
                if (n == s) {
                    break;
                }
                ++n;
                n3 = n5;
            }
        }
        return n2;
    }
    
    public final void g(final T t, final float n, final boolean b, final otb<oyv> otb) {
        final int e0 = this.E0;
        final int e2 = e0 + 1;
        this.E0 = e2;
        final Object[] c0 = this.C0;
        if (e2 >= c0.length) {
            final int n2 = c0.length + 16;
            final Object[] copy = Arrays.copyOf(c0, n2);
            zzd.e((Object)copy, "copyOf(this, newSize)");
            this.C0 = copy;
            final long[] copy2 = Arrays.copyOf(this.D0, n2);
            zzd.e((Object)copy2, "copyOf(this, newSize)");
            this.D0 = copy2;
        }
        final Object[] c2 = this.C0;
        final int e3 = this.E0;
        c2[e3] = t;
        this.D0[e3] = x3j.g(n, b);
        this.j();
        otb.invoke();
        this.E0 = e0;
    }
    
    @Override
    public final T get(final int n) {
        return (T)this.C0[n];
    }
    
    public final boolean i(final float n, final boolean b) {
        final int e0 = this.E0;
        final int s = tdy.S((List)this);
        final boolean b2 = true;
        return e0 == s || (h6q.p(this.e(), x3j.g(n, b)) > 0 && b2);
    }
    
    @Override
    public final int indexOf(final Object o) {
        final int s = tdy.S((List)this);
        if (s >= 0) {
            int n;
            for (n = 0; !zzd.a(this.C0[n], o); ++n) {
                if (n == s) {
                    return -1;
                }
            }
            return n;
        }
        return -1;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.F0 == 0;
    }
    
    @Override
    public final Iterator<T> iterator() {
        return new a(0, 7);
    }
    
    public final void j() {
        int n = this.E0 + 1;
        final int s = tdy.S((List)this);
        if (n <= s) {
            while (true) {
                this.C0[n] = null;
                if (n == s) {
                    break;
                }
                ++n;
            }
        }
        this.F0 = this.E0 + 1;
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        for (int s = tdy.S((List)this); -1 < s; --s) {
            if (zzd.a(this.C0[s], o)) {
                return s;
            }
        }
        return -1;
    }
    
    @Override
    public final ListIterator<T> listIterator() {
        return new a(0, 7);
    }
    
    @Override
    public final ListIterator<T> listIterator(final int n) {
        return new a(n, 6);
    }
    
    @Override
    public final T remove(final int n) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void replaceAll(final UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final T set(final int n, final T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final int size() {
        return this.F0;
    }
    
    @Override
    public final void sort(final Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final List<T> subList(final int n, final int n2) {
        return new b(n, n2);
    }
    
    @Override
    public final Object[] toArray() {
        return bfe.A((Collection)this);
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        zzd.f((Object)array, "array");
        return (T[])bfe.B((Collection)this, (Object[])array);
    }
    
    public final class a implements ListIterator<T>, coe, j$.util.Iterator
    {
        public int C0;
        public final int D0;
        public final int E0;
        
        public a(final plc plc, int n, int f0) {
            if ((f0 & 0x1) != 0x0) {
                n = 0;
            }
            if ((f0 & 0x4) != 0x0) {
                f0 = plc.F0;
            }
            else {
                f0 = 0;
            }
            this(n, 0, f0);
        }
        
        public a(final int c0, final int d0, final int e0) {
            this.C0 = c0;
            this.D0 = d0;
            this.E0 = e0;
        }
        
        @Override
        public final void add(final T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean hasNext() {
            return this.C0 < this.E0;
        }
        
        @Override
        public final boolean hasPrevious() {
            return this.C0 > this.D0;
        }
        
        @Override
        public final T next() {
            return (T)plc.this.C0[this.C0++];
        }
        
        @Override
        public final int nextIndex() {
            return this.C0 - this.D0;
        }
        
        @Override
        public final T previous() {
            final Object[] c0 = plc.this.C0;
            final int c2 = this.C0 - 1;
            this.C0 = c2;
            return (T)c0[c2];
        }
        
        @Override
        public final int previousIndex() {
            return this.C0 - this.D0 - 1;
        }
        
        @Override
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final void set(final T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
    
    public final class b implements List<T>, coe, j$.util.List
    {
        public final int C0;
        public final int D0;
        
        public b(final int c0, final int d0) {
            this.C0 = c0;
            this.D0 = d0;
        }
        
        @Override
        public final void add(final int n, final T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean add(final T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean addAll(final int n, final Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean addAll(final Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean contains(final Object o) {
            return this.indexOf(o) != -1;
        }
        
        @Override
        public final boolean containsAll(final Collection<?> collection) {
            zzd.f((Object)collection, "elements");
            final Iterator<Object> iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!this.contains(iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public final T get(final int n) {
            return (T)plc.this.C0[n + this.C0];
        }
        
        @Override
        public final int indexOf(final Object o) {
            int c0 = this.C0;
            final int d0 = this.D0;
            if (c0 <= d0) {
                while (!zzd.a(plc.this.C0[c0], o)) {
                    if (c0 == d0) {
                        return -1;
                    }
                    ++c0;
                }
                return c0 - this.C0;
            }
            return -1;
        }
        
        @Override
        public final boolean isEmpty() {
            return this.D0 - this.C0 == 0;
        }
        
        @Override
        public final Iterator<T> iterator() {
            final plc<T> e0 = plc.this;
            final int c0 = this.C0;
            return new a(c0, c0, this.D0);
        }
        
        @Override
        public final int lastIndexOf(final Object o) {
            int d0 = this.D0;
            final int c0 = this.C0;
            if (c0 <= d0) {
                while (!zzd.a(plc.this.C0[d0], o)) {
                    if (d0 == c0) {
                        return -1;
                    }
                    --d0;
                }
                return d0 - this.C0;
            }
            return -1;
        }
        
        @Override
        public final ListIterator<T> listIterator() {
            final plc<T> e0 = plc.this;
            final int c0 = this.C0;
            return new a(c0, c0, this.D0);
        }
        
        @Override
        public final ListIterator<T> listIterator(final int n) {
            final plc<T> e0 = plc.this;
            final int c0 = this.C0;
            return new a(n + c0, c0, this.D0);
        }
        
        @Override
        public final T remove(final int n) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean remove(final Object o) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean removeAll(final Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        public final void replaceAll(final UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean retainAll(final Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final T set(final int n, final T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final int size() {
            return this.D0 - this.C0;
        }
        
        @Override
        public final void sort(final Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final List<T> subList(final int n, final int n2) {
            final plc<T> e0 = plc.this;
            final int c0 = this.C0;
            return new b(n + c0, c0 + n2);
        }
        
        @Override
        public final Object[] toArray() {
            return bfe.A((Collection)this);
        }
        
        @Override
        public final <T> T[] toArray(final T[] array) {
            zzd.f((Object)array, "array");
            return (T[])bfe.B((Collection)this, (Object[])array);
        }
    }
}
