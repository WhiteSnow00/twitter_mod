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

public abstract class jey<E> extends bfy<E> implements List<E>, RandomAccess
{
    public static final cjy<Object> D0;
    
    static {
        jey.D0 = new rfy((jey)kgy.G0, 0);
    }
    
    public static <E> jey<E> n(final Object[] array, final int n) {
        if (n == 0) {
            return kgy.G0;
        }
        return new kgy<E>(array, n);
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
        if (value == this) {
            return true;
        }
        if (value instanceof List) {
            final List list = (List)value;
            final int size = this.size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; ++i) {
                        if (!rqu.V((Object)this.get(i), list.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
                final int size2 = ((AbstractCollection)this).size();
                final Iterator iterator = list.iterator();
                int j = 0;
                while (j < size2) {
                    if (!iterator.hasNext()) {
                        return false;
                    }
                    value = this.get(j);
                    ++j;
                    if (rqu.V(value, iterator.next())) {
                        continue;
                    }
                    return false;
                }
                if (!iterator.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final niy<E> g() {
        return (cjy)this.listIterator();
    }
    
    public final int hashCode() {
        final int size = ((AbstractCollection)this).size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = ~(~(this.get(i).hashCode() + n * 31));
        }
        return n;
    }
    
    public final int indexOf(@NullableDecl final Object o) {
        if (o == null) {
            return -1;
        }
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (o.equals(this.get(i))) {
                return i;
            }
        }
        return -1;
    }
    
    public final int lastIndexOf(@NullableDecl final Object o) {
        if (o == null) {
            return -1;
        }
        for (int i = this.size() - 1; i >= 0; --i) {
            if (o.equals(this.get(i))) {
                return i;
            }
        }
        return -1;
    }
    
    public final /* synthetic */ ListIterator listIterator() {
        return this.listIterator(0);
    }
    
    public final ListIterator listIterator(final int n) {
        final int size = ((AbstractCollection)this).size();
        if (n < 0 || n > size) {
            throw new IndexOutOfBoundsException(tdy.c1(n, size, "index"));
        }
        if (((AbstractCollection)this).isEmpty()) {
            return (ListIterator)jey.D0;
        }
        return (ListIterator)new rfy(this, n);
    }
    
    public jey<E> m(final int n, int n2) {
        tdy.d1(n, n2, ((AbstractCollection)this).size());
        n2 -= n;
        if (n2 == ((AbstractCollection)this).size()) {
            return this;
        }
        if (n2 == 0) {
            return kgy.G0;
        }
        return new kfy(this, n, n2);
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
