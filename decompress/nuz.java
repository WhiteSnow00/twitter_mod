import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nuz<E> extends slz<E> implements List<E>, RandomAccess
{
    public static final byz<Object> G0;
    
    static {
        nuz.G0 = new lrz((nuz<E>)cwz.J0, 0);
    }
    
    @Deprecated
    @Override
    public final void add(final int n, final E e) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean addAll(final int n, final Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    public int e(final Object[] array) {
        final int size = this.size();
        for (int i = 0; i < size; ++i) {
            array[i] = this.get(i);
        }
        return size;
    }
    
    @Override
    public final boolean equals(Object value) {
        final boolean b = true;
        boolean b2;
        if (value == this) {
            b2 = b;
        }
        else {
            if (value instanceof List) {
                final List list = (List)value;
                final int size = this.size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        int n = 0;
                        while (true) {
                            b2 = b;
                            if (n >= size) {
                                return b2;
                            }
                            final E value2 = this.get(n);
                            value = list.get(n);
                            if (value2 != value && (value2 == null || !value2.equals(value))) {
                                break;
                            }
                            ++n;
                        }
                    }
                    else {
                        final byz<E> m = this.m(0);
                        final Iterator iterator = list.iterator();
                        Object next;
                        Object next2;
                        do {
                            final lrz lrz = (lrz)m;
                            if (lrz.hasNext()) {
                                if (!iterator.hasNext()) {
                                    break;
                                }
                                next = lrz.next();
                                next2 = iterator.next();
                            }
                            else {
                                if (!iterator.hasNext()) {
                                    b2 = b;
                                    return b2;
                                }
                                break;
                            }
                        } while (next == next2 || (next != null && next.equals(next2)));
                    }
                }
            }
            b2 = false;
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        final int size = this.size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = n * 31 + this.get(i).hashCode();
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        final int n = -1;
        if (o == null) {
            return -1;
        }
        final int size = this.size();
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= size) {
                break;
            }
            if (o.equals(this.get(n2))) {
                n3 = n2;
                break;
            }
            ++n2;
        }
        return n3;
    }
    
    @Override
    public final /* bridge */ Iterator iterator() {
        return (Iterator)this.m(0);
    }
    
    public nuz<E> k(final int n, int n2) {
        iuk.b1(n, n2, this.size());
        n2 -= n;
        if (n2 == this.size()) {
            return this;
        }
        if (n2 == 0) {
            return (nuz<E>)cwz.J0;
        }
        return (nuz<E>)new atz(this, n, n2);
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        final int n = -1;
        if (o == null) {
            return -1;
        }
        int n2 = this.size() - 1;
        int n3;
        while (true) {
            n3 = n;
            if (n2 < 0) {
                break;
            }
            if (o.equals(this.get(n2))) {
                n3 = n2;
                break;
            }
            --n2;
        }
        return n3;
    }
    
    @Override
    public final /* bridge */ ListIterator listIterator() {
        return (ListIterator)this.m(0);
    }
    
    @Override
    public final /* bridge */ ListIterator listIterator(final int n) {
        return (ListIterator)this.m(n);
    }
    
    public final byz<E> m(final int n) {
        final int size = this.size();
        if (n < 0 || n > size) {
            throw new IndexOutOfBoundsException(iuk.c1(n, size, "index"));
        }
        if (this.isEmpty()) {
            return nuz.G0;
        }
        return (byz<E>)new lrz((nuz<Object>)this, n);
    }
    
    @Deprecated
    @Override
    public final E remove(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final E set(final int n, final E e) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public /* bridge */ List subList(final int n, final int n2) {
        return this.k(n, n2);
    }
}
