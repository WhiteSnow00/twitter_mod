import java.util.Iterator;
import java.util.SortedSet;
import java.util.Collection;
import java.util.Arrays;
import java.util.Objects;
import com.google.j2objc.annotations.RetainedWith;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class led<E> extends tdd<E> implements Set<E>
{
    @RetainedWith
    public transient aed<E> D0;
    
    public static <E> a<E> o(final int n) {
        wvz.i(n, "expectedSize");
        return new a<E>(n);
    }
    
    public static int p(int n) {
        final int max = Math.max(n, 2);
        n = 1;
        if (max < 751619276) {
            for (n = Integer.highestOneBit(max - 1) << 1; n * 0.7 < max; n <<= 1) {}
            return n;
        }
        if (max >= 1073741824) {
            n = 0;
        }
        if (n != 0) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }
    
    public static <E> led<E> q(int n, final Object... array) {
        if (n == 0) {
            return (led<E>)nam.L0;
        }
        final int n2 = 0;
        if (n == 1) {
            final Object o = array[0];
            Objects.requireNonNull(o);
            return new kcq<E>((E)o);
        }
        final int p2 = p(n);
        final Object[] array2 = new Object[p2];
        final int n3 = p2 - 1;
        int i = 0;
        int n4 = 0;
        int n5 = 0;
        while (i < n) {
            final Object o2 = array[i];
            jgw.u(o2, i);
            final int hashCode = o2.hashCode();
            int z = h6q.Z(hashCode);
            while (true) {
                final int n6 = z & n3;
                final Object o3 = array2[n6];
                if (o3 == null) {
                    array2[n6] = (array[n5] = o2);
                    n4 += hashCode;
                    ++n5;
                    break;
                }
                if (o3.equals(o2)) {
                    break;
                }
                ++z;
            }
            ++i;
        }
        Arrays.fill(array, n5, n, null);
        if (n5 == 1) {
            final Object o4 = array[0];
            Objects.requireNonNull(o4);
            return new kcq<E>((E)o4);
        }
        if (p(n5) < p2 / 2) {
            return (led<E>)q(n5, array);
        }
        final int length = array.length;
        n = n2;
        if (n5 < (length >> 1) + (length >> 2)) {
            n = 1;
        }
        Object[] copy = array;
        if (n != 0) {
            copy = Arrays.copyOf(array, n5);
        }
        return new nam<E>(copy, n4, array2, n3, n5);
    }
    
    public static <E> led<E> r(final Collection<? extends E> collection) {
        if (collection instanceof led && !(collection instanceof SortedSet)) {
            final led led = (led)collection;
            if (!led.m()) {
                return led;
            }
        }
        final Object[] array = collection.toArray();
        return (led<E>)q(array.length, array);
    }
    
    public static <E> led<E> t(final E e, final E e2) {
        return q(2, e, e2);
    }
    
    public static <E> led<E> u(final E e, final E e2, final E e3) {
        return q(3, e, e2, e3);
    }
    
    public static <E> led<E> v(final E e, final E e2, final E e3, final E e4) {
        return q(4, e, e2, e3, e4);
    }
    
    public static <E> led<E> w(final E e, final E e2, final E e3, final E e4, final E e5) {
        return q(5, e, e2, e3, e4, e5);
    }
    
    @SafeVarargs
    public static <E> led<E> x(final E e, final E e2, final E e3, final E e4, final E e5, final E e6, final E... array) {
        if (array.length <= 2147483641) {
            final int n = array.length + 6;
            final Object[] array2 = new Object[n];
            array2[0] = e;
            array2[1] = e2;
            array2[2] = e3;
            array2[3] = e4;
            array2[4] = e5;
            array2[5] = e6;
            System.arraycopy(array, 0, array2, 6, array.length);
            return (led<E>)q(n, array2);
        }
        throw new IllegalArgumentException("the total number of elements must fit in an int");
    }
    
    @Override
    public aed<E> e() {
        aed<E> d0;
        if ((d0 = this.D0) == null) {
            d0 = this.s();
            this.D0 = d0;
        }
        return d0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof led && this instanceof nam) {
            final led led = (led)o;
            Objects.requireNonNull(led);
            if (led instanceof nam && this.hashCode() != o.hashCode()) {
                return false;
            }
        }
        return xmp.a(this, o);
    }
    
    @Override
    public int hashCode() {
        return xmp.c(this);
    }
    
    public aed<E> s() {
        final Object[] array = this.toArray();
        final aed$b d0 = aed.D0;
        return (aed<E>)aed.o(array, array.length);
    }
    
    public static final class a<E> extends tdd$a<E>
    {
        public Object[] d;
        public int e;
        
        public a(final int n) {
            super(n);
            this.d = new Object[led.p(n)];
        }
        
        public final a<E> f(final E e) {
            Objects.requireNonNull(e);
            if (this.d != null) {
                final int p = led.p(super.b);
                final Object[] d = this.d;
                if (p <= d.length) {
                    Objects.requireNonNull(d);
                    final int length = this.d.length;
                    final int hashCode = e.hashCode();
                    int z = h6q.Z(hashCode);
                    while (true) {
                        z &= length - 1;
                        final Object[] d2 = this.d;
                        final Object o = d2[z];
                        if (o == null) {
                            d2[z] = e;
                            this.e += hashCode;
                            this.c((Object)e);
                            break;
                        }
                        if (o.equals(e)) {
                            break;
                        }
                        ++z;
                    }
                    return this;
                }
            }
            this.d = null;
            this.c((Object)e);
            return this;
        }
        
        public final a<E> g(final Iterable<? extends E> iterable) {
            Objects.requireNonNull(iterable);
            if (this.d != null) {
                final Iterator<? extends E> iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    this.f(iterator.next());
                }
            }
            else {
                this.d((Iterable)iterable);
            }
            return this;
        }
        
        public final led<E> h() {
            final int b = super.b;
            if (b == 0) {
                return (led<E>)nam.L0;
            }
            boolean b2 = false;
            if (b != 1) {
                led<Object> q;
                if (this.d != null && led.p(b) == this.d.length) {
                    final int b3 = super.b;
                    final Object[] a = super.a;
                    final int length = a.length;
                    if (b3 < (length >> 1) + (length >> 2)) {
                        b2 = true;
                    }
                    Object[] copy = a;
                    if (b2) {
                        copy = Arrays.copyOf(a, b3);
                    }
                    final int e = this.e;
                    final Object[] d = this.d;
                    q = new nam<Object>(copy, e, d, d.length - 1, super.b);
                }
                else {
                    q = led.q(super.b, super.a);
                    super.b = q.size();
                }
                super.c = true;
                this.d = null;
                return (led<E>)q;
            }
            final Object o = super.a[0];
            Objects.requireNonNull(o);
            return new kcq<E>((E)o);
        }
    }
}
