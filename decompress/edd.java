import java.util.AbstractCollection;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class edd<E> extends xcd<E> implements List<E>, RandomAccess
{
    public static final zb E0;
    
    static {
        edd.E0 = new b((edd<E>)abm.H0, 0);
    }
    
    public static <E> edd<E> o(final Object[] array, final int n) {
        if (n == 0) {
            return (edd<E>)abm.H0;
        }
        return (edd<E>)new abm(array, n);
    }
    
    public static <E> edd<E> p(final Object... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            rrz.k(array[i], i);
        }
        return o(array, array.length);
    }
    
    public static <E> edd<E> q(final Collection<? extends E> collection) {
        if (collection instanceof xcd) {
            edd<Object> edd2;
            final edd edd = edd2 = ((xcd)collection).e();
            if (edd.m()) {
                final Object[] array = edd.toArray();
                edd2 = o(array, array.length);
            }
            return (edd<E>)edd2;
        }
        return p(collection.toArray());
    }
    
    public static <E> edd<E> r(final E[] array) {
        Object o;
        if (array.length == 0) {
            o = abm.H0;
        }
        else {
            o = p((Object[])array.clone());
        }
        return (edd<E>)o;
    }
    
    public static <E> edd<E> t(final E e) {
        return p(e);
    }
    
    public static <E> edd<E> u(final E e, final E e2, final E e3, final E e4, final E e5) {
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
    public final edd<E> e() {
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
                    if (!af8.o((Object)iterator.next(), iterator2.next())) {
                        return b;
                    }
                }
                b = (iterator2.hasNext() ^ true);
                return b;
            }
            for (int i = 0; i < size; ++i) {
                if (!af8.o((Object)this.get(i), list.get(i))) {
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
    
    public final f0w<E> n() {
        return (f0w<E>)this.s(0);
    }
    
    @Deprecated
    public final E remove(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public final zb s(final int n) {
        nza.G0(n, ((AbstractCollection)this).size());
        if (((AbstractCollection)this).isEmpty()) {
            return edd.E0;
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
    
    public edd<E> v(final int n, int n2) {
        nza.H0(n, n2, ((AbstractCollection)this).size());
        n2 -= n;
        if (n2 == ((AbstractCollection)this).size()) {
            return this;
        }
        if (n2 == 0) {
            return (edd<E>)abm.H0;
        }
        return new c(n, n2);
    }
    
    public static final class a<E> extends xcd$a<E>
    {
        public a() {
            super(4);
        }
        
        public final xcd$b a(final Object o) {
            this.c(o);
            return (xcd$b)this;
        }
        
        public final edd<E> f() {
            super.c = true;
            return edd.o(super.a, super.b);
        }
    }
    
    public static final class b<E> extends zb<E>
    {
        public final edd<E> F0;
        
        public b(final edd<E> f0, final int n) {
            super(((AbstractCollection)f0).size(), n);
            this.F0 = f0;
        }
        
        public final E a(final int n) {
            return this.F0.get(n);
        }
    }
    
    public final class c extends edd<E>
    {
        public final transient int F0;
        public final transient int G0;
        public final edd H0;
        
        public c(final edd h0, final int f0, final int g0) {
            this.H0 = h0;
            this.F0 = f0;
            this.G0 = g0;
        }
        
        public final E get(final int n) {
            nza.E0(n, this.G0);
            return this.H0.get(n + this.F0);
        }
        
        public final Object[] i() {
            return this.H0.i();
        }
        
        @Override
        public final Iterator iterator() {
            return (Iterator)this.s(0);
        }
        
        public final int j() {
            return this.H0.l() + this.F0 + this.G0;
        }
        
        public final int l() {
            return this.H0.l() + this.F0;
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
            return this.G0;
        }
        
        public final /* bridge */ List subList(final int n, final int n2) {
            return this.v(n, n2);
        }
        
        @Override
        public final edd<E> v(final int n, final int n2) {
            nza.H0(n, n2, this.G0);
            final edd h0 = this.H0;
            final int f0 = this.F0;
            return h0.v(n + f0, n2 + f0);
        }
    }
}
