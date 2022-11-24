import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
import com.google.android.exoplayer2.f$a;
import com.google.android.exoplayer2.f;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wr4 implements f
{
    public static final f$a<wr4> K0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final byte[] I0;
    public int J0;
    
    static {
        wr4.K0 = y2r.P0;
    }
    
    public wr4(final int f0, final int g0, final int h0, final byte[] i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Pure
    public static int a(final int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 9) {
            return 6;
        }
        if (n != 4 && n != 5 && n != 6 && n != 7) {
            return -1;
        }
        return 2;
    }
    
    @Pure
    public static int b(final int n) {
        if (n != 1) {
            if (n == 16) {
                return 6;
            }
            if (n == 18) {
                return 7;
            }
            if (n != 6 && n != 7) {
                return -1;
            }
        }
        return 3;
    }
    
    public static String c(final int n) {
        return Integer.toString(n, 36);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && wr4.class == o.getClass()) {
            final wr4 wr4 = (wr4)o;
            if (this.F0 != wr4.F0 || this.G0 != wr4.G0 || this.H0 != wr4.H0 || !Arrays.equals(this.I0, wr4.I0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.J0 == 0) {
            this.J0 = Arrays.hashCode(this.I0) + (((527 + this.F0) * 31 + this.G0) * 31 + this.H0) * 31;
        }
        return this.J0;
    }
    
    @Override
    public final String toString() {
        final int f0 = this.F0;
        final int g0 = this.G0;
        final int h0 = this.H0;
        final boolean b = this.I0 != null;
        final StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(f0);
        sb.append(", ");
        sb.append(g0);
        sb.append(", ");
        sb.append(h0);
        sb.append(", ");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
