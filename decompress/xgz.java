import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public class xgz extends ugz
{
    public final byte[] F0;
    
    public xgz(final byte[] f0) {
        Objects.requireNonNull(f0);
        this.F0 = f0;
    }
    
    public byte e(final int n) {
        return this.F0[n];
    }
    
    public final boolean equals(final Object o) {
        final boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof phz)) {
            return false;
        }
        if (this.i() != ((phz)o).i()) {
            return false;
        }
        if (this.i() == 0) {
            return true;
        }
        if (!(o instanceof xgz)) {
            return o.equals(this);
        }
        final xgz xgz = (xgz)o;
        final int d0 = ((phz)this).D0;
        final int d2 = ((phz)xgz).D0;
        if (d0 != 0 && d2 != 0 && d0 != d2) {
            return false;
        }
        final int i = this.i();
        if (i > xgz.i()) {
            final int j = this.i();
            final StringBuilder sb = new StringBuilder();
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i <= xgz.i()) {
            final byte[] f0 = this.F0;
            final byte[] f2 = xgz.F0;
            xgz.r();
            int n = 0;
            int n2 = 0;
            boolean b2;
            while (true) {
                b2 = b;
                if (n >= i) {
                    break;
                }
                if (f0[n] != f2[n2]) {
                    b2 = false;
                    break;
                }
                ++n;
                ++n2;
            }
            return b2;
        }
        throw new IllegalArgumentException(zjf.h("Ran off end of other: 0, ", i, ", ", xgz.i()));
    }
    
    public byte g(final int n) {
        return this.F0[n];
    }
    
    public int i() {
        return this.F0.length;
    }
    
    public final int j(int i, final int n) {
        final byte[] f0 = this.F0;
        final Charset a = ulz.a;
        final int n2 = 0;
        int n3 = i;
        for (i = n2; i < n; ++i) {
            n3 = n3 * 31 + f0[i];
        }
        return n3;
    }
    
    public final phz l() {
        final int p = phz.p(0, 47, this.i());
        if (p == 0) {
            return (phz)phz.E0;
        }
        return (phz)new rgz(this.F0, p);
    }
    
    public final String m(final Charset charset) {
        return new String(this.F0, 0, this.i(), charset);
    }
    
    public final void n(final rp9 rp9) throws IOException {
        ((diz)rp9).v1(this.F0, this.i());
    }
    
    public final boolean o() {
        return dsz.d(this.F0, 0, this.i());
    }
    
    public void r() {
    }
}
