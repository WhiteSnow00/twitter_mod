import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Arrays;
import java.math.RoundingMode;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dky
{
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    
    public dky(String concat, final char[] b) {
        this.a = concat;
        Objects.requireNonNull(b);
        this.b = b;
        try {
            final int d0 = w9i.d0(b.length, RoundingMode.UNNECESSARY);
            this.d = d0;
            final int min = Math.min(8, Integer.lowestOneBit(d0));
            try {
                this.e = 8 / min;
                this.f = d0 / min;
                this.c = b.length - 1;
                final byte[] g = new byte[128];
                Arrays.fill(g, (byte)(-1));
                final int n = 0;
                for (int i = 0; i < b.length; ++i) {
                    final char c = b[i];
                    g63.k0(c < '\u0080', "Non-ASCII character: %s", c);
                    g63.k0(g[c] == -1, "Duplicate character: %s", c);
                    g[c] = (byte)i;
                }
                this.g = g;
                final boolean[] array = new boolean[this.e];
                for (int j = n; j < this.f; ++j) {
                    array[w9i.c0(j << 3, this.d, RoundingMode.CEILING)] = true;
                }
            }
            catch (final ArithmeticException ex) {
                concat = new String(b);
                if (concat.length() != 0) {
                    concat = "Illegal alphabet ".concat(concat);
                }
                else {
                    concat = new String("Illegal alphabet ");
                }
                throw new IllegalArgumentException(concat, ex);
            }
        }
        catch (final ArithmeticException ex2) {
            throw new IllegalArgumentException(jxa.p(35, "Illegal alphabet length ", b.length), ex2);
        }
    }
    
    @Override
    public final boolean equals(@NullableDecl final Object o) {
        return o instanceof dky && Arrays.equals(this.b, ((dky)o).b);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
