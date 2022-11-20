import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yz1 implements Cloneable
{
    public final int D0;
    public final int E0;
    public final int F0;
    public final int[] G0;
    
    public yz1(int n, final int e0) {
        if (n >= 1 && e0 >= 1) {
            this.D0 = n;
            this.E0 = e0;
            n = (n + 31) / 32;
            this.F0 = n;
            this.G0 = new int[n * e0];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }
    
    public yz1(final int d0, final int e0, final int f0, final int[] g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void a(final int n, int n2) {
        n2 = n / 32 + n2 * this.F0;
        final int[] g0 = this.G0;
        g0[n2] ^= 1 << (n & 0x1F);
    }
    
    public final boolean c(final int n, int n2) {
        n2 = this.G0[n / 32 + n2 * this.F0];
        boolean b = true;
        if ((n2 >>> (n & 0x1F) & 0x1) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public final Object clone() throws CloneNotSupportedException {
        return new yz1(this.D0, this.E0, this.F0, this.G0.clone());
    }
    
    public final void d(final int n, int n2) {
        n2 = n / 32 + n2 * this.F0;
        final int[] g0 = this.G0;
        g0[n2] |= 1 << (n & 0x1F);
    }
    
    public final void e(final int n, int i, int j, int n2) {
        if (i < 0 || n < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (n2 < 1 || j < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        final int n3 = j + n;
        n2 += i;
        if (n2 <= this.E0 && n3 <= this.D0) {
            while (i < n2) {
                final int f0 = this.F0;
                int[] g0;
                int n4;
                for (j = n; j < n3; ++j) {
                    g0 = this.G0;
                    n4 = j / 32 + f0 * i;
                    g0[n4] |= 1 << (j & 0x1F);
                }
                ++i;
            }
            return;
        }
        throw new IllegalArgumentException("The region must fit inside the matrix");
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof yz1;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final yz1 yz1 = (yz1)o;
        boolean b3 = b2;
        if (this.D0 == yz1.D0) {
            b3 = b2;
            if (this.E0 == yz1.E0) {
                b3 = b2;
                if (this.F0 == yz1.F0) {
                    b3 = b2;
                    if (Arrays.equals(this.G0, yz1.G0)) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        final int d0 = this.D0;
        return Arrays.hashCode(this.G0) + (((d0 * 31 + d0) * 31 + this.E0) * 31 + this.F0) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder((this.D0 + 1) * this.E0);
        for (int i = 0; i < this.E0; ++i) {
            for (int j = 0; j < this.D0; ++j) {
                String s;
                if (this.c(j, i)) {
                    s = "X ";
                }
                else {
                    s = "  ";
                }
                sb.append(s);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
