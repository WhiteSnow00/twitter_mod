import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public class jgz extends ggz
{
    public final byte[] E0;
    
    public jgz(final byte[] e0) {
        Objects.requireNonNull(e0);
        this.E0 = e0;
    }
    
    public byte e(final int n) {
        return this.E0[n];
    }
    
    public final boolean equals(final Object o) {
        final boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof bhz)) {
            return false;
        }
        if (this.i() != ((bhz)o).i()) {
            return false;
        }
        if (this.i() == 0) {
            return true;
        }
        if (!(o instanceof jgz)) {
            return o.equals(this);
        }
        final jgz jgz = (jgz)o;
        final int c0 = ((bhz)this).C0;
        final int c2 = ((bhz)jgz).C0;
        if (c0 != 0 && c2 != 0 && c0 != c2) {
            return false;
        }
        final int i = this.i();
        if (i > jgz.i()) {
            final int j = this.i();
            final StringBuilder sb = new StringBuilder();
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i <= jgz.i()) {
            final byte[] e0 = this.E0;
            final byte[] e2 = jgz.E0;
            jgz.r();
            int n = 0;
            int n2 = 0;
            boolean b2;
            while (true) {
                b2 = b;
                if (n >= i) {
                    break;
                }
                if (e0[n] != e2[n2]) {
                    b2 = false;
                    break;
                }
                ++n;
                ++n2;
            }
            return b2;
        }
        throw new IllegalArgumentException(hi.H("Ran off end of other: 0, ", i, ", ", jgz.i()));
    }
    
    public byte g(final int n) {
        return this.E0[n];
    }
    
    public int i() {
        return this.E0.length;
    }
    
    public final int j(int i, final int n) {
        final byte[] e0 = this.E0;
        final Charset a = glz.a;
        final int n2 = 0;
        int n3 = i;
        for (i = n2; i < n; ++i) {
            n3 = n3 * 31 + e0[i];
        }
        return n3;
    }
    
    public final bhz l() {
        final int p = bhz.p(0, 47, this.i());
        if (p == 0) {
            return (bhz)bhz.D0;
        }
        return (bhz)new dgz(this.E0, p);
    }
    
    public final String m(final Charset charset) {
        return new String(this.E0, 0, this.i(), charset);
    }
    
    public final void n(final fk7 fk7) throws IOException {
        ((phz)fk7).g1(this.E0, this.i());
    }
    
    public final boolean o() {
        return prz.d(this.E0, 0, this.i());
    }
    
    public void r() {
    }
}
