import java.util.AbstractCollection;
import java.util.ListIterator;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class suz<E> extends kpz<E> implements List<E>, RandomAccess
{
    public static final txz<Object> D0;
    
    static {
        suz.D0 = new zqz((suz<E>)gwz.F0, 0);
    }
    
    @Deprecated
    public final void add(final int n, final E e) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    public final boolean addAll(final int n, final Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }
    
    public final boolean contains(@NullableDecl final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    public int e(final Object[] array) {
        final int size = ((AbstractCollection)this).size();
        for (int i = 0; i < size; ++i) {
            array[i] = this.get(i);
        }
        return size;
    }
    
    public final boolean equals(@NullableDecl Object value) {
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
                            value = this.get(n);
                            final Object value2 = list.get(n);
                            if (value != value2 && (value == null || !value.equals(value2))) {
                                break;
                            }
                            ++n;
                        }
                    }
                    else {
                        final txz<E> m = this.m(0);
                        final Iterator iterator = list.iterator();
                        Object next;
                        Object next2;
                        do {
                            final zqz zqz = (zqz)m;
                            if (zqz.hasNext()) {
                                if (!iterator.hasNext()) {
                                    break;
                                }
                                next = zqz.next();
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
    
    public final int hashCode() {
        final int size = ((AbstractCollection)this).size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = n * 31 + this.get(i).hashCode();
        }
        return n;
    }
    
    public final int indexOf(@NullableDecl final Object o) {
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
    
    public suz<E> l(final int n, int n2) {
        jgw.B0(n, n2, ((AbstractCollection)this).size());
        n2 -= n;
        if (n2 == ((AbstractCollection)this).size()) {
            return this;
        }
        if (n2 == 0) {
            return (suz<E>)gwz.F0;
        }
        return (suz<E>)new dtz(this, n, n2);
    }
    
    public final int lastIndexOf(@NullableDecl final Object o) {
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
    
    public final txz<E> m(final int n) {
        final int size = ((AbstractCollection)this).size();
        if (n < 0 || n > size) {
            throw new IndexOutOfBoundsException(jgw.D0(n, size, "index"));
        }
        if (((AbstractCollection)this).isEmpty()) {
            return suz.D0;
        }
        return (txz<E>)new zqz((suz<Object>)this, n);
    }
    
    @Deprecated
    public final E remove(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    public final E set(final int n, final E e) {
        throw new UnsupportedOperationException();
    }
}
