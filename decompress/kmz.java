import java.util.AbstractList;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;
import java.util.Collection;
import java.util.RandomAccess;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmz extends gfz implements RandomAccess, blz, qoz
{
    public static final kmz F0;
    public long[] D0;
    public int E0;
    
    static {
        (F0 = new kmz(new long[0], 0)).C0 = false;
    }
    
    public kmz() {
        this(new long[10], 0);
    }
    
    public kmz(final long[] d0, final int e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final boolean addAll(final Collection collection) {
        this.e();
        final Charset a = glz.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof kmz)) {
            return super.addAll(collection);
        }
        final kmz kmz = (kmz)collection;
        final int e0 = kmz.E0;
        if (e0 == 0) {
            return false;
        }
        final int e2 = this.E0;
        if (Integer.MAX_VALUE - e2 >= e0) {
            final int e3 = e2 + e0;
            final long[] d0 = this.D0;
            if (e3 > d0.length) {
                this.D0 = Arrays.copyOf(d0, e3);
            }
            System.arraycopy(kmz.D0, 0, this.D0, this.E0, kmz.E0);
            this.E0 = e3;
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
        if (!(o instanceof kmz)) {
            return super.equals(o);
        }
        final kmz kmz = (kmz)o;
        if (this.E0 != kmz.E0) {
            return false;
        }
        final long[] d0 = kmz.D0;
        for (int i = 0; i < this.E0; ++i) {
            if (this.D0[i] != d0[i]) {
                return false;
            }
        }
        return true;
    }
    
    public final long g(final int n) {
        this.m(n);
        return this.D0[n];
    }
    
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.E0; ++i) {
            n = n * 31 + glz.b(this.D0[i]);
        }
        return n;
    }
    
    public final blz i(final int n) {
        if (n >= this.E0) {
            return new kmz(Arrays.copyOf(this.D0, n), this.E0);
        }
        throw new IllegalArgumentException();
    }
    
    public final int indexOf(final Object o) {
        if (!(o instanceof Long)) {
            return -1;
        }
        final long longValue = (long)o;
        for (int e0 = this.E0, i = 0; i < e0; ++i) {
            if (this.D0[i] == longValue) {
                return i;
            }
        }
        return -1;
    }
    
    public final void j(final long n) {
        this.e();
        final int e0 = this.E0;
        final long[] d0 = this.D0;
        if (e0 == d0.length) {
            final long[] d2 = new long[e0 * 3 / 2 + 1];
            System.arraycopy(d0, 0, d2, 0, e0);
            this.D0 = d2;
        }
        this.D0[this.E0++] = n;
    }
    
    public final String l(final int n) {
        return hi.H("Index:", n, ", Size:", this.E0);
    }
    
    public final void m(final int n) {
        if (n >= 0 && n < this.E0) {
            return;
        }
        throw new IndexOutOfBoundsException(this.l(n));
    }
    
    public final void removeRange(final int n, final int n2) {
        this.e();
        if (n2 >= n) {
            final long[] d0 = this.D0;
            System.arraycopy(d0, n2, d0, n, this.E0 - n2);
            this.E0 -= n2 - n;
            ++((AbstractList)this).modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }
    
    public final int size() {
        return this.E0;
    }
}
