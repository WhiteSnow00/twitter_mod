import java.nio.charset.Charset;
import java.util.Objects;
import java.util.Collection;
import java.util.Arrays;
import java.util.RandomAccess;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ojz extends tgz implements RandomAccess, dqz
{
    public double[] G0;
    public int H0;
    
    static {
        new ojz(new double[0], 0).F0 = false;
    }
    
    public ojz() {
        this(new double[10], 0);
    }
    
    public ojz(final double[] g0, final int h0) {
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final /* bridge */ qmz W(final int n) {
        if (n >= this.H0) {
            return (qmz)new ojz(Arrays.copyOf(this.G0, n), this.H0);
        }
        throw new IllegalArgumentException();
    }
    
    public final void add(final int n, final Object o) {
        final double doubleValue = (double)o;
        this.e();
        if (n >= 0) {
            final int h0 = this.H0;
            if (n <= h0) {
                final double[] g0 = this.G0;
                if (h0 < g0.length) {
                    System.arraycopy(g0, n, g0, n + 1, h0 - n);
                }
                else {
                    final double[] g2 = new double[h0 * 3 / 2 + 1];
                    System.arraycopy(g0, 0, g2, 0, n);
                    System.arraycopy(this.G0, n, g2, n + 1, this.H0 - n);
                    this.G0 = g2;
                }
                this.G0[n] = doubleValue;
                ++this.H0;
                ++super.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.i(n));
    }
    
    @Override
    public final /* bridge */ boolean add(final Object o) {
        this.g((double)o);
        return true;
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        this.e();
        final Charset a = tmz.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof ojz)) {
            return super.addAll(collection);
        }
        final ojz ojz = (ojz)collection;
        final int h0 = ojz.H0;
        if (h0 == 0) {
            return false;
        }
        final int h2 = this.H0;
        if (Integer.MAX_VALUE - h2 >= h0) {
            final int h3 = h2 + h0;
            final double[] g0 = this.G0;
            if (h3 > g0.length) {
                this.G0 = Arrays.copyOf(g0, h3);
            }
            System.arraycopy(ojz.G0, 0, this.G0, this.H0, ojz.H0);
            this.H0 = h3;
            ++super.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }
    
    public final boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ojz)) {
            return super.equals(o);
        }
        final ojz ojz = (ojz)o;
        if (this.H0 != ojz.H0) {
            return false;
        }
        final double[] g0 = ojz.G0;
        for (int i = 0; i < this.H0; ++i) {
            if (Double.doubleToLongBits(this.G0[i]) != Double.doubleToLongBits(g0[i])) {
                return false;
            }
        }
        return true;
    }
    
    public final void g(final double n) {
        this.e();
        final int h0 = this.H0;
        final double[] g0 = this.G0;
        if (h0 == g0.length) {
            final double[] g2 = new double[h0 * 3 / 2 + 1];
            System.arraycopy(g0, 0, g2, 0, h0);
            this.G0 = g2;
        }
        this.G0[this.H0++] = n;
    }
    
    public final Object get(final int n) {
        this.j(n);
        return this.G0[n];
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.H0; ++i) {
            n = n * 31 + tmz.b(Double.doubleToLongBits(this.G0[i]));
        }
        return n;
    }
    
    public final String i(final int n) {
        return mw.z("Index:", n, ", Size:", this.H0);
    }
    
    public final int indexOf(final Object o) {
        if (!(o instanceof Double)) {
            return -1;
        }
        final double doubleValue = (double)o;
        for (int h0 = this.H0, i = 0; i < h0; ++i) {
            if (this.G0[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }
    
    public final void j(final int n) {
        if (n >= 0 && n < this.H0) {
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n));
    }
    
    @Override
    public final /* bridge */ Object remove(final int n) {
        this.e();
        this.j(n);
        final double[] g0 = this.G0;
        final double n2 = g0[n];
        final int h0 = this.H0;
        if (n < h0 - 1) {
            System.arraycopy(g0, n + 1, g0, n, h0 - n - 1);
        }
        --this.H0;
        ++super.modCount;
        return n2;
    }
    
    public final void removeRange(final int n, final int n2) {
        this.e();
        if (n2 >= n) {
            final double[] g0 = this.G0;
            System.arraycopy(g0, n2, g0, n, this.H0 - n2);
            this.H0 -= n2 - n;
            ++super.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }
    
    public final /* bridge */ Object set(final int n, final Object o) {
        final double doubleValue = (double)o;
        this.e();
        this.j(n);
        final double[] g0 = this.G0;
        final double n2 = g0[n];
        g0[n] = doubleValue;
        return n2;
    }
    
    public final int size() {
        return this.H0;
    }
}
