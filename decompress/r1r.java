// 
// Decompiled by Procyon v0.6.0
// 

public final class r1r<E> implements Cloneable
{
    public static final Object I0;
    public int[] F0;
    public Object[] G0;
    public int H0;
    
    static {
        I0 = new Object();
    }
    
    public r1r() {
        final int k = iwl.k(10);
        this.F0 = new int[k];
        this.G0 = new Object[k];
    }
    
    public final void a(final int n, final E e) {
        final int h0 = this.H0;
        if (h0 != 0 && n <= this.F0[h0 - 1]) {
            this.g(n, e);
            return;
        }
        if (h0 >= this.F0.length) {
            final int k = iwl.k(h0 + 1);
            final int[] f0 = new int[k];
            final Object[] g0 = new Object[k];
            final int[] f2 = this.F0;
            System.arraycopy(f2, 0, f0, 0, f2.length);
            final Object[] g2 = this.G0;
            System.arraycopy(g2, 0, g0, 0, g2.length);
            this.F0 = f0;
            this.G0 = g0;
        }
        this.F0[h0] = n;
        this.G0[h0] = e;
        this.H0 = h0 + 1;
    }
    
    public final r1r<E> c() {
        try {
            final r1r r1r = (r1r)super.clone();
            r1r.F0 = this.F0.clone();
            r1r.G0 = this.G0.clone();
            return r1r;
        }
        catch (final CloneNotSupportedException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.c();
    }
    
    public final boolean d(final int n) {
        return iwl.b(this.F0, this.H0, n) >= 0;
    }
    
    public final E e(int b, final E e) {
        b = iwl.b(this.F0, this.H0, b);
        if (b >= 0) {
            final Object[] g0 = this.G0;
            if (g0[b] != r1r.I0) {
                return (E)g0[b];
            }
        }
        return e;
    }
    
    public final int f(final int n) {
        return this.F0[n];
    }
    
    public final void g(final int n, final E e) {
        final int b = iwl.b(this.F0, this.H0, n);
        if (b >= 0) {
            this.G0[b] = e;
        }
        else {
            final int n2 = ~b;
            final int h0 = this.H0;
            if (n2 < h0) {
                final Object[] g0 = this.G0;
                if (g0[n2] == r1r.I0) {
                    this.F0[n2] = n;
                    g0[n2] = e;
                    return;
                }
            }
            if (h0 >= this.F0.length) {
                final int k = iwl.k(h0 + 1);
                final int[] f0 = new int[k];
                final Object[] g2 = new Object[k];
                final int[] f2 = this.F0;
                System.arraycopy(f2, 0, f0, 0, f2.length);
                final Object[] g3 = this.G0;
                System.arraycopy(g3, 0, g2, 0, g3.length);
                this.F0 = f0;
                this.G0 = g2;
            }
            final int n3 = this.H0 - n2;
            if (n3 != 0) {
                final int[] f3 = this.F0;
                final int n4 = n2 + 1;
                System.arraycopy(f3, n2, f3, n4, n3);
                final Object[] g4 = this.G0;
                System.arraycopy(g4, n2, g4, n4, this.H0 - n2);
            }
            this.F0[n2] = n;
            this.G0[n2] = e;
            ++this.H0;
        }
    }
    
    public final int h() {
        return this.H0;
    }
    
    public final E i(final int n) {
        return (E)this.G0[n];
    }
    
    @Override
    public final String toString() {
        if (this.h() <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.H0 * 28);
        sb.append('{');
        for (int i = 0; i < this.H0; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.f(i));
            sb.append('=');
            final E j = this.i(i);
            if (j != this) {
                sb.append(j);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
