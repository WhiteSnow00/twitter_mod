import java.util.AbstractCollection;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class eed<E> extends xdd<E> implements List<E>, RandomAccess
{
    public static final ac G0;
    
    static {
        eed.G0 = new b(nbm.J0, 0);
    }
    
    public static <E> eed<E> o(final Object[] array, final int n) {
        if (n == 0) {
            return nbm.J0;
        }
        return new nbm<E>(array, n);
    }
    
    public static <E> eed<E> p(final Object... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            vmw.e(array[i], i);
        }
        return o(array, array.length);
    }
    
    public static <E> eed<E> q(final Collection<? extends E> collection) {
        if (collection instanceof xdd) {
            eed<Object> eed2;
            final eed eed = eed2 = ((xdd)collection).e();
            if (eed.m()) {
                final Object[] array = eed.toArray();
                eed2 = o(array, array.length);
            }
            return (eed<E>)eed2;
        }
        return p(collection.toArray());
    }
    
    public static <E> eed<E> r(final E[] array) {
        eed<Object> eed;
        if (array.length == 0) {
            eed = nbm.J0;
        }
        else {
            eed = p((Object[])array.clone());
        }
        return (eed<E>)eed;
    }
    
    public static <E> eed<E> t(final E e) {
        return p(e);
    }
    
    public static <E> eed<E> u(final E e, final E e2, final E e3, final E e4, final E e5) {
        return p(e, e2, e3, e4, e5);
    }
    
    @Deprecated
    public final void add(final int n, final E e) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    public final boolean addAll(final int n, final Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }
    
    public final boolean contains(final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    @Deprecated
    public final eed<E> e() {
        return this;
    }
    
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
                final Iterator<E> iterator = this.iterator();
                final Iterator iterator2 = list.iterator();
                while (iterator.hasNext()) {
                    if (!iterator2.hasNext()) {
                        return b;
                    }
                    if (!vq9.c((Object)iterator.next(), iterator2.next())) {
                        return b;
                    }
                }
                b = (iterator2.hasNext() ^ true);
                return b;
            }
            for (int i = 0; i < size; ++i) {
                if (!vq9.c((Object)this.get(i), list.get(i))) {
                    return b;
                }
            }
        }
        b = true;
        return b;
    }
    
    public int g(final Object[] array, final int n) {
        final int size = ((AbstractCollection)this).size();
        for (int i = 0; i < size; ++i) {
            array[n + i] = this.get(i);
        }
        return n + size;
    }
    
    public final int hashCode() {
        final int size = ((AbstractCollection)this).size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = ~(~(this.get(i).hashCode() + n * 31));
        }
        return n;
    }
    
    public final int indexOf(final Object o) {
        final int n = -1;
        int n2;
        if (o == null) {
            n2 = n;
        }
        else {
            final int size = this.size();
            int n3 = 0;
            while (true) {
                n2 = n;
                if (n3 >= size) {
                    break;
                }
                if (o.equals(this.get(n3))) {
                    n2 = n3;
                    break;
                }
                ++n3;
            }
        }
        return n2;
    }
    
    public Iterator iterator() {
        return (Iterator)this.s(0);
    }
    
    public final int lastIndexOf(final Object o) {
        final int n = -1;
        int n2;
        if (o == null) {
            n2 = n;
        }
        else {
            int n3 = this.size() - 1;
            while (true) {
                n2 = n;
                if (n3 < 0) {
                    break;
                }
                if (o.equals(this.get(n3))) {
                    n2 = n3;
                    break;
                }
                --n3;
            }
        }
        return n2;
    }
    
    public ListIterator listIterator() {
        return (ListIterator)this.s(0);
    }
    
    public /* bridge */ ListIterator listIterator(final int n) {
        return (ListIterator)this.s(n);
    }
    
    public final v0w<E> n() {
        return (v0w<E>)this.s(0);
    }
    
    @Deprecated
    public final E remove(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public final ac s(final int n) {
        v7q.g(n, ((AbstractCollection)this).size());
        if (((AbstractCollection)this).isEmpty()) {
            return eed.G0;
        }
        return new b<Object>(this, n);
    }
    
    @Deprecated
    public final E set(final int n, final E e) {
        throw new UnsupportedOperationException();
    }
    
    public /* bridge */ List subList(final int n, final int n2) {
        return this.v(n, n2);
    }
    
    public eed<E> v(final int n, int n2) {
        v7q.h(n, n2, ((AbstractCollection)this).size());
        n2 -= n;
        if (n2 == ((AbstractCollection)this).size()) {
            return this;
        }
        if (n2 == 0) {
            return nbm.J0;
        }
        return new c(n, n2);
    }
    
    public static final class a<E> extends xdd.a<E>
    {
        public a() {
            super(4);
        }
        
        public final xdd$b a(final Object o) {
            this.c((E)o);
            return this;
        }
        
        public final eed<E> f() {
            super.c = true;
            return eed.o(super.a, super.b);
        }
    }
    
    public static final class b<E> extends ac<E>
    {
        public final eed<E> H0;
        
        public b(final eed<E> h0, final int n) {
            super(((AbstractCollection)h0).size(), n);
            this.H0 = h0;
        }
        
        public final E a(final int n) {
            return this.H0.get(n);
        }
    }
    
    public final class c extends eed<E>
    {
        public final transient int H0;
        public final transient int I0;
        public final eed J0;
        
        public c(final eed j0, final int h0, final int i0) {
            this.J0 = j0;
            this.H0 = h0;
            this.I0 = i0;
        }
        
        public final E get(final int n) {
            v7q.e(n, this.I0);
            return this.J0.get(n + this.H0);
        }
        
        public final Object[] i() {
            return this.J0.i();
        }
        
        @Override
        public final Iterator iterator() {
            return (Iterator)this.s(0);
        }
        
        public final int j() {
            return this.J0.k() + this.H0 + this.I0;
        }
        
        public final int k() {
            return this.J0.k() + this.H0;
        }
        
        @Override
        public final ListIterator listIterator() {
            return (ListIterator)this.s(0);
        }
        
        public final /* bridge */ ListIterator listIterator(final int n) {
            return (ListIterator)this.s(n);
        }
        
        public final boolean m() {
            return true;
        }
        
        public final int size() {
            return this.I0;
        }
        
        public final /* bridge */ List subList(final int n, final int n2) {
            return this.v(n, n2);
        }
        
        @Override
        public final eed<E> v(final int n, final int n2) {
            v7q.h(n, n2, this.I0);
            final eed j0 = this.J0;
            final int h0 = this.H0;
            return j0.v(n + h0, n2 + h0);
        }
    }
}
