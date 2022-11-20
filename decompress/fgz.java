import java.util.AbstractList;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.Collection;
import java.util.Arrays;
import java.util.RandomAccess;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fgz extends ufz implements RandomAccess, epz
{
    public boolean[] E0;
    public int F0;
    
    static {
        new fgz(new boolean[0], 0).D0 = false;
    }
    
    public fgz() {
        this(new boolean[10], 0);
    }
    
    public fgz(final boolean[] e0, final int f0) {
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final /* bridge */ rlz V(final int n) {
        if (n >= this.F0) {
            return (rlz)new fgz(Arrays.copyOf(this.E0, n), this.F0);
        }
        throw new IllegalArgumentException();
    }
    
    public final void add(final int n, final Object o) {
        final boolean booleanValue = (boolean)o;
        this.e();
        if (n >= 0) {
            final int f0 = this.F0;
            if (n <= f0) {
                final boolean[] e0 = this.E0;
                if (f0 < e0.length) {
                    System.arraycopy(e0, n, e0, n + 1, f0 - n);
                }
                else {
                    final boolean[] e2 = new boolean[f0 * 3 / 2 + 1];
                    System.arraycopy(e0, 0, e2, 0, n);
                    System.arraycopy(this.E0, n, e2, n + 1, this.F0 - n);
                    this.E0 = e2;
                }
                this.E0[n] = booleanValue;
                ++this.F0;
                ++((AbstractList)this).modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.i(n));
    }
    
    public final /* bridge */ boolean add(final Object o) {
        this.g((boolean)o);
        return true;
    }
    
    public final boolean addAll(final Collection collection) {
        this.e();
        final Charset a = ulz.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof fgz)) {
            return super.addAll(collection);
        }
        final fgz fgz = (fgz)collection;
        final int f0 = fgz.F0;
        if (f0 == 0) {
            return false;
        }
        final int f2 = this.F0;
        if (Integer.MAX_VALUE - f2 >= f0) {
            final int f3 = f2 + f0;
            final boolean[] e0 = this.E0;
            if (f3 > e0.length) {
                this.E0 = Arrays.copyOf(e0, f3);
            }
            System.arraycopy(fgz.E0, 0, this.E0, this.F0, fgz.F0);
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
        if (!(o instanceof fgz)) {
            return super.equals(o);
        }
        final fgz fgz = (fgz)o;
        if (this.F0 != fgz.F0) {
            return false;
        }
        final boolean[] e0 = fgz.E0;
        for (int i = 0; i < this.F0; ++i) {
            if (this.E0[i] != e0[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final void g(final boolean b) {
        this.e();
        final int f0 = this.F0;
        final boolean[] e0 = this.E0;
        if (f0 == e0.length) {
            final boolean[] e2 = new boolean[f0 * 3 / 2 + 1];
            System.arraycopy(e0, 0, e2, 0, f0);
            this.E0 = e2;
        }
        this.E0[this.F0++] = b;
    }
    
    public final Object get(final int n) {
        this.j(n);
        return this.E0[n];
    }
    
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.F0; ++i) {
            n = n * 31 + ulz.a(this.E0[i]);
        }
        return n;
    }
    
    public final String i(final int n) {
        return zjf.h("Index:", n, ", Size:", this.F0);
    }
    
    public final int indexOf(final Object o) {
        if (!(o instanceof Boolean)) {
            return -1;
        }
        final boolean booleanValue = (boolean)o;
        for (int f0 = this.F0, i = 0; i < f0; ++i) {
            if (this.E0[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }
    
    public final void j(final int n) {
        if (n >= 0 && n < this.F0) {
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n));
    }
    
    public final /* bridge */ Object remove(final int n) {
        this.e();
        this.j(n);
        final boolean[] e0 = this.E0;
        final boolean b = e0[n];
        final int f0 = this.F0;
        if (n < f0 - 1) {
            System.arraycopy(e0, n + 1, e0, n, f0 - n - 1);
        }
        --this.F0;
        ++((AbstractList)this).modCount;
        return b;
    }
    
    public final void removeRange(final int n, final int n2) {
        this.e();
        if (n2 >= n) {
            final boolean[] e0 = this.E0;
            System.arraycopy(e0, n2, e0, n, this.F0 - n2);
            this.F0 -= n2 - n;
            ++((AbstractList)this).modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }
    
    public final /* bridge */ Object set(final int n, final Object o) {
        final boolean booleanValue = (boolean)o;
        this.e();
        this.j(n);
        final boolean[] e0 = this.E0;
        final boolean b = e0[n];
        e0[n] = booleanValue;
        return b;
    }
    
    public final int size() {
        return this.F0;
    }
}
