import java.util.AbstractList;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;
import java.util.Collection;
import java.util.RandomAccess;

// 
// Decompiled by Procyon v0.6.0
// 

public final class elz extends ufz implements RandomAccess, mlz, epz
{
    public static final elz G0;
    public int[] E0;
    public int F0;
    
    static {
        (G0 = new elz(new int[0], 0)).D0 = false;
    }
    
    public elz() {
        this(new int[10], 0);
    }
    
    public elz(final int[] e0, final int f0) {
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final /* bridge */ rlz V(final int n) {
        return (rlz)this.i(n);
    }
    
    public final void add(final int n, final Object o) {
        final int intValue = (int)o;
        this.e();
        if (n >= 0) {
            final int f0 = this.F0;
            if (n <= f0) {
                final int[] e0 = this.E0;
                if (f0 < e0.length) {
                    System.arraycopy(e0, n, e0, n + 1, f0 - n);
                }
                else {
                    final int[] e2 = new int[f0 * 3 / 2 + 1];
                    System.arraycopy(e0, 0, e2, 0, n);
                    System.arraycopy(this.E0, n, e2, n + 1, this.F0 - n);
                    this.E0 = e2;
                }
                this.E0[n] = intValue;
                ++this.F0;
                ++((AbstractList)this).modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.l(n));
    }
    
    public final /* bridge */ boolean add(final Object o) {
        this.j((int)o);
        return true;
    }
    
    public final boolean addAll(final Collection collection) {
        this.e();
        final Charset a = ulz.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof elz)) {
            return super.addAll(collection);
        }
        final elz elz = (elz)collection;
        final int f0 = elz.F0;
        if (f0 == 0) {
            return false;
        }
        final int f2 = this.F0;
        if (Integer.MAX_VALUE - f2 >= f0) {
            final int f3 = f2 + f0;
            final int[] e0 = this.E0;
            if (f3 > e0.length) {
                this.E0 = Arrays.copyOf(e0, f3);
            }
            System.arraycopy(elz.E0, 0, this.E0, this.F0, elz.F0);
            this.F0 = f3;
            ++((AbstractList)this).modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }
    
    public final boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof elz)) {
            return super.equals(o);
        }
        final elz elz = (elz)o;
        if (this.F0 != elz.F0) {
            return false;
        }
        final int[] e0 = elz.E0;
        for (int i = 0; i < this.F0; ++i) {
            if (this.E0[i] != e0[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final int g(final int n) {
        this.m(n);
        return this.E0[n];
    }
    
    public final Object get(final int n) {
        this.m(n);
        return this.E0[n];
    }
    
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.F0; ++i) {
            n = n * 31 + this.E0[i];
        }
        return n;
    }
    
    public final mlz i(final int n) {
        if (n >= this.F0) {
            return (mlz)new elz(Arrays.copyOf(this.E0, n), this.F0);
        }
        throw new IllegalArgumentException();
    }
    
    public final int indexOf(final Object o) {
        if (!(o instanceof Integer)) {
            return -1;
        }
        final int intValue = (int)o;
        for (int f0 = this.F0, i = 0; i < f0; ++i) {
            if (this.E0[i] == intValue) {
                return i;
            }
        }
        return -1;
    }
    
    public final void j(final int n) {
        this.e();
        final int f0 = this.F0;
        final int[] e0 = this.E0;
        if (f0 == e0.length) {
            final int[] e2 = new int[f0 * 3 / 2 + 1];
            System.arraycopy(e0, 0, e2, 0, f0);
            this.E0 = e2;
        }
        this.E0[this.F0++] = n;
    }
    
    public final String l(final int n) {
        return zjf.h("Index:", n, ", Size:", this.F0);
    }
    
    public final void m(final int n) {
        if (n >= 0 && n < this.F0) {
            return;
        }
        throw new IndexOutOfBoundsException(this.l(n));
    }
    
    public final /* bridge */ Object remove(final int n) {
        this.e();
        this.m(n);
        final int[] e0 = this.E0;
        final int n2 = e0[n];
        final int f0 = this.F0;
        if (n < f0 - 1) {
            System.arraycopy(e0, n + 1, e0, n, f0 - n - 1);
        }
        --this.F0;
        ++((AbstractList)this).modCount;
        return n2;
    }
    
    public final void removeRange(final int n, final int n2) {
        this.e();
        if (n2 >= n) {
            final int[] e0 = this.E0;
            System.arraycopy(e0, n2, e0, n, this.F0 - n2);
            this.F0 -= n2 - n;
            ++((AbstractList)this).modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }
    
    public final /* bridge */ Object set(final int n, final Object o) {
        final int intValue = (int)o;
        this.e();
        this.m(n);
        final int[] e0 = this.E0;
        final int n2 = e0[n];
        e0[n] = intValue;
        return n2;
    }
    
    public final int size() {
        return this.F0;
    }
}
