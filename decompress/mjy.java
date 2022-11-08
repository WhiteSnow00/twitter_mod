import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Arrays;
import java.math.RoundingMode;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mjy
{
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    
    public mjy(String concat, final char[] b) {
        this.a = concat;
        Objects.requireNonNull(b);
        this.b = b;
        try {
            final int g1 = kq9.g1(b.length, RoundingMode.UNNECESSARY);
            this.d = g1;
            final int min = Math.min(8, Integer.lowestOneBit(g1));
            try {
                this.e = 8 / min;
                this.f = g1 / min;
                this.c = b.length - 1;
                final byte[] g2 = new byte[128];
                Arrays.fill(g2, (byte)(-1));
                final int n = 0;
                for (int i = 0; i < b.length; ++i) {
                    final char c = b[i];
                    tdy.f1(c < '\u0080', "Non-ASCII character: %s", c);
                    tdy.f1(g2[c] == -1, "Duplicate character: %s", c);
                    g2[c] = (byte)i;
                }
                this.g = g2;
                final boolean[] array = new boolean[this.e];
                for (int j = n; j < this.f; ++j) {
                    array[kq9.f1(j << 3, this.d, RoundingMode.CEILING)] = true;
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
            throw new IllegalArgumentException(q1a.f(35, "Illegal alphabet length ", b.length), ex2);
        }
    }
    
    @Override
    public final boolean equals(@NullableDecl final Object o) {
        return o instanceof mjy && Arrays.equals(this.b, ((mjy)o).b);
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
