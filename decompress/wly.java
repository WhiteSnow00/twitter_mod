import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class wly<E> extends cly<E> implements List<E>, RandomAccess
{
    public static final qqy<Object> G0;
    
    static {
        wly.G0 = new nly(ppy.J0, 0);
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
    public final boolean equals(final Object o) {
        boolean b = false;
        if (o != this) {
            if (!(o instanceof List)) {
                return b;
            }
            final List list = (List)o;
            final int size = this.size();
            if (size != list.size()) {
                return b;
            }
            if (!(list instanceof RandomAccess)) {
                final qqy<E> m = this.m(0);
                final Iterator iterator = list.iterator();
                nly nly;
                do {
                    nly = (nly)m;
                    if (nly.hasNext()) {
                        if (!iterator.hasNext()) {
                            break;
                        }
                        continue;
                    }
                    else {
                        if (!iterator.hasNext()) {
                            return true;
                        }
                        break;
                    }
                } while (p0b.S(nly.next(), iterator.next()));
                return b;
            }
            for (int i = 0; i < size; ++i) {
                if (!p0b.S((Object)this.get(i), list.get(i))) {
                    return b;
                }
            }
        }
        b = true;
        return b;
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
    
    public wly<E> k(final int n, int n2) {
        p4j.f0(n, n2, this.size());
        n2 -= n;
        if (n2 == this.size()) {
            return this;
        }
        if (n2 == 0) {
            return ppy.J0;
        }
        return (wly<E>)new sly(this, n, n2);
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
    
    public final qqy<E> m(final int n) {
        final int size = this.size();
        if (n < 0 || n > size) {
            throw new IndexOutOfBoundsException(p4j.h0(n, size, "index"));
        }
        if (this.isEmpty()) {
            return wly.G0;
        }
        return (qqy<E>)new nly((wly<Object>)this, n);
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
